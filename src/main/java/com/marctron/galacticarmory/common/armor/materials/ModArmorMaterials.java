package com.marctron.galacticarmory.common.armor.materials;

import com.marctron.galacticarmory.GalacticArmory;
import java.util.Map;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public interface ModArmorMaterials extends ArmorMaterials {


    ArmorMaterial BESKAR = create(37, 3, 6, 8, 3, 11, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, ItemTags.REPAIRS_NETHERITE_ARMOR, EquipmentAssets.NETHERITE);
    ArmorMaterial DURASTEEL = create(25, 2, 5, 6, 2, 5, 12, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.0F, ItemTags.REPAIRS_IRON_ARMOR, EquipmentAssets.IRON);
    ArmorMaterial PLASTOID = create(11, 1, 3, 4, 1, 3, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, ItemTags.REPAIRS_LEATHER_ARMOR, equipmentAsset("plastoid"));
    ArmorMaterial CLONE_HELMET_BASE = create(11, 1, 3, 4, 1, 3, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, ItemTags.REPAIRS_LEATHER_ARMOR, equipmentAsset("clone_helmet_phase_1"));
    ArmorMaterial CLONE_PHASE_1 = create(11, 1, 3, 4, 1, 3, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, ItemTags.REPAIRS_LEATHER_ARMOR, equipmentAsset("clone_helmet_phase_1"));
    ArmorMaterial CLONE_PHASE_2 = create(11, 1, 3, 4, 1, 3, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, ItemTags.REPAIRS_LEATHER_ARMOR, equipmentAsset("clone_helmet_phase_2"));
    ArmorMaterial CLONE_ARF = create(11, 1, 3, 4, 1, 3, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, ItemTags.REPAIRS_LEATHER_ARMOR, equipmentAsset("clone_helmet_arf"));
    ArmorMaterial CLONE_ARMOR = create(11, 2, 4, 5, 2, 3, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, ItemTags.REPAIRS_LEATHER_ARMOR, equipmentAsset("clone_armor"));

    private static ArmorMaterial create(int durability, int boots, int legs, int chest, int helm, int body, int enchantmentValue,
                                        Holder<net.minecraft.sounds.SoundEvent> equipSound,
                                        float toughness, float knockbackResistance, TagKey<Item> repairIngredient,
                                        ResourceKey<EquipmentAsset> assetId) {
        return new ArmorMaterial(
                durability,
                Map.of(
                        ArmorType.BOOTS, boots,
                        ArmorType.LEGGINGS, legs,
                        ArmorType.CHESTPLATE, chest,
                        ArmorType.HELMET, helm,
                        ArmorType.BODY, body
                ),
                enchantmentValue,
                equipSound,
                toughness,
                knockbackResistance,
                repairIngredient,
                assetId
        );
    }

    private static ResourceKey<EquipmentAsset> equipmentAsset(String path) {
        return ResourceKey.create(
                EquipmentAssets.ROOT_ID,
                Identifier.fromNamespaceAndPath(GalacticArmory.MODID, path)
        );
    }
}
