package com.marctron.galacticarmory.common.armor.parts.helmet;

import com.marctron.galacticarmory.common.armor.parts.HelmetPartEnum;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;

public class BasePart extends Item {
    private final HelmetPartEnum helmetPartEnum;

    public BasePart(HelmetPartEnum helmetPartEnum, ArmorMaterial material) {
        super(new Properties().stacksTo(1));
        this.helmetPartEnum = helmetPartEnum;
    }

    public HelmetPartEnum getHelmetPartEnum() {
        return helmetPartEnum;
    }
}
