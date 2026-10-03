package com.marctron.galacticarmory.common.armor;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class CompositeHelmetModel extends HumanoidModel<HumanoidRenderState> {
    private HumanoidModel<HumanoidRenderState> baseModel;
    private final Map<String, HumanoidModel<HumanoidRenderState>> parts = new HashMap<>();

    public CompositeHelmetModel(ModelPart root) {
        super(root);
    }

    public void setBase(HumanoidModel<?> base) {
        if (base instanceof HumanoidModel<?>) {
            this.baseModel = (HumanoidModel<HumanoidRenderState>) base;
        }
    }

    public void addPart(String partName, HumanoidModel<?> partModel) {
        if (partModel instanceof HumanoidModel<?>) {
            parts.put(partName, (HumanoidModel<HumanoidRenderState>) partModel);
        }
    }

    @Override
    public void setupAnim(HumanoidRenderState poseStack) {
        super.setupAnim(poseStack);
        
        if (baseModel != null) {
            baseModel.setupAnim(poseStack);
        }
        
        for (HumanoidModel<HumanoidRenderState> part : parts.values()) {
            part.setupAnim(poseStack);
        }
    }
    
    public void renderParts(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        // Render base model first
        if (baseModel != null) {
            baseModel.renderToBuffer(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        }
        
        // Then render all parts
        for (HumanoidModel<HumanoidRenderState> part : parts.values()) {
            part.renderToBuffer(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        }
    }
}


