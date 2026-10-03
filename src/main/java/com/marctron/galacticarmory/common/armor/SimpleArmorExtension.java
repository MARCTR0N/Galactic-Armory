package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.armor.model.clone_armor_phase_1;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_arf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;

import java.util.function.Function;

public class SimpleArmorExtension implements IClientItemExtensions {
    private final ModelLayerLocation layerLocation;
    private final Function<ModelPart, HumanoidModel<?>> modelFactory;
    private final boolean isBodyArmor;

    public SimpleArmorExtension(ModelLayerLocation layerLocation, Function<ModelPart, HumanoidModel<?>> modelFactory, boolean isBodyArmor) {
        this.layerLocation = layerLocation;
        this.modelFactory = modelFactory;
        this.isBodyArmor = isBodyArmor;
    }

    @Override
    public Model getGenericArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
        if (!(original instanceof HumanoidModel<?> originalHumanoid)) {
            return original;
        }

        String itemPath = BuiltInRegistries.ITEM.getKey(itemStack.getItem()).getPath();
        boolean isHelmet = itemPath.contains("helmet");
        boolean isChest = itemPath.contains("chestplate");
        boolean isLegs = itemPath.contains("leggings");
        boolean isFeet = itemPath.contains("boots");

        HumanoidModel<?> model;
        
        // For helmets, determine which model to use
        if (isHelmet) {
            // Look up specific helmet variant from registry
            model = HelmetModelRegistry.getHelmetModel(itemPath);
        } else {
            // For body armor, use default layer
            ModelPart root = bakeModelRoot();
            model = modelFactory.apply(root);
        }

        // Only render parts for the current armor piece.
        model.head.visible = isHelmet;
        model.hat.visible = isHelmet;
        model.body.visible = isChest;
        model.rightArm.visible = isChest;
        model.leftArm.visible = isChest;
        model.rightLeg.visible = isLegs || isFeet;
        model.leftLeg.visible = isLegs || isFeet;

        // Prevent player skin head from clipping through custom full helmets.
        if (isHelmet) {
            originalHumanoid.head.visible = false;
            originalHumanoid.hat.visible = false;
        }

        // Handle visibility if it's the body armor class (Phase 1 Armor)
        if (isBodyArmor && model instanceof clone_armor_phase_1 armor) {
            armor.chest.visible = isChest;
            armor.left_arm.visible = isChest;
            armor.right_arm.visible = isChest;
            armor.leftLegging.visible = isLegs;
            armor.rightLegging.visible = isLegs;
            armor.rightBoot.visible = isFeet;
            armor.leftBoot.visible = isFeet;
        }

        return model;
    }


    private ModelPart bakeModelRoot() {
        // Fallback to local layer definitions so all HumanoidModel base parts exist.
        if (layerLocation.equals(clone_armor_phase_1.LAYER_LOCATION)) {
            return clone_armor_phase_1.createBodyLayer().bakeRoot();
        }
        if (layerLocation.equals(clone_helmet_arf.LAYER_LOCATION)) {
            return clone_helmet_arf.createBodyLayer().bakeRoot();
        }
        return Minecraft.getInstance().getEntityModels().bakeLayer(layerLocation);
    }
}