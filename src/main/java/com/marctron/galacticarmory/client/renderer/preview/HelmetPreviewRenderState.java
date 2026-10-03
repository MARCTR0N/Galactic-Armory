package com.marctron.galacticarmory.client.renderer.preview;

import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.state.gui.pip.PictureInPictureRenderState;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.Nullable;

import java.util.List;

/**
 * Immutable snapshot of the assembled helmet shown in the armor assembler, drawn off-screen by
 * {@link HelmetPreviewRenderer}.
 */
public record HelmetPreviewRenderState(
        List<Piece> pieces,
        float yaw,
        float pitch,
        int x0,
        int y0,
        int x1,
        int y1,
        float scale,
        @Nullable ScreenRectangle scissorArea,
        @Nullable ScreenRectangle bounds
) implements PictureInPictureRenderState {

    public HelmetPreviewRenderState(
            List<Piece> pieces, float yaw, float pitch,
            int x0, int y0, int x1, int y1, float scale, @Nullable ScreenRectangle scissorArea
    ) {
        this(pieces, yaw, pitch, x0, y0, x1, y1, scale, scissorArea,
                PictureInPictureRenderState.getBounds(x0, y0, x1, y1, scissorArea));
    }

    /**
     * One drawable chunk of the helmet. The model is kept alongside the part purely to obtain its
     * {@code renderType}.
     */
    public record Piece(HumanoidModel<?> model, ModelPart part, Identifier texture) {
    }
}
