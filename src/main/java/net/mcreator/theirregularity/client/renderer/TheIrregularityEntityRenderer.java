package net.mcreator.theirregularity.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.theirregularity.entity.TheIrregularityEntityEntity;
import net.mcreator.theirregularity.client.model.Modelirregular_entity;

public class TheIrregularityEntityRenderer extends MobRenderer<TheIrregularityEntityEntity, LivingEntityRenderState, Modelirregular_entity> {
	private TheIrregularityEntityEntity entity = null;

	public TheIrregularityEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelirregular_entity(context.bakeLayer(Modelirregular_entity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TheIrregularityEntityEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("the_irregularity:textures/entities/block_textureone_face.png");
	}
}