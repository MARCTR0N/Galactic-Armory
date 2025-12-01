package com.marctron.galacticarmory.common.item;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GalacticArmory.MODID);

    public static final Supplier<Item> phase1_helmet = createArmor("helmet_phase1", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET);
    private static Supplier<Item> createArmor(String name, Holder<ArmorMaterial> material, ArmorItem.Type slot){
        return ITEMS.register(name, () -> new ArmorItem(material, slot, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    }

}
