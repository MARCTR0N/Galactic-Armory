package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.model.clone_armor_phase_1;
import com.marctron.galacticarmory.common.model.helmet.parts.base.phase_1_clone_base;
import com.marctron.galacticarmory.common.model.helmet.parts.fin.phase_1_clone_fin;
import com.marctron.galacticarmory.common.model.helmet.parts.visor.phase_1_clone_visor;
import com.marctron.galacticarmory.common.model.helmet.parts.base.phase_2_clone_base;
import com.marctron.galacticarmory.common.model.helmet.parts.fin.phase_2_clone_fin;
import com.marctron.galacticarmory.common.model.helmet.parts.visor.phase_2_clone_visor;
import com.marctron.galacticarmory.common.model.helmet.parts.base.arf_clone_base;
import com.marctron.galacticarmory.common.model.helmet.parts.visor.arf_clone_visor;
import com.marctron.galacticarmory.common.model.helmet.parts.sunvisor.arf_clone_sunvisor;
import com.marctron.galacticarmory.common.model.helmet.parts.sunvisor.phase_1_clone_sunvisor;
import com.marctron.galacticarmory.common.model.helmet.parts.rangefinder.phase_1_clone_rangefinder;
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
                clone_helmet_arf.LAYER_LOCATION,
                clone_helmet_arf::createBodyLayer
        );
        event.registerLayerDefinition(
                phase_1_clone_base.LAYER_LOCATION,
                phase_1_clone_base::createBodyLayer
        );
        event.registerLayerDefinition(
                phase_1_clone_fin.LAYER_LOCATION,
                phase_1_clone_fin::createBodyLayer
        );
        event.registerLayerDefinition(
                phase_1_clone_visor.LAYER_LOCATION,
                phase_1_clone_visor::createBodyLayer
        );
        event.registerLayerDefinition(
                phase_2_clone_base.LAYER_LOCATION,
                phase_2_clone_base::createBodyLayer
        );
        event.registerLayerDefinition(
                phase_2_clone_fin.LAYER_LOCATION,
                phase_2_clone_fin::createBodyLayer
        );
        event.registerLayerDefinition(
                phase_2_clone_visor.LAYER_LOCATION,
                phase_2_clone_visor::createBodyLayer
        );
        event.registerLayerDefinition(
                phase_1_clone_sunvisor.LAYER_LOCATION,
                phase_1_clone_sunvisor::createBodyLayer
        );
        event.registerLayerDefinition(
                phase_1_clone_rangefinder.LAYER_LOCATION,
                phase_1_clone_rangefinder::createBodyLayer
        );
        event.registerLayerDefinition(
                arf_clone_base.LAYER_LOCATION,
                arf_clone_base::createBodyLayer
        );
        event.registerLayerDefinition(
                arf_clone_visor.LAYER_LOCATION,
                arf_clone_visor::createBodyLayer
        );
        event.registerLayerDefinition(
                arf_clone_sunvisor.LAYER_LOCATION,
                arf_clone_sunvisor::createBodyLayer
        );
    }

    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {

        // Use a single IClientItemExtensions instance for cleaner code
        // Inside your IClientItemExtensions for the chest/legs/boots:

        SimpleArmorExtension phase1Body = new SimpleArmorExtension(
                clone_armor_phase_1.LAYER_LOCATION, clone_armor_phase_1::new, true);


        SimpleArmorExtension arfHelmet = new SimpleArmorExtension(
                clone_helmet_arf.LAYER_LOCATION, clone_helmet_arf::new, false);

        // 2. Register them to the items
        event.registerItem(phase1Body,
                ModItems.phase1_chestplate.get(),
                ModItems.phase1_leggings.get(),
                ModItems.phase1_boots.get()
        );

        // Assembled helmets are drawn by CloneHelmetLayer instead, so the stock armor model is hidden.
        event.registerItem(new AssembledHelmetExtension(), ModItems.clone_helmet.get());

    }

    @SubscribeEvent
    public static void addLayers(EntityRenderersEvent.AddLayers event) {
        for (net.minecraft.world.entity.player.PlayerModelType type : event.getSkins()) {
            addLayerTo(event.getPlayerRenderer(type));
            addLayerTo(event.getMannequinRenderer(type));
        }
        for (net.minecraft.world.entity.EntityType<?> entityType : event.getEntityTypes()) {
            addLayerTo(event.getRenderer(entityType));
        }
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static void addLayerTo(Object renderer) {
        if (!(renderer instanceof net.minecraft.client.renderer.entity.LivingEntityRenderer<?, ?, ?> living)) {
            return;
        }
        if (!(living.getModel() instanceof net.minecraft.client.model.HumanoidModel<?>)) {
            return;
        }
        living.addLayer(new com.marctron.galacticarmory.client.renderer.CloneHelmetLayer(
                (net.minecraft.client.renderer.entity.RenderLayerParent) living));
    }

    @SubscribeEvent
    public static void registerSpecialModelRenderers(RegisterSpecialModelRendererEvent event) {
        event.register(
                Identifier.fromNamespaceAndPath("galacticarmory", "armor"),
                SpecialArmorRenderer.Unbaked.MAP_CODEC
        );
        event.register(
                Identifier.fromNamespaceAndPath("galacticarmory", "helmet_part"),
                com.marctron.galacticarmory.client.renderer.HelmetPartItemRenderer.Unbaked.MAP_CODEC
        );
    }

}