package com.hellion.mythologymod.client.models;

import com.hellion.mythologymod.entities.CentaurEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class CentaurModel extends EntityModel<CentaurEntity> {
    public RendererModel CowBody;
    public RendererModel Udders;
    public RendererModel RearLeftLeg;
    public RendererModel FrontLeftLeg;
    public RendererModel RearRightLeg;
    public RendererModel FrontRightLeg;
    public RendererModel VillagerHead;
    public RendererModel VillagerRightArm;
    public RendererModel VillagerLeftArm;
    public RendererModel VillagerMiddleArm;
    public RendererModel VillagerChest;
    public RendererModel VillagerCoat;
    public RendererModel VillagerNose;

    public CentaurModel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.VillagerRightArm = new RendererModel(this, 44, 22);
        this.VillagerRightArm.setRotationPoint(0.0F, -12.0F, -5.0F);
        this.VillagerRightArm.addBox(-8.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(VillagerRightArm, -0.7499679795819634F, 0.0F, 0.0F);
        this.RearRightLeg = new RendererModel(this, 0, 16);
        this.RearRightLeg.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.RearRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.FrontLeftLeg = new RendererModel(this, 0, 16);
        this.FrontLeftLeg.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.FrontLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerCoat = new RendererModel(this, 0, 38);
        this.VillagerCoat.setRotationPoint(0.0F, -15.0F, -4.0F);
        this.VillagerCoat.addBox(-4.0F, 0.0F, -3.0F, 8, 18, 6, 0.5F);
        this.CowBody = new RendererModel(this, 18, 4);
        this.CowBody.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.CowBody.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(CowBody, 1.5707963267948966F, 0.0F, 0.0F);
        this.RearLeftLeg = new RendererModel(this, 0, 16);
        this.RearLeftLeg.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.RearLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerMiddleArm = new RendererModel(this, 40, 38);
        this.VillagerMiddleArm.setRotationPoint(0.0F, -12.0F, -5.0F);
        this.VillagerMiddleArm.addBox(-4.0F, 2.0F, -2.0F, 8, 4, 4, 0.0F);
        this.setRotateAngle(VillagerMiddleArm, -0.7499679795819634F, 0.0F, 0.0F);
        this.VillagerLeftArm = new RendererModel(this, 44, 22);
        this.VillagerLeftArm.setRotationPoint(0.0F, -12.0F, -5.0F);
        this.VillagerLeftArm.addBox(4.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(VillagerLeftArm, -0.7499679795819634F, 0.0F, 0.0F);
        this.VillagerChest = new RendererModel(this, 16, 20);
        this.VillagerChest.setRotationPoint(0.0F, -15.0F, -4.0F);
        this.VillagerChest.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F);
        this.FrontRightLeg = new RendererModel(this, 0, 16);
        this.FrontRightLeg.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.FrontRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerNose = new RendererModel(this, 24, 0);
        this.VillagerNose.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.VillagerNose.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.VillagerHead = new RendererModel(this, 0, 0);
        this.VillagerHead.setRotationPoint(-0.1F, -15.0F, -4.0F);
        this.VillagerHead.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.Udders = new RendererModel(this, 52, 0);
        this.Udders.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.Udders.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(Udders, 1.5707963267948966F, 0.0F, 0.0F);
        this.VillagerHead.addChild(this.VillagerNose);
    }

    @Override
    public void render(CentaurEntity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.VillagerRightArm.render(f5);
        this.RearRightLeg.render(f5);
        this.FrontLeftLeg.render(f5);
        this.VillagerCoat.render(f5);
        this.CowBody.render(f5);
        this.RearLeftLeg.render(f5);
        this.VillagerMiddleArm.render(f5);
        this.VillagerLeftArm.render(f5);
        this.VillagerChest.render(f5);
        this.FrontRightLeg.render(f5);
        this.VillagerHead.render(f5);
        this.Udders.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel RendererModel, float x, float y, float z) {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
}