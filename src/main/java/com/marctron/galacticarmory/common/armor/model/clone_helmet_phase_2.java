package com.marctron.galacticarmory.common.armor.model;// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.marctron.galacticarmory.GalacticArmory;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class clone_helmet_phase_2 extends HumanoidModel<LivingEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(GalacticArmory.MODID, "clone_helmet_phase_2"), "main");
    private final ModelPart head;
	private final ModelPart phase2;
	private final ModelPart bipedhead2;
	private final ModelPart bone35;
	private final ModelPart bone34;
	private final ModelPart bone36;
	private final ModelPart bone37;
	private final ModelPart bone16;
	private final ModelPart bone21;
	private final ModelPart bone45;
	private final ModelPart bone19;
	private final ModelPart bone47;
	private final ModelPart bone44;
	private final ModelPart bone20;
	private final ModelPart bone42;
	private final ModelPart bone43;
	private final ModelPart bone48;
	private final ModelPart bone49;
	private final ModelPart chin;
	private final ModelPart bone18;
	private final ModelPart bone17;
	private final ModelPart bone38;
	private final ModelPart bone39;
	private final ModelPart visor2;
	private final ModelPart bone;
	private final ModelPart bone22;
	private final ModelPart bone28;
	private final ModelPart bone29;
	private final ModelPart phase2nose;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart bone46;
	private final ModelPart bone32;
	private final ModelPart bone41;
	private final ModelPart bone30;
	private final ModelPart bone31;
	private final ModelPart bone50;
	private final ModelPart bone33;
	private final ModelPart bone40;
	private final ModelPart fin2;

	public clone_helmet_phase_2(ModelPart root) {
        super(root);
		this.head = root.getChild("head");
		this.phase2 = this.head.getChild("phase2");
		this.bipedhead2 = this.phase2.getChild("bipedhead2");
		this.bone35 = this.bipedhead2.getChild("bone35");
		this.bone34 = this.bone35.getChild("bone34");
		this.bone36 = this.bipedhead2.getChild("bone36");
		this.bone37 = this.bone36.getChild("bone37");
		this.bone16 = this.bipedhead2.getChild("bone16");
		this.bone21 = this.bone16.getChild("bone21");
		this.bone45 = this.bone21.getChild("bone45");
		this.bone19 = this.bone45.getChild("bone19");
		this.bone47 = this.bone19.getChild("bone47");
		this.bone44 = this.bone47.getChild("bone44");
		this.bone20 = this.bone16.getChild("bone20");
		this.bone42 = this.bone20.getChild("bone42");
		this.bone43 = this.bone42.getChild("bone43");
		this.bone48 = this.bone43.getChild("bone48");
		this.bone49 = this.bone48.getChild("bone49");
		this.chin = this.bipedhead2.getChild("chin");
		this.bone18 = this.chin.getChild("bone18");
		this.bone17 = this.chin.getChild("bone17");
		this.bone38 = this.bipedhead2.getChild("bone38");
		this.bone39 = this.bone38.getChild("bone39");
		this.visor2 = this.phase2.getChild("visor2");
		this.bone = this.visor2.getChild("bone");
		this.bone22 = this.bone.getChild("bone22");
		this.bone28 = this.visor2.getChild("bone28");
		this.bone29 = this.bone28.getChild("bone29");
		this.phase2nose = this.visor2.getChild("phase2nose");
		this.bone25 = this.phase2nose.getChild("bone25");
		this.bone26 = this.bone25.getChild("bone26");
		this.bone27 = this.bone25.getChild("bone27");
		this.bone23 = this.phase2nose.getChild("bone23");
		this.bone24 = this.bone23.getChild("bone24");
		this.bone46 = this.bone24.getChild("bone46");
		this.bone32 = this.bone46.getChild("bone32");
		this.bone41 = this.bone32.getChild("bone41");
		this.bone30 = this.phase2nose.getChild("bone30");
		this.bone31 = this.bone30.getChild("bone31");
		this.bone50 = this.bone31.getChild("bone50");
		this.bone33 = this.bone50.getChild("bone33");
		this.bone40 = this.bone33.getChild("bone40");
		this.fin2 = this.phase2.getChild("fin2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

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

		PartDefinition visor2 = phase2.addOrReplaceChild("visor2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.75F, -5.0F));

		PartDefinition bone = visor2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(6, 37).addBox(-4.6971F, -29.5F, -2.2929F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.3571F, 29.45F, 4.2179F));

		PartDefinition bone22 = bone.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(17, 32).addBox(-4.7071F, -30.0F, -3.3007F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(37, 38).addBox(-4.0F, -30.0059F, -4.0028F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r5 = bone22.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(6, 39).addBox(-4.0F, -30.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1716F, 0.0039F, -1.1716F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone28 = visor2.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(25, 36).addBox(3.6971F, -29.5F, -2.2929F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.3571F, 29.45F, 4.2179F));

		PartDefinition bone29 = bone28.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(10, 31).addBox(3.7071F, -30.0F, -3.3007F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(36, 19).addBox(0.0F, -30.002F, -3.9989F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r6 = bone29.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(17, 33).addBox(3.0F, -30.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1716F, 0.0039F, -1.1716F, 0.0F, 0.7854F, 0.0F));

		PartDefinition phase2nose = visor2.addOrReplaceChild("phase2nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8398F, 0.2227F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = phase2nose.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 28).addBox(0.0F, -0.2813F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(7.0156F, -0.2813F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0078F, 0.8943F, 0.6052F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone25 = phase2nose.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(42, 22).addBox(0.0F, -2.0117F, -0.025F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.5F, 2.9648F, 0.0547F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7552F, 0.145F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r7 = bone25.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(19, 16).addBox(-2.0F, -1.0F, -0.0255F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.25F, -0.0078F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Head_r8 = bone25.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(42, 2).addBox(-1.0F, -1.0F, -0.0255F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.25F, -0.0078F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.65F, -0.025F, 0.0F, 0.0436F, 0.0F));

		PartDefinition Head_r9 = bone26.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(32, 7).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9971F, 0.0F, 0.1309F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Head_r10 = bone26.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(0, 44).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone27 = bone25.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -1.65F, -0.025F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Head_r11 = bone27.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(32, 7).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9971F, 0.0F, 0.1309F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Head_r12 = bone27.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition bone23 = phase2nose.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(0, 39).addBox(0.0046F, -1.0F, -2.7929F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3429F, 1.0122F, 4.0903F, 0.4189F, 0.0F, 0.0F));

		PartDefinition bone24 = bone23.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(0, 39).addBox(-0.0032F, -1.0F, -0.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Head_r13 = bone24.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(31, 37).addBox(-4.0004F, -29.9922F, -0.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5323F, 29.0F, 1.1284F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone46 = bone24.addOrReplaceChild("bone46", CubeListBuilder.create().texOffs(47, 37).addBox(-0.0095F, -0.0513F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7134F, -0.9504F, -1.695F, 0.0F, 0.0436F, 0.0F));

		PartDefinition Head_r14 = bone46.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(8, 47).addBox(-2.9999F, -0.0006F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1523F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r15 = bone46.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(47, 21).addBox(0.0001F, -0.0003F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0095F, -0.0516F, -0.0039F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bone32 = bone46.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offset(3.2868F, 0.5583F, 0.0039F));

		PartDefinition Head_r16 = bone32.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(24, 33).addBox(-2.9999F, -0.0006F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2164F, 0.9763F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r17 = bone32.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(46, 35).addBox(-2.9999F, -0.0006F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone41 = bone32.addOrReplaceChild("bone41", CubeListBuilder.create(), PartPose.offset(0.2164F, 0.9757F, -0.0078F));

		PartDefinition Head_r18 = bone41.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(24, 35).addBox(-1.5F, 0.0078F, 0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 35).addBox(-1.0F, 0.0F, 0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.031F, 0.9016F, -0.0156F, 0.0F, 0.0F, -1.2654F));

		PartDefinition Head_r19 = bone41.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(0, 47).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0117F, 0.0F, 0.0F, -0.6109F));

		PartDefinition bone30 = phase2nose.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(31, 38).addBox(-1.0046F, -1.0F, -2.7929F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3429F, 1.0122F, 4.0903F, 0.4189F, 0.0F, 0.0F));

		PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(0, 33).addBox(-0.9968F, -1.0F, -0.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Head_r20 = bone31.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(24, 31).addBox(3.0004F, -29.9922F, -0.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5323F, 29.0F, 1.1284F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone50 = bone31.addOrReplaceChild("bone50", CubeListBuilder.create().texOffs(22, 38).addBox(-1.9905F, -0.0513F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7134F, -0.9504F, -1.695F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Head_r21 = bone50.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(23, 46).addBox(-0.0001F, -0.0006F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1524F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Head_r22 = bone50.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(46, 29).addBox(-3.0001F, -0.0003F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0095F, -0.0516F, -0.0039F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bone33 = bone50.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offset(-3.2868F, 0.5583F, 0.0039F));

		PartDefinition Head_r23 = bone33.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(0, 31).addBox(1.9999F, -0.0006F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2164F, 0.9763F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Head_r24 = bone33.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(15, 46).addBox(-0.0001F, -0.0006F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone40 = bone33.addOrReplaceChild("bone40", CubeListBuilder.create(), PartPose.offset(-0.2164F, 0.9757F, -0.0078F));

		PartDefinition Head_r25 = bone40.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(46, 19).addBox(0.0F, -1.0F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0039F, 0.0F, 0.0F, 0.6109F));

		PartDefinition Head_r26 = bone40.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(17, 31).addBox(0.5F, 0.0078F, 0.0117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 31).addBox(0.0F, 0.0F, 0.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.031F, 0.9016F, -0.0078F, 0.0F, 0.0F, 1.2654F));

		PartDefinition fin2 = phase2.addOrReplaceChild("fin2", CubeListBuilder.create().texOffs(27, 11).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.75F, -0.3438F));

		PartDefinition cube_r18 = fin2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 26).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5078F, -1.0F, 3.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r19 = fin2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(34, 13).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5078F, -1.0F, -2.0F, 0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int colour) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, colour);
    }

    @Override
    public void setupAnim(LivingEntity livingEntity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(livingEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }
}