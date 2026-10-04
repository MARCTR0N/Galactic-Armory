package com.marctron.galacticarmory.client.renderer;

import com.marctron.galacticarmory.client.renderer.preview.HelmetPreviewAssembler;
import com.marctron.galacticarmory.client.renderer.preview.HelmetPreviewRenderState;
import com.marctron.galacticarmory.common.armor.HelmetConfiguration;
import com.marctron.galacticarmory.common.item.helmet.parts.HelmetPartEnum;
import com.marctron.galacticarmory.common.item.helmet.BaseHelmetItem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Map;

/**
 * Draws an assembled clone helmet on a worn head.
 *
 * <p>The vanilla armor layer can only draw one model with one texture, but an assembled helmet mixes
 * parts from different models and textures, so it gets its own layer and the stock armor model is
 * suppressed for configured helmets.
 */
public class CloneHelmetLayer<S extends HumanoidRenderState, M extends HumanoidModel<S>> extends RenderLayer<S, M> {

    public CloneHelmetLayer(RenderLayerParent<S, M> renderer) {
        super(renderer);
    }

    /** True when this helmet is assembled from parts and so must bypass the vanilla armor layer. */
    public static boolean isAssembled(ItemStack stack) {
        if (!(stack.getItem() instanceof BaseHelmetItem)) {
            return false;
        }
        Map<HelmetPartEnum, Item> loadout = HelmetConfiguration.readLoadout(stack);
        return loadout.containsKey(HelmetPartEnum.BASEHELMET);
    }

    @Override
    public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, S state, float yRot, float xRot) {
        if (state.isInvisible || !isAssembled(state.headEquipment)) {
            return;
        }

        Map<HelmetPartEnum, Item> loadout = HelmetConfiguration.readLoadout(state.headEquipment);
        List<HelmetPreviewRenderState.Piece> pieces = HelmetPreviewAssembler.assemble(loadout);
        if (pieces.isEmpty()) {
            return;
        }

        poseStack.pushPose();
        // Parts are authored as children of the humanoid head, so inherit the head's pose.
        this.getParentModel().head.translateAndRotate(poseStack);

        for (HelmetPreviewRenderState.Piece piece : pieces) {
            piece.part().visible = true;
            submitNodeCollector.submitModelPart(
                    piece.part(),
                    poseStack,
                    piece.model().renderType(piece.texture()),
                    lightCoords,
                    OverlayTexture.NO_OVERLAY,
                    null,
                    false,
                    false,
                    -1,
                    null,
                    state.outlineColor
            );
        }

        poseStack.popPose();
    }
}
