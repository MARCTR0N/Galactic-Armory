package com.marctron.galacticarmory.common.armor.parts.helmet;

import com.marctron.galacticarmory.GalacticArmory;
import com.marctron.galacticarmory.common.armor.parts.HelmetPartEnum;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;

public class BasePart extends Item {
    private final HelmetPartEnum helmetPartEnum;

    public BasePart(HelmetPartEnum helmetPartEnum, ArmorMaterial material, String name) {
        super(new Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GalacticArmory.MODID, name))).stacksTo(1));
        this.helmetPartEnum = helmetPartEnum;
    }

    public HelmetPartEnum getHelmetPartEnum() {
        return helmetPartEnum;
    }
}
