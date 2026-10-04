package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.GADataComponents;
import com.marctron.galacticarmory.common.item.helmet.parts.HelmetPartEnum;
import com.marctron.galacticarmory.common.item.helmet.HelmetPartItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.ItemStack;

/**
 * Configuration system for mixing and matching Clone Helmet pieces.
 * Stores customization in CLONE_HELMENT DataComponent as item IDs.
 */
public class HelmetConfiguration {
    
    /**
     * Check if a piece should be visible
     */
    public static boolean isPieceVisible(ItemStack helmet, HelmetPartEnum part) {
        try {
            GADataComponents.CloneHelmetData data = helmet.get(GADataComponents.CLONE_HELMENT);
            if (data == null) {
                return part == HelmetPartEnum.BASEHELMET;
            }
            
            String value = getPartValue(data, part);
            return !value.isEmpty();
        } catch (Exception e) {
            return part == HelmetPartEnum.BASEHELMET;
        }
    }
    
    private static GADataComponents.CloneHelmetData getDefaultData() {
        return new GADataComponents.CloneHelmetData("", "", "", "", "");
    }
    
    private static GADataComponents.CloneHelmetData updatePart(GADataComponents.CloneHelmetData data, HelmetPartEnum part, String value) {
        return switch(part) {
            case BASEHELMET -> new GADataComponents.CloneHelmetData(value, data.visor(), data.fin(), data.sunvisor(), data.rangeFinder());
            case VISOR -> new GADataComponents.CloneHelmetData(data.base(), value, data.fin(), data.sunvisor(), data.rangeFinder());
            case FIN -> new GADataComponents.CloneHelmetData(data.base(), data.visor(), value, data.sunvisor(), data.rangeFinder());
            case SUNVISOR -> new GADataComponents.CloneHelmetData(data.base(), data.visor(), data.fin(), value, data.rangeFinder());
            case RANGEFINDER -> new GADataComponents.CloneHelmetData(data.base(), data.visor(), data.fin(), data.sunvisor(), value);
        };
    }
    
    private static String getPartValue(GADataComponents.CloneHelmetData data, HelmetPartEnum part) {
        return switch(part) {
            case BASEHELMET -> data.base();
            case VISOR -> data.visor();
            case FIN -> data.fin();
            case SUNVISOR -> data.sunvisor();
            case RANGEFINDER -> data.rangeFinder();
        };
    }

    /** The item id installed in the given slot, or "" when the slot is empty. */
    public static String getPartId(ItemStack helmet, HelmetPartEnum part) {
        GADataComponents.CloneHelmetData data = helmet.get(GADataComponents.CLONE_HELMENT);
        return data == null ? "" : getPartValue(data, part);
    }

    /** Reads the whole loadout, skipping slots that are empty or reference an unknown item. */
    public static java.util.Map<HelmetPartEnum, net.minecraft.world.item.Item> readLoadout(ItemStack helmet) {
        java.util.Map<HelmetPartEnum, net.minecraft.world.item.Item> loadout =
                new java.util.EnumMap<>(HelmetPartEnum.class);
        for (HelmetPartEnum part : HelmetPartEnum.values()) {
            net.minecraft.world.item.Item item =
                    HelmetPartItems.itemFromId(getPartId(helmet, part));
            if (item != null) {
                loadout.put(part, item);
            }
        }
        return loadout;
    }

    /** Overwrites every slot at once; entries absent from the map are cleared. */
    public static void writeLoadout(ItemStack helmet, java.util.Map<HelmetPartEnum, net.minecraft.world.item.Item> loadout) {
        for (HelmetPartEnum part : HelmetPartEnum.values()) {
            net.minecraft.world.item.Item item = loadout.get(part);
            if (item == null) {
                clearPartItem(helmet, part);
            } else {
                setPartItem(helmet, part, item);
            }
        }
    }
    
    /**
     * Set a specific part item for this helmet
     */
    public static void setPartItem(ItemStack helmet, HelmetPartEnum part, net.minecraft.world.item.Item item) {
        try {
            String itemName = BuiltInRegistries.ITEM.getKey(item).toString();
            GADataComponents.CloneHelmetData data = helmet.get(GADataComponents.CLONE_HELMENT);
            if (data == null) {
                data = getDefaultData();
            }
            
            GADataComponents.CloneHelmetData updated = updatePart(data, part, itemName);
            helmet.set(GADataComponents.CLONE_HELMENT, updated);
        } catch (Exception e) {
            // Silently fail if components not bound
        }
    }
    
    /**
     * Clear a part item for this helmet
     */
    public static void clearPartItem(ItemStack helmet, HelmetPartEnum part) {
        try {
            GADataComponents.CloneHelmetData data = helmet.get(GADataComponents.CLONE_HELMENT);
            if (data == null) {
                data = getDefaultData();
            }
            
            GADataComponents.CloneHelmetData updated = updatePart(data, part, "");
            helmet.set(GADataComponents.CLONE_HELMENT, updated);
        } catch (Exception e) {
            // Silently fail if components not bound
        }
    }
}
