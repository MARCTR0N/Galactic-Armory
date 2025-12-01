package com.marctron.galacticarmory.common.item;

import net.minecraft.world.item.Item;
public class ComponentItem extends Item {

    public ComponentItem(Properties properties) {
        super(properties);
    }

   

    /*

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
    }*/

    private String capitalize(String input) {
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}