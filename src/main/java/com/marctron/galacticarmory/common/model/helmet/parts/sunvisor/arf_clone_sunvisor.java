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

public class arf_clone_sunvisor extends HumanoidModel<HumanoidRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "arf_clone_sunvisor"), "main");
	public static final Identifier TEXTURE =
			Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "textures/models/armor/clone_helmet_arf.png");

	public arf_clone_sunvisor(ModelPart root) {
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

		PartDefinition arf = head.addOrReplaceChild("arf_sunvisor", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sunvisor = arf.addOrReplaceChild("sunvisor", CubeListBuilder.create().texOffs(0, 25).addBox(-4.5F, -1.25F, -0.25F, 9.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.8164F, 0.0F));

		PartDefinition cube_r1 = sunvisor.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 31).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -1.2578F, 3.75F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = sunvisor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 31).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0774F, -1.2656F, 4.6563F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r3 = sunvisor.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 31).addBox(-1.9922F, -0.0078F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1377F, -1.25F, 4.9983F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = sunvisor.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 19).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1377F, -1.25F, 4.9983F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r5 = sunvisor.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0774F, -1.2656F, 4.6563F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r6 = sunvisor.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(15, 10).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -1.2578F, 3.75F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r7 = sunvisor.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 25).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 13).addBox(7.9094F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4547F, 2.6406F, 0.75F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r8 = sunvisor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 15).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(14, 13).addBox(8.0234F, 0.0F, 0.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5117F, -0.75F, -6.25F, 0.9163F, 0.0F, 0.0F));

		PartDefinition bone86 = sunvisor.addOrReplaceChild("bone86", CubeListBuilder.create(), PartPose.offset(-4.5F, -0.75F, -6.25F));

		PartDefinition cube_r9 = bone86.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0078F, 1.789F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = bone86.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(19, 0).addBox(0.0078F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0078F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone87 = bone86.addOrReplaceChild("bone87", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r11 = bone87.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(64, 14).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.789F, 0.0F, -3.1416F));

		PartDefinition cube_r12 = bone87.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone88 = bone87.addOrReplaceChild("bone88", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0117F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r13 = bone88.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.789F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = bone88.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(43, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone89 = sunvisor.addOrReplaceChild("bone89", CubeListBuilder.create(), PartPose.offset(4.5F, -0.75F, -6.25F));

		PartDefinition cube_r15 = bone89.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0078F, 1.789F, 0.0F, 3.1416F));

		PartDefinition cube_r16 = bone89.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-1.0078F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0078F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone90 = bone89.addOrReplaceChild("bone90", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r17 = bone90.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(72, 14).addBox(0.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.789F, 0.0F, 3.1416F));

		PartDefinition cube_r18 = bone90.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone91 = sunvisor.addOrReplaceChild("bone91", CubeListBuilder.create().texOffs(23, 8).addBox(-4.5F, -1.0F, -0.3742F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0273F, 0.9679F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone91.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 20).addBox(-4.3429F, -1.0F, -1.3346F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0078F, 2.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r20 = bone91.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(20, 8).addBox(-2.8343F, -1.0F, -3.3075F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0156F, 2.0F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r21 = bone91.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(26, 25).addBox(-1.8742F, -1.0F, -3.1377F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r22 = bone91.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(16, 31).addBox(-0.118F, -1.0039F, -3.1377F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r23 = bone91.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(23, 31).addBox(0.8343F, -1.0F, -3.3075F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0156F, 2.0F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r24 = bone91.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(29, 31).addBox(2.3429F, -1.0F, -1.3346F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0078F, 2.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition bone92 = sunvisor.addOrReplaceChild("bone92", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -2.1836F, -4.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone92.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(86, 4).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(80, 8).addBox(-1.5313F, 0.0039F, -1.9297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1685F, 0.2266F, -0.1091F));

		PartDefinition cube_r26 = bone92.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(86, 8).addBox(0.5313F, 0.0039F, -1.9297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(80, 4).addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 1.1685F, -0.2266F, 0.1091F));

		PartDefinition cube_r27 = bone92.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(80, 0).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(HumanoidRenderState renderState) {
		super.setupAnim(renderState);
	}
}
