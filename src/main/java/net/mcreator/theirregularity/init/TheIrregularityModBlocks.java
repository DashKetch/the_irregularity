/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theirregularity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.theirregularity.block.TheirregularityblockttypeBlock;
import net.mcreator.theirregularity.TheIrregularityMod;

import java.util.function.Function;

public class TheIrregularityModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TheIrregularityMod.MODID);
	public static final DeferredBlock<Block> THE_IRREGULARITY = register("the_irregularity", TheirregularityblockttypeBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}