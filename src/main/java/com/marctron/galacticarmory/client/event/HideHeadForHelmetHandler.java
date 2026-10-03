package com.marctron.galacticarmory.client.event;

import com.marctron.galacticarmory.client.renderer.CloneHelmetLayer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderLivingEvent;

/**
 * Hides the wearer's head while an assembled clone helmet is worn.
 *
 * <p>The base part reuses the vanilla head cube, so without this the skin z-fights through the
 * helmet. This runs on {@code Pre} because the body model is submitted before render layers.
 */
@EventBusSubscriber(modid = "galacticarmory", value = Dist.CLIENT)
public class HideHeadForHelmetHandler {

    @SubscribeEvent
    public static void onRenderLivingPre(RenderLivingEvent.Pre<?, ?, ?> event) {
        if (!(event.getRenderState() instanceof HumanoidRenderState state)) {
            return;
        }
        if (!(event.getRenderer().getModel() instanceof HumanoidModel<?> model)) {
            return;
        }
        // Models are shared between entities, so visibility must be restored explicitly.
        boolean hidden = CloneHelmetLayer.isAssembled(state.headEquipment);
        model.head.visible = !hidden;
        model.hat.visible = !hidden;
    }
}
