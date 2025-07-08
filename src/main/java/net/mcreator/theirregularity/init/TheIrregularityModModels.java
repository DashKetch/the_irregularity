/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theirregularity.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.theirregularity.client.model.Modelirregular_entity;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TheIrregularityModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelirregular_entity.LAYER_LOCATION, Modelirregular_entity::createBodyLayer);
	}
}