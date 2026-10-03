package com.marctron.galacticarmory.common.network;

import com.marctron.galacticarmory.GalacticArmory;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber(modid = GalacticArmory.MODID)
public class ModNetwork {

    @SubscribeEvent
    public static void register(RegisterPayloadHandlersEvent event) {
        PayloadRegistrar registrar = event.registrar("1");
        registrar.playToServer(
                ApplyHelmetConfigPayload.TYPE,
                ApplyHelmetConfigPayload.STREAM_CODEC,
                ApplyHelmetConfigPayload::handle
        );
    }
}
