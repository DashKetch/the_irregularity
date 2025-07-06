package net.mcreator.theirregularity.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CrystalUpgradeTemplateItem extends Item {
	public CrystalUpgradeTemplateItem(Item.Properties properties) {
		super(properties.stacksTo(16).fireResistant());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}