package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.armor.model.clone_armor_phase_1;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
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
    public HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
        ModelPart root = Minecraft.getInstance().getEntityModels().bakeLayer(layerLocation);
        HumanoidModel<?> model = modelFactory.apply(root);

        // This one line replaces manually setting crouching, riding, etc.
        original.copyPropertiesTo((HumanoidModel) model);

        // Handle visibility if it's the body armor class (Phase 1 Armor)
        if (isBodyArmor && model instanceof clone_armor_phase_1 armor) {
            armor.chest.visible = equipmentSlot == EquipmentSlot.CHEST;
            armor.left_arm.visible = equipmentSlot == EquipmentSlot.CHEST;
            armor.right_arm.visible = equipmentSlot == EquipmentSlot.CHEST;
            armor.leftLegging.visible = equipmentSlot == EquipmentSlot.LEGS;
            armor.rightLegging.visible = equipmentSlot == EquipmentSlot.LEGS;
            armor.rightBoot.visible = equipmentSlot == EquipmentSlot.FEET;
            armor.leftBoot.visible = equipmentSlot == EquipmentSlot.FEET;
        }

        return model;
    }
    @Override
    public BlockEntityWithoutLevelRenderer getCustomRenderer() {
        return ArmorRenderer.getBewlr();
    }
}