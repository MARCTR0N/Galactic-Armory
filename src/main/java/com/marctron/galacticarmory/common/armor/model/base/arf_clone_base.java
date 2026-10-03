// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Reworked as a HumanoidModel so the helmet part renderers can resolve it.

package com.marctron.galacticarmory.common.armor.model.base;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public class arf_clone_base extends HumanoidModel<HumanoidRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "arf_clone_base"), "main");
	public static final Identifier TEXTURE =
			Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "textures/models/armor/clone_helmet_arf.png");

	public arf_clone_base(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		// HumanoidModel requires these to exist; they stay empty because only the helmet
		// part itself is ever submitted for this model.
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		head.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition arf = head.addOrReplaceChild("arf_base", CubeListBuilder.create().texOffs(4, 48).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone93 = arf.addOrReplaceChild("bone93", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.65F));

		PartDefinition cube_r1 = bone93.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 37).addBox(-1.2F, -3.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0914F, -0.2078F, -0.6F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = bone93.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 42).addBox(-1.8F, -3.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0914F, -0.2078F, -0.6F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r3 = bone93.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 41).addBox(0.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1578F, -1.1633F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r4 = bone93.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 20).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1578F, -1.1633F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone114 = arf.addOrReplaceChild("bone114", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone115 = bone114.addOrReplaceChild("bone115", CubeListBuilder.create(), PartPose.offset(-2.5F, -8.0F, -4.0F));

		PartDefinition bone127 = bone115.addOrReplaceChild("bone127", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone127.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 50).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 58).addBox(-1.5313F, 0.0039F, -1.9297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.159F, 0.3068F, -0.1449F));

		PartDefinition cube_r6 = bone127.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(50, 59).addBox(0.5313F, 0.0039F, -1.9297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 50).addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 1.159F, -0.3068F, 0.1449F));

		PartDefinition cube_r7 = bone127.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 0).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition bone116 = bone115.addOrReplaceChild("bone116", CubeListBuilder.create().texOffs(44, 25).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition bone117 = bone116.addOrReplaceChild("bone117", CubeListBuilder.create().texOffs(28, 52).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone118 = bone117.addOrReplaceChild("bone118", CubeListBuilder.create().texOffs(8, 41).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone119 = bone118.addOrReplaceChild("bone119", CubeListBuilder.create().texOffs(38, 58).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone120 = bone115.addOrReplaceChild("bone120", CubeListBuilder.create().texOffs(56, 26).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8945F, -0.0352F, 0.0859F, 0.7854F, 0.0F, -0.3927F));

		PartDefinition bone121 = bone120.addOrReplaceChild("bone121", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 1.0F, -0.3017F, 0.0999F, -0.0353F));

		PartDefinition cube_r8 = bone121.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 55).addBox(0.0079F, 0.0041F, 0.1097F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone122 = bone121.addOrReplaceChild("bone122", CubeListBuilder.create().texOffs(48, 51).addBox(-0.0019F, -0.0329F, 0.105F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3871F, 0.0874F, -0.0388F));

		PartDefinition bone123 = bone122.addOrReplaceChild("bone123", CubeListBuilder.create().texOffs(46, 25).addBox(-0.0239F, -0.0299F, 0.0933F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2694F, 0.1194F, -0.0189F));

		PartDefinition bone124 = bone115.addOrReplaceChild("bone124", CubeListBuilder.create().texOffs(42, 20).addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1055F, -0.0352F, 0.0859F, 0.7854F, 0.0F, 0.3927F));

		PartDefinition bone125 = bone124.addOrReplaceChild("bone125", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 1.0F, -0.3017F, -0.0999F, 0.0353F));

		PartDefinition cube_r9 = bone125.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 21).addBox(-3.0079F, 0.0041F, 0.1097F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone126 = bone125.addOrReplaceChild("bone126", CubeListBuilder.create().texOffs(53, 32).addBox(-2.9981F, -0.0329F, 0.105F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3871F, -0.0874F, 0.0388F));

		PartDefinition bone128 = bone126.addOrReplaceChild("bone128", CubeListBuilder.create().texOffs(43, 32).addBox(-2.9761F, -0.0299F, 0.0933F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2694F, -0.1194F, 0.0189F));

		PartDefinition bone129 = bone115.addOrReplaceChild("bone129", CubeListBuilder.create().texOffs(53, 60).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 8.25F));

		PartDefinition cube_r10 = bone129.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 22).addBox(-3.5F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.543F, 1.9336F, -0.9163F, 0.0F, 0.0F));

		PartDefinition bone130 = bone129.addOrReplaceChild("bone130", CubeListBuilder.create().texOffs(46, 10).addBox(0.0F, 0.0F, -5.0078F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r11 = bone130.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 39).addBox(0.0036F, -0.994F, -1.9964F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition bone131 = bone129.addOrReplaceChild("bone131", CubeListBuilder.create().texOffs(37, 23).addBox(-1.0F, 0.0F, -5.0078F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 2.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r12 = bone131.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 13).addBox(-4.0036F, -0.994F, -1.9964F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition bone132 = bone114.addOrReplaceChild("bone132", CubeListBuilder.create(), PartPose.offset(-4.3008F, 0.793F, -3.7687F));

		PartDefinition bone133 = bone132.addOrReplaceChild("bone133", CubeListBuilder.create().texOffs(38, 47).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2969F, 0.0F, -0.2367F));

		PartDefinition cube_r13 = bone133.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 59).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0078F, 0.0F, 0.0F, 0.5934F, 0.0F));

		PartDefinition bone134 = bone132.addOrReplaceChild("bone134", CubeListBuilder.create().texOffs(32, 43).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.3047F, 0.0F, -0.2367F));

		PartDefinition cube_r14 = bone134.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 34).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0078F, 0.0F, 0.0F, -0.5934F, 0.0F));

		PartDefinition bone135 = bone114.addOrReplaceChild("bone135", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 4.45F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone135.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6641F, 0.2539F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone136 = bone135.addOrReplaceChild("bone136", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.25F, 1.0F, 0.0F, -0.2618F, 0.0873F));

		PartDefinition cube_r16 = bone136.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 6).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone137 = bone136.addOrReplaceChild("bone137", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0873F));

		PartDefinition cube_r17 = bone137.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(64, 8).addBox(-1.9924F, -0.0004F, -2.0017F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone138 = bone137.addOrReplaceChild("bone138", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r18 = bone138.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(72, 10).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone139 = bone138.addOrReplaceChild("bone139", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0873F));

		PartDefinition cube_r19 = bone139.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 14).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone140 = bone139.addOrReplaceChild("bone140", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0873F));

		PartDefinition cube_r20 = bone140.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(56, 53).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone141 = bone135.addOrReplaceChild("bone141", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.25F, 1.0F, 0.0F, 0.2618F, -0.0873F));

		PartDefinition cube_r21 = bone141.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(64, 4).mirror().addBox(0.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone142 = bone141.addOrReplaceChild("bone142", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.3491F, -0.0873F));

		PartDefinition cube_r22 = bone142.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.0076F, -0.0004F, -2.0017F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone143 = bone142.addOrReplaceChild("bone143", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r23 = bone143.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(49, 6).mirror().addBox(0.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone144 = bone143.addOrReplaceChild("bone144", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.0873F));

		PartDefinition cube_r24 = bone144.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 8).mirror().addBox(0.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone145 = bone144.addOrReplaceChild("bone145", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0873F, -0.0873F));

		PartDefinition cube_r25 = bone145.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(0.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(HumanoidRenderState renderState) {
		super.setupAnim(renderState);
	}
}
