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

public class clone_helmet_arf extends HumanoidModel<LivingEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(GalacticArmory.MODID, "clone_helmet_arf"), "main");
    private final ModelPart head;
    private final ModelPart arf;
	private final ModelPart mouthpiece;
	private final ModelPart bone85;
	private final ModelPart bone84;
	private final ModelPart sunvisor;
	private final ModelPart bone86;
	private final ModelPart bone87;
	private final ModelPart bone88;
	private final ModelPart bone89;
	private final ModelPart bone90;
	private final ModelPart bone91;
	private final ModelPart bone92;
	private final ModelPart bone93;
	private final ModelPart visor;
	private final ModelPart bone94;
	private final ModelPart bone95;
	private final ModelPart bone96;
	private final ModelPart bone97;
	private final ModelPart bone98;
	private final ModelPart bone106;
	private final ModelPart bone99;
	private final ModelPart bone105;
	private final ModelPart bone107;
	private final ModelPart bone100;
	private final ModelPart phase1nose2;
	private final ModelPart bone101;
	private final ModelPart bone102;
	private final ModelPart bone103;
	private final ModelPart bone104;
	private final ModelPart bone108;
	private final ModelPart bone109;
	private final ModelPart bone110;
	private final ModelPart bone111;
	private final ModelPart bone112;
	private final ModelPart bone113;
	private final ModelPart bone114;
	private final ModelPart bone115;
	private final ModelPart bone127;
	private final ModelPart bone116;
	private final ModelPart bone117;
	private final ModelPart bone118;
	private final ModelPart bone119;
	private final ModelPart bone120;
	private final ModelPart bone121;
	private final ModelPart bone122;
	private final ModelPart bone123;
	private final ModelPart bone124;
	private final ModelPart bone125;
	private final ModelPart bone126;
	private final ModelPart bone128;
	private final ModelPart bone129;
	private final ModelPart bone130;
	private final ModelPart bone131;
	private final ModelPart bone132;
	private final ModelPart bone133;
	private final ModelPart bone134;
	private final ModelPart bone135;
	private final ModelPart bone136;
	private final ModelPart bone137;
	private final ModelPart bone138;
	private final ModelPart bone139;
	private final ModelPart bone140;
	private final ModelPart bone141;
	private final ModelPart bone142;
	private final ModelPart bone143;
	private final ModelPart bone144;
	private final ModelPart bone145;

	public clone_helmet_arf(ModelPart root) {
        super(root);
		this.head = root.getChild("head");
		this.arf = head.getChild("arf");
		this.mouthpiece = this.arf.getChild("mouthpiece");
		this.bone85 = this.mouthpiece.getChild("bone85");
		this.bone84 = this.mouthpiece.getChild("bone84");
		this.sunvisor = this.arf.getChild("sunvisor");
		this.bone86 = this.sunvisor.getChild("bone86");
		this.bone87 = this.bone86.getChild("bone87");
		this.bone88 = this.bone87.getChild("bone88");
		this.bone89 = this.sunvisor.getChild("bone89");
		this.bone90 = this.bone89.getChild("bone90");
		this.bone91 = this.sunvisor.getChild("bone91");
		this.bone92 = this.sunvisor.getChild("bone92");
		this.bone93 = this.arf.getChild("bone93");
		this.visor = this.arf.getChild("visor");
		this.bone94 = this.visor.getChild("bone94");
		this.bone95 = this.bone94.getChild("bone95");
		this.bone96 = this.bone95.getChild("bone96");
		this.bone97 = this.bone95.getChild("bone97");
		this.bone98 = this.bone97.getChild("bone98");
		this.bone106 = this.bone98.getChild("bone106");
		this.bone99 = this.bone95.getChild("bone99");
		this.bone105 = this.bone99.getChild("bone105");
		this.bone107 = this.bone105.getChild("bone107");
		this.bone100 = this.bone94.getChild("bone100");
		this.phase1nose2 = this.visor.getChild("phase1nose2");
		this.bone101 = this.phase1nose2.getChild("bone101");
		this.bone102 = this.bone101.getChild("bone102");
		this.bone103 = this.bone102.getChild("bone103");
		this.bone104 = this.bone102.getChild("bone104");
		this.bone108 = this.bone104.getChild("bone108");
		this.bone109 = this.bone101.getChild("bone109");
		this.bone110 = this.bone109.getChild("bone110");
		this.bone111 = this.bone110.getChild("bone111");
		this.bone112 = this.bone101.getChild("bone112");
		this.bone113 = this.phase1nose2.getChild("bone113");
		this.bone114 = this.arf.getChild("bone114");
		this.bone115 = this.bone114.getChild("bone115");
		this.bone127 = this.bone115.getChild("bone127");
		this.bone116 = this.bone115.getChild("bone116");
		this.bone117 = this.bone116.getChild("bone117");
		this.bone118 = this.bone117.getChild("bone118");
		this.bone119 = this.bone118.getChild("bone119");
		this.bone120 = this.bone115.getChild("bone120");
		this.bone121 = this.bone120.getChild("bone121");
		this.bone122 = this.bone121.getChild("bone122");
		this.bone123 = this.bone122.getChild("bone123");
		this.bone124 = this.bone115.getChild("bone124");
		this.bone125 = this.bone124.getChild("bone125");
		this.bone126 = this.bone125.getChild("bone126");
		this.bone128 = this.bone126.getChild("bone128");
		this.bone129 = this.bone115.getChild("bone129");
		this.bone130 = this.bone129.getChild("bone130");
		this.bone131 = this.bone129.getChild("bone131");
		this.bone132 = this.bone114.getChild("bone132");
		this.bone133 = this.bone132.getChild("bone133");
		this.bone134 = this.bone132.getChild("bone134");
		this.bone135 = this.bone114.getChild("bone135");
		this.bone136 = this.bone135.getChild("bone136");
		this.bone137 = this.bone136.getChild("bone137");
		this.bone138 = this.bone137.getChild("bone138");
		this.bone139 = this.bone138.getChild("bone139");
		this.bone140 = this.bone139.getChild("bone140");
		this.bone141 = this.bone135.getChild("bone141");
		this.bone142 = this.bone141.getChild("bone142");
		this.bone143 = this.bone142.getChild("bone143");
		this.bone144 = this.bone143.getChild("bone144");
		this.bone145 = this.bone144.getChild("bone145");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition arf = head.addOrReplaceChild("arf", CubeListBuilder.create().texOffs(4, 48).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));

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

		PartDefinition sunvisor = arf.addOrReplaceChild("sunvisor", CubeListBuilder.create().texOffs(0, 25).addBox(-4.5F, -1.25F, -0.25F, 9.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.8164F, 0.0F));

		PartDefinition cube_r9 = sunvisor.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(7, 31).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -1.2578F, 3.75F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r10 = sunvisor.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 31).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0774F, -1.2656F, 4.6563F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r11 = sunvisor.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 31).addBox(-1.9922F, -0.0078F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1377F, -1.25F, 4.9983F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r12 = sunvisor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(2, 19).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1377F, -1.25F, 4.9983F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r13 = sunvisor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0774F, -1.2656F, 4.6563F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r14 = sunvisor.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 10).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -1.2578F, 3.75F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r15 = sunvisor.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 25).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 13).addBox(7.9094F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4547F, 2.6406F, 0.75F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r16 = sunvisor.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(74, 15).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(14, 13).addBox(8.0234F, 0.0F, 0.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5117F, -0.75F, -6.25F, 0.9163F, 0.0F, 0.0F));

		PartDefinition bone86 = sunvisor.addOrReplaceChild("bone86", CubeListBuilder.create(), PartPose.offset(-4.5F, -0.75F, -6.25F));

		PartDefinition cube_r17 = bone86.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0078F, 1.789F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = bone86.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 0).addBox(0.0078F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0078F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone87 = bone86.addOrReplaceChild("bone87", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r19 = bone87.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(64, 14).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.789F, 0.0F, -3.1416F));

		PartDefinition cube_r20 = bone87.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone88 = bone87.addOrReplaceChild("bone88", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0117F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r21 = bone88.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.789F, 0.0F, -3.1416F));

		PartDefinition cube_r22 = bone88.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone89 = sunvisor.addOrReplaceChild("bone89", CubeListBuilder.create(), PartPose.offset(4.5F, -0.75F, -6.25F));

		PartDefinition cube_r23 = bone89.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(39, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0078F, 1.789F, 0.0F, 3.1416F));

		PartDefinition cube_r24 = bone89.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-1.0078F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0078F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone90 = bone89.addOrReplaceChild("bone90", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r25 = bone90.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(72, 14).addBox(0.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.789F, 0.0F, 3.1416F));

		PartDefinition cube_r26 = bone90.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone91 = sunvisor.addOrReplaceChild("bone91", CubeListBuilder.create().texOffs(23, 8).addBox(-4.5F, -1.0F, -0.3742F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0273F, 0.9679F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone91.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 20).addBox(-4.3429F, -1.0F, -1.3346F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0078F, 2.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r28 = bone91.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 8).addBox(-2.8343F, -1.0F, -3.3075F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0156F, 2.0F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r29 = bone91.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(26, 25).addBox(-1.8742F, -1.0F, -3.1377F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r30 = bone91.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(16, 31).addBox(-0.118F, -1.0039F, -3.1377F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r31 = bone91.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(23, 31).addBox(0.8343F, -1.0F, -3.3075F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0156F, 2.0F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r32 = bone91.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(29, 31).addBox(2.3429F, -1.0F, -1.3346F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0078F, 2.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition bone92 = sunvisor.addOrReplaceChild("bone92", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -2.1836F, -4.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone92.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(86, 4).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(80, 8).addBox(-1.5313F, 0.0039F, -1.9297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1685F, 0.2266F, -0.1091F));

		PartDefinition cube_r34 = bone92.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(86, 8).addBox(0.5313F, 0.0039F, -1.9297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(80, 4).addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 1.1685F, -0.2266F, 0.1091F));

		PartDefinition cube_r35 = bone92.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(80, 0).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition bone93 = arf.addOrReplaceChild("bone93", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.65F));

		PartDefinition cube_r36 = bone93.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(36, 37).addBox(-1.2F, -3.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0914F, -0.2078F, -0.6F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r37 = bone93.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(18, 42).addBox(-1.8F, -3.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0914F, -0.2078F, -0.6F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r38 = bone93.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(30, 41).addBox(0.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1578F, -1.1633F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r39 = bone93.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(36, 20).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1578F, -1.1633F, 0.0F, 0.1745F, 0.0F));

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

		PartDefinition cube_r40 = phase1nose2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(4, 13).addBox(0.7305F, -0.332F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2305F, -1.1799F, -0.5803F, 0.0785F, 0.0F, 0.0F));

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

		PartDefinition bone114 = arf.addOrReplaceChild("bone114", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone115 = bone114.addOrReplaceChild("bone115", CubeListBuilder.create(), PartPose.offset(-2.5F, -8.0F, -4.0F));

		PartDefinition bone127 = bone115.addOrReplaceChild("bone127", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone127.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(6, 50).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 58).addBox(-1.5313F, 0.0039F, -1.9297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.159F, 0.3068F, -0.1449F));

		PartDefinition cube_r42 = bone127.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(50, 59).addBox(0.5313F, 0.0039F, -1.9297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 50).addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 1.159F, -0.3068F, 0.1449F));

		PartDefinition cube_r43 = bone127.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(80, 0).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition bone116 = bone115.addOrReplaceChild("bone116", CubeListBuilder.create().texOffs(44, 25).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition bone117 = bone116.addOrReplaceChild("bone117", CubeListBuilder.create().texOffs(28, 52).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone118 = bone117.addOrReplaceChild("bone118", CubeListBuilder.create().texOffs(8, 41).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone119 = bone118.addOrReplaceChild("bone119", CubeListBuilder.create().texOffs(38, 58).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone120 = bone115.addOrReplaceChild("bone120", CubeListBuilder.create().texOffs(56, 26).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8945F, -0.0352F, 0.0859F, 0.7854F, 0.0F, -0.3927F));

		PartDefinition bone121 = bone120.addOrReplaceChild("bone121", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 1.0F, -0.3017F, 0.0999F, -0.0353F));

		PartDefinition cube_r44 = bone121.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(46, 55).addBox(0.0079F, 0.0041F, 0.1097F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone122 = bone121.addOrReplaceChild("bone122", CubeListBuilder.create().texOffs(48, 51).addBox(-0.0019F, -0.0329F, 0.105F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3871F, 0.0874F, -0.0388F));

		PartDefinition bone123 = bone122.addOrReplaceChild("bone123", CubeListBuilder.create().texOffs(46, 25).addBox(-0.0239F, -0.0299F, 0.0933F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2694F, 0.1194F, -0.0189F));

		PartDefinition bone124 = bone115.addOrReplaceChild("bone124", CubeListBuilder.create().texOffs(42, 20).addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1055F, -0.0352F, 0.0859F, 0.7854F, 0.0F, 0.3927F));

		PartDefinition bone125 = bone124.addOrReplaceChild("bone125", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 1.0F, -0.3017F, -0.0999F, 0.0353F));

		PartDefinition cube_r45 = bone125.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(48, 21).addBox(-3.0079F, 0.0041F, 0.1097F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone126 = bone125.addOrReplaceChild("bone126", CubeListBuilder.create().texOffs(53, 32).addBox(-2.9981F, -0.0329F, 0.105F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3871F, -0.0874F, 0.0388F));

		PartDefinition bone128 = bone126.addOrReplaceChild("bone128", CubeListBuilder.create().texOffs(43, 32).addBox(-2.9761F, -0.0299F, 0.0933F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2694F, -0.1194F, 0.0189F));

		PartDefinition bone129 = bone115.addOrReplaceChild("bone129", CubeListBuilder.create().texOffs(53, 60).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 8.25F));

		PartDefinition cube_r46 = bone129.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(26, 22).addBox(-3.5F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.543F, 1.9336F, -0.9163F, 0.0F, 0.0F));

		PartDefinition bone130 = bone129.addOrReplaceChild("bone130", CubeListBuilder.create().texOffs(46, 10).addBox(0.0F, 0.0F, -5.0078F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5F, 2.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r47 = bone130.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(52, 39).addBox(0.0036F, -0.994F, -1.9964F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition bone131 = bone129.addOrReplaceChild("bone131", CubeListBuilder.create().texOffs(37, 23).addBox(-1.0F, 0.0F, -5.0078F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 2.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r48 = bone131.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(34, 13).addBox(-4.0036F, -0.994F, -1.9964F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition bone132 = bone114.addOrReplaceChild("bone132", CubeListBuilder.create(), PartPose.offset(-4.3008F, 0.793F, -3.7687F));

		PartDefinition bone133 = bone132.addOrReplaceChild("bone133", CubeListBuilder.create().texOffs(38, 47).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2969F, 0.0F, -0.2367F));

		PartDefinition cube_r49 = bone133.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 59).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0078F, 0.0F, 0.0F, 0.5934F, 0.0F));

		PartDefinition bone134 = bone132.addOrReplaceChild("bone134", CubeListBuilder.create().texOffs(32, 43).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.3047F, 0.0F, -0.2367F));

		PartDefinition cube_r50 = bone134.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(12, 34).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0078F, 0.0F, 0.0F, -0.5934F, 0.0F));

		PartDefinition bone135 = bone114.addOrReplaceChild("bone135", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 4.45F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone135.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6641F, 0.2539F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone136 = bone135.addOrReplaceChild("bone136", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.25F, 1.0F, 0.0F, -0.2618F, 0.0873F));

		PartDefinition cube_r52 = bone136.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 6).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone137 = bone136.addOrReplaceChild("bone137", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0873F));

		PartDefinition cube_r53 = bone137.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(64, 8).addBox(-1.9924F, -0.0004F, -2.0017F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone138 = bone137.addOrReplaceChild("bone138", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r54 = bone138.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(72, 10).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone139 = bone138.addOrReplaceChild("bone139", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0873F));

		PartDefinition cube_r55 = bone139.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(56, 14).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone140 = bone139.addOrReplaceChild("bone140", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0873F));

		PartDefinition cube_r56 = bone140.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(56, 53).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone141 = bone135.addOrReplaceChild("bone141", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.25F, 1.0F, 0.0F, 0.2618F, -0.0873F));

		PartDefinition cube_r57 = bone141.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 4).mirror().addBox(0.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone142 = bone141.addOrReplaceChild("bone142", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.3491F, -0.0873F));

		PartDefinition cube_r58 = bone142.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.0076F, -0.0004F, -2.0017F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone143 = bone142.addOrReplaceChild("bone143", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r59 = bone143.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(49, 6).mirror().addBox(0.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone144 = bone143.addOrReplaceChild("bone144", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.2618F, -0.0873F));

		PartDefinition cube_r60 = bone144.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(56, 8).mirror().addBox(0.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone145 = bone144.addOrReplaceChild("bone145", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0873F, -0.0873F));

		PartDefinition cube_r61 = bone145.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(0.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

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