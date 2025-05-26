package com.marctron.galacticarmory.common.item;

import java.util.function.Consumer;

import com.marctron.galacticarmory.common.armor.materials.ArmorMaterial;
import com.marctron.galacticarmory.common.util.ModDataComponents;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
public class ComponentItem extends Item {

    public ComponentItem(Properties properties) {
        super(properties);
    }

   


    @Override
    public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
    	
    	ArmorMaterial material = stack.get(ModDataComponents.ARMOR_MATERIAL);
    	//System.out.println(material);
    	super.inventoryTick(stack, level, entity, slot);
    }
    
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> tooltipAdder, TooltipFlag flag) {
        ArmorMaterial material = stack.get(ModDataComponents.ARMOR_MATERIAL);
        if (material != null) {
            tooltipAdder.accept(Component.literal("Material: " + capitalize(material.getSerializedName())).withColor(0xee6217));
        } else {
            tooltipAdder.accept(Component.literal("Material: Unknown").withColor(0xee6217));
        }
    }

    private String capitalize(String input) {
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}