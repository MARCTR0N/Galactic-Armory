package com.marctron.galacticarmory.common.item;

import java.util.function.Consumer;

import com.marctron.galacticarmory.common.armor.materials.ArmorMaterial;
import com.marctron.galacticarmory.common.util.ModDataComponents;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

public class ModularChestplateItem extends Item {
    public ModularChestplateItem(Properties properties) {
        super(properties);
    }

    @Override
    public Component getName(ItemStack stack) {
        ArmorMaterial material = stack.get(ModDataComponents.ARMOR_MATERIAL);
        String prefix = (material != null) ? capitalize(material.getSerializedName()) + " " : "";
        return Component.literal(prefix + "Chestplate");
    }

    @Override
    public void appendHoverText(ItemStack stack,
                                TooltipContext context,
                                TooltipDisplay tooltipDisplay,
                                Consumer<Component> tooltipAdder,
                                TooltipFlag flag) {
        ArmorMaterial material = stack.get(ModDataComponents.ARMOR_MATERIAL);
        if (material != null) {
            tooltipAdder.accept(Component.literal("Material: " + capitalize(material.getSerializedName())));
        } else {
            tooltipAdder.accept(Component.literal("Material: Unknown"));
        }
    }

    private String capitalize(String input) {
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}