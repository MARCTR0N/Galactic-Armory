package com.marctron.galacticarmory.common.menu;

import com.marctron.galacticarmory.common.block.entity.ArmorAssemblerBlockEntity;
import com.marctron.galacticarmory.common.util.registry.ModMenus;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class ArmorAssemblerMenu extends AbstractContainerMenu {
    private static final int RESULT_SLOT_INDEX = 0;
    private static final int INVENTORY_START = 1;
    private static final int INVENTORY_END = INVENTORY_START + 36;

    private final Container container;

    /** Client-side constructor used by the menu type factory. */
    public ArmorAssemblerMenu(int containerId, Inventory inventory, RegistryFriendlyByteBuf buf) {
        this(containerId, inventory, new SimpleContainer(1));
    }

    public ArmorAssemblerMenu(int containerId, Inventory inventory, Container container) {
        super(ModMenus.ARMOR_ASSEMBLER.get(), containerId);
        checkContainerSize(container, 1);
        this.container = container;
        container.startOpen(inventory.player);

        this.addSlot(new Slot(container, ArmorAssemblerBlockEntity.RESULT_SLOT, 152, 112) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                // Output only: finished helmets are produced by the assembler, never inserted.
                return false;
            }

            @Override
            public int getMaxStackSize() {
                return 1;
            }
        });

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(inventory, col + row * 9 + 9, 8 + col * 18, 140 + row * 18));
            }
        }
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(inventory, col, 8 + col * 18, 198));
        }
    }

    public ItemStack getResult() {
        return this.container.getItem(ArmorAssemblerBlockEntity.RESULT_SLOT);
    }

    public Container getContainer() {
        return this.container;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        Slot slot = this.slots.get(index);
        if (!slot.hasItem()) {
            return ItemStack.EMPTY;
        }

        ItemStack stack = slot.getItem();
        ItemStack original = stack.copy();

        if (index == RESULT_SLOT_INDEX) {
            if (!this.moveItemStackTo(stack, INVENTORY_START, INVENTORY_END, true)) {
                return ItemStack.EMPTY;
            }
        } else {
            // Nothing can be pushed into the result slot, so shift-click only shuffles the inventory.
            return ItemStack.EMPTY;
        }

        if (stack.isEmpty()) {
            slot.setByPlayer(ItemStack.EMPTY);
        } else {
            slot.setChanged();
        }
        return original;
    }

    @Override
    public boolean stillValid(Player player) {
        return this.container.stillValid(player);
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        this.container.stopOpen(player);
    }
}
