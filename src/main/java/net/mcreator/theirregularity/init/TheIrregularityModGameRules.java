/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theirregularity.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TheIrregularityModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_ISLAND;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		SPAWN_ISLAND = GameRules.register("spawnIsland", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(true));
	}
}