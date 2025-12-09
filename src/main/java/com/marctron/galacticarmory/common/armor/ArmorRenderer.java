package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.armor.model.clone_armor_phase_1;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_phase_1;
import com.marctron.galacticarmory.common.util.registry.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = "galacticarmory", bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
        // Note: If clone_helmet_phase_1 is a separate model, register it here too.
        // event.registerLayerDefinition(
        //         clone_helmet_phase_1.LAYER_LOCATION,
        //         clone_helmet_phase_1::createBodyLayer
        // );
    }

    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {

        // Use a single IClientItemExtensions instance for cleaner code
        // Inside your IClientItemExtensions for the chest/legs/boots:

        IClientItemExtensions armorExtensions = new IClientItemExtensions() {
            @Override
            public HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                ModelPart root = Minecraft.getInstance().getEntityModels().bakeLayer(clone_armor_phase_1.LAYER_LOCATION);
                clone_armor_phase_1 model = new clone_armor_phase_1(root);
                boolean isChestSlot = equipmentSlot == EquipmentSlot.CHEST;
                boolean isLegsSlot = equipmentSlot == EquipmentSlot.LEGS;
                boolean isFeetSlot = equipmentSlot == EquipmentSlot.FEET;

                // Torso and Arms Visibility: MUST be true ONLY for the CHEST slot.
                model.body.visible = isChestSlot;
                model.right_arm.visible = isChestSlot;
                model.left_arm.visible = isChestSlot;
                model.shirt.visible = isChestSlot;
                model.chestplate.visible = isChestSlot;
                model.stomach.visible = isChestSlot;
                model.belt.visible = isChestSlot;
                model.back.visible = isChestSlot;
                // Leg Visibility: True for BOTH Leggings and Boots.
                boolean isLowerBody = isLegsSlot || isFeetSlot;
                model.left_leg.visible = isLegsSlot;
                model.right_leg.visible = isLegsSlot;
                model.rightThigh.visible = isLegsSlot;
                model.rightKnee.visible = isLegsSlot;
                model.rightShin.visible = isLegsSlot;
                model.leftShin.visible = isLegsSlot;
                model.leftKnee.visible = isLegsSlot;
                model.leftThigh.visible = isLegsSlot;

                // Feet/Boots (must be explicitly controlled if they are distinct fields)
                model.rightBoot.visible = isFeetSlot;
                model.leftBoot.visible = isFeetSlot;
                if(equipmentSlot == EquipmentSlot.LEGS)
                {
                    //System.out.println(model.body.visible);
                }

                // You also need to control the boots specifically (if they are not children of legs)
                // Since rightBoot/leftBoot are fields, you might need to control them separately:
                // IMPORTANT: If rightBoot/leftBoot are children of right_leg/left_leg, you ONLY need to set
                // right_leg.visible and the child parts will follow. If they are root parts, use:
                // model.rightBoot.visible = original.rightLeg.visible;
                // model.leftBoot.visible = original.leftLeg.visible;

                return model;
            }
        };

        // Register the shared extension for all four armor items
        event.registerItem(new IClientItemExtensions() {
            @Override
            public HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                // IMPORTANT FIX: Use the LAYER_LOCATION of the model class you are instantiating.
                // Since you are using clone_armor_phase_1 for all slots, use its LAYER_LOCATION.

                ModelPart root = Minecraft.getInstance().getEntityModels().bakeLayer(clone_helmet_phase_1.LAYER_LOCATION);
                clone_helmet_phase_1 model = new clone_helmet_phase_1(root);

                // Set the model parts to match the vanilla model parts for correct movement.
                model.crouching = original.crouching;
                model.riding = original.riding;
                model.young = original.young;
                return model;
            }
        }, ModItems.phase1_helmet.get());
        event.registerItem(armorExtensions, ModItems.phase1_chestplate.get());
        event.registerItem(armorExtensions, ModItems.phase1_leggings.get());
        event.registerItem(armorExtensions, ModItems.phase1_boots.get());
    }
}