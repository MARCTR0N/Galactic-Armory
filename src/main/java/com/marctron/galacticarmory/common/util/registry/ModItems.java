package com.marctron.galacticarmory.common.util.registry;

import com.marctron.galacticarmory.GalacticArmory;
import com.marctron.galacticarmory.common.armor.BaseArmorItem;
import com.marctron.galacticarmory.common.armor.BaseHelmetItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GalacticArmory.MODID);

	public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
	
	public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GalacticArmory.MODID, name));
    }

    public static final Supplier<Item> phase1_helmet = createHelmet("clone_helmet_phase_1", ArmorMaterials.DIAMOND, ArmorType.HELMET, "textures/models/armor/clone_helmet_phase_1.png");
    public static final Supplier<Item> phase2_helmet = createHelmet("clone_helmet_phase_2", ArmorMaterials.DIAMOND, ArmorType.HELMET, "textures/models/armor/clone_helmet_phase_2.png");
    public static final Supplier<Item> arf_helmet = createHelmet("clone_helmet_arf", ArmorMaterials.DIAMOND, ArmorType.HELMET, "textures/models/armor/clone_helmet_arf.png");
    public static final Supplier<Item> phase1_chestplate = createArmor("clone_chestplate_phase_1", ArmorMaterials.DIAMOND, ArmorType.CHESTPLATE, "textures/models/armor/clone_armor_phase_1.png");
    public static final Supplier<Item> phase1_leggings = createArmor("clone_leggings_phase_1", ArmorMaterials.DIAMOND, ArmorType.LEGGINGS, "textures/models/armor/clone_armor_phase_1.png");
    public static final Supplier<Item> phase1_boots = createArmor("clone_boots_phase_1", ArmorMaterials.DIAMOND, ArmorType.BOOTS, "textures/models/armor/clone_armor_phase_1.png");


	private static Supplier<Item> createArmor(String name, ArmorMaterial material, ArmorType slot, String texture){
        return ITEMS.register(name, () ->
						new BaseArmorItem(new Item.Properties().setId(itemId(name)).durability(500),
                        Identifier.fromNamespaceAndPath(GalacticArmory.MODID, texture)));
    }

    private static Supplier<Item> createHelmet(String name, ArmorMaterial material, ArmorType slot, String texture){
        return ITEMS.register(name, () ->
				new BaseHelmetItem(new Item.Properties().setId(itemId(name)).durability(500).humanoidArmor(material, ArmorType.HELMET),
                        Identifier.fromNamespaceAndPath(GalacticArmory.MODID, texture)));
    }

    /*
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

   */
}