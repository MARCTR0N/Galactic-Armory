package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.client.renderer.CloneHelmetLayer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;

/**
 * Hides the stock armor model for helmets that have been assembled from parts; those are drawn by
 * {@link CloneHelmetLayer}, which can mix models and textures the single-model armor layer cannot.
 */
public class AssembledHelmetExtension implements IClientItemExtensions {

    @Override
    public Model getGenericArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
        if (original instanceof HumanoidModel<?> humanoid && CloneHelmetLayer.isAssembled(itemStack)) {
            humanoid.head.visible = false;
            humanoid.hat.visible = false;
            humanoid.body.visible = false;
            humanoid.rightArm.visible = false;
            humanoid.leftArm.visible = false;
            humanoid.rightLeg.visible = false;
            humanoid.leftLeg.visible = false;
        }
        return original;
    }
}
