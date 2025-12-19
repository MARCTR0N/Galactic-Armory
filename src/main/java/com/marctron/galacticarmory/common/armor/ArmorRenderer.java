package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.armor.model.clone_armor_phase_1;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_arf;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_phase_1;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_phase_2;
import com.marctron.galacticarmory.common.util.registry.ModItems;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = "galacticarmory", bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArmorRenderer extends BlockEntityWithoutLevelRenderer {

    private static ArmorRenderer bewlr;
    public ArmorRenderer(BlockEntityRenderDispatcher blockEntityRenderDispatcher, EntityModelSet entityModelSet) {
        super(blockEntityRenderDispatcher, entityModelSet);
        ArmorModelRegistry.init();
    }

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


    public static ArmorRenderer getBewlr() {
        if (bewlr == null) {
            bewlr = new ArmorRenderer(
                    Minecraft.getInstance().getBlockEntityRenderDispatcher(),
                    Minecraft.getInstance().getEntityModels()
            );
        }
        return bewlr;
    }
    @Override
    public void renderByItem(ItemStack stack, ItemDisplayContext displayContext, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        HumanoidModel<?> model = ArmorModelRegistry.getModelFor(stack);
        ResourceLocation texture = ArmorModelRegistry.getTextureFor(stack);

        if (model != null && texture != null) {
            poseStack.pushPose();

            // 1. Position the model in the inventory slot
            // Most armor models need to be flipped and lowered to center them
            if (!(stack.getItem() instanceof  BaseHelmetItem helmetItem))
            {
                poseStack.translate(0.5f, 1.5f, 0.5f);
            }
            else{
                poseStack.translate(0.5f,0.4f,0.5f);
                poseStack.mulPose(Axis.ZN.rotationDegrees(-15));
                poseStack.mulPose(Axis.XN.rotationDegrees(-15));
            }
            poseStack.scale(1.0f, -1.0f, -1.0f);

            // 2. Filter parts (e.g., if it's a helmet item, hide the boots)
            if (stack.getItem() instanceof ArmorItem armor) {
                ArmorModelRegistry.setupPartVisibility(model, armor.getType().getSlot());
            }

            // 3. Render
            VertexConsumer vc = buffer.getBuffer(RenderType.entityCutoutNoCull(texture));
            model.renderToBuffer(poseStack, vc, packedLight, packedOverlay, -1);

            poseStack.popPose();
        }
    }
}