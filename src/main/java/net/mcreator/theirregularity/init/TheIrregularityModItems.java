/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theirregularity.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.theirregularity.item.RawIrregularCrystalsItem;
import net.mcreator.theirregularity.item.IrregularSwordItem;
import net.mcreator.theirregularity.item.IrregularCrystalItem;
import net.mcreator.theirregularity.item.IrregularArmorItem;
import net.mcreator.theirregularity.item.CrystalUpgradeTemplateItem;
import net.mcreator.theirregularity.TheIrregularityMod;

import java.util.function.Function;

public class TheIrregularityModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TheIrregularityMod.MODID);
	public static final DeferredItem<Item> THE_IRREGULARITY = block(TheIrregularityModBlocks.THE_IRREGULARITY, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> RAW_IRREGULAR_CRYSTAL = register("raw_irregular_crystal", RawIrregularCrystalsItem::new);
	public static final DeferredItem<Item> IRREGULAR_CRYSTAL = register("irregular_crystal", IrregularCrystalItem::new);
	public static final DeferredItem<Item> CRYSTAL_UPGRADE_TEMPLATE = register("crystal_upgrade_template", CrystalUpgradeTemplateItem::new);
	public static final DeferredItem<Item> IRREGULAR_SWORD = register("irregular_sword", IrregularSwordItem::new);
	public static final DeferredItem<Item> IRREGULAR_ARMOR_HELMET = register("irregular_armor_helmet", IrregularArmorItem.Helmet::new);
	public static final DeferredItem<Item> IRREGULAR_ARMOR_CHESTPLATE = register("irregular_armor_chestplate", IrregularArmorItem.Chestplate::new);
	public static final DeferredItem<Item> IRREGULAR_ARMOR_LEGGINGS = register("irregular_armor_leggings", IrregularArmorItem.Leggings::new);
	public static final DeferredItem<Item> IRREGULAR_ARMOR_BOOTS = register("irregular_armor_boots", IrregularArmorItem.Boots::new);
	public static final DeferredItem<Item> THE_IRREGULARITY_ENTITY_SPAWN_EGG = register("the_irregularity_entity_spawn_egg", properties -> new SpawnEggItem(TheIrregularityModEntities.THE_IRREGULARITY_ENTITY.get(), properties));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}