// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Reworked as a HumanoidModel so the helmet part renderers can resolve it.

package com.marctron.galacticarmory.common.model.helmet.parts.sunvisor;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public class phase_1_clone_sunvisor extends HumanoidModel<HumanoidRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "phase_1_clone_sunvisor"), "main");
	public static final Identifier TEXTURE =
			Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "textures/models/armor/clone_helmet_phase_1_sunvisor.png");

	public phase_1_clone_sunvisor(ModelPart root) {
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

		PartDefinition extras = head.addOrReplaceChild("phase1_sunvisor", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition binoculars = extras.addOrReplaceChild("binoculars", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sunvisor = extras.addOrReplaceChild("sunvisor", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.5F));

		PartDefinition bone149 = sunvisor.addOrReplaceChild("bone149", CubeListBuilder.create().texOffs(8, 15).addBox(0.0F, -1.0133F, 2.8676F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(-0.0078F, -0.5008F, 1.649F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).mirror().addBox(-0.5078F, -0.5047F, 1.6529F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-4.3969F, -1.9629F, -4.7938F));

		PartDefinition bone159 = bone149.addOrReplaceChild("bone159", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0133F, 2.8676F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone159.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 11).addBox(0.0F, -0.5F, -2.9922F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, 0.0F, -3.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone158 = bone159.addOrReplaceChild("bone158", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0133F, -2.8676F));

		PartDefinition cube_r2 = bone158.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 8).mirror().addBox(-0.4922F, 0.0033F, 0.0071F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(6, 8).addBox(0.0078F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone160 = sunvisor.addOrReplaceChild("bone160", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -1.0133F, 2.8676F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(17, 17).addBox(-0.9922F, -0.5008F, 1.649F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(17, 17).mirror().addBox(-0.4922F, -0.5047F, 1.6529F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.3969F, -1.9629F, -4.7938F));

		PartDefinition bone161 = bone160.addOrReplaceChild("bone161", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0133F, 2.8676F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone161.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 1).addBox(-5.0F, -0.5F, -2.9922F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 4).addBox(-5.0F, 0.0F, -3.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone162 = bone161.addOrReplaceChild("bone162", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0133F, -2.8676F));

		PartDefinition cube_r4 = bone162.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-0.5078F, 0.0033F, 0.0071F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 8).addBox(-1.0078F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(HumanoidRenderState renderState) {
		super.setupAnim(renderState);
	}
}
