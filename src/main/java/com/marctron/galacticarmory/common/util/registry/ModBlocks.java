package com.marctron.galacticarmory.common.util.registry;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GalacticArmory.MODID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }    
    
    public static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(GalacticArmory.MODID, name));
    }

    /*
    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> blockCreator) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, () -> blockCreator.apply(BlockBehaviour.Properties.of().setId(blockId(name))));
        registerBlockItems(name, toReturn);
        return toReturn;
    }
    
    public static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(ModItems.itemId(name)).useBlockDescriptionPrefix()));
    }
    
    
    
    public static final DeferredBlock<Block> ARMOR_ASSEMBLER_BLOCK = registerBlock("armor_assembler_block", ArmorAssemblerBlock::new);


    // Example block registration:
    
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = registerBlock("example_block", properties -> new Block(properties
            .requiresCorrectToolForDrops()
            .strength(1.0F, 8.0F)
            .sound(SoundType.GRAVEL)
            .mapColor(MapColor.METAL)
            .instrument(NoteBlockInstrument.BELL)
            .noOcclusion()
            .noCollission()
    ));    
  

    // Add your ArmorAssemblyTable block here when ready, e.g.
    // public static final DeferredBlock<ArmorAssemblyTableBlock> ARMOR_ASSEMBLY_TABLE =
    //      BLOCKS.register("armor_assembly_table", () -> new ArmorAssemblyTableBlock(Properties.of(Material.METAL).strength(3.5f)));
    */
}