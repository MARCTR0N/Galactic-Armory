package com.marctron.galacticarmory.common.armor;

import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class BaseArmorItem extends Item {
    // Fields to hold the specific client-side model information
    private final Identifier texture;

    public BaseArmorItem(Properties properties, Identifier resourceLocation) {
        super(properties.stacksTo(1));
        this.texture = resourceLocation;
    }




    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
    public @Nullable Identifier getArmorTexture(ItemStack stack) {
        return texture;
    }

}
