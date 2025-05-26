package com.marctron.galacticarmory.common.block;

import javax.annotation.Nullable;

import com.marctron.galacticarmory.common.block.entity.ArmorAssemblerBlockEntity;
import com.marctron.galacticarmory.common.util.registry.ModBlockEntities;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ArmorAssemblerBlock extends BaseEntityBlock {
	public static final MapCodec<ArmorAssemblerBlock> CODEC = simpleCodec(ArmorAssemblerBlock::new);

	public ArmorAssemblerBlock(Properties properties) {
		super(properties);
	}

	@Override
	 public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new ArmorAssemblerBlockEntity(blockPos, blockState);
    }

	@Override
	protected MapCodec<? extends BaseEntityBlock> codec() {
		// TODO Auto-generated method stub
		return CODEC;
	}

    @Override
    protected RenderShape getRenderShape(BlockState state) {
    	// TODO Auto-generated method stub
    	return RenderShape.MODEL;
    }
    
    @Override
    protected InteractionResult useItemOn(ItemStack pStack, BlockState pState, Level pLevel, BlockPos pPos,
                                          Player pPlayer, InteractionHand pHand, BlockHitResult pHitResult) {
        if (!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if(entity instanceof ArmorAssemblerBlockEntity armorAssemblerBlockEntity) {
                ((ServerPlayer) pPlayer).openMenu(new SimpleMenuProvider(armorAssemblerBlockEntity, Component.literal("Armor Assembler")), pPos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }

        return InteractionResult.SUCCESS;
    }
    
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if(level.isClientSide()) {
            return null;
        }

        return createTickerHelper(blockEntityType, ModBlockEntities.ARMOR_ASSEMBLER_BLOCK_ENTITY.get(),
                (level1, blockPos, blockState, blockEntity) -> blockEntity.tick(level1, blockPos, blockState));
    }
}
