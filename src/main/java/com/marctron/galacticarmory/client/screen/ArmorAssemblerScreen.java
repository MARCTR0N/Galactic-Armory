package com.marctron.galacticarmory.client.screen;

import com.marctron.galacticarmory.client.renderer.preview.HelmetPreviewAssembler;
import com.marctron.galacticarmory.client.renderer.preview.HelmetPreviewRenderState;
import com.marctron.galacticarmory.common.armor.parts.HelmetPartEnum;
import com.marctron.galacticarmory.common.armor.parts.HelmetPartItems;
import com.marctron.galacticarmory.common.menu.ArmorAssemblerMenu;
import com.marctron.galacticarmory.common.network.ApplyHelmetConfigPayload;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Armor assembler UI, laid out like a lightsaber builder: a column of part categories on the left,
 * a live rotatable 3D preview in the middle, and a grid of options for the selected category.
 */
public class ArmorAssemblerScreen extends AbstractContainerScreen<ArmorAssemblerMenu> {
    private static final int WIDTH = 220;
    private static final int HEIGHT = 222;

    private static final int CATEGORY_X = 8;
    private static final int CATEGORY_Y = 30;
    private static final int CATEGORY_W = 58;
    private static final int CATEGORY_H = 16;

    private static final int PREVIEW_X = 72;
    private static final int PREVIEW_Y = 20;
    private static final int PREVIEW_W = 76;
    private static final int PREVIEW_H = 86;

    private static final int GRID_X = 154;
    private static final int GRID_Y = 20;
    private static final int GRID_COLS = 3;
    private static final int GRID_ROWS = 5;
    private static final int CELL = 18;

    private static final int APPLY_X = 72;
    private static final int APPLY_Y = 112;
    private static final int APPLY_W = 76;
    private static final int APPLY_H = 16;

    private static final int PANEL_BG = 0xFF101016;
    private static final int PANEL_EDGE = 0xFF2E2E3C;
    private static final int CELL_BG = 0xFF1B1B24;
    private static final int CELL_HOVER = 0xFF3C4C66;
    private static final int CELL_SELECTED = 0xFF4E7CB8;
    private static final int TEXT = 0xFFE6E6F0;
    private static final int TEXT_DIM = 0xFF8A8A9A;

    private final Map<HelmetPartEnum, Item> loadout = new EnumMap<>(HelmetPartEnum.class);
    private List<HelmetPartEnum> categories = List.of();
    private HelmetPartEnum selectedCategory;

    private float previewYaw = 0.0F;
    private float previewPitch = 0.0F;
    private boolean draggingPreview;

    public ArmorAssemblerScreen(ArmorAssemblerMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title, WIDTH, HEIGHT);
        this.inventoryLabelY = this.imageHeight - 94;
    }

    @Override
    protected void init() {
        super.init();
        this.categories = HelmetPartItems.getPopulatedSlots();
        if (this.selectedCategory == null && !this.categories.isEmpty()) {
            this.selectedCategory = this.categories.get(0);
        }
    }

    /** True once every required category has a part chosen, which is what Build requires. */
    private boolean isComplete() {
        List<HelmetPartEnum> required = HelmetPartItems.getRequiredSlots();
        for (HelmetPartEnum slot : required) {
            if (!this.loadout.containsKey(slot)) {
                return false;
            }
        }
        return !required.isEmpty();
    }

    private boolean canBuild() {
        return this.isComplete()
                && this.menu.getResult().isEmpty()
                && this.affordable();
    }

    /** Checks the player can pay for every chosen part, counting duplicates. */
    private boolean affordable() {
        if (this.minecraft == null || this.minecraft.player == null) {
            return false;
        }
        if (this.minecraft.player.isCreative()) {
            return true;
        }
        Map<Item, Integer> needed = new java.util.HashMap<>();
        for (Item item : this.loadout.values()) {
            needed.merge(item, 1, Integer::sum);
        }
        for (int i = 0; i < this.minecraft.player.getInventory().getContainerSize(); i++) {
            ItemStack stack = this.minecraft.player.getInventory().getItem(i);
            Integer need = needed.get(stack.getItem());
            if (need == null) {
                continue;
            }
            if (stack.getCount() >= need) {
                needed.remove(stack.getItem());
            } else {
                needed.put(stack.getItem(), need - stack.getCount());
            }
        }
        return needed.isEmpty();
    }

    // ---------------------------------------------------------------- rendering

    @Override
    public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick) {
        super.extractBackground(graphics, mouseX, mouseY, partialTick);
        int x = this.leftPos;
        int y = this.topPos;

        panel(graphics, x, y, this.imageWidth, this.imageHeight);
        panel(graphics, x + PREVIEW_X - 1, y + PREVIEW_Y - 1, PREVIEW_W + 2, PREVIEW_H + 2);

        this.extractCategories(graphics, mouseX, mouseY);
        this.extractOptionGrid(graphics, mouseX, mouseY);
        this.extractApplyButton(graphics, mouseX, mouseY);
        this.extractSlotBackgrounds(graphics);
    }

    /** The background is procedurally drawn, so slot wells have to be painted explicitly. */
    private void extractSlotBackgrounds(GuiGraphicsExtractor graphics) {
        for (net.minecraft.world.inventory.Slot slot : this.menu.slots) {
            int x = this.leftPos + slot.x - 1;
            int y = this.topPos + slot.y - 1;
            graphics.fill(x, y, x + 18, y + 18, CELL_BG);
            graphics.fill(x, y, x + 18, y + 1, PANEL_EDGE);
            graphics.fill(x, y + 17, x + 18, y + 18, PANEL_EDGE);
            graphics.fill(x, y, x + 1, y + 18, PANEL_EDGE);
            graphics.fill(x + 17, y, x + 18, y + 18, PANEL_EDGE);
        }
    }

    @Override
    public void extractContents(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick) {
        super.extractContents(graphics, mouseX, mouseY, partialTick);
        this.extractPreview(graphics);
    }

    private void extractPreview(GuiGraphicsExtractor graphics) {
        if (this.loadout.isEmpty()) {
            return;
        }
        List<HelmetPreviewRenderState.Piece> pieces = HelmetPreviewAssembler.assemble(this.loadout);
        if (pieces.isEmpty()) {
            return;
        }
        int x0 = this.leftPos + PREVIEW_X;
        int y0 = this.topPos + PREVIEW_Y;
        graphics.submitPictureInPictureRenderState(new HelmetPreviewRenderState(
                pieces, this.previewYaw, this.previewPitch,
                x0, y0, x0 + PREVIEW_W, y0 + PREVIEW_H,
                60.0F, null));
    }

    private void extractCategories(GuiGraphicsExtractor graphics, int mouseX, int mouseY) {
        graphics.text(this.font, Component.translatable("gui.galacticarmory.assembler.parts"),
                this.leftPos + CATEGORY_X, this.topPos + CATEGORY_Y - 12, TEXT_DIM);

        for (int i = 0; i < this.categories.size(); i++) {
            HelmetPartEnum category = this.categories.get(i);
            int x = this.leftPos + CATEGORY_X;
            int y = this.topPos + CATEGORY_Y + i * (CATEGORY_H + 2);
            boolean selected = category == this.selectedCategory;
            boolean hovered = isWithin(mouseX, mouseY, x, y, CATEGORY_W, CATEGORY_H);

            graphics.fill(x, y, x + CATEGORY_W, y + CATEGORY_H,
                    selected ? CELL_SELECTED : hovered ? CELL_HOVER : CELL_BG);

            Item installed = this.loadout.get(category);
            // Required categories stay bright while unfilled so the player can see what Build needs.
            int labelColour = selected || (category.isRequired() && installed == null) ? TEXT : TEXT_DIM;
            graphics.text(this.font, categoryLabel(category), x + 4, y + 4, labelColour);
            if (installed != null) {
                graphics.item(new ItemStack(installed), x + CATEGORY_W - 18, y - 1);
            }
        }
    }

    private void extractOptionGrid(GuiGraphicsExtractor graphics, int mouseX, int mouseY) {
        if (this.selectedCategory == null) {
            return;
        }
        graphics.text(this.font, categoryLabel(this.selectedCategory),
                this.leftPos + GRID_X, this.topPos + GRID_Y - 12, TEXT_DIM);

        List<Option> options = this.options();
        for (int i = 0; i < options.size(); i++) {
            Option option = options.get(i);
            int x = this.leftPos + GRID_X + (i % GRID_COLS) * CELL;
            int y = this.topPos + GRID_Y + (i / GRID_COLS) * CELL;
            boolean selected = this.loadout.get(this.selectedCategory) == option.item();
            boolean hovered = isWithin(mouseX, mouseY, x, y, CELL, CELL);

            graphics.fill(x, y, x + CELL, y + CELL,
                    selected ? CELL_SELECTED : hovered ? CELL_HOVER : CELL_BG);
            graphics.item(new ItemStack(option.item()), x + 1, y + 1);
        }
    }

    private void extractApplyButton(GuiGraphicsExtractor graphics, int mouseX, int mouseY) {
        int x = this.leftPos + APPLY_X;
        int y = this.topPos + APPLY_Y;
        boolean enabled = this.canBuild();
        boolean hovered = enabled && isWithin(mouseX, mouseY, x, y, APPLY_W, APPLY_H);

        graphics.fill(x, y, x + APPLY_W, y + APPLY_H, hovered ? CELL_SELECTED : CELL_BG);
        Component label = Component.translatable("gui.galacticarmory.assembler.build");
        int labelX = x + (APPLY_W - this.font.width(label)) / 2;
        graphics.text(this.font, label, labelX, y + 4, enabled ? TEXT : TEXT_DIM);

        if (!enabled) {
            Component hint;
            if (!this.menu.getResult().isEmpty()) {
                hint = Component.translatable("gui.galacticarmory.assembler.collect");
            } else if (!this.isComplete()) {
                hint = Component.translatable("gui.galacticarmory.assembler.need_all");
            } else {
                hint = Component.translatable("gui.galacticarmory.assembler.need_parts");
            }
            int hintX = this.leftPos + 20 + (this.imageWidth - this.font.width(hint)) / 2;
            //graphics.text(this.font, hint, hintX, y + APPLY_H + 1, TEXT_DIM);
        }
    }

    @Override
    protected void extractTooltip(GuiGraphicsExtractor graphics, int mouseX, int mouseY) {
        super.extractTooltip(graphics, mouseX, mouseY);
        if (this.selectedCategory == null) {
            return;
        }
        List<Option> options = this.options();
        for (int i = 0; i < options.size(); i++) {
            int x = this.leftPos + GRID_X + (i % GRID_COLS) * CELL;
            int y = this.topPos + GRID_Y + (i / GRID_COLS) * CELL;
            if (isWithin(mouseX, mouseY, x, y, CELL, CELL)) {
                ItemStack stack = new ItemStack(options.get(i).item());
                if (options.get(i).owned()) {
                    graphics.setTooltipForNextFrame(this.font, stack, mouseX, mouseY);
                } else {
                    graphics.setTooltipForNextFrame(this.font,
                            Component.translatable("gui.galacticarmory.assembler.missing", stack.getHoverName()),
                            mouseX, mouseY);
                }
                return;
            }
        }
    }

    private static void panel(GuiGraphicsExtractor graphics, int x, int y, int w, int h) {
        graphics.fill(x, y, x + w, y + h, PANEL_BG);
        graphics.fill(x, y, x + w, y + 1, PANEL_EDGE);
        graphics.fill(x, y + h - 1, x + w, y + h, PANEL_EDGE);
        graphics.fill(x, y, x + 1, y + h, PANEL_EDGE);
        graphics.fill(x + w - 1, y, x + w, y + h, PANEL_EDGE);
    }

    // ---------------------------------------------------------------- interaction

    @Override
    public boolean mouseClicked(MouseButtonEvent event, boolean doubleClick) {
        int mouseX = (int) event.x();
        int mouseY = (int) event.y();

        for (int i = 0; i < this.categories.size(); i++) {
            int x = this.leftPos + CATEGORY_X;
            int y = this.topPos + CATEGORY_Y + i * (CATEGORY_H + 2);
            if (isWithin(mouseX, mouseY, x, y, CATEGORY_W, CATEGORY_H)) {
                this.selectedCategory = this.categories.get(i);
                return true;
            }
        }

        if (this.selectedCategory != null) {
            List<Option> options = this.options();
            for (int i = 0; i < options.size(); i++) {
                int x = this.leftPos + GRID_X + (i % GRID_COLS) * CELL;
                int y = this.topPos + GRID_Y + (i / GRID_COLS) * CELL;
                if (isWithin(mouseX, mouseY, x, y, CELL, CELL)) {
                    Option option = options.get(i);
                    if (!option.owned()) {
                        return true;
                    }
                    // Clicking the installed part again takes it back off.
                    if (this.loadout.get(this.selectedCategory) == option.item()) {
                        this.loadout.remove(this.selectedCategory);
                    } else {
                        this.loadout.put(this.selectedCategory, option.item());
                    }
                    return true;
                }
            }
        }

        if (isWithin(mouseX, mouseY, this.leftPos + APPLY_X, this.topPos + APPLY_Y, APPLY_W, APPLY_H)) {
            this.apply();
            return true;
        }

        if (isWithin(mouseX, mouseY, this.leftPos + PREVIEW_X, this.topPos + PREVIEW_Y, PREVIEW_W, PREVIEW_H)) {
            this.draggingPreview = true;
            return true;
        }

        return super.mouseClicked(event, doubleClick);
    }

    @Override
    public boolean mouseDragged(MouseButtonEvent event, double dragX, double dragY) {
        if (this.draggingPreview) {
            this.previewYaw -= (float) dragX * 2.0F;
            this.previewPitch = Mth.clamp(this.previewPitch + (float) dragY * 2.0F, -60.0F, 60.0F);
            return true;
        }
        return super.mouseDragged(event, dragX, dragY);
    }

    @Override
    public boolean mouseReleased(MouseButtonEvent event) {
        this.draggingPreview = false;
        return super.mouseReleased(event);
    }

    private void apply() {
        if (!this.canBuild()) {
            return;
        }
        ClientPacketDistributor.sendToServer(ApplyHelmetConfigPayload.of(this.loadout));
    }

    // ---------------------------------------------------------------- helpers

    private List<Option> options() {
        List<Option> options = new ArrayList<>();
        boolean creative = this.minecraft != null && this.minecraft.player != null
                && this.minecraft.player.isCreative();
        for (Item item : HelmetPartItems.getPartsForSlot(this.selectedCategory)) {
            options.add(new Option(item, creative || this.playerHas(item)));
            if (options.size() >= GRID_COLS * GRID_ROWS) {
                break;
            }
        }
        return options;
    }

    private boolean playerHas(Item item) {
        return this.minecraft != null && this.minecraft.player != null
                && this.minecraft.player.getInventory().contains(stack -> stack.is(item));
    }

    private static Component categoryLabel(HelmetPartEnum category) {
        return Component.translatable("gui.galacticarmory.part." + category.name().toLowerCase());
    }

    private static boolean isWithin(int mouseX, int mouseY, int x, int y, int w, int h) {
        return mouseX >= x && mouseX < x + w && mouseY >= y && mouseY < y + h;
    }

    /** A selectable part plus whether the player actually has one to install. */
    private record Option(Item item, boolean owned) {
    }
}
