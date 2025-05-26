package com.marctron.galacticarmory.common.util.registry;

import com.marctron.galacticarmory.GalacticArmory;
import com.marctron.galacticarmory.common.armor.materials.ArmorMaterial;
import com.marctron.galacticarmory.common.item.ComponentItem;
import com.marctron.galacticarmory.common.item.ModularChestplateItem;
import com.marctron.galacticarmory.common.util.ModDataComponents;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GalacticArmory.MODID);

	public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
	
	public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GalacticArmory.MODID, name));
    }
	
	
	public static final DeferredItem<Item> EXAMPLE_ITEM = 
		ITEMS.registerSimpleItem("example_item", new Item.Properties());
	
	// ARMOR COMPONENTS ---
	public static final DeferredItem<Item> SHOULDER_PAD =
			ITEMS.register("shoulder_pad", () -> 
		    new ComponentItem(new ComponentItem.Properties()
		            .setId(itemId("shoulder_pad"))
		            .component(ModDataComponents.ARMOR_MATERIAL, ArmorMaterial.PLASTOID)
		    		));
	public static final DeferredItem<Item> ELBOW_COVER =
		    ITEMS.register("elbow_cover", () -> 
		    	new ComponentItem(new ComponentItem.Properties()
		    			.setId(itemId("elbow_cover"))
			            .component(ModDataComponents.ARMOR_MATERIAL, ArmorMaterial.PLASTOID)
		    			));	
	public static final DeferredItem<Item> GLOVE =
		    ITEMS.register("glove", () -> 
		    	new ComponentItem(new ComponentItem.Properties()
		    			.setId(itemId("glove"))
			            .component(ModDataComponents.ARMOR_MATERIAL, ArmorMaterial.PLASTOID)
		    			));
	
	// MODULAR ARMOR ---
    public static final DeferredItem<Item> MODULAR_CHESTPLATE =
        ITEMS.registerSimpleItem("modular_chestplate", new ModularChestplateItem.Properties().stacksTo(1));

   
}