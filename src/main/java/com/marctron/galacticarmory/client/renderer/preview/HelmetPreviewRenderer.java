package com.marctron.galacticarmory.client.renderer.preview;

import com.mojang.blaze3d.platform.Lighting;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.render.pip.PictureInPictureRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.texture.OverlayTexture;

/**
 * Draws the assembled helmet into an off-screen texture that the armor assembler screen blits,
 * giving the GUI a real 3D, rotatable preview.
 */
public class HelmetPreviewRenderer extends PictureInPictureRenderer<HelmetPreviewRenderState> {
    private static final int FULL_BRIGHT = 15728880;

    public HelmetPreviewRenderer(MultiBufferSource.BufferSource bufferSource) {
        super(bufferSource);
    }

    @Override
    public Class<HelmetPreviewRenderState> getRenderStateClass() {
        return HelmetPreviewRenderState.class;
    }

    @Override
    protected void renderToTexture(HelmetPreviewRenderState state, PoseStack poseStack) {
        Minecraft.getInstance().gameRenderer.getLighting().setupFor(Lighting.Entry.ENTITY_IN_UI);

        // The PiP projection already mirrors Z, and entity models are authored with +Y pointing down,
        // so the geometry is upright as-is; only centre the skull on the origin and spin it.
        poseStack.mulPose(Axis.XP.rotationDegrees(state.pitch()));
        poseStack.mulPose(Axis.YP.rotationDegrees(state.yaw()));
        poseStack.translate(0.0F, 0.25F, 0.0F);

        for (HelmetPreviewRenderState.Piece piece : state.pieces()) {
            VertexConsumer buffer = this.bufferSource.getBuffer(piece.model().renderType(piece.texture()));
            piece.part().render(poseStack, buffer, FULL_BRIGHT, OverlayTexture.NO_OVERLAY);
        }
    }

    @Override
    protected float getTranslateY(int height, int guiScale) {
        return height / 2.0F;
    }

    @Override
    protected String getTextureLabel() {
        return "galacticarmory helmet preview";
    }
}
