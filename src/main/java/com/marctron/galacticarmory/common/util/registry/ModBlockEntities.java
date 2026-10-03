package com.marctron.galacticarmory.common.util.registry;

import com.marctron.galacticarmory.GalacticArmory;
import com.marctron.galacticarmory.common.block.entity.ArmorAssemblerBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, GalacticArmory.MODID);

    public static final Supplier<BlockEntityType<ArmorAssemblerBlockEntity>> ARMOR_ASSEMBLER =
            BLOCK_ENTITIES.register("armor_assembler", () -> new BlockEntityType<>(
                    ArmorAssemblerBlockEntity::new, ModBlocks.ARMOR_ASSEMBLER.get()));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
