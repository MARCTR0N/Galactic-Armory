package com.marctron.galacticarmory.common.armor;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;

public class BaseHelmetItem extends BaseArmorItem{
    public BaseHelmetItem(Holder<ArmorMaterial> material, Type slot, Properties properties, ResourceLocation resourceLocation) {
        super(material, slot, properties, resourceLocation);
    }
}
