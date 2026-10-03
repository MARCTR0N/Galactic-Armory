// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Reworked as a HumanoidModel so the helmet part item renderer can resolve it.

package com.marctron.galacticarmory.common.armor.model.base;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public class phase_2_clone_base extends HumanoidModel<HumanoidRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "phase_2_clone_base"), "main");
	public static final Identifier TEXTURE =
			Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "textures/models/armor/clone_helmet_phase_2.png");

	private final ModelPart phase2;
	private final ModelPart bipedhead2;

	public phase_2_clone_base(ModelPart root) {
		super(root);
		this.phase2 = this.head.getChild("phase2");
		this.bipedhead2 = this.phase2.getChild("bipedhead2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		// HumanoidModel requires these to exist; they stay empty because only the helmet
		// part itself is ever submitted for these models.
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		head.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition phase2 = head.addOrReplaceChild("phase2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedhead2 = phase2.addOrReplaceChild("bipedhead2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.75F, -6.2544F, -5.75F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(4.75F, -1.7456F, 1.75F));

		PartDefinition cube_r1 = bipedhead2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.75F, -5.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0524F));

		PartDefinition cube_r2 = bipedhead2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 38).addBox(-0.25F, -5.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0524F));

		PartDefinition cube_r3 = bipedhead2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 41).addBox(-3.0F, -6.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, 1.3237F, 3.3297F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bipedhead2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 37).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.75F, -3.4544F, 3.1F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone35 = bipedhead2.addOrReplaceChild("bone35", CubeListBuilder.create().texOffs(35, 47).addBox(3.2071F, -7.5F, -2.672F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, 2.9409F, 2.6719F));

		PartDefinition cube_r5 = bone35.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 10).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -7.5F, 0.0352F, 0.0F, 0.0349F, 0.0F));

		PartDefinition bone34 = bone35.addOrReplaceChild("bone34", CubeListBuilder.create().texOffs(48, 23).addBox(-0.975F, -1.4922F, -0.9751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -6.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone36 = bipedhead2.addOrReplaceChild("bone36", CubeListBuilder.create().texOffs(29, 47).addBox(-4.2071F, -7.5F, -2.7071F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.9409F, 2.707F));

		PartDefinition cube_r6 = bone36.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 13).addBox(0.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -7.5F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition bone37 = bone36.addOrReplaceChild("bone37", CubeListBuilder.create().texOffs(16, 24).addBox(0.0F, -1.4922F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -6.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone16 = bipedhead2.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(19, 18).addBox(-3.0F, -1.9973F, -5.003F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.75F, 1.5964F, 3.4992F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone16.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -1.0F, -3.9922F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0027F, -5.0108F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone21 = bone16.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(36, 13).addBox(-2.4247F, -0.0294F, -5.3592F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-1.0105F, -0.0294F, -0.945F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9779F, -1.9723F, -0.0438F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r8 = bone21.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 43).addBox(0.0F, 0.0008F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4247F, -0.0202F, -1.3592F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone45 = bone21.addOrReplaceChild("bone45", CubeListBuilder.create().texOffs(34, 32).addBox(0.0F, -0.0092F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4247F, -0.0202F, -5.3592F, 0.0873F, -0.1745F, 0.0F));

		PartDefinition bone19 = bone45.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(15, 49).addBox(0.0F, -0.0092F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1745F, -0.3316F, -0.0698F));

		PartDefinition bone47 = bone19.addOrReplaceChild("bone47", CubeListBuilder.create().texOffs(23, 49).addBox(0.0F, -0.0092F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0078F, 0.0078F, 0.5F));

		PartDefinition bone44 = bone47.addOrReplaceChild("bone44", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r9 = bone44.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 50).addBox(0.0F, -0.0053F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition bone20 = bone16.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(34, 25).addBox(0.4247F, -0.0294F, -5.3592F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(19, 18).addBox(0.0105F, -0.0294F, -0.945F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9779F, -1.9723F, -0.0438F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r10 = bone20.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(42, 31).addBox(-2.0F, 0.0008F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4247F, -0.0202F, -1.3592F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone42 = bone20.addOrReplaceChild("bone42", CubeListBuilder.create().texOffs(34, 7).addBox(-2.0F, -0.0092F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4247F, -0.0202F, -5.3592F, 0.0873F, 0.1745F, 0.0F));

		PartDefinition bone43 = bone42.addOrReplaceChild("bone43", CubeListBuilder.create().texOffs(15, 53).mirror().addBox(-2.0F, -0.0092F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1745F, 0.3316F, 0.0698F));

		PartDefinition bone48 = bone43.addOrReplaceChild("bone48", CubeListBuilder.create().texOffs(23, 53).mirror().addBox(-2.0F, -0.0092F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.0078F, 0.0078F, 0.5F));

		PartDefinition bone49 = bone48.addOrReplaceChild("bone49", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r11 = bone49.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-2.0F, -0.0053F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition chin = bipedhead2.addOrReplaceChild("chin", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.75F, 1.3042F, -8.357F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r12 = chin.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 4).addBox(0.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -1.01F, 2.0682F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r13 = chin.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 4).addBox(-0.5F, -0.8984F, 0.3828F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.3272F, 0.8525F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r14 = chin.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.8984F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1117F, 0.7392F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone18 = chin.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(9, 50).addBox(-0.0303F, -0.9063F, 0.0303F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0352F, -2.1117F, -0.0108F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r15 = bone18.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 6).addBox(0.0F, -3.0F, 0.0078F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9697F, 2.0938F, 0.0303F, 0.0F, 0.0F, -0.5236F));

		PartDefinition bone17 = chin.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(8, 50).addBox(-0.9697F, -0.9063F, 0.0303F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.043F, -2.1117F, -0.0108F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r16 = bone17.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(6, 31).addBox(-3.0F, -3.0F, 0.0078F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9697F, 2.0938F, 0.0303F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bone38 = bipedhead2.addOrReplaceChild("bone38", CubeListBuilder.create().texOffs(0, 16).addBox(-8.25F, -7.4362F, -4.0003F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = bone38.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(24, 0).addBox(-6.9961F, -2.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -6.4362F, -5.7324F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Head_r2 = bone38.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(16, 28).addBox(-7.0F, -2.0F, 0.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -4.5044F, -6.25F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone39 = bone38.addOrReplaceChild("bone39", CubeListBuilder.create().texOffs(24, 4).addBox(-0.0039F, 0.0039F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.25F, -7.4362F, 1.0997F));

		PartDefinition Head_r3 = bone39.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(20, 25).addBox(0.0F, 0.0F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4142F, 1.4142F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r4 = bone39.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 28).addBox(0.0039F, 0.0F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(HumanoidRenderState renderState) {
		super.setupAnim(renderState);
	}
}
