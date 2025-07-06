package net.mcreator.theirregularity.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class IrregularSwordRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, BlockPos.containing(x, y + 30, z), Blocks.ANVIL.defaultBlockState());
		}
	}
}