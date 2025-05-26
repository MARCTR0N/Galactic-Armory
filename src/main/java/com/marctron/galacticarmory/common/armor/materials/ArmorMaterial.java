package com.marctron.galacticarmory.common.armor.materials;

import com.mojang.serialization.Codec;
import net.minecraft.util.StringRepresentable;

public enum ArmorMaterial implements StringRepresentable {
    BESKAR("beskar"),
    DURASTEEL("durasteel"),
    PLASTOID("plastoid");

    public static final Codec<ArmorMaterial> CODEC = StringRepresentable.fromEnum(ArmorMaterial::values);
    
    private final String name;

    ArmorMaterial(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}