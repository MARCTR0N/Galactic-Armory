// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

package com.marctron.galacticarmory.common.armor.model.visor;

import com.marctron.galacticarmory.GalacticArmory;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public class phase_1_clone_visor extends HumanoidModel<HumanoidRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "phase_1_clone_visor"), "main");
	public static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("galacticarmory", "textures/models/armor/clone_helmet_phase_1.png");
	private final ModelPart head;
	private final ModelPart visor;
	private final ModelPart bone3;
	private final ModelPart bone51;
	private final ModelPart bone60;
	private final ModelPart bone61;
	private final ModelPart bone54;
	private final ModelPart bone55;
	private final ModelPart bone56;
	private final ModelPart bone4;
	private final ModelPart phase1nose;
	private final ModelPart bone5;
	private final ModelPart bone13;
	private final ModelPart bone53;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone14;
	private final ModelPart bone52;
	private final ModelPart bone15;
	private final ModelPart bb_main;

	public phase_1_clone_visor(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.visor = this.head.getChild("visor");
		this.bone3 = this.visor.getChild("bone3");
		this.bone51 = this.bone3.getChild("bone51");
		this.bone60 = this.bone51.getChild("bone60");
		this.bone61 = this.bone60.getChild("bone61");
		this.bone54 = this.bone3.getChild("bone54");
		this.bone55 = this.bone54.getChild("bone55");
		this.bone56 = this.bone55.getChild("bone56");
		this.bone4 = this.bone3.getChild("bone4");
		this.phase1nose = this.visor.getChild("phase1nose");
		this.bone5 = this.phase1nose.getChild("bone5");
		this.bone13 = this.bone5.getChild("bone13");
		this.bone53 = this.bone13.getChild("bone53");
		this.bone6 = this.bone13.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone8 = this.bone5.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.bone14 = this.bone9.getChild("bone14");
		this.bone52 = this.bone5.getChild("bone52");
		this.bone15 = this.phase1nose.getChild("bone15");
		this.bb_main = root.getChild("bb_main");
		this.body.visible = false;
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(32, 0).addBox(0, 0, 0, 0, 0, 0, new CubeDeformation(0)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition leftArm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition rightArm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(32, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(1.9F, 12.0F, 0.0F));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition visor = head.addOrReplaceChild("visor", CubeListBuilder.create(), PartPose.offset(0.0F, -5.75F, -4.5F));

		PartDefinition bone3 = visor.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(8, 30).addBox(-4.0F, -30.225F, -3.525F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 42).addBox(-4.01F, -30.225F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(3.01F, -30.225F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 29.75F, 4.0F));

		PartDefinition bone51 = bone3.addOrReplaceChild("bone51", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.5F, -4.225F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone60 = bone51.addOrReplaceChild("bone60", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, 0.0F, 4.1F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone61 = bone60.addOrReplaceChild("bone61", CubeListBuilder.create().texOffs(7, 40).addBox(0.8929F, -30.002F, -3.715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 42).addBox(1.2929F, -30.0F, -3.7071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 31).addBox(3.0F, -30.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 29.0F, -0.35F));

		PartDefinition Head_r1 = bone61.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(22, 43).addBox(3.0F, -30.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4645F, 0.0F, -0.8787F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone54 = bone3.addOrReplaceChild("bone54", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.5F, -4.225F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone55 = bone54.addOrReplaceChild("bone55", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.25F, 0.0F, 4.1F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone56 = bone55.addOrReplaceChild("bone56", CubeListBuilder.create().texOffs(43, 42).addBox(-3.2929F, -30.0F, -3.7071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 44).addBox(-1.8929F, -30.002F, -3.715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 23).addBox(-4.0F, -30.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 29.0F, -0.35F));

		PartDefinition Head_r2 = bone56.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(29, 44).addBox(-4.0F, -30.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4645F, 0.0F, -0.8787F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(36, 39).addBox(-4.5F, -30.0F, -3.325F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(43, 39).addBox(-3.7929F, -30.002F, -4.031F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 36).addBox(-0.7071F, -30.0F, -4.0321F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 16).addBox(3.0F, -30.0F, -3.325F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(7, 37).addBox(3.025F, -29.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 37).addBox(-4.525F, -29.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -0.3F, -0.25F));

		PartDefinition Head_r3 = bone4.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(45, 12).addBox(3.0F, -30.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4645F, 0.0F, -1.2037F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Head_r4 = bone4.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(40, 45).addBox(-4.0F, -30.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9645F, 0.0F, -1.2037F, 0.0F, -0.7854F, 0.0F));

		PartDefinition phase1nose = visor.addOrReplaceChild("phase1nose", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2227F, -0.2188F));

		PartDefinition Head_r5 = phase1nose.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(13, 55).mirror().addBox(0.0F, 3.0F, 0.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 57).mirror().addBox(0.0F, 2.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -4.4727F, 0.7188F, 0.0F, -0.0044F, 0.0F));

		PartDefinition Head_r6 = phase1nose.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(45, 18).addBox(0.0F, -4.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 3.5273F, 0.7188F, 0.0F, 0.2487F, 0.0F));

		PartDefinition Head_r7 = phase1nose.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(3, 53).addBox(-1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1, 51).addBox(-1.0F, 3.0F, 0.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.4727F, 0.7188F, 0.0F, 0.0044F, 0.0F));

		PartDefinition Head_r8 = phase1nose.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 45).addBox(-3.0F, -4.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.5273F, 0.7188F, 0.0F, -0.2487F, 0.0F));

		PartDefinition bone5 = phase1nose.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0273F, -0.0062F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone13 = bone5.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.25F, 0.0F, 4.1F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone53 = bone13.addOrReplaceChild("bone53", CubeListBuilder.create(), PartPose.offset(4.0F, 29.0F, -0.35F));

		PartDefinition bone6 = bone13.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(1.0F, -1.0F, -4.1F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.4F, 0.0F, 0.0F));

		PartDefinition Head_r9 = bone7.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 62).addBox(2.7217F, -0.9928F, -1.0084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4609F, 1.8197F, -0.3044F, -2.9901F, 0.0869F, 2.245F));

		PartDefinition Head_r10 = bone7.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(28, 27).mirror().addBox(-0.0009F, -0.0007F, -0.0006F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4609F, 1.8197F, -0.3044F, 0.1515F, 0.0869F, 2.245F));

		PartDefinition Head_r11 = bone7.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(43, 28).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(49, 28).addBox(0.3F, 0.025F, 0.0221F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7071F, 0.0F, 0.0429F, 0.0F, 0.1745F, 1.1781F));

		PartDefinition bone8 = bone5.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, 0.0F, 4.1F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0F, -4.1F));

		PartDefinition bone14 = bone9.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.0F, 0.0F));

		PartDefinition Head_r12 = bone14.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(4, 62).mirror().addBox(-3.7218F, -0.9928F, -1.0084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4609F, 1.8197F, -0.3044F, -2.9901F, -0.0869F, -2.245F));

		PartDefinition Head_r13 = bone14.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(28, 27).addBox(-3.9991F, -0.0007F, -0.0006F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4609F, 1.8197F, -0.3044F, 0.1515F, -0.0869F, -2.245F));

		PartDefinition Head_r14 = bone14.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(41, 22).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 30).mirror().addBox(-2.3F, 0.025F, 0.0221F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7071F, 0.0F, 0.0429F, 0.0F, -0.1745F, -1.1781F));

		PartDefinition bone52 = bone5.addOrReplaceChild("bone52", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, 0.0F, 4.1F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone15 = phase1nose.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.7547F, 0.5267F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 50).addBox(-1.5F, 3.3703F, 0.5516F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8656F, -0.1203F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r15 = bone15.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(24, 6).addBox(-2.0F, -1.0F, -0.0255F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3703F, 0.5516F, 0.0F, 0.0F, -0.6109F));

		PartDefinition Head_r16 = bone15.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(4, 43).addBox(-1.0F, -1.0F, -0.0255F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.3703F, 0.5516F, 0.0F, 0.0F, 0.6109F));

		PartDefinition Head_r17 = bone15.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(45, 9).addBox(-3.0F, 0.25F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8797F, 0.5267F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Head_r18 = bone15.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(45, 15).addBox(0.0F, 0.25F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.8797F, 0.5267F, 0.0F, -0.0873F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.025F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(HumanoidRenderState poseStack) {
		super.setupAnim(poseStack);
	}
}