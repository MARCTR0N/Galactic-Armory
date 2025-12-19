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

public class clone_armor_phase_1 extends HumanoidModel<LivingEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(GalacticArmory.MODID, "clone_armor_phase_1"), "main");
	private final ModelPart body;
	public final ModelPart chest;
	private final ModelPart shirt;
	private final ModelPart belt;
	private final ModelPart crotch;
	private final ModelPart stomach;
	private final ModelPart chestplate;
	private final ModelPart bone146;
	private final ModelPart bone148;
	private final ModelPart back;
	private final ModelPart bone157;
	private final ModelPart bone147;
	private final ModelPart bone155;
	private final ModelPart bone156;
    public final ModelPart right_arm;
	private final ModelPart shoulder;
	private final ModelPart rightUpperArm;
	private final ModelPart rightElbow;
	private final ModelPart rightLowerArm;
	private final ModelPart rightHand;
    public final ModelPart left_arm;
	private final ModelPart leftShoulder;
	private final ModelPart leftUpperArm;
	private final ModelPart leftElbow;
	private final ModelPart leftLowerArm;
	private final ModelPart leftHand;
	private final ModelPart right_leg;
    public final ModelPart rightLegging;
	private final ModelPart rightThigh;
	private final ModelPart rightKnee;
	private final ModelPart bone151;
	private final ModelPart rightShin;
    public final ModelPart rightBoot;
	private final ModelPart bone152;
	private final ModelPart left_leg;
    public final ModelPart leftLegging;
	private final ModelPart leftThigh;
	private final ModelPart leftKnee;
	private final ModelPart bone153;
	private final ModelPart leftShin;
    public final ModelPart leftBoot;
	private final ModelPart bone154;

	public clone_armor_phase_1(ModelPart root) {
        super(root);
		this.body = root.getChild("body");
		this.chest = this.body.getChild("chest");
		this.shirt = this.chest.getChild("shirt");
		this.belt = this.chest.getChild("belt");
		this.crotch = this.chest.getChild("crotch");
		this.stomach = this.chest.getChild("stomach");
		this.chestplate = this.chest.getChild("chestplate");
		this.bone146 = this.chestplate.getChild("bone146");
		this.bone148 = this.chestplate.getChild("bone148");
		this.back = this.chest.getChild("back");
		this.bone157 = this.back.getChild("bone157");
		this.bone147 = this.back.getChild("bone147");
		this.bone155 = this.bone147.getChild("bone155");
		this.bone156 = this.bone147.getChild("bone156");
		this.right_arm = root.getChild("right_arm");
		this.shoulder = this.right_arm.getChild("shoulder");
		this.rightUpperArm = this.right_arm.getChild("rightUpperArm");
		this.rightElbow = this.right_arm.getChild("rightElbow");
		this.rightLowerArm = this.right_arm.getChild("rightLowerArm");
		this.rightHand = this.right_arm.getChild("rightHand");
		this.left_arm = root.getChild("left_arm");
		this.leftShoulder = this.left_arm.getChild("leftShoulder");
		this.leftUpperArm = this.left_arm.getChild("leftUpperArm");
		this.leftElbow = this.left_arm.getChild("leftElbow");
		this.leftLowerArm = this.left_arm.getChild("leftLowerArm");
		this.leftHand = this.left_arm.getChild("leftHand");
		this.right_leg = root.getChild("right_leg");
		this.rightLegging = this.right_leg.getChild("rightLegging");
		this.rightThigh = this.rightLegging.getChild("rightThigh");
		this.rightKnee = this.rightLegging.getChild("rightKnee");
		this.bone151 = this.rightKnee.getChild("bone151");
		this.rightShin = this.rightLegging.getChild("rightShin");
		this.rightBoot = this.right_leg.getChild("rightBoot");
		this.bone152 = this.rightBoot.getChild("bone152");
		this.left_leg = root.getChild("left_leg");
		this.leftLegging = this.left_leg.getChild("leftLegging");
		this.leftThigh = this.leftLegging.getChild("leftThigh");
		this.leftKnee = this.leftLegging.getChild("leftKnee");
		this.bone153 = this.leftKnee.getChild("bone153");
		this.leftShin = this.leftLegging.getChild("leftShin");
		this.leftBoot = this.left_leg.getChild("leftBoot");
		this.bone154 = this.leftBoot.getChild("bone154");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(32, 0).addBox(0, 0, 0, 0, 0, 0, new CubeDeformation(0)), PartPose.offset(0.0F, 0.0F, 0.0F));


        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition shirt = chest.addOrReplaceChild("shirt", CubeListBuilder.create().texOffs(28, 1).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0039F))
		.texOffs(24, 51).addBox(-4.0F, 5.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0078F))
		.texOffs(34, 42).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0039F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition belt = chest.addOrReplaceChild("belt", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -1.0F, -2.5F, 9.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-4.75F, -1.4F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 10).addBox(3.75F, -1.4F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.5F, 0.0F));

		PartDefinition cube_r1 = belt.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 26).addBox(-0.5F, -1.5F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 0.1F, 2.25F, 0.0F, 1.4835F, 0.0F));

		PartDefinition cube_r2 = belt.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 26).addBox(-0.5F, -1.5F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.1F, 2.25F, 0.0F, -1.4835F, 0.0F));

		PartDefinition cube_r3 = belt.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 23).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.1F, -2.25F, 0.0F, 1.4835F, 0.0F));

		PartDefinition cube_r4 = belt.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 0.1F, -2.25F, 0.0F, -1.4835F, 0.0F));

		PartDefinition crotch = chest.addOrReplaceChild("crotch", CubeListBuilder.create().texOffs(22, 26).addBox(-3.5F, -13.8812F, -2.25F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(25, 12).addBox(-1.0F, -12.5F, -2.35F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0078F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = crotch.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 8).addBox(-3.5F, -13.8812F, -2.25F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(43, 14).addBox(-1.0F, -12.5F, -2.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition stomach = chest.addOrReplaceChild("stomach", CubeListBuilder.create().texOffs(8, 47).addBox(-5.0F, -3.0F, -0.35F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.05F))
		.texOffs(0, 59).addBox(-5.0F, -3.5F, -0.35F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.045F)), PartPose.offset(1.0F, -15.5F, -1.65F));

		PartDefinition cube_r6 = stomach.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 31).addBox(0.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0273F, 0.0F, 0.0436F, -0.0436F, 0.2618F));

		PartDefinition cube_r7 = stomach.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 31).addBox(-1.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0273F, 0.0F, 0.0436F, 0.0436F, -0.2618F));

		PartDefinition cube_r8 = stomach.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -2.9648F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chestplate = chest.addOrReplaceChild("chestplate", CubeListBuilder.create(), PartPose.offset(0.0F, -20.0F, 0.0F));

		PartDefinition bone146 = chestplate.addOrReplaceChild("bone146", CubeListBuilder.create(), PartPose.offset(0.0F, -3.9414F, -2.2F));

		PartDefinition cube_r9 = bone146.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 11).addBox(0.3047F, 0.0F, -0.1547F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1744F, -0.0866F, 0.0097F));

		PartDefinition cube_r10 = bone146.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 11).addBox(0.0297F, 0.0133F, 0.0297F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0258F)), PartPose.offsetAndRotation(-4.4324F, 4.0368F, -0.5778F, -0.1901F, 0.0413F, -0.2548F));

		PartDefinition cube_r11 = bone146.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 8).addBox(-4.0297F, 0.0133F, 0.0297F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0258F)), PartPose.offsetAndRotation(4.4324F, 4.0368F, -0.5778F, -0.1901F, -0.0413F, 0.2548F));

		PartDefinition cube_r12 = bone146.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 7).addBox(-4.3047F, 0.0F, -0.1547F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1744F, 0.0866F, -0.0097F));

		PartDefinition cube_r13 = bone146.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 13).addBox(-0.4453F, 0.0117F, -0.0414F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.08F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone148 = chestplate.addOrReplaceChild("bone148", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.45F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(12, 7).addBox(-3.5F, -0.8797F, 0.1922F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(6, 16).addBox(3.0F, -0.45F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 0.55F, -2.65F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone148.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 17).addBox(0.2F, -2.2F, 0.2078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(2.8F, 2.75F, 0.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition cube_r15 = bone148.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(6, 13).addBox(-1.2F, -2.2F, 0.2078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-2.8F, 2.75F, 0.0F, 0.0F, 0.0F, 0.9163F));

		PartDefinition back = chest.addOrReplaceChild("back", CubeListBuilder.create(), PartPose.offset(0.0F, -22.0F, 2.0F));

		PartDefinition cube_r16 = back.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 17).addBox(-8.1F, -4.7852F, -3.75F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.1695F)), PartPose.offsetAndRotation(4.1F, 2.9F, 0.35F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = back.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 52).addBox(-8.1F, -0.55F, -3.95F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(4.1F, 2.9F, 0.35F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone157 = back.addOrReplaceChild("bone157", CubeListBuilder.create().texOffs(48, 0).addBox(-5.0F, -2.9727F, -2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0078F)), PartPose.offset(2.5F, 2.25F, 1.25F));

		PartDefinition cube_r18 = bone157.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(50, 16).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone147 = back.addOrReplaceChild("bone147", CubeListBuilder.create(), PartPose.offset(4.014F, -2.4995F, -2.0F));

		PartDefinition bone155 = bone147.addOrReplaceChild("bone155", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.278F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r19 = bone155.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, -0.0436F));

		PartDefinition cube_r20 = bone155.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 38).addBox(-0.0078F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, -0.0436F));

		PartDefinition bone156 = bone147.addOrReplaceChild("bone156", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r21 = bone156.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(35, 14).addBox(-1.9922F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0436F));

		PartDefinition cube_r22 = bone156.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0436F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(48, 51).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0078F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition shoulder = right_arm.addOrReplaceChild("shoulder", CubeListBuilder.create().texOffs(48, 29).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F))
		.texOffs(0, 67).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-1.0234F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0175F));

		PartDefinition rightUpperArm = right_arm.addOrReplaceChild("rightUpperArm", CubeListBuilder.create().texOffs(16, 67).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.05F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition rightElbow = right_arm.addOrReplaceChild("rightElbow", CubeListBuilder.create().texOffs(24, 60).addBox(-4.0F, 2.25F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0195F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightElbow.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 43).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.55F, 1.75F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLowerArm = right_arm.addOrReplaceChild("rightLowerArm", CubeListBuilder.create().texOffs(0, 75).addBox(-4.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0117F))
		.texOffs(32, 67).addBox(-4.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition rightHand = right_arm.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offset(1.0F, 2.0F, 0.0F));

		PartDefinition cube_r24 = rightHand.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 23).addBox(-1.1F, -0.9F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0117F)), PartPose.offsetAndRotation(-3.0F, 7.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(48, 51).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0078F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition leftShoulder = left_arm.addOrReplaceChild("leftShoulder", CubeListBuilder.create().texOffs(48, 29).mirror().addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false)
		.texOffs(0, 67).mirror().addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(1.0234F, -0.25F, 0.0F, 0.0F, 0.0F, -0.0175F));

		PartDefinition leftUpperArm = left_arm.addOrReplaceChild("leftUpperArm", CubeListBuilder.create().texOffs(16, 67).mirror().addBox(0.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition leftElbow = left_arm.addOrReplaceChild("leftElbow", CubeListBuilder.create().texOffs(24, 60).mirror().addBox(0.0F, 2.25F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0195F)).mirror(false), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftElbow.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(24, 43).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 3.55F, 1.75F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLowerArm = left_arm.addOrReplaceChild("leftLowerArm", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(0.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0117F)).mirror(false)
		.texOffs(32, 67).mirror().addBox(0.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition leftHand = left_arm.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.0F, 0.0F));

		PartDefinition cube_r26 = leftHand.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(50, 23).mirror().addBox(-0.9F, -0.9F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0117F)).mirror(false), PartPose.offsetAndRotation(3.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition rightLegging = right_leg.addOrReplaceChild("rightLegging", CubeListBuilder.create().texOffs(8, 31).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0078F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition rightThigh = rightLegging.addOrReplaceChild("rightThigh", CubeListBuilder.create().texOffs(36, 33).addBox(-2.05F, -0.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F))
		.texOffs(38, 18).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0156F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition rightKnee = rightLegging.addOrReplaceChild("rightKnee", CubeListBuilder.create().texOffs(24, 31).addBox(-2.0F, -1.25F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.075F)), PartPose.offset(-2.0F, -6.0F, 0.0F));

		PartDefinition bone151 = rightKnee.addOrReplaceChild("bone151", CubeListBuilder.create().texOffs(34, 17).addBox(-1.75F, -2.85F, -2.0156F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(-1.0F, -1.6F, -2.15F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.03F)), PartPose.offset(0.0F, -0.15F, -0.1F));

		PartDefinition rightShin = rightLegging.addOrReplaceChild("rightShin", CubeListBuilder.create().texOffs(16, 74).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0156F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition rightBoot = right_leg.addOrReplaceChild("rightBoot", CubeListBuilder.create().texOffs(36, 27).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0156F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition bone152 = rightBoot.addOrReplaceChild("bone152", CubeListBuilder.create().texOffs(24, 39).addBox(-2.0F, -0.75F, -2.55F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-2.0F, -0.75F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone152.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 31).addBox(0.0F, -1.0F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.75F, -2.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition leftLegging = left_leg.addOrReplaceChild("leftLegging", CubeListBuilder.create().texOffs(8, 31).mirror().addBox(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0078F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition leftThigh = leftLegging.addOrReplaceChild("leftThigh", CubeListBuilder.create().texOffs(36, 33).mirror().addBox(-1.95F, -0.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false)
		.texOffs(38, 18).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0156F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition leftKnee = leftLegging.addOrReplaceChild("leftKnee", CubeListBuilder.create().texOffs(24, 31).mirror().addBox(-2.0F, -1.25F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.075F)).mirror(false), PartPose.offset(2.0F, -6.0F, 0.0F));

		PartDefinition bone153 = leftKnee.addOrReplaceChild("bone153", CubeListBuilder.create().texOffs(34, 17).mirror().addBox(-2.25F, -2.85F, -2.0156F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 27).mirror().addBox(-1.0F, -1.6F, -2.15F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.03F)).mirror(false), PartPose.offset(0.0F, -0.15F, -0.1F));

		PartDefinition leftShin = leftLegging.addOrReplaceChild("leftShin", CubeListBuilder.create().texOffs(16, 74).mirror().addBox(-2.0F, 6.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0156F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition leftBoot = left_leg.addOrReplaceChild("leftBoot", CubeListBuilder.create().texOffs(36, 27).mirror().addBox(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0156F)).mirror(false), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition bone154 = leftBoot.addOrReplaceChild("bone154", CubeListBuilder.create().texOffs(24, 39).mirror().addBox(-2.0F, -0.75F, -2.55F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 20).mirror().addBox(-2.0F, -0.75F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone154.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 31).mirror().addBox(-3.0F, -1.0F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.75F, -2.5F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int colour) {
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, colour);
        this.right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, colour);
        this.left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, colour);
        this.right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, colour);
        this.left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, colour);
    }

    @Override
    public void setupAnim(LivingEntity livingEntity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(livingEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

    }
}