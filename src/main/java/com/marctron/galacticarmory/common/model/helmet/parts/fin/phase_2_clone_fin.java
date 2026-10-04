// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Reworked as a HumanoidModel so the helmet part item renderer can resolve it.

package com.marctron.galacticarmory.common.model.helmet.parts.fin;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public class phase_2_clone_fin extends HumanoidModel<HumanoidRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "phase_2_clone_fin"), "main");
	public static final Identifier TEXTURE =
			Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "textures/models/armor/clone_helmet_phase_2.png");

	private final ModelPart phase2;
	private final ModelPart fin2;

	public phase_2_clone_fin(ModelPart root) {
		super(root);
		this.phase2 = this.head.getChild("phase2");
		this.fin2 = this.phase2.getChild("fin2");
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

		PartDefinition fin2 = phase2.addOrReplaceChild("fin2", CubeListBuilder.create().texOffs(27, 11).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.75F, -0.3438F));

		PartDefinition cube_r1 = fin2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 26).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5078F, -1.0F, 3.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r2 = fin2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 13).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5078F, -1.0F, -2.0F, 0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(HumanoidRenderState renderState) {
		super.setupAnim(renderState);
	}
}
