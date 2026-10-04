package com.marctron.galacticarmory.client.renderer.preview;

import com.marctron.galacticarmory.common.armor.ArmorModelRegistry;
import com.marctron.galacticarmory.common.item.helmet.parts.HelmetPartEnum;
import com.marctron.galacticarmory.common.item.helmet.HelmetPartItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/** Turns a helmet part loadout into the concrete model parts the preview should draw. */
public final class HelmetPreviewAssembler {
    private HelmetPreviewAssembler() {
    }

    public static List<HelmetPreviewRenderState.Piece> assemble(Map<HelmetPartEnum, Item> loadout) {
        EntityModelSet models = Minecraft.getInstance().getEntityModels();
        List<HelmetPreviewRenderState.Piece> pieces = new ArrayList<>();

        // Draw in slot order so the base sits behind the attachments.
        for (HelmetPartEnum slot : HelmetPartEnum.values()) {
            Item item = loadout.get(slot);
            if (item == null) {
                continue;
            }
            HelmetPreviewRenderState.Piece piece = pieceFor(models, item);
            if (piece != null) {
                pieces.add(piece);
            }
        }
        return pieces;
    }

    private static HelmetPreviewRenderState.@Nullable Piece pieceFor(EntityModelSet models, Item item) {
        HelmetPartItems.PartItemMapping mapping = HelmetPartItems.getPartMapping(item);
        if (mapping == null) {
            return null;
        }
        HumanoidModel<?> model = ArmorModelRegistry.getModelFor(models, item);
        if (model == null) {
            return null;
        }
        Function<String, @Nullable ModelPart> lookup = model.root().createPartLookup();
        ModelPart part = lookup.apply(mapping.modelPart());
        if (part == null) {
            return null;
        }
        part.visible = true;
        return new HelmetPreviewRenderState.Piece(model, part, ArmorModelRegistry.getTextureFor(item));
    }
}
