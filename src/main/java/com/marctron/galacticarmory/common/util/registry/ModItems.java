package com.marctron.galacticarmory.common.util.registry;

import com.marctron.galacticarmory.GalacticArmory;
import com.marctron.galacticarmory.common.armor.BaseArmorItem;
import com.marctron.galacticarmory.common.armor.BaseHelmetItem;
import com.marctron.galacticarmory.common.armor.CloneHelmetItem;
import com.marctron.galacticarmory.common.armor.materials.ModArmorMaterials;
import com.marctron.galacticarmory.common.armor.parts.HelmetPartEnum;
import com.marctron.galacticarmory.common.armor.parts.helmet.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
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

    public static final Supplier<Item> clone_helmet = createHelmet("clone_helmet", ModArmorMaterials.CLONE_HELMET_BASE, ArmorType.HELMET, "textures/models/armor/clone_helmet_phase_1.png");

    // Helmet Base Items (just the body, no parts) - WEARABLE ARMOR
    public static final Supplier<Item> helmet = createHelmet("phase1_base", ModArmorMaterials.CLONE_PHASE_1, ArmorType.HELMET, "textures/models/armor/clone_helmet_phase_1.png");

    // Helmet Base Parts (for composition)
    public static final Supplier<Item> phase1_base_part = ITEMS.register("phase_1_clone_base", () -> new BasePart(HelmetPartEnum.BASEHELMET, ModArmorMaterials.CLONE_PHASE_1, "phase_1_clone_base"));

    // Helmet Part Items - Phase 1
    public static final Supplier<Item> phase1_visor = ITEMS.register("phase1_visor", () -> new VisorPart(ModArmorMaterials.CLONE_PHASE_1, "phase1_visor"));
    public static final Supplier<Item> phase1_fin = ITEMS.register("phase1_fin", () -> new FinPart("phase1_fin"));
    public static final Supplier<Item> phase1_sunvisor = ITEMS.register("phase1_sunvisor", () -> new SunvisorPart("phase1_sunvisor"));
    public static final Supplier<Item> phase1_rangefinder = ITEMS.register("phase1_rangefinder", () -> new RangeFinderPart("phase1_rangefinder"));

    // Helmet Part Items - Phase 2
    public static final Supplier<Item> phase2_base_part = ITEMS.register("phase_2_clone_base", () -> new BasePart(HelmetPartEnum.BASEHELMET, ModArmorMaterials.CLONE_PHASE_2, "phase_2_clone_base"));
    public static final Supplier<Item> phase2_visor = ITEMS.register("phase2_visor", () -> new VisorPart(ModArmorMaterials.CLONE_PHASE_2, "phase2_visor"));
    public static final Supplier<Item> phase2_fin = ITEMS.register("phase2_fin", () -> new FinPart("phase2_fin"));

    // Helmet Part Items - ARF
    public static final Supplier<Item> arf_base_part = ITEMS.register("arf_clone_base", () -> new BasePart(HelmetPartEnum.BASEHELMET, ModArmorMaterials.CLONE_ARF, "arf_clone_base"));
    public static final Supplier<Item> arf_visor = ITEMS.register("arf_visor", () -> new VisorPart(ModArmorMaterials.CLONE_ARF, "arf_visor"));
    public static final Supplier<Item> arf_sunvisor = ITEMS.register("arf_sunvisor", () -> new SunvisorPart("arf_sunvisor"));

    

    public static final Supplier<Item> phase1_chestplate = createArmor("clone_chestplate_phase_1", ModArmorMaterials.CLONE_ARMOR, ArmorType.CHESTPLATE, "textures/models/armor/clone_armor_phase_1.png");
    public static final Supplier<Item> phase1_leggings = createArmor("clone_leggings_phase_1", ModArmorMaterials.CLONE_ARMOR, ArmorType.LEGGINGS, "textures/models/armor/clone_armor_phase_1.png");
    public static final Supplier<Item> phase1_boots = createArmor("clone_boots_phase_1", ModArmorMaterials.CLONE_ARMOR, ArmorType.BOOTS, "textures/models/armor/clone_armor_phase_1.png");


	private static Supplier<Item> createArmor(String name, ArmorMaterial material, ArmorType slot, String texture){
        return ITEMS.register(name, () ->
						new BaseArmorItem(new Item.Properties().setId(itemId(name)).durability(500).humanoidArmor(material, slot),
                        Identifier.fromNamespaceAndPath(GalacticArmory.MODID, texture), slot));
    }

    private static Supplier<Item> createHelmet(String name, ArmorMaterial material, ArmorType slot, String texture){
        return ITEMS.register(name, () ->
				new BaseHelmetItem(new Item.Properties().setId(itemId(name)).durability(500).humanoidArmor(material, ArmorType.HELMET),
                        Identifier.fromNamespaceAndPath(GalacticArmory.MODID, texture)));
    }

    private static Supplier<Item> createModularHelmet(String name) {
        return ITEMS.register(name, () ->
				new CloneHelmetItem(new Item.Properties().setId(itemId(name)).durability(500),
                        Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "textures/models/armor/clone_helmet_phase_1.png")));
    }
}