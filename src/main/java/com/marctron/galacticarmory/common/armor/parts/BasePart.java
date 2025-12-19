package com.marctron.galacticarmory.common.armor.parts;

import com.ibm.icu.text.MessagePattern;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.Item;

public class BasePart extends Item {
    private HelmetPartEnum helmetPartEnum;
    private String material = "";
    public BasePart(HelmetPartEnum helmetPartEnum) {
        super(new Properties().stacksTo(1));
        this.helmetPartEnum = helmetPartEnum;
    }

    public String getMaterial() {
        return material;
    }

    public HelmetPartEnum getHelmetPartEnum() {
        return helmetPartEnum;
    }
}
