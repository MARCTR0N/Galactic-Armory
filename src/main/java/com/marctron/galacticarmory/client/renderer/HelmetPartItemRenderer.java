package com.marctron.galacticarmory.client.renderer;

import com.marctron.galacticarmory.common.armor.ArmorModelRegistry;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.NoDataSpecialModelRenderer;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

import java.util.function.Consumer;
import java.util.function.Function;

public class HelmetPartItemRenderer implements NoDataSpecialModelRenderer {
    private final HumanoidModel<?> model;
    private final Identifier texture;
    private final ModelPart targetPart;

    public HelmetPartItemRenderer(HumanoidModel<?> model, Identifier texture, ModelPart targetPart) {
        this.model = model;
        this.texture = texture;
        this.targetPart = targetPart;
    }

    private void applyCommonTransform(PoseStack poseStack) {
        // 0.4 keeps the part centred in the item cell, matching SpecialArmorRenderer's head transform.
        poseStack.translate(0.5F, 0.4F, 0.5F);
        poseStack.mulPose(Axis.ZN.rotationDegrees(-15));
        poseStack.mulPose(Axis.XN.rotationDegrees(-15));
        poseStack.scale(1.0F, -1.0F, -1.0F);
    }

    @Override
    public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, int overlayCoords, boolean hasFoil, int outlineColor) {
        poseStack.pushPose();
        this.applyCommonTransform(poseStack);

        // Only the requested sub-part is submitted, so no model-wide visibility juggling is needed.
        this.targetPart.visible = true;
        submitNodeCollector.submitModelPart(
                this.targetPart,
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
        this.targetPart.visible = true;
        VisibleModelExtents.collect(this.targetPart, poseStack, output);
    }

    public record Unbaked(Identifier item, String part) implements NoDataSpecialModelRenderer.Unbaked {
        public static final MapCodec<Unbaked> MAP_CODEC = RecordCodecBuilder.mapCodec(
                instance -> instance.group(
                        Identifier.CODEC.fieldOf("item").forGetter(Unbaked::item),
                        Codec.STRING.fieldOf("part").forGetter(Unbaked::part)
                ).apply(instance, Unbaked::new)
        );

        @Override
        public MapCodec<Unbaked> type() {
            return MAP_CODEC;
        }

        @Override
        public @Nullable HelmetPartItemRenderer bake(SpecialModelRenderer.BakingContext context) {
            if (!BuiltInRegistries.ITEM.containsKey(this.item)) {
                return null;
            }

            Item registryItem = BuiltInRegistries.ITEM.getValue(this.item);
            HumanoidModel<?> model = ArmorModelRegistry.getModelFor(context.entityModelSet(), registryItem);
            if (model == null) {
                return null;
            }

            ModelPart targetPart = findPart(model.root(), this.part);
            if (targetPart == null) {
                return null;
            }

            return new HelmetPartItemRenderer(model, ArmorModelRegistry.getTextureFor(registryItem), targetPart);
        }

        private static @Nullable ModelPart findPart(ModelPart root, String name) {
            // createPartLookup walks the whole hierarchy and returns null instead of throwing,
            // unlike ModelPart#getChild which only looks at direct children.
            Function<String, @Nullable ModelPart> lookup = root.createPartLookup();
            return lookup.apply(name);
        }
    }
}
