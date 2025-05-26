package com.marctron.galacticarmory.common.util.registry;

import java.util.function.Supplier;

import com.marctron.galacticarmory.GalacticArmory;
import com.marctron.galacticarmory.common.block.entity.ArmorAssemblerBlockEntity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, GalacticArmory.MODID);


    public static final Supplier<BlockEntityType<ArmorAssemblerBlockEntity>> ARMOR_ASSEMBLER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("growth_chamber_be", () -> new BlockEntityType<>(
            		ArmorAssemblerBlockEntity::new, ModBlocks.ARMOR_ASSEMBLER_BLOCK.get()));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
