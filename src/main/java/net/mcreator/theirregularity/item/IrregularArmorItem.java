package net.mcreator.theirregularity.item;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.mcreator.theirregularity.init.TheIrregularityModItems;

import java.util.Map;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class IrregularArmorItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(60, Map.of(ArmorType.BOOTS, 8, ArmorType.LEGGINGS, 20, ArmorType.CHESTPLATE, 24, ArmorType.HELMET, 8, ArmorType.BODY, 24), 9,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("block.anvil.use")), 20f, 2f, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_irregularity:irregular_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("the_irregularity:irregular_armor")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_irregularity:textures/models/armor/irregular_layer_1.png");
			}
		}, TheIrregularityModItems.IRREGULAR_ARMOR_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_irregularity:textures/models/armor/irregular_layer_1.png");
			}
		}, TheIrregularityModItems.IRREGULAR_ARMOR_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_irregularity:textures/models/armor/irregular_layer_2.png");
			}
		}, TheIrregularityModItems.IRREGULAR_ARMOR_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_irregularity:textures/models/armor/irregular_layer_1.png");
			}
		}, TheIrregularityModItems.IRREGULAR_ARMOR_BOOTS.get());
	}

	private IrregularArmorItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends IrregularArmorItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}
	}

	public static class Chestplate extends IrregularArmorItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}
	}

	public static class Leggings extends IrregularArmorItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}
	}

	public static class Boots extends IrregularArmorItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}
	}
}