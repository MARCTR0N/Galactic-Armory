package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.armor.model.clone_armor_phase_1;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_arf;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_phase_1;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_phase_2;
import com.marctron.galacticarmory.common.util.registry.ModItems;
import net.minecraft.resources.Identifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterSpecialModelRendererEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = "galacticarmory", value = Dist.CLIENT)
public class ArmorRenderer {

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(
                clone_armor_phase_1.LAYER_LOCATION,
                clone_armor_phase_1::createBodyLayer
        );
        event.registerLayerDefinition(
                clone_helmet_phase_1.LAYER_LOCATION,
                clone_helmet_phase_1::createBodyLayer
        );
        event.registerLayerDefinition(
                clone_helmet_phase_2.LAYER_LOCATION,
                clone_helmet_phase_2::createBodyLayer
        );
        event.registerLayerDefinition(
                clone_helmet_arf.LAYER_LOCATION,
                clone_helmet_arf::createBodyLayer
        );
    }

    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {

        // Use a single IClientItemExtensions instance for cleaner code
        // Inside your IClientItemExtensions for the chest/legs/boots:

        SimpleArmorExtension phase1Body = new SimpleArmorExtension(
                clone_armor_phase_1.LAYER_LOCATION, clone_armor_phase_1::new, true);

        SimpleArmorExtension phase1Helmet = new SimpleArmorExtension(
                clone_helmet_phase_1.LAYER_LOCATION, clone_helmet_phase_1::new, false);

        SimpleArmorExtension phase2Helmet = new SimpleArmorExtension(
                clone_helmet_phase_2.LAYER_LOCATION, clone_helmet_phase_2::new, false);

        SimpleArmorExtension arfHelmet = new SimpleArmorExtension(
                clone_helmet_arf.LAYER_LOCATION, clone_helmet_arf::new, false);

        // 2. Register them to the items
        event.registerItem(phase1Body,
                ModItems.phase1_chestplate.get(),
                ModItems.phase1_leggings.get(),
                ModItems.phase1_boots.get()
        );

        event.registerItem(phase1Helmet, ModItems.phase1_helmet.get());
        event.registerItem(phase2Helmet, ModItems.phase2_helmet.get());
        event.registerItem(arfHelmet, ModItems.arf_helmet.get());

    }
    @SubscribeEvent
    public static void registerSpecialModelRenderers(RegisterSpecialModelRendererEvent event) {
        event.register(
                Identifier.fromNamespaceAndPath("galacticarmory", "armor"),
                SpecialArmorRenderer.Unbaked.MAP_CODEC
        );
    }

}