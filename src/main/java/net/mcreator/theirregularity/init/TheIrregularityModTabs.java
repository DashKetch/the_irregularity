/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theirregularity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.theirregularity.TheIrregularityMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TheIrregularityModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheIrregularityMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> IRREGULARITIES = REGISTRY.register("irregularities",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_irregularity.irregularities")).icon(() -> new ItemStack(TheIrregularityModBlocks.THE_IRREGULARITY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheIrregularityModBlocks.THE_IRREGULARITY.get().asItem());
				tabData.accept(TheIrregularityModItems.RAW_IRREGULAR_CRYSTAL.get());
				tabData.accept(TheIrregularityModItems.IRREGULAR_CRYSTAL.get());
				tabData.accept(TheIrregularityModItems.CRYSTAL_UPGRADE_TEMPLATE.get());
				tabData.accept(TheIrregularityModItems.IRREGULAR_SWORD.get());
				tabData.accept(TheIrregularityModItems.IRREGULAR_ARMOR_HELMET.get());
				tabData.accept(TheIrregularityModItems.IRREGULAR_ARMOR_CHESTPLATE.get());
				tabData.accept(TheIrregularityModItems.IRREGULAR_ARMOR_LEGGINGS.get());
				tabData.accept(TheIrregularityModItems.IRREGULAR_ARMOR_BOOTS.get());
				tabData.accept(TheIrregularityModItems.THE_IRREGULARITY_ENTITY_SPAWN_EGG.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TheIrregularityModBlocks.THE_IRREGULARITY.get().asItem());
			tabData.accept(TheIrregularityModItems.RAW_IRREGULAR_CRYSTAL.get());
			tabData.accept(TheIrregularityModItems.IRREGULAR_CRYSTAL.get());
			tabData.accept(TheIrregularityModItems.CRYSTAL_UPGRADE_TEMPLATE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TheIrregularityModBlocks.THE_IRREGULARITY.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheIrregularityModItems.IRREGULAR_SWORD.get());
			tabData.accept(TheIrregularityModItems.IRREGULAR_ARMOR_HELMET.get());
			tabData.accept(TheIrregularityModItems.IRREGULAR_ARMOR_CHESTPLATE.get());
			tabData.accept(TheIrregularityModItems.IRREGULAR_ARMOR_LEGGINGS.get());
			tabData.accept(TheIrregularityModItems.IRREGULAR_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TheIrregularityModItems.THE_IRREGULARITY_ENTITY_SPAWN_EGG.get());
		}
	}
}