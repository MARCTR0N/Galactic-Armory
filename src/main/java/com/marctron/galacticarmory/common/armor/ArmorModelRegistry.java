package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.armor.model.clone_armor_phase_1;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_arf;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_phase_1;
import com.marctron.galacticarmory.common.armor.model.clone_helmet_phase_2;
import com.marctron.galacticarmory.common.util.registry.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ArmorModelRegistry {
    // Maps Items to their baked Model instances
    private static final Map<Item, HumanoidModel<?>> MODEL_MAP = new HashMap<>();

    public static void init() {
        EntityModelSet models = Minecraft.getInstance().getEntityModels();

        ModelPart phase1Part = models.bakeLayer(clone_armor_phase_1.LAYER_LOCATION);
        ModelPart p1HelmetPart = models.bakeLayer(clone_helmet_phase_1.LAYER_LOCATION);
        ModelPart arfPart = models.bakeLayer(clone_helmet_arf.LAYER_LOCATION);
        ModelPart p2Part = models.bakeLayer(clone_helmet_phase_2.LAYER_LOCATION);

        // Create the model instances
        clone_armor_phase_1 phase1Armor = new clone_armor_phase_1(phase1Part);
        clone_helmet_phase_1 p1Helmet = new clone_helmet_phase_1(p1HelmetPart);
        clone_helmet_arf arfHelmet = new clone_helmet_arf(arfPart);
        clone_helmet_phase_2 p2Helmet = new clone_helmet_phase_2(p2Part);

        // Map multiple items to the SAME model instance
        MODEL_MAP.put(ModItems.phase1_helmet.get(), p1Helmet);

        MODEL_MAP.put(ModItems.phase1_chestplate.get(), phase1Armor);
        MODEL_MAP.put(ModItems.phase1_leggings.get(), phase1Armor);
        MODEL_MAP.put(ModItems.phase1_boots.get(), phase1Armor);

        MODEL_MAP.put(ModItems.arf_helmet.get(), arfHelmet);
        MODEL_MAP.put(ModItems.phase2_helmet.get(), p2Helmet);
    }

    public static HumanoidModel<?> getModelFor(ItemStack stack) {
        // Just return the pre-baked model from the map
        return MODEL_MAP.get(stack.getItem());
    }

    public static void setupPartVisibility(HumanoidModel<?> model, EquipmentSlot slot) {
        model.setAllVisible(false);
        switch (slot) {
            case HEAD -> { model.head.visible = true; model.hat.visible = true; }
            case CHEST -> { model.body.visible = true; model.rightArm.visible = true; model.leftArm.visible = true; }
            case LEGS -> { model.body.visible = false; model.rightLeg.visible = true; model.leftLeg.visible = true; }
            case FEET -> { model.rightLeg.visible = true; model.leftLeg.visible = true;}
        }
    }

    public static ResourceLocation getTextureFor(ItemStack stack) {
        if (stack.getItem() instanceof BaseArmorItem base) {
            return base.getArmorTexture(stack, null, null, null, false);
        }
        return null;
    }
}