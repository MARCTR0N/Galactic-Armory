package com.marctron.galacticarmory.common.util.registry;

import com.marctron.galacticarmory.GalacticArmory;
import com.marctron.galacticarmory.common.armor.BaseArmorItem;
import com.marctron.galacticarmory.common.armor.BaseHelmetItem;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GalacticArmory.MODID);

	public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
	
	public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GalacticArmory.MODID, name));
    }


    public static final Supplier<Item> phase1_helmet = createHelmet("clone_helmet_phase_1", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, "textures/models/armor/clone_helmet_phase_1.png");
    public static final Supplier<Item> phase2_helmet = createHelmet("clone_helmet_phase_2", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, "textures/models/armor/clone_helmet_phase_2.png");
    public static final Supplier<Item> arf_helmet = createHelmet("clone_helmet_arf", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, "textures/models/armor/clone_helmet_arf.png");
    public static final Supplier<Item> phase1_chestplate = createArmor("clone_chestplate_phase_1", ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, "textures/models/armor/clone_armor_phase_1.png");
    public static final Supplier<Item> phase1_leggings = createArmor("clone_leggings_phase_1", ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, "textures/models/armor/clone_armor_phase_1.png");
    public static final Supplier<Item> phase1_boots = createArmor("clone_boots_phase_1", ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, "textures/models/armor/clone_armor_phase_1.png");


    private static Supplier<Item> createArmor(String name, Holder<net.minecraft.world.item.ArmorMaterial> material, ArmorItem.Type slot, String texture){
        return ITEMS.register(name, () ->
                new BaseArmorItem(material, slot, new Item.Properties().durability(500),
                        ResourceLocation.fromNamespaceAndPath(GalacticArmory.MODID, texture)));
    }

    private static Supplier<Item> createHelmet(String name, Holder<net.minecraft.world.item.ArmorMaterial> material, ArmorItem.Type slot, String texture){
        return ITEMS.register(name, () ->
                new BaseHelmetItem(material, slot, new Item.Properties().durability(500),
                        ResourceLocation.fromNamespaceAndPath(GalacticArmory.MODID, texture)));
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