/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.theirregularity.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class TheIrregularityModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Blocks.DEEPSLATE_EMERALD_ORE), new ItemStack(Blocks.EMERALD_ORE), new ItemStack(TheIrregularityModItems.RAW_IRREGULAR_CRYSTAL.get()), 1, 5, 0.05f));
	}
}