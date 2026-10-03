// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Reworked as a HumanoidModel so the helmet part renderers can resolve it.

package com.marctron.galacticarmory.common.armor.model.visor;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public class arf_clone_visor extends HumanoidModel<HumanoidRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "arf_clone_visor"), "main");
	public static final Identifier TEXTURE =
			Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "textures/models/armor/clone_helmet_arf.png");

	public arf_clone_visor(ModelPart root) {
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

		PartDefinition arf = head.addOrReplaceChild("arf_visor", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mouthpiece = arf.addOrReplaceChild("mouthpiece", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.15F, -6.1734F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 5).addBox(-1.0F, -2.9F, -6.1617F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 6).addBox(-0.5F, -3.4F, -6.1539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 0).addBox(-0.5F, -0.3555F, -6.3359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.3F));

		PartDefinition bone85 = mouthpiece.addOrReplaceChild("bone85", CubeListBuilder.create().texOffs(8, 3).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -3.7599F, -6.1927F));

		PartDefinition cube_r1 = bone85.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 21).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0746F, 1.6868F, 1.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r2 = bone85.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 7).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0078F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r3 = bone85.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0746F, 1.6868F, 1.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r4 = bone85.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 9).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0078F, 0.0F, 0.0F, 0.5672F));

		PartDefinition bone84 = mouthpiece.addOrReplaceChild("bone84", CubeListBuilder.create().texOffs(12, 4).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.7599F, -6.1927F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone84.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 14).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0746F, 1.6868F, 1.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r6 = bone84.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0009F, 0.0014F, -0.9924F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r7 = bone84.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(6, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0746F, 1.6868F, 1.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r8 = bone84.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 13).addBox(0.0009F, 0.0014F, -0.9924F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition bone93 = arf.addOrReplaceChild("bone93", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.65F));

		PartDefinition cube_r9 = bone93.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 37).addBox(-1.2F, -3.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0914F, -0.2078F, -0.6F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r10 = bone93.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 42).addBox(-1.8F, -3.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0914F, -0.2078F, -0.6F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r11 = bone93.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 41).addBox(0.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1578F, -1.1633F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r12 = bone93.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 20).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1578F, -1.1633F, 0.0F, 0.1745F, 0.0F));

		PartDefinition visor = arf.addOrReplaceChild("visor", CubeListBuilder.create(), PartPose.offset(0.0F, -5.25F, -4.4609F));

		PartDefinition bone94 = visor.addOrReplaceChild("bone94", CubeListBuilder.create().texOffs(44, 48).addBox(-4.0F, -30.225F, -3.525F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 14).addBox(-4.01F, -30.225F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(54, 42).addBox(3.01F, -30.225F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 29.75F, 4.0F));

		PartDefinition bone95 = bone94.addOrReplaceChild("bone95", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.5F, -4.225F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone96 = bone95.addOrReplaceChild("bone96", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.25F, 0.0F, 4.1F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone97 = bone95.addOrReplaceChild("bone97", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, 0.0F, 4.1F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone98 = bone97.addOrReplaceChild("bone98", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0969F, 0.0299F, 0.7462F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r1 = bone98.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(15, 4).addBox(3.0005F, -30.0036F, 0.0014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5355F, 29.0F, -1.8787F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone106 = bone98.addOrReplaceChild("bone106", CubeListBuilder.create().texOffs(6, 41).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7071F, -1.0F, -4.7071F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Head_r2 = bone106.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(34, 25).addBox(-2.9993F, -0.9998F, 0.0038F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone99 = bone95.addOrReplaceChild("bone99", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.25F, 0.0F, 4.1F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone105 = bone99.addOrReplaceChild("bone105", CubeListBuilder.create().texOffs(13, 36).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0969F, 0.0299F, 0.7462F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Head_r3 = bone105.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(16, 8).addBox(-4.0005F, -30.0036F, 0.0014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5355F, 29.0F, -1.8787F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone107 = bone105.addOrReplaceChild("bone107", CubeListBuilder.create().texOffs(26, 25).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7071F, -1.0F, -4.7071F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Head_r4 = bone107.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(22, 16).addBox(-0.0007F, -0.9998F, 0.0038F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone100 = bone94.addOrReplaceChild("bone100", CubeListBuilder.create().texOffs(5, 34).addBox(-4.5F, -29.9922F, -3.325F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(37, 29).addBox(-2.7679F, -30.0078F, -4.325F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-0.7321F, -30.0F, -4.3328F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 31).addBox(3.0F, -29.9922F, -3.325F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-0.7321F, -30.2656F, -4.3211F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(37, 29).addBox(-2.7679F, -30.2578F, -4.3133F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(5, 34).addBox(-4.4922F, -30.25F, -3.3133F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(30, 31).addBox(2.9922F, -30.25F, -3.3133F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(10, 19).addBox(3.025F, -29.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-4.525F, -29.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -0.8F, -0.25F));

		PartDefinition Head_r5 = bone100.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(30, 37).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -30.2422F, -3.3133F, 0.0F, 1.0472F, 0.0F));

		PartDefinition Head_r6 = bone100.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(37, 32).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -30.2422F, -3.3133F, 0.0F, -1.0472F, 0.0F));

		PartDefinition Head_r7 = bone100.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(30, 37).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -30.0F, -3.325F, 0.0F, 1.0472F, 0.0F));

		PartDefinition Head_r8 = bone100.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(37, 32).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -30.0F, -3.325F, 0.0F, -1.0472F, 0.0F));

		PartDefinition phase1nose2 = visor.addOrReplaceChild("phase1nose2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2227F, -0.2188F));

		PartDefinition cube_r13 = phase1nose2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(4, 13).addBox(0.7305F, -0.332F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2305F, -1.1799F, -0.5803F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r9 = phase1nose2.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, 3.0F, 0.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(41, 33).addBox(0.0F, 1.7148F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.1875F, 0.7188F, 0.0F, -0.0044F, 0.0F));

		PartDefinition Head_r10 = phase1nose2.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(48, 45).addBox(-1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 38).addBox(-1.0F, 3.2852F, 0.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.4727F, 0.7188F, 0.0F, 0.0044F, 0.0F));

		PartDefinition bone101 = phase1nose2.addOrReplaceChild("bone101", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0273F, -0.0062F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone102 = bone101.addOrReplaceChild("bone102", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.25F, 0.0F, 4.1F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone103 = bone102.addOrReplaceChild("bone103", CubeListBuilder.create(), PartPose.offset(4.0F, 29.0F, -0.35F));

		PartDefinition bone104 = bone102.addOrReplaceChild("bone104", CubeListBuilder.create(), PartPose.offset(1.0F, -1.0F, -4.1F));

		PartDefinition bone108 = bone104.addOrReplaceChild("bone108", CubeListBuilder.create(), PartPose.offset(0.4F, 0.0F, 0.0F));

		PartDefinition bone109 = bone101.addOrReplaceChild("bone109", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, 0.0F, 4.1F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone110 = bone109.addOrReplaceChild("bone110", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0F, -4.1F));

		PartDefinition bone111 = bone110.addOrReplaceChild("bone111", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.0F, 0.0F));

		PartDefinition bone112 = bone101.addOrReplaceChild("bone112", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, 0.0F, 4.1F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone113 = phase1nose2.addOrReplaceChild("bone113", CubeListBuilder.create().texOffs(40, 55).addBox(0.0F, -1.7547F, 0.5267F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8656F, -0.7703F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r11 = bone113.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(23, 39).addBox(-3.0F, 0.25F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8797F, 0.5267F, 0.0F, 0.3229F, 0.0F));

		PartDefinition Head_r12 = bone113.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(50, 42).addBox(0.0F, 0.25F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.8797F, 0.5267F, 0.0F, -0.3229F, 0.0F));

		
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(HumanoidRenderState renderState) {
		super.setupAnim(renderState);
	}
}
