package com.marctron.galacticarmory.common.recipes;

import com.marctron.galacticarmory.common.util.registry.ModRecipes;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public record ArmorAssemblerRecipe(Ingredient inputItem, ItemStack output) implements Recipe<ArmorAssemblerRecipeInput> {
    // inputItem & output ==> Read From JSON File!
    // ArmorAssemblerRecipeInput --> INVENTORY of the Block Entity

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(ArmorAssemblerRecipeInput ArmorAssemblerRecipeInput, Level level) {
        if (level.isClientSide()) {
            return false;
        }

        return inputItem.test(ArmorAssemblerRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(ArmorAssemblerRecipeInput ArmorAssemblerRecipeInput, HolderLookup.Provider provider) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return null;
    }

    @Override
    public RecipeSerializer<? extends Recipe<ArmorAssemblerRecipeInput>> getSerializer() {
        return ModRecipes.ARMOR_ASSEMBLER_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<ArmorAssemblerRecipeInput>> getType() {
        return ModRecipes.ARMOR_ASSEMBLER_TYPE.get();
    }


    /*
    @Override
    public PlacementInfo placementInfo() {
        return PlacementInfo.create(inputItem);
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }
    */

    public static class Serializer implements RecipeSerializer<ArmorAssemblerRecipe> {
        public static final MapCodec<ArmorAssemblerRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(ArmorAssemblerRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(ArmorAssemblerRecipe::output)
        ).apply(inst, ArmorAssemblerRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, ArmorAssemblerRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, ArmorAssemblerRecipe::inputItem,
                        ItemStack.STREAM_CODEC, ArmorAssemblerRecipe::output,
                        ArmorAssemblerRecipe::new);

        @Override
        public MapCodec<ArmorAssemblerRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, ArmorAssemblerRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}