package com.marctron.galacticarmory.common.util.registry;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, GalacticArmory.MODID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, GalacticArmory.MODID);
    /*
    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<ArmorAssemblerRecipe>> ARMOR_ASSEMBLER_SERIALIZER =
            SERIALIZERS.register("armor_assembler", ArmorAssemblerRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<ArmorAssemblerRecipe>> ARMOR_ASSEMBLER_TYPE =
            TYPES.register("armor_assembler", () -> new RecipeType<ArmorAssemblerRecipe>() {
                @Override
                public String toString() {
                    return "armor_assembler";
                }
            });
    */

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}