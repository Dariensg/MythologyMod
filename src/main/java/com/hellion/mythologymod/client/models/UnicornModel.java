package com.hellion.mythologymod.client.models;

import com.hellion.mythologymod.entities.UnicornEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.util.math.MathHelper;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class UnicornModel extends EntityModel<UnicornEntity> {
    public RendererModel HorseEarRt;
    public RendererModel HorseHeadBack;
    public RendererModel HorseEarLt;
    public RendererModel HorseHoofFrRt;
    public RendererModel HorseLegBackRtMid;
    public RendererModel HorseHoffBackRt;
    public RendererModel HorseLegFrRtTop;
    public RendererModel HorseLegFrLtTop;
    public RendererModel HorseLegFrRtMid;
    public RendererModel HorseLegFrLtMid;
    public RendererModel HorseBody;
    public RendererModel HorseMidTail;
    public RendererModel HorseLegBackRtTop;
    public RendererModel HorseNeck;
    public RendererModel HorseMane;
    public RendererModel HorseTopTail;
    public RendererModel HorseLowerTail;
    public RendererModel HorseLegBackLtTop;
    public RendererModel HorseLegBackLtMid;
    public RendererModel HorseHoofBackLt;
    public RendererModel HorseHoofFrLt;
    public RendererModel HornBase;
    public RendererModel HornPoint;
    public RendererModel field_110709_aChild;
    public RendererModel field_110709_aChild_1;

    public UnicornModel() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.HornBase = new RendererModel(this, 79, 13);
        this.HornBase.setRotationPoint(-1.0F, -6.1F, -16.0F);
        this.HornBase.addBox(0.0F, 0.0F, -0.2F, 2, 2, 2, 0.0F);
        this.setRotateAngle(HornBase, 0.5235987755982988F, 0.0F, 0.0F);
        this.HorseLegBackRtTop = new RendererModel(this, 78, 29);
        this.HorseLegBackRtTop.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.HorseLegBackRtTop.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.HorseHeadBack = new RendererModel(this, 0, 0);
        this.HorseHeadBack.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.HorseHeadBack.addBox(-2.5F, -10.0F, -1.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(HorseHeadBack, 0.5235987755982988F, 0.0F, 0.0F);
        this.HornPoint = new RendererModel(this, 81, 6);
        this.HornPoint.setRotationPoint(-0.5F, -9.5F, -17.7F);
        this.HornPoint.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(HornPoint, 0.5235987755982988F, 0.0F, 0.0F);
        this.HorseBody = new RendererModel(this, 0, 34);
        this.HorseBody.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.HorseBody.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.HorseLegBackLtTop = new RendererModel(this, 96, 29);
        this.HorseLegBackLtTop.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.HorseLegBackLtTop.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.HorseHoffBackRt = new RendererModel(this, 78, 51);
        this.HorseHoffBackRt.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.HorseHoffBackRt.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.HorseNeck = new RendererModel(this, 0, 12);
        this.HorseNeck.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.HorseNeck.addBox(-2.0F, -9.8F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(HorseNeck, 0.5235987755982988F, 0.0F, 0.0F);
        this.HorseEarLt = new RendererModel(this, 0, 0);
        this.HorseEarLt.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.HorseEarLt.addBox(-2.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(HorseEarLt, 0.5235987755982988F, 0.0F, 0.0F);
        this.HorseMidTail = new RendererModel(this, 38, 7);
        this.HorseMidTail.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.HorseMidTail.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(HorseMidTail, -1.3089969389957472F, 0.0F, 0.0F);
        this.HorseHoofBackLt = new RendererModel(this, 96, 51);
        this.HorseHoofBackLt.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.HorseHoofBackLt.addBox(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.HorseHoofFrLt = new RendererModel(this, 60, 51);
        this.HorseHoofFrLt.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.HorseHoofFrLt.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.field_110709_aChild_1 = new RendererModel(this, 24, 27);
        this.field_110709_aChild_1.setRotationPoint(0.0F, 5.9F, -8.2F);
        this.field_110709_aChild_1.addBox(-2.0F, -10.0F, -7.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(field_110709_aChild_1, 0.5235987755982988F, 0.0F, 0.0F);
        this.HorseLegFrRtMid = new RendererModel(this, 44, 41);
        this.HorseLegFrRtMid.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.HorseLegFrRtMid.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.HorseLegBackLtMid = new RendererModel(this, 96, 43);
        this.HorseLegBackLtMid.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.HorseLegBackLtMid.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.HorseLegBackRtMid = new RendererModel(this, 78, 43);
        this.HorseLegBackRtMid.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.HorseLegBackRtMid.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.HorseLegFrLtTop = new RendererModel(this, 60, 29);
        this.HorseLegFrLtTop.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.HorseLegFrLtTop.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.HorseLegFrLtMid = new RendererModel(this, 60, 41);
        this.HorseLegFrLtMid.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.HorseLegFrLtMid.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.HorseTopTail = new RendererModel(this, 44, 0);
        this.HorseTopTail.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.HorseTopTail.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(HorseTopTail, -1.3089969389957472F, 0.0F, 0.0F);
        this.field_110709_aChild = new RendererModel(this, 24, 18);
        this.field_110709_aChild.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.field_110709_aChild.addBox(-2.0F, -10.0F, -7.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(field_110709_aChild, 0.5235987755982988F, 0.0F, 0.0F);
        this.HorseEarRt = new RendererModel(this, 0, 0);
        this.HorseEarRt.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.HorseEarRt.addBox(0.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(HorseEarRt, 0.5235987755982988F, 0.0F, 0.0F);
        this.HorseHoofFrRt = new RendererModel(this, 44, 51);
        this.HorseHoofFrRt.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.HorseHoofFrRt.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.HorseLowerTail = new RendererModel(this, 24, 3);
        this.HorseLowerTail.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.HorseLowerTail.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(HorseLowerTail, -1.5707963267948966F, 0.0F, 0.0F);
        this.HorseMane = new RendererModel(this, 58, 0);
        this.HorseMane.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.HorseMane.addBox(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
        this.setRotateAngle(HorseMane, 0.5235987755982988F, 0.0F, 0.0F);
        this.HorseLegFrRtTop = new RendererModel(this, 44, 29);
        this.HorseLegFrRtTop.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.HorseLegFrRtTop.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
    }

    @Override
    public void render(UnicornEntity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.HornBase.render(f5);
        this.HorseLegBackRtTop.render(f5);
        this.HorseHeadBack.render(f5);
        this.HornPoint.render(f5);
        this.HorseBody.render(f5);
        this.HorseLegBackLtTop.render(f5);
        this.HorseHoffBackRt.render(f5);
        this.HorseNeck.render(f5);
        this.HorseEarLt.render(f5);
        this.HorseMidTail.render(f5);
        this.HorseHoofBackLt.render(f5);
        this.HorseHoofFrLt.render(f5);
        this.field_110709_aChild_1.render(f5);
        this.HorseLegFrRtMid.render(f5);
        this.HorseLegBackLtMid.render(f5);
        this.HorseLegBackRtMid.render(f5);
        this.HorseLegFrLtTop.render(f5);
        this.HorseLegFrLtMid.render(f5);
        this.HorseTopTail.render(f5);
        this.field_110709_aChild.render(f5);
        this.HorseEarRt.render(f5);
        this.HorseHoofFrRt.render(f5);
        this.HorseLowerTail.render(f5);
        this.HorseMane.render(f5);
        this.HorseLegFrRtTop.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel RendererModel, float x, float y, float z) {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(UnicornEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) 
    {
    	this.HorseLegFrLtTop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.HorseLegBackLtTop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	
    	this.HorseLegFrRtTop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.HorseLegBackRtTop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.HorseLegFrLtMid.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.HorseLegBackLtMid.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	
    	this.HorseLegFrRtMid.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.HorseLegBackRtMid.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }
}
