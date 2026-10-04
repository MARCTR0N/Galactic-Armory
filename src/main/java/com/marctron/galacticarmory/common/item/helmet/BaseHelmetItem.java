package com.marctron.galacticarmory.common.item.helmet;

import net.minecraft.resources.Identifier;
import net.minecraft.world.item.equipment.ArmorType;

public class BaseHelmetItem extends BaseArmorItem {
    public BaseHelmetItem(Properties properties, Identifier resourceLocation) {
        super(properties, resourceLocation, ArmorType.HELMET);
    }
}
