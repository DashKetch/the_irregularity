package net.mcreator.theirregularity.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.theirregularity.procedures.IrregularSwordRightclickedProcedure;

public class IrregularSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1850, 4f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_irregularity:irregular_sword_repair_items")));

	public IrregularSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 15f, 0f, properties.fireResistant());
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		IrregularSwordRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
		return ar;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}