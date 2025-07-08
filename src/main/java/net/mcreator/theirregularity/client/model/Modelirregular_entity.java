package net.mcreator.theirregularity.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelirregular_entity extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("the_irregularity", "modelirregular_entity"), "main");
	public final ModelPart big_torus;
	public final ModelPart bone_group_1;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone_group_2;
	public final ModelPart bone4;
	public final ModelPart bone5;
	public final ModelPart bone6;
	public final ModelPart big_torus2;
	public final ModelPart bone_group_3;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bone9;
	public final ModelPart bone_group_4;
	public final ModelPart bone10;
	public final ModelPart bone11;
	public final ModelPart bone12;
	public final ModelPart cube_bone;

	public Modelirregular_entity(ModelPart root) {
		super(root);
		this.big_torus = root.getChild("big_torus");
		this.bone_group_1 = this.big_torus.getChild("bone_group_1");
		this.bone = this.bone_group_1.getChild("bone");
		this.bone2 = this.bone_group_1.getChild("bone2");
		this.bone3 = this.bone_group_1.getChild("bone3");
		this.bone_group_2 = this.big_torus.getChild("bone_group_2");
		this.bone4 = this.bone_group_2.getChild("bone4");
		this.bone5 = this.bone_group_2.getChild("bone5");
		this.bone6 = this.bone_group_2.getChild("bone6");
		this.big_torus2 = root.getChild("big_torus2");
		this.bone_group_3 = this.big_torus2.getChild("bone_group_3");
		this.bone7 = this.bone_group_3.getChild("bone7");
		this.bone8 = this.bone_group_3.getChild("bone8");
		this.bone9 = this.bone_group_3.getChild("bone9");
		this.bone_group_4 = this.big_torus2.getChild("bone_group_4");
		this.bone10 = this.bone_group_4.getChild("bone10");
		this.bone11 = this.bone_group_4.getChild("bone11");
		this.bone12 = this.bone_group_4.getChild("bone12");
		this.cube_bone = root.getChild("cube_bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition big_torus = partdefinition.addOrReplaceChild("big_torus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone_group_1 = big_torus.addOrReplaceChild("bone_group_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = bone_group_1.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(1, 0).addBox(-0.8018F, -0.5F, -1.6982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1982F, -0.5F, 1.9482F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 0).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0518F, 0.5F, 1.0518F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone2 = bone_group_1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.1982F, -0.5F, 1.6982F));
		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8018F, -0.5F, -0.6982F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0518F, -0.5F, 1.0518F, 3.1416F, -0.7854F, 0.0F));
		PartDefinition bone3 = bone_group_1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4628F, -0.5F, 3.0116F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(-1, -2).mirror().addBox(-0.1274F, -0.5F, -2.8964F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3704F, 0.0F, -0.8973F, 3.1416F, -0.7854F, 0.0F));
		PartDefinition bone_group_2 = big_torus.addOrReplaceChild("bone_group_2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 0.25F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone4 = bone_group_2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(1, 0).addBox(-0.8018F, -0.5F, -1.6982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1982F, -0.5F, 1.9482F));
		PartDefinition cube_r5 = bone4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, 0).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0518F, 0.5F, 1.0518F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone5 = bone_group_2.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(3.1982F, -0.5F, 1.6982F));
		PartDefinition cube_r6 = bone5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8018F, -0.5F, -0.6982F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0518F, -0.5F, 1.0518F, 3.1416F, -0.7854F, 0.0F));
		PartDefinition bone6 = bone_group_2.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4628F, -0.5F, 3.0116F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r8 = bone6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-1, -2).mirror().addBox(-0.1274F, -0.5F, -2.8964F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3704F, 0.0F, -0.8973F, 3.1416F, -0.7854F, 0.0F));
		PartDefinition big_torus2 = partdefinition.addOrReplaceChild("big_torus2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bone_group_3 = big_torus2.addOrReplaceChild("bone_group_3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone7 = bone_group_3.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(1, 0).addBox(-0.8018F, -0.5F, -1.6982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1982F, -0.5F, 1.9482F));
		PartDefinition cube_r9 = bone7.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 0).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0518F, 0.5F, 1.0518F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone8 = bone_group_3.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(3.1982F, -0.5F, 1.6982F));
		PartDefinition cube_r10 = bone8.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8018F, -0.5F, -0.6982F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bone8.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0518F, -0.5F, 1.0518F, 3.1416F, -0.7854F, 0.0F));
		PartDefinition bone9 = bone_group_3.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4628F, -0.5F, 3.0116F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r12 = bone9.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-1, -2).mirror().addBox(-0.1274F, -0.5F, -2.8964F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3704F, 0.0F, -0.8973F, 3.1416F, -0.7854F, 0.0F));
		PartDefinition bone_group_4 = big_torus2.addOrReplaceChild("bone_group_4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 0.25F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone10 = bone_group_4.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(1, 0).addBox(-0.8018F, -0.5F, -1.6982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1982F, -0.5F, 1.9482F));
		PartDefinition cube_r13 = bone10.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1, 0).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0518F, 0.5F, 1.0518F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone11 = bone_group_4.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(3.1982F, -0.5F, 1.6982F));
		PartDefinition cube_r14 = bone11.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(1, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8018F, -0.5F, -0.6982F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r15 = bone11.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(1, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0518F, -0.5F, 1.0518F, 3.1416F, -0.7854F, 0.0F));
		PartDefinition bone12 = bone_group_4.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4628F, -0.5F, 3.0116F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r16 = bone12.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(-1, -2).mirror().addBox(-0.1274F, -0.5F, -2.8964F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3704F, 0.0F, -0.8973F, 3.1416F, -0.7854F, 0.0F));
		PartDefinition cube_bone = partdefinition.addOrReplaceChild("cube_bone", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}