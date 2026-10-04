// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Reworked as a HumanoidModel so the helmet part renderers can resolve it.

package com.marctron.galacticarmory.common.model.helmet.parts.rangefinder;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public class phase_1_clone_rangefinder extends HumanoidModel<HumanoidRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "phase_1_clone_rangefinder"), "main");
	public static final Identifier TEXTURE =
			Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "textures/models/armor/clone_helmet_phase_1_rangefinder.png");

	public phase_1_clone_rangefinder(ModelPart root) {
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

		PartDefinition rangefinder = head.addOrReplaceChild("phase1_rangefinder", CubeListBuilder.create(), PartPose.offset(0.15F, -3.5F, 0.0F));

		PartDefinition bone83 = rangefinder.addOrReplaceChild("bone83", CubeListBuilder.create().texOffs(7, 5).addBox(-1.0547F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 2).addBox(-1.0F, -1.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 3).addBox(-1.0F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 6).addBox(-1.0F, -1.0F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 4).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.9453F, -1.2227F, -0.1266F));

		PartDefinition hinge = rangefinder.addOrReplaceChild("hinge", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3109F, -7.5F, -0.75F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -1.7227F, 0.7734F, 0.0F, 0.0F, 0.0349F));

		PartDefinition bone74 = hinge.addOrReplaceChild("bone74", CubeListBuilder.create().texOffs(4, 8).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(1.0F, -1.0F, 0.0039F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.6F, -7.5F, -0.5F));

		PartDefinition cube_r1 = bone74.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(4, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9375F, -0.5F, 1.0F, 3.1416F, 0.0F, -0.2443F));

		
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(HumanoidRenderState renderState) {
		super.setupAnim(renderState);
	}
}
