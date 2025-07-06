package net.mcreator.theirregularity.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class IrregularSwordRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, BlockPos.containing(x, y + 30, z), Blocks.CRIMSON_HYPHAE.defaultBlockState());
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 12, Level.ExplosionInteraction.BLOCK);
		}
	}
}