package com.marctron.galacticarmory.common.network;

import com.marctron.galacticarmory.GalacticArmory;
import com.marctron.galacticarmory.common.armor.HelmetConfiguration;
import com.marctron.galacticarmory.common.item.helmet.parts.HelmetPartEnum;
import com.marctron.galacticarmory.common.item.helmet.HelmetPartItems;
import com.marctron.galacticarmory.common.block.entity.ArmorAssemblerBlockEntity;
import com.marctron.galacticarmory.common.menu.ArmorAssemblerMenu;
import com.marctron.galacticarmory.common.util.registry.ModItems;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.network.handling.IPayloadContext;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Sent when the player confirms a loadout in the armor assembler. The client only proposes the
 * selection; the server re-validates it and owns the resulting item.
 */
public record ApplyHelmetConfigPayload(List<String> partIds) implements CustomPacketPayload {
    public static final Type<ApplyHelmetConfigPayload> TYPE =
            new Type<>(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "apply_helmet_config"));

    public static final StreamCodec<RegistryFriendlyByteBuf, ApplyHelmetConfigPayload> STREAM_CODEC =
            StreamCodec.composite(
                    ByteBufCodecs.STRING_UTF8.apply(ByteBufCodecs.list(HelmetPartEnum.values().length)),
                    ApplyHelmetConfigPayload::partIds,
                    ApplyHelmetConfigPayload::new
            );

    public static ApplyHelmetConfigPayload of(Map<HelmetPartEnum, Item> loadout) {
        List<String> ids = new java.util.ArrayList<>(HelmetPartEnum.values().length);
        for (HelmetPartEnum part : HelmetPartEnum.values()) {
            Item item = loadout.get(part);
            ids.add(item == null ? "" : HelmetPartItems.idOf(item));
        }
        return new ApplyHelmetConfigPayload(ids);
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(ApplyHelmetConfigPayload payload, IPayloadContext context) {
        Player player = context.player();
        if (!(player.containerMenu instanceof ArmorAssemblerMenu menu)) {
            return;
        }
        if (!menu.getResult().isEmpty()) {
            // Make the player collect the previous helmet first, so a build can never be overwritten.
            return;
        }

        HelmetPartEnum[] parts = HelmetPartEnum.values();
        Map<HelmetPartEnum, Item> requested = new EnumMap<>(HelmetPartEnum.class);
        for (int i = 0; i < parts.length && i < payload.partIds().size(); i++) {
            Item item = HelmetPartItems.itemFromId(payload.partIds().get(i));
            if (item == null) {
                continue;
            }
            // Never trust the client about which slot a part belongs in.
            HelmetPartItems.PartItemMapping mapping = HelmetPartItems.getPartMapping(item);
            if (mapping == null || mapping.partType() != parts[i]) {
                continue;
            }
            requested.put(parts[i], item);
        }

        // Only the structural parts are mandatory; the rest are cosmetic add-ons.
        for (HelmetPartEnum slot : HelmetPartItems.getRequiredSlots()) {
            if (!requested.containsKey(slot)) {
                return;
            }
        }

        List<Item> cost = new ArrayList<>(requested.values());
        boolean free = player.isCreative();
        if (!free) {
            if (!hasAll(player, cost)) {
                menu.broadcastChanges();
                return;
            }
            for (Item item : cost) {
                consumeOne(player, item);
            }
        }

        ItemStack helmet = new ItemStack(ModItems.clone_helmet.get());
        HelmetConfiguration.writeLoadout(helmet, requested);
        menu.getContainer().setItem(ArmorAssemblerBlockEntity.RESULT_SLOT, helmet);
        menu.broadcastChanges();
    }

    /** Verifies the player can pay for every part at once, counting duplicates. */
    private static boolean hasAll(Player player, List<Item> needed) {
        Map<Item, Integer> remaining = new java.util.HashMap<>();
        for (Item item : needed) {
            remaining.merge(item, 1, Integer::sum);
        }
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack stack = player.getInventory().getItem(i);
            Integer need = remaining.get(stack.getItem());
            if (need == null) {
                continue;
            }
            int taken = Math.min(need, stack.getCount());
            if (taken >= need) {
                remaining.remove(stack.getItem());
            } else {
                remaining.put(stack.getItem(), need - taken);
            }
        }
        return remaining.isEmpty();
    }

    private static void consumeOne(Player player, Item item) {
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack stack = player.getInventory().getItem(i);
            if (stack.is(item)) {
                stack.shrink(1);
                if (stack.isEmpty()) {
                    player.getInventory().setItem(i, ItemStack.EMPTY);
                }
                return;
            }
        }
    }
}
