package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.client.renderer.VisibleModelExtents;
import com.marctron.galacticarmory.client.renderer.preview.HelmetPreviewAssembler;
import com.marctron.galacticarmory.client.renderer.preview.HelmetPreviewRenderState;
import com.marctron.galacticarmory.common.armor.parts.HelmetPartEnum;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class SpecialArmorRenderer implements SpecialModelRenderer<List<HelmetPreviewRenderState.Piece>> {
    private final HumanoidModel<?> model;
    private final Identifier texture;
    private final EquipmentSlot slot;

    public SpecialArmorRenderer(HumanoidModel<?> model, Identifier texture, EquipmentSlot slot) {
        this.model = model;
        this.texture = texture;
        this.slot = slot;
    }

    /**
     * Resolves the helmet's configured parts from the stack. Returning null (or an empty list) means
     * "no customisation", in which case the stock model is drawn.
     */
    @Override
    public @Nullable List<HelmetPreviewRenderState.Piece> extractArgument(ItemStack stack) {
        if (this.slot != EquipmentSlot.HEAD || !(stack.getItem() instanceof BaseHelmetItem)) {
            return null;
        }
        Map<HelmetPartEnum, Item> loadout = HelmetConfiguration.readLoadout(stack);
        if (loadout.isEmpty()) {
            return null;
        }
        List<HelmetPreviewRenderState.Piece> pieces = HelmetPreviewAssembler.assemble(loadout);
        return pieces.isEmpty() ? null : pieces;
    }

    private void applyCommonTransform(PoseStack poseStack) {
        poseStack.translate(0.5F, this.slot == EquipmentSlot.HEAD ? 0.4F : 1.5F, 0.5F);
        if (this.slot == EquipmentSlot.HEAD) {
            poseStack.mulPose(Axis.ZN.rotationDegrees(-15));
            poseStack.mulPose(Axis.XN.rotationDegrees(-15));
        }
        poseStack.scale(1.0F, -1.0F, -1.0F);
    }

    private void applyVisibility() {
        if (this.model instanceof com.marctron.galacticarmory.common.armor.model.clone_armor_phase_1 armorModel) {
            armorModel.chest.visible = this.slot == EquipmentSlot.CHEST;
            armorModel.left_arm.visible = this.slot == EquipmentSlot.CHEST;
            armorModel.right_arm.visible = this.slot == EquipmentSlot.CHEST;
            armorModel.leftLegging.visible = this.slot == EquipmentSlot.LEGS;
            armorModel.rightLegging.visible = this.slot == EquipmentSlot.LEGS;
            armorModel.rightBoot.visible = this.slot == EquipmentSlot.FEET;
            armorModel.leftBoot.visible = this.slot == EquipmentSlot.FEET;
        } else {
            ArmorModelRegistry.setupPartVisibility(this.model, this.slot);
        }
    }

    @Override
    public void submit(@Nullable List<HelmetPreviewRenderState.Piece> pieces, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, int overlayCoords, boolean hasFoil, int outlineColor) {
        poseStack.pushPose();
        this.applyCommonTransform(poseStack);

        if (pieces != null) {
            // A configured helmet is built entirely from its chosen parts, so the stock model is skipped.
            for (HelmetPreviewRenderState.Piece piece : pieces) {
                piece.part().visible = true;
                submitNodeCollector.submitModelPart(
                        piece.part(),
                        poseStack,
                        piece.model().renderType(piece.texture()),
                        lightCoords,
                        overlayCoords,
                        null,
                        false,
                        hasFoil,
                        -1,
                        null,
                        outlineColor
                );
            }
            poseStack.popPose();
            return;
        }

        this.applyVisibility();

        submitNodeCollector.submitModelPart(
                this.model.root(),
                poseStack,
                this.model.renderType(this.texture),
                lightCoords,
                overlayCoords,
                null,
                false,
                hasFoil,
                -1,
                null,
                outlineColor
        );

        poseStack.popPose();
    }

    @Override
    public void getExtents(Consumer<Vector3fc> output) {
        PoseStack poseStack = new PoseStack();
        this.applyCommonTransform(poseStack);
        // Models are shared between items, so visibility has to be re-applied here: this may run
        // before any submit() call, and the result is memoized by SpecialModelWrapper.
        this.applyVisibility();
        VisibleModelExtents.collect(this.model.root(), poseStack, output);
    }

    public record Unbaked(Identifier item) implements SpecialModelRenderer.Unbaked<List<HelmetPreviewRenderState.Piece>> {
        public static final MapCodec<Unbaked> MAP_CODEC = RecordCodecBuilder.mapCodec(
                instance -> instance.group(
                        Identifier.CODEC.fieldOf("item").forGetter(Unbaked::item)
                ).apply(instance, Unbaked::new)
        );

        @Override
        public MapCodec<Unbaked> type() {
            return MAP_CODEC;
        }

        @Override
        public @Nullable SpecialArmorRenderer bake(SpecialModelRenderer.BakingContext context) {
            if (!BuiltInRegistries.ITEM.containsKey(this.item)) {
                return null;
            }

            Item registryItem = BuiltInRegistries.ITEM.getValue(this.item);

            // Don't create an ItemStack here - components aren't bound yet during model baking,
            // so models/textures are looked up by Item instead.
            HumanoidModel<?> model = ArmorModelRegistry.getModelFor(context.entityModelSet(), registryItem);
            if (model == null) {
                return null;
            }

            Identifier texture = ArmorModelRegistry.getTextureFor(registryItem);
            EquipmentSlot slot = resolveSlot(registryItem);
            return new SpecialArmorRenderer(model, texture, slot);
        }

        private static EquipmentSlot resolveSlot(Item item) {
            // Must not read the EQUIPPABLE data component here: item holders are not bound during model baking.
            return item instanceof BaseArmorItem armor ? armor.getEquipmentSlot() : EquipmentSlot.HEAD;
        }
    }
}
