// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

package com.marctron.galacticarmory.common.armor.model.fin;

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

public class phase_1_clone_fin extends HumanoidModel<HumanoidRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "phase_1_clone_fin"), "main");
	public static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("galacticarmory", "textures/models/armor/clone_helmet_phase_1.png");
	private final ModelPart head;
	private final ModelPart fin;
	private final ModelPart bb_main;

	public phase_1_clone_fin(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.fin = this.head.getChild("fin");
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



        PartDefinition fin = head.addOrReplaceChild("fin", CubeListBuilder.create().texOffs(0, 40).addBox(-22.5F, -32.3558F, -3.7742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 27).addBox(-22.501F, -33.77F, -2.36F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(20, 27).mirror().addBox(-22.499F, -33.77F, -2.36F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 29).addBox(-22.4999F, -33.77F, 3.64F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(22.0F, 23.0F, 0.25F));

		PartDefinition Box_r1 = fin.addOrReplaceChild("Box_r1", CubeListBuilder.create().texOffs(24, 43).addBox(-0.9998F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.5F, -32.77F, 5.64F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Box_r2 = fin.addOrReplaceChild("Box_r2", CubeListBuilder.create().texOffs(0, 22).addBox(-0.9999F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.5F, -33.77F, -2.36F, 0.7854F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.025F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(HumanoidRenderState poseStack) {
		super.setupAnim(poseStack);
	}
}