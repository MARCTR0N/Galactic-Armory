// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Reworked as a HumanoidModel so the helmet part item renderer can resolve it.

package com.marctron.galacticarmory.common.model.helmet.parts.visor;

import com.marctron.galacticarmory.GalacticArmory;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public class phase_2_clone_visor extends HumanoidModel<HumanoidRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "phase_2_clone_visor"), "main");
	public static final Identifier TEXTURE =
			Identifier.fromNamespaceAndPath(GalacticArmory.MODID, "textures/models/armor/clone_helmet_phase_2.png");

	private final ModelPart phase2;
	private final ModelPart visor2;

	public phase_2_clone_visor(ModelPart root) {
		super(root);
		this.phase2 = this.head.getChild("phase2");
		this.visor2 = this.phase2.getChild("visor2");
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

		PartDefinition visor2 = phase2.addOrReplaceChild("visor2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.75F, -5.0F));

		PartDefinition bone = visor2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(6, 37).addBox(-4.6971F, -29.5F, -2.2929F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.3571F, 29.45F, 4.2179F));

		PartDefinition bone22 = bone.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(17, 32).addBox(-4.7071F, -30.0F, -3.3007F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(37, 38).addBox(-4.0F, -30.0059F, -4.0028F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = bone22.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(6, 39).addBox(-4.0F, -30.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1716F, 0.0039F, -1.1716F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone28 = visor2.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(25, 36).addBox(3.6971F, -29.5F, -2.2929F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.3571F, 29.45F, 4.2179F));

		PartDefinition bone29 = bone28.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(10, 31).addBox(3.7071F, -30.0F, -3.3007F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(36, 19).addBox(0.0F, -30.002F, -3.9989F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r2 = bone29.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(17, 33).addBox(3.0F, -30.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1716F, 0.0039F, -1.1716F, 0.0F, 0.7854F, 0.0F));

		PartDefinition phase2nose = visor2.addOrReplaceChild("phase2nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8398F, 0.2227F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = phase2nose.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 28).addBox(0.0F, -0.2813F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(7.0156F, -0.2813F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0078F, 0.8943F, 0.6052F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone25 = phase2nose.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(42, 22).addBox(0.0F, -2.0117F, -0.025F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.5F, 2.9648F, 0.0547F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7552F, 0.145F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r3 = bone25.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(19, 16).addBox(-2.0F, -1.0F, -0.0255F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.25F, -0.0078F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Head_r4 = bone25.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(42, 2).addBox(-1.0F, -1.0F, -0.0255F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.25F, -0.0078F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.65F, -0.025F, 0.0F, 0.0436F, 0.0F));

		PartDefinition Head_r5 = bone26.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(32, 7).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9971F, 0.0F, 0.1309F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Head_r6 = bone26.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 44).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone27 = bone25.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -1.65F, -0.025F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Head_r7 = bone27.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(32, 7).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9971F, 0.0F, 0.1309F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Head_r8 = bone27.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition bone23 = phase2nose.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(0, 39).addBox(0.0046F, -1.0F, -2.7929F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3429F, 1.0122F, 4.0903F, 0.4189F, 0.0F, 0.0F));

		PartDefinition bone24 = bone23.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(0, 39).addBox(-0.0032F, -1.0F, -0.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Head_r9 = bone24.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(31, 37).addBox(-4.0004F, -29.9922F, -0.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5323F, 29.0F, 1.1284F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone46 = bone24.addOrReplaceChild("bone46", CubeListBuilder.create().texOffs(47, 37).addBox(-0.0095F, -0.0513F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7134F, -0.9504F, -1.695F, 0.0F, 0.0436F, 0.0F));

		PartDefinition Head_r10 = bone46.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(8, 47).addBox(-2.9999F, -0.0006F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1523F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r11 = bone46.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(47, 21).addBox(0.0001F, -0.0003F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0095F, -0.0516F, -0.0039F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bone32 = bone46.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offset(3.2868F, 0.5583F, 0.0039F));

		PartDefinition Head_r12 = bone32.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(24, 33).addBox(-2.9999F, -0.0006F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2164F, 0.9763F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r13 = bone32.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(46, 35).addBox(-2.9999F, -0.0006F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone41 = bone32.addOrReplaceChild("bone41", CubeListBuilder.create(), PartPose.offset(0.2164F, 0.9757F, -0.0078F));

		PartDefinition Head_r14 = bone41.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(24, 35).addBox(-1.5F, 0.0078F, 0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 35).addBox(-1.0F, 0.0F, 0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.031F, 0.9016F, -0.0156F, 0.0F, 0.0F, -1.2654F));

		PartDefinition Head_r15 = bone41.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(0, 47).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0117F, 0.0F, 0.0F, -0.6109F));

		PartDefinition bone30 = phase2nose.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(31, 38).addBox(-1.0046F, -1.0F, -2.7929F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3429F, 1.0122F, 4.0903F, 0.4189F, 0.0F, 0.0F));

		PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(0, 33).addBox(-0.9968F, -1.0F, -0.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Head_r16 = bone31.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(24, 31).addBox(3.0004F, -29.9922F, -0.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5323F, 29.0F, 1.1284F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone50 = bone31.addOrReplaceChild("bone50", CubeListBuilder.create().texOffs(22, 38).addBox(-1.9905F, -0.0513F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7134F, -0.9504F, -1.695F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Head_r17 = bone50.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(23, 46).addBox(-0.0001F, -0.0006F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1524F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Head_r18 = bone50.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(46, 29).addBox(-3.0001F, -0.0003F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0095F, -0.0516F, -0.0039F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bone33 = bone50.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offset(-3.2868F, 0.5583F, 0.0039F));

		PartDefinition Head_r19 = bone33.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(0, 31).addBox(1.9999F, -0.0006F, -0.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2164F, 0.9763F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Head_r20 = bone33.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(15, 46).addBox(-0.0001F, -0.0006F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone40 = bone33.addOrReplaceChild("bone40", CubeListBuilder.create(), PartPose.offset(-0.2164F, 0.9757F, -0.0078F));

		PartDefinition Head_r21 = bone40.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(46, 19).addBox(0.0F, -1.0F, -0.0078F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0039F, 0.0F, 0.0F, 0.6109F));

		PartDefinition Head_r22 = bone40.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(17, 31).addBox(0.5F, 0.0078F, 0.0117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 31).addBox(0.0F, 0.0F, 0.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.031F, 0.9016F, -0.0078F, 0.0F, 0.0F, 1.2654F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(HumanoidRenderState renderState) {
		super.setupAnim(renderState);
	}
}
