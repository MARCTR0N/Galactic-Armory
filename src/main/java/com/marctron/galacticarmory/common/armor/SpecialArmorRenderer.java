package com.marctron.galacticarmory.common.armor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.NoDataSpecialModelRenderer;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

import java.util.function.Consumer;

public class SpecialArmorRenderer implements NoDataSpecialModelRenderer {
    private final HumanoidModel<?> model;
    private final Identifier texture;
    private final EquipmentSlot slot;

    public SpecialArmorRenderer(HumanoidModel<?> model, Identifier texture, EquipmentSlot slot) {
        this.model = model;
        this.texture = texture;
        this.slot = slot;
    }

    @Override
    public @Nullable Void extractArgument(ItemStack stack) {
        return null;
    }

    private void applyCommonTransform(PoseStack poseStack) {
        poseStack.translate(0.5F, this.slot == EquipmentSlot.HEAD ? 0.4F : 1.5F, 0.5F);
        if (this.slot == EquipmentSlot.HEAD) {
            poseStack.mulPose(Axis.ZN.rotationDegrees(-15));
            poseStack.mulPose(Axis.XN.rotationDegrees(-15));
        }
        poseStack.scale(1.0F, -1.0F, -1.0F);
    }

    @Override
    public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, int overlayCoords, boolean hasFoil, int outlineColor) {
        poseStack.pushPose();
        this.applyCommonTransform(poseStack);

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
        this.model.root().getExtentsForGui(poseStack, output);
    }

    public record Unbaked(Identifier item) implements NoDataSpecialModelRenderer.Unbaked {
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
            ArmorModelRegistry.init();

            if (!BuiltInRegistries.ITEM.containsKey(this.item)) {
                return null;
            }

            Item registryItem = BuiltInRegistries.ITEM.getValue(this.item);

            ItemStack stack = new ItemStack(registryItem);
            HumanoidModel<?> model = ArmorModelRegistry.getModelFor(stack);
            Identifier texture = ArmorModelRegistry.getTextureFor(stack);
            if (model == null || texture == null) {
                return null;
            }

            EquipmentSlot slot = resolveSlot(this.item);
            return new SpecialArmorRenderer(model, texture, slot);
        }

        private static EquipmentSlot resolveSlot(Identifier itemId) {
            String path = itemId.getPath();
            if (path.contains("helmet")) {
                return EquipmentSlot.HEAD;
            }
            if (path.contains("chestplate")) {
                return EquipmentSlot.CHEST;
            }
            if (path.contains("leggings")) {
                return EquipmentSlot.LEGS;
            }
            return EquipmentSlot.FEET;
        }
    }
}
