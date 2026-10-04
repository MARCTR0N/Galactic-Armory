package com.marctron.galacticarmory.common.item.helmet;

import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorType;
import org.jetbrains.annotations.Nullable;

public class BaseArmorItem extends Item {
    // Fields to hold the specific client-side model information
    private final Identifier texture;
    private final ArmorType armorType;

    public BaseArmorItem(Properties properties, Identifier resourceLocation, ArmorType armorType) {
        super(properties.stacksTo(1));
        this.texture = resourceLocation;
        this.armorType = armorType;
    }

    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    public @Nullable Identifier getArmorTexture(ItemStack stack) {
        return texture;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    /**
     * Readable during model baking, unlike the EQUIPPABLE data component whose holder
     * is not bound yet at that point.
     */
    public EquipmentSlot getEquipmentSlot() {
        return armorType.getSlot();
    }
}
