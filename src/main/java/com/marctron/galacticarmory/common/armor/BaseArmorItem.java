package com.marctron.galacticarmory.common.armor;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class BaseArmorItem extends ArmorItem implements IClientItemExtensions{
    // Fields to hold the specific client-side model information
    ResourceLocation texture;
    // Pass the model definition details into the item's constructor
    public BaseArmorItem(
            Holder<ArmorMaterial> material,
            Type slot,
            Properties properties,
            ResourceLocation resourceLocation)
    {
        super(material, slot, properties.stacksTo(1));
        this.texture = resourceLocation;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
    @Override
    public @Nullable ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, ArmorMaterial.Layer layer, boolean innerModel) {
        return texture;
    }

}
