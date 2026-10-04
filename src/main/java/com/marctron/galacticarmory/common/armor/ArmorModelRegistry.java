package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.model.clone_armor_phase_1;
import com.marctron.galacticarmory.common.model.helmet.parts.base.phase_1_clone_base;
import com.marctron.galacticarmory.common.model.helmet.parts.visor.phase_1_clone_visor;
import com.marctron.galacticarmory.common.model.helmet.parts.fin.phase_1_clone_fin;
import com.marctron.galacticarmory.common.model.helmet.parts.base.phase_2_clone_base;
import com.marctron.galacticarmory.common.model.helmet.parts.visor.phase_2_clone_visor;
import com.marctron.galacticarmory.common.model.helmet.parts.fin.phase_2_clone_fin;
import com.marctron.galacticarmory.common.model.helmet.parts.base.arf_clone_base;
import com.marctron.galacticarmory.common.model.helmet.parts.visor.arf_clone_visor;
import com.marctron.galacticarmory.common.model.helmet.parts.sunvisor.arf_clone_sunvisor;
import com.marctron.galacticarmory.common.model.helmet.parts.sunvisor.phase_1_clone_sunvisor;
import com.marctron.galacticarmory.common.model.helmet.parts.rangefinder.phase_1_clone_rangefinder;
import com.marctron.galacticarmory.common.item.helmet.BaseArmorItem;
import com.marctron.galacticarmory.common.util.registry.ModItems;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ArmorModelRegistry {
    private static final Identifier FALLBACK_TEXTURE =
            Identifier.fromNamespaceAndPath("galacticarmory", "textures/entity/equipment/humanoid/clone_helmet_phase_1/outer.png");

    // Maps Items to their baked Model instances for the EntityModelSet they were baked from.
    private static final Map<Item, HumanoidModel<?>> MODEL_MAP = new HashMap<>();
    // Helmet part items are plain Items, so their texture cannot be read off the item itself.
    private static final Map<Item, Identifier> PART_TEXTURES = new HashMap<>();
    private static @Nullable EntityModelSet cachedModelSet;

    /**
     * (Re)bakes every armor model against the given {@link EntityModelSet}. The set is swapped out on
     * every resource reload, so models baked from a previous one must never be reused.
     */
    private static void initIfNeeded(EntityModelSet models) {
        if (cachedModelSet == models && !MODEL_MAP.isEmpty()) {
            return;
        }

        MODEL_MAP.clear();
        PART_TEXTURES.clear();
        cachedModelSet = models;

        clone_armor_phase_1 phase1Armor = new clone_armor_phase_1(models.bakeLayer(clone_armor_phase_1.LAYER_LOCATION));
        phase_1_clone_base p1Base = new phase_1_clone_base(models.bakeLayer(phase_1_clone_base.LAYER_LOCATION));
        phase_1_clone_visor p1Visor = new phase_1_clone_visor(models.bakeLayer(phase_1_clone_visor.LAYER_LOCATION));
        phase_1_clone_fin p1Fin = new phase_1_clone_fin(models.bakeLayer(phase_1_clone_fin.LAYER_LOCATION));
        clone_helmet_arf arfHelmet = new clone_helmet_arf(models.bakeLayer(clone_helmet_arf.LAYER_LOCATION));
        phase_2_clone_base p2Base = new phase_2_clone_base(models.bakeLayer(phase_2_clone_base.LAYER_LOCATION));
        phase_2_clone_visor p2Visor = new phase_2_clone_visor(models.bakeLayer(phase_2_clone_visor.LAYER_LOCATION));
        phase_2_clone_fin p2Fin = new phase_2_clone_fin(models.bakeLayer(phase_2_clone_fin.LAYER_LOCATION));
        phase_1_clone_sunvisor p1Sunvisor = new phase_1_clone_sunvisor(models.bakeLayer(phase_1_clone_sunvisor.LAYER_LOCATION));
        phase_1_clone_rangefinder p1Rangefinder = new phase_1_clone_rangefinder(models.bakeLayer(phase_1_clone_rangefinder.LAYER_LOCATION));
        arf_clone_base arfBase = new arf_clone_base(models.bakeLayer(arf_clone_base.LAYER_LOCATION));
        arf_clone_visor arfVisor = new arf_clone_visor(models.bakeLayer(arf_clone_visor.LAYER_LOCATION));
        arf_clone_sunvisor arfSunvisor = new arf_clone_sunvisor(models.bakeLayer(arf_clone_sunvisor.LAYER_LOCATION));

        // Helmets
        MODEL_MAP.put(ModItems.clone_helmet.get(), p1Base);


        // Phase 1 part items
        MODEL_MAP.put(ModItems.phase1_base_part.get(), p1Base);
        MODEL_MAP.put(ModItems.phase1_visor.get(), p1Visor);
        MODEL_MAP.put(ModItems.phase1_fin.get(), p1Fin);

        // Phase 2 part items
        MODEL_MAP.put(ModItems.phase2_base_part.get(), p2Base);
        MODEL_MAP.put(ModItems.phase2_visor.get(), p2Visor);
        MODEL_MAP.put(ModItems.phase2_fin.get(), p2Fin);

        // Phase 1 extras
        MODEL_MAP.put(ModItems.phase1_sunvisor.get(), p1Sunvisor);
        MODEL_MAP.put(ModItems.phase1_rangefinder.get(), p1Rangefinder);

        // ARF part items
        MODEL_MAP.put(ModItems.arf_base_part.get(), arfBase);
        MODEL_MAP.put(ModItems.arf_visor.get(), arfVisor);
        MODEL_MAP.put(ModItems.arf_sunvisor.get(), arfSunvisor);

        PART_TEXTURES.put(ModItems.phase1_base_part.get(), phase_1_clone_base.TEXTURE);
        PART_TEXTURES.put(ModItems.phase1_visor.get(), phase_1_clone_visor.TEXTURE);
        PART_TEXTURES.put(ModItems.phase1_fin.get(), phase_1_clone_fin.TEXTURE);
        PART_TEXTURES.put(ModItems.phase2_base_part.get(), phase_2_clone_base.TEXTURE);
        PART_TEXTURES.put(ModItems.phase2_visor.get(), phase_2_clone_visor.TEXTURE);
        PART_TEXTURES.put(ModItems.phase2_fin.get(), phase_2_clone_fin.TEXTURE);
        PART_TEXTURES.put(ModItems.phase1_sunvisor.get(), phase_1_clone_sunvisor.TEXTURE);
        PART_TEXTURES.put(ModItems.phase1_rangefinder.get(), phase_1_clone_rangefinder.TEXTURE);
        PART_TEXTURES.put(ModItems.arf_base_part.get(), arf_clone_base.TEXTURE);
        PART_TEXTURES.put(ModItems.arf_visor.get(), arf_clone_visor.TEXTURE);
        PART_TEXTURES.put(ModItems.arf_sunvisor.get(), arf_clone_sunvisor.TEXTURE);

        // Armor pieces
        MODEL_MAP.put(ModItems.phase1_chestplate.get(), phase1Armor);
        MODEL_MAP.put(ModItems.phase1_leggings.get(), phase1Armor);
        MODEL_MAP.put(ModItems.phase1_boots.get(), phase1Armor);
    }

    public static @Nullable HumanoidModel<?> getModelFor(EntityModelSet models, Item item) {
        initIfNeeded(models);
        return MODEL_MAP.get(item);
    }

    public static @Nullable HumanoidModel<?> getModelFor(EntityModelSet models, ItemStack stack) {
        return getModelFor(models, stack.getItem());
    }

    public static void setupPartVisibility(HumanoidModel<?> model, EquipmentSlot slot) {
        model.head.visible = false;
        model.hat.visible = false;
        model.body.visible = false;
        model.rightArm.visible = false;
        model.leftArm.visible = false;
        model.rightLeg.visible = false;
        model.leftLeg.visible = false;
        switch (slot) {
            case HEAD -> { model.head.visible = true; model.hat.visible = true; }
            case CHEST -> { model.body.visible = true; model.rightArm.visible = true; model.leftArm.visible = true; }
            case LEGS -> { model.rightLeg.visible = true; model.leftLeg.visible = true; }
            case FEET -> { model.rightLeg.visible = true; model.leftLeg.visible = true; }
            default -> { }
        }
    }

    public static Identifier getTextureFor(Item item) {
        Identifier partTexture = PART_TEXTURES.get(item);
        if (partTexture != null) {
            return partTexture;
        }
        if (item instanceof BaseArmorItem base) {
            Identifier texture = base.getArmorTexture(ItemStack.EMPTY);
            if (texture != null) {
                return texture;
            }
        }
        return FALLBACK_TEXTURE;
    }

    public static Identifier getTextureFor(ItemStack stack) {
        if (stack.getItem() instanceof BaseArmorItem base) {
            Identifier texture = base.getArmorTexture(stack);
            if (texture != null) {
                return texture;
            }
        }
        return FALLBACK_TEXTURE;
    }
}
