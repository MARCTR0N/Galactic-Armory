package com.marctron.galacticarmory.common.item.helmet;

import com.marctron.galacticarmory.common.item.helmet.parts.HelmetPartEnum;
import com.marctron.galacticarmory.common.util.registry.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Catalog of every helmet part item, grouped by the slot it fills.
 *
 * <p>Backs the armor assembler's option grid, so the order parts are registered in is the order
 * they appear in the UI. Population is lazy because the item registry is not populated when this
 * class is first loaded.
 */
public class HelmetPartItems {
    private static final Map<Item, PartItemMapping> PART_ITEMS = new LinkedHashMap<>();
    private static final Map<HelmetPartEnum, List<Item>> BY_SLOT = new EnumMap<>(HelmetPartEnum.class);
    private static boolean populated;

    private static synchronized void populate() {
        if (populated) {
            return;
        }
        populated = true;

        register(ModItems.phase1_base_part, HelmetPartEnum.BASEHELMET, "phase1", "bipedHead");
        register(ModItems.phase2_base_part, HelmetPartEnum.BASEHELMET, "phase2", "bipedhead2");
        register(ModItems.arf_base_part, HelmetPartEnum.BASEHELMET, "arf", "arf_base");

        register(ModItems.phase1_visor, HelmetPartEnum.VISOR, "phase1", "visor");
        register(ModItems.phase2_visor, HelmetPartEnum.VISOR, "phase2", "visor2");
        register(ModItems.arf_visor, HelmetPartEnum.VISOR, "arf", "arf_visor");

        register(ModItems.phase1_fin, HelmetPartEnum.FIN, "phase1", "fin");
        register(ModItems.phase2_fin, HelmetPartEnum.FIN, "phase2", "fin2");

        register(ModItems.phase1_sunvisor, HelmetPartEnum.SUNVISOR, "phase1", "phase1_sunvisor");
        register(ModItems.arf_sunvisor, HelmetPartEnum.SUNVISOR, "arf", "arf_sunvisor");

        register(ModItems.phase1_rangefinder, HelmetPartEnum.RANGEFINDER, "phase1", "phase1_rangefinder");
    }

    public static void register(Supplier<Item> itemSupplier, HelmetPartEnum partType, String modelVariant, String modelPart) {
        Item item = itemSupplier.get();
        PART_ITEMS.put(item, new PartItemMapping(partType, modelVariant, modelPart));
        BY_SLOT.computeIfAbsent(partType, key -> new ArrayList<>()).add(item);
    }

    public static @Nullable PartItemMapping getPartMapping(Item item) {
        populate();
        return PART_ITEMS.get(item);
    }

    public static boolean isHelmetPart(Item item) {
        populate();
        return PART_ITEMS.containsKey(item);
    }

    /** Every part that can fill the given slot, in registration order. */
    public static List<Item> getPartsForSlot(HelmetPartEnum slot) {
        populate();
        return Collections.unmodifiableList(BY_SLOT.getOrDefault(slot, List.of()));
    }

    /** Slots that actually have at least one part, so the UI never shows an empty category. */
    public static List<HelmetPartEnum> getPopulatedSlots() {
        populate();
        List<HelmetPartEnum> slots = new ArrayList<>();
        for (HelmetPartEnum slot : HelmetPartEnum.values()) {
            if (!getPartsForSlot(slot).isEmpty()) {
                slots.add(slot);
            }
        }
        return slots;
    }

    /**
     * Slots that must be filled before a helmet can be built. Everything else is cosmetic and may
     * be left empty.
     */
    public static List<HelmetPartEnum> getRequiredSlots() {
        populate();
        List<HelmetPartEnum> slots = new ArrayList<>();
        for (HelmetPartEnum slot : getPopulatedSlots()) {
            if (slot.isRequired()) {
                slots.add(slot);
            }
        }
        return slots;
    }

    /** Resolves a stored item id back to an item, returning null for "" or an unknown id. */
    public static @Nullable Item itemFromId(String id) {
        if (id == null || id.isEmpty()) {
            return null;
        }
        Identifier identifier = Identifier.tryParse(id);
        if (identifier == null || !BuiltInRegistries.ITEM.containsKey(identifier)) {
            return null;
        }
        return BuiltInRegistries.ITEM.getValue(identifier);
    }

    public static String idOf(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString();
    }

    /**
     * @param partType     which slot the part fills
     * @param sourceHelmet which helmet family it comes from, e.g. "phase1"
     * @param modelPart    the {@link net.minecraft.client.model.geom.ModelPart} name to draw for it
     */
    public record PartItemMapping(HelmetPartEnum partType, String sourceHelmet, String modelPart) {
        @Override
        public String toString() {
            return String.format("%s from %s", partType.name().toLowerCase(), sourceHelmet);
        }
    }
}
