// Made with Blockbench 4.2.0-beta.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class clone_armor_phase_1_helmet extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Head_r4;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone3;
	private final ModelRenderer bone15;
	private final ModelRenderer Head_r5;
	private final ModelRenderer Head_r6;
	private final ModelRenderer Head_r7;
	private final ModelRenderer Head_r8;
	private final ModelRenderer bone4;
	private final ModelRenderer Head_r9;
	private final ModelRenderer Head_r10;
	private final ModelRenderer bone5;
	private final ModelRenderer bone13;
	private final ModelRenderer Head_r11;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer Head_r12;
	private final ModelRenderer Head_r13;
	private final ModelRenderer bone8;
	private final ModelRenderer Head_r14;
	private final ModelRenderer bone9;
	private final ModelRenderer bone14;
	private final ModelRenderer Head_r15;
	private final ModelRenderer Head_r16;
	private final ModelRenderer fin;
	private final ModelRenderer Box_r1;
	private final ModelRenderer Box_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r12;

	public clone_armor_phase_1_helmet() {
		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 22, -3.5F, -9.1819F, -2.2503F, 7, 2, 6, 0.0F, false));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 18, 43, 3.45F, -6.725F, -0.225F, 1, 7, 2, 0.0F, false));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 18, 43, -4.45F, -6.725F, -0.225F, 1, 7, 2, 0.0F, true));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 31, 36, -4.25F, -5.975F, 1.25F, 2, 5, 3, 0.0F, false));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 11, 34, 2.25F, -5.975F, 1.25F, 2, 5, 3, 0.0F, false));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 35, 0, -1.0F, -7.0F, 2.475F, 2, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.25F, -5.975F, 4.25F);
		bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3491F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 35, 0.0F, 0.0F, -3.025F, 2, 5, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.25F, -5.975F, 4.25F);
		bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 27, -2.0F, 0.0F, -3.025F, 2, 5, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(4.5F, -0.293F, -4.4688F);
		bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 29, -1.055F, 0.0F, 0.0F, 1, 1, 6, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 29, -8.945F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.7929F, -0.2314F, -5.1732F);
		bipedHead.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0894F, -0.2304F, -0.0237F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 0, -3.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 37, -3.9F, -0.0086F, -0.0018F, 1, 1, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(4.5F, -0.293F, -4.4688F);
		bipedHead.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1231F, -0.7816F, -0.0869F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 11, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.5F, -0.293F, -4.4688F);
		bipedHead.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1231F, 0.7816F, 0.0869F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 17, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.7929F, -0.2314F, -5.1732F);
		bipedHead.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0894F, 0.2304F, 0.0237F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 9, 2.9F, -0.0086F, -0.0018F, 1, 1, 5, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 11, 0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.25F, -1.725F, 0.425F);
		bipedHead.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, -8.75F, 1.005F, -5.0F, 9, 1, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(4.5F, 0.275F, 2.0F);
		bipedHead.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 22, -9.0F, -2.0F, -0.25F, 9, 2, 3, 0.0F, false));

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(3.5F, -8.1819F, -3.9824F);
		bipedHead.addChild(Head_r1);
		setRotationAngle(Head_r1, -1.0472F, 0.0F, 0.0F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 23, 17, -7.0F, -2.0F, 0.0F, 7, 2, 2, 0.0F, false));

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(3.5F, -6.25F, -4.5F);
		bipedHead.addChild(Head_r2);
		setRotationAngle(Head_r2, -0.2618F, 0.0F, 0.0F);
		Head_r2.cubeList.add(new ModelBox(Head_r2, 32, 6, -7.0F, -2.0F, 0.0F, 7, 2, 1, 0.0F, false));

		Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(-4.0F, 0.0F, -4.0F);
		bipedHead.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0F, 0.2487F, 0.0F);
		Head_r3.cubeList.add(new ModelBox(Head_r3, 45, 18, 0.0F, -4.0F, 0.0F, 3, 2, 1, 0.0F, false));
		Head_r3.cubeList.add(new ModelBox(Head_r3, 0, 30, 0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(4.0F, 0.0F, -4.0F);
		bipedHead.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.0F, -0.2487F, 0.0F);
		Head_r4.cubeList.add(new ModelBox(Head_r4, 0, 33, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));
		Head_r4.cubeList.add(new ModelBox(Head_r4, 32, 45, -3.0F, -4.0F, 0.0F, 3, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.025F, -0.1563F, 0.9172F);
		bipedHead.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0349F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 48, -0.5F, -0.5037F, -1.5F, 1, 1, 3, 0.0F, true));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 48, 7.55F, -0.5037F, -1.5F, 1, 1, 3, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, -0.5F);
		bipedHead.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 8, 30, -4.0F, -30.225F, -3.525F, 8, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 8, 42, -4.01F, -30.225F, -3.5F, 1, 2, 4, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 40, 0, 3.01F, -30.225F, -3.5F, 1, 2, 4, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-1.0F, -28.225F, -3.8F);
		bone3.addChild(bone15);
		setRotationAngle(bone15, -0.0873F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, 0.0F, -1.75F, -0.025F, 2, 6, 1, 0.0F, false));

		Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(0.0F, 3.25F, 0.0F);
		bone15.addChild(Head_r5);
		setRotationAngle(Head_r5, 0.0F, 0.0F, -0.6109F);
		Head_r5.cubeList.add(new ModelBox(Head_r5, 24, 6, -2.0F, -1.0F, -0.0225F, 3, 1, 1, 0.0F, false));

		Head_r6 = new ModelRenderer(this);
		Head_r6.setRotationPoint(2.0F, 3.25F, 0.0F);
		bone15.addChild(Head_r6);
		setRotationAngle(Head_r6, 0.0F, 0.0F, 0.6109F);
		Head_r6.cubeList.add(new ModelBox(Head_r6, 4, 43, -1.0F, -1.0F, -0.0225F, 3, 1, 1, 0.0F, false));

		Head_r7 = new ModelRenderer(this);
		Head_r7.setRotationPoint(0.0F, -2.0F, -0.025F);
		bone15.addChild(Head_r7);
		setRotationAngle(Head_r7, 0.0F, 0.0873F, 0.0F);
		Head_r7.cubeList.add(new ModelBox(Head_r7, 45, 9, -3.0F, 0.25F, 0.0F, 3, 2, 1, 0.0F, false));

		Head_r8 = new ModelRenderer(this);
		Head_r8.setRotationPoint(2.0F, -2.0F, -0.025F);
		bone15.addChild(Head_r8);
		setRotationAngle(Head_r8, 0.0F, -0.0873F, 0.0F);
		Head_r8.cubeList.add(new ModelBox(Head_r8, 45, 15, 0.0F, 0.25F, 0.0F, 3, 2, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.25F, -0.3F, -0.25F);
		bone3.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 36, 39, -4.5F, -30.0F, -3.325F, 1, 1, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 43, 39, -3.7929F, -30.002F, -4.031F, 4, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 38, 36, -0.7071F, -30.0F, -4.0321F, 4, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 38, 16, 3.0F, -30.0F, -3.325F, 1, 1, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 7, 37, 3.025F, -29.9F, 0.0F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 37, -4.525F, -29.9F, 0.0F, 1, 2, 1, 0.0F, false));

		Head_r9 = new ModelRenderer(this);
		Head_r9.setRotationPoint(0.4645F, 0.0F, -1.2037F);
		bone4.addChild(Head_r9);
		setRotationAngle(Head_r9, 0.0F, 0.7854F, 0.0F);
		Head_r9.cubeList.add(new ModelBox(Head_r9, 45, 12, 3.0F, -30.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Head_r10 = new ModelRenderer(this);
		Head_r10.setRotationPoint(-0.9645F, 0.0F, -1.2037F);
		bone4.addChild(Head_r10);
		setRotationAngle(Head_r10, 0.0F, -0.7854F, 0.0F);
		Head_r10.cubeList.add(new ModelBox(Head_r10, 40, 45, -4.0F, -30.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -27.5F, -4.225F);
		bone3.addChild(bone5);
		setRotationAngle(bone5, 0.1745F, 0.0F, 0.0F);
		

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-4.25F, 0.0F, 4.1F);
		bone5.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.1309F);
		bone13.cubeList.add(new ModelBox(bone13, 43, 23, 0.0F, -1.0F, -3.35F, 1, 1, 4, 0.0F, false));

		Head_r11 = new ModelRenderer(this);
		Head_r11.setRotationPoint(3.5355F, 29.0F, -1.2287F);
		bone13.addChild(Head_r11);
		setRotationAngle(Head_r11, 0.0F, -0.7854F, 0.0F);
		Head_r11.cubeList.add(new ModelBox(Head_r11, 29, 44, -4.0F, -30.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(1.0F, -1.0F, -4.1F);
		bone13.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 43, 42, -0.2929F, 0.0F, 0.0429F, 2, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.4F, 0.0F, 0.0F);
		bone6.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 14, 44, 0.7071F, -0.002F, 0.035F, 1, 1, 1, 0.0F, false));

		Head_r12 = new ModelRenderer(this);
		Head_r12.setRotationPoint(2.4608F, 1.8197F, -0.3044F);
		bone7.addChild(Head_r12);
		setRotationAngle(Head_r12, 0.1515F, 0.0869F, 2.245F);
		Head_r12.cubeList.add(new ModelBox(Head_r12, 28, 27, -0.0009F, -0.0006F, -0.0006F, 4, 1, 1, 0.0F, true));

		Head_r13 = new ModelRenderer(this);
		Head_r13.setRotationPoint(1.7071F, 0.0F, 0.0429F);
		bone7.addChild(Head_r13);
		setRotationAngle(Head_r13, 0.0F, 0.1745F, 1.1781F);
		Head_r13.cubeList.add(new ModelBox(Head_r13, 43, 28, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));
		Head_r13.cubeList.add(new ModelBox(Head_r13, 49, 28, 0.3F, 0.025F, 0.0221F, 2, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(4.25F, 0.0F, 4.1F);
		bone5.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.1309F);
		bone8.cubeList.add(new ModelBox(bone8, 42, 31, -1.0F, -1.0F, -3.35F, 1, 1, 4, 0.0F, false));

		Head_r14 = new ModelRenderer(this);
		Head_r14.setRotationPoint(-3.5355F, 29.0F, -1.2287F);
		bone8.addChild(Head_r14);
		setRotationAngle(Head_r14, 0.0F, 0.7854F, 0.0F);
		Head_r14.cubeList.add(new ModelBox(Head_r14, 22, 43, 3.0F, -30.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.0F, -1.0F, -4.1F);
		bone8.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 14, 42, -1.7071F, 0.0F, 0.0429F, 2, 1, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-0.4F, 0.0F, 0.0F);
		bone9.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 7, 40, -1.7071F, -0.002F, 0.035F, 1, 1, 1, 0.0F, false));

		Head_r15 = new ModelRenderer(this);
		Head_r15.setRotationPoint(-2.4608F, 1.8197F, -0.3044F);
		bone14.addChild(Head_r15);
		setRotationAngle(Head_r15, 0.1515F, -0.0869F, -2.245F);
		Head_r15.cubeList.add(new ModelBox(Head_r15, 28, 27, -3.9991F, -0.0006F, -0.0006F, 4, 1, 1, 0.0F, false));

		Head_r16 = new ModelRenderer(this);
		Head_r16.setRotationPoint(-1.7071F, 0.0F, 0.0429F);
		bone14.addChild(Head_r16);
		setRotationAngle(Head_r16, 0.0F, -0.1745F, -1.1781F);
		Head_r16.cubeList.add(new ModelBox(Head_r16, 41, 22, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
		Head_r16.cubeList.add(new ModelBox(Head_r16, 49, 30, -2.3F, 0.025F, 0.0221F, 2, 1, 1, 0.0F, true));

		fin = new ModelRenderer(this);
		fin.setRotationPoint(22.0F, 23.0F, 0.25F);
		bipedHead.addChild(fin);
		fin.cubeList.add(new ModelBox(fin, 0, 40, -22.5F, -32.3558F, -3.7742F, 1, 1, 1, 0.0F, false));
		fin.cubeList.add(new ModelBox(fin, 20, 27, -22.501F, -33.77F, -2.36F, 1, 2, 6, 0.0F, false));
		fin.cubeList.add(new ModelBox(fin, 20, 27, -22.499F, -33.77F, -2.36F, 1, 2, 6, 0.0F, true));
		fin.cubeList.add(new ModelBox(fin, 28, 29, -22.4999F, -33.77F, 3.64F, 1, 1, 2, 0.0F, false));

		Box_r1 = new ModelRenderer(this);
		Box_r1.setRotationPoint(-21.5F, -32.77F, 5.64F);
		fin.addChild(Box_r1);
		setRotationAngle(Box_r1, 0.5236F, 0.0F, 0.0F);
		Box_r1.cubeList.add(new ModelBox(Box_r1, 24, 43, -0.9998F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

		Box_r2 = new ModelRenderer(this);
		Box_r2.setRotationPoint(-21.5F, -33.77F, -2.36F);
		fin.addChild(Box_r2);
		setRotationAngle(Box_r2, 0.7854F, 0.0F, 0.0F);
		Box_r2.cubeList.add(new ModelBox(Box_r2, 0, 22, -0.9999F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.125F, -6.0F);
		bipedHead.addChild(bone2);
		setRotationAngle(bone2, -0.6109F, 0.0F, 0.0F);
		

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.7854F, 0.0F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(bone11);
		setRotationAngle(bone11, 0.0F, -0.3927F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 24, 0, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.3927F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 35, -2.25F, -2.0F, 0.005F, 2, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 36, -2.0F, -1.0F, 0.005F, 2, 1, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(bone12);
		setRotationAngle(bone12, 0.0F, -1.1781F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 16, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 26, 0.25F, -2.0F, 0.005F, 2, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 33, 0.0F, -1.0F, 0.005F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedHead.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}