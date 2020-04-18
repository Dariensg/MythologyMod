package com.hellion.mythologymod.client.models;

import com.hellion.mythologymod.entities.PegasusEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class PegasusModel extends EntityModel<PegasusEntity> {
    public RendererModel pegasus_ear_L;
    public RendererModel pegasus_head_top;
    public RendererModel pegasus_ear_R;
    public RendererModel pegasus_hoof_frL;
    public RendererModel pegasus_calf_bkL;
    public RendererModel pegasus_hoof_bkL;
    public RendererModel pegasus_thigh_frL;
    public RendererModel pegasus_thigh_frR;
    public RendererModel pegasus_calf_frL;
    public RendererModel pegasus_calf_frR;
    public RendererModel pegasus_body;
    public RendererModel pegasus_tail_mid;
    public RendererModel pegasus_thigh_bkL;
    public RendererModel pegasus_neck;
    public RendererModel pegasus_mane;
    public RendererModel pegasus_tail_top;
    public RendererModel pegasus_tail_bot;
    public RendererModel pegasus_thigh_bkR;
    public RendererModel pegasus_calf_bkR;
    public RendererModel pegasus_hoof_bkR;
    public RendererModel pegasus_hoof_frR;
    public RendererModel pegasus_wingbase1_R;
    public RendererModel pegasus_wingbase2_R;
    public RendererModel pegasus_wing1_R;
    public RendererModel pegasus_wing2_R;
    public RendererModel pegasus_wing1_L;
    public RendererModel pegasus_wingbase1_L;
    public RendererModel pegasus_wing2_L;
    public RendererModel pegasus_wingbase2_L;
    public RendererModel pegasus_jaw_top;
    public RendererModel pegasus_jaw_bot;

    public PegasusModel() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.pegasus_wingbase1_L = new RendererModel(this, 35, 70);
        this.pegasus_wingbase1_L.setRotationPoint(0.0F, 2.4F, -0.6F);
        this.pegasus_wingbase1_L.addBox(0.0F, 0.0F, 0.0F, 10, 2, 1, 0.0F);
        this.setRotateAngle(pegasus_wingbase1_L, 0.0F, 0.1308996938995747F, -0.17453292519943295F);
        this.pegasus_thigh_frL = new RendererModel(this, 44, 29);
        this.pegasus_thigh_frL.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.pegasus_thigh_frL.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.pegasus_wingbase2_R = new RendererModel(this, 0, 75);
        this.pegasus_wingbase2_R.setRotationPoint(-20.8F, 0.6F, -1.9F);
        this.pegasus_wingbase2_R.addBox(0.0F, 0.0F, 0.0F, 11, 2, 1, 0.0F);
        this.pegasus_wing1_L = new RendererModel(this, 35, 80);
        this.pegasus_wing1_L.setRotationPoint(0.1F, 2.7F, 0.1F);
        this.pegasus_wing1_L.addBox(0.0F, 0.0F, 0.0F, 10, 1, 7, 0.0F);
        this.setRotateAngle(pegasus_wing1_L, 0.0F, 0.1308996938995747F, -0.17453292519943295F);
        this.pegasus_wingbase1_R = new RendererModel(this, 0, 70);
        this.pegasus_wingbase1_R.setRotationPoint(-10.0F, 0.6F, -1.9F);
        this.pegasus_wingbase1_R.addBox(0.0F, 0.0F, 0.0F, 10, 2, 1, 0.0F);
        this.setRotateAngle(pegasus_wingbase1_R, 0.0F, -0.1308996938995747F, 0.17453292519943295F);
        this.pegasus_jaw_top = new RendererModel(this, 24, 18);
        this.pegasus_jaw_top.setRotationPoint(0.0F, 0.02F, 0.02F);
        this.pegasus_jaw_top.addBox(-2.0F, -10.0F, -7.0F, 4, 3, 6, 0.0F);
        this.pegasus_hoof_frL = new RendererModel(this, 44, 51);
        this.pegasus_hoof_frL.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.pegasus_hoof_frL.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.pegasus_jaw_bot = new RendererModel(this, 24, 27);
        this.pegasus_jaw_bot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pegasus_jaw_bot.addBox(-2.0F, -7.0F, -6.5F, 4, 2, 5, 0.0F);
        this.pegasus_hoof_bkR = new RendererModel(this, 96, 51);
        this.pegasus_hoof_bkR.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.pegasus_hoof_bkR.addBox(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.pegasus_hoof_frR = new RendererModel(this, 60, 51);
        this.pegasus_hoof_frR.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.pegasus_hoof_frR.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.pegasus_ear_R = new RendererModel(this, 0, 0);
        this.pegasus_ear_R.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.pegasus_ear_R.addBox(-2.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(pegasus_ear_R, 0.5235987755982988F, 0.0F, 0.0F);
        this.pegasus_calf_frR = new RendererModel(this, 60, 41);
        this.pegasus_calf_frR.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.pegasus_calf_frR.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.pegasus_wing2_R = new RendererModel(this, 0, 90);
        this.pegasus_wing2_R.setRotationPoint(-20.2F, 1.1F, -1.2F);
        this.pegasus_wing2_R.addBox(0.0F, 0.0F, 0.0F, 10, 1, 6, 0.0F);
        this.pegasus_wing1_R = new RendererModel(this, 0, 80);
        this.pegasus_wing1_R.setRotationPoint(-10.1F, 1.1F, -1.3F);
        this.pegasus_wing1_R.addBox(0.0F, 0.0F, 0.0F, 10, 1, 7, 0.0F);
        this.setRotateAngle(pegasus_wing1_R, 0.0F, -0.1308996938995747F, 0.17453292519943295F);
        this.pegasus_thigh_bkL = new RendererModel(this, 78, 29);
        this.pegasus_thigh_bkL.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.pegasus_thigh_bkL.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.pegasus_neck = new RendererModel(this, 0, 12);
        this.pegasus_neck.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.pegasus_neck.addBox(-2.05F, -9.8F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(pegasus_neck, 0.5235987755982988F, 0.0F, 0.0F);
        this.pegasus_mane = new RendererModel(this, 58, 0);
        this.pegasus_mane.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.pegasus_mane.addBox(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
        this.setRotateAngle(pegasus_mane, 0.5235987755982988F, 0.0F, 0.0F);
        this.pegasus_thigh_frR = new RendererModel(this, 60, 29);
        this.pegasus_thigh_frR.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.pegasus_thigh_frR.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.pegasus_calf_bkL = new RendererModel(this, 78, 43);
        this.pegasus_calf_bkL.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.pegasus_calf_bkL.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.pegasus_ear_L = new RendererModel(this, 0, 0);
        this.pegasus_ear_L.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.pegasus_ear_L.addBox(0.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(pegasus_ear_L, 0.5235987755982988F, 0.0F, 0.0F);
        this.pegasus_hoof_bkL = new RendererModel(this, 78, 51);
        this.pegasus_hoof_bkL.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.pegasus_hoof_bkL.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.pegasus_tail_mid = new RendererModel(this, 38, 7);
        this.pegasus_tail_mid.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.pegasus_tail_mid.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(pegasus_tail_mid, -1.3089969389957472F, 0.0F, 0.0F);
        this.pegasus_wingbase2_L = new RendererModel(this, 35, 75);
        this.pegasus_wingbase2_L.setRotationPoint(9.6F, 0.6F, -1.9F);
        this.pegasus_wingbase2_L.addBox(0.0F, 0.0F, 0.0F, 11, 2, 1, 0.0F);
        this.pegasus_body = new RendererModel(this, 0, 34);
        this.pegasus_body.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.pegasus_body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.pegasus_thigh_bkR = new RendererModel(this, 96, 29);
        this.pegasus_thigh_bkR.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.pegasus_thigh_bkR.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.pegasus_calf_frL = new RendererModel(this, 44, 41);
        this.pegasus_calf_frL.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.pegasus_calf_frL.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.pegasus_tail_top = new RendererModel(this, 44, 0);
        this.pegasus_tail_top.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.pegasus_tail_top.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(pegasus_tail_top, -1.3089969389957472F, 0.0F, 0.0F);
        this.pegasus_tail_bot = new RendererModel(this, 24, 3);
        this.pegasus_tail_bot.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.pegasus_tail_bot.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(pegasus_tail_bot, -1.5707963267948966F, 0.0F, 0.0F);
        this.pegasus_calf_bkR = new RendererModel(this, 96, 43);
        this.pegasus_calf_bkR.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.pegasus_calf_bkR.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.pegasus_head_top = new RendererModel(this, 0, 0);
        this.pegasus_head_top.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.pegasus_head_top.addBox(-2.5F, -10.0F, -1.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(pegasus_head_top, 0.5235987755982988F, 0.0F, 0.0F);
        this.pegasus_wing2_L = new RendererModel(this, 35, 90);
        this.pegasus_wing2_L.setRotationPoint(9.9F, 1.1F, -1.1F);
        this.pegasus_wing2_L.addBox(0.0F, 0.0F, 0.0F, 10, 1, 6, 0.0F);
        this.pegasus_head_top.addChild(this.pegasus_jaw_top);
        this.pegasus_head_top.addChild(this.pegasus_jaw_bot);
    }

    @Override
    public void render(PegasusEntity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.pegasus_wingbase1_L.render(f5);
        this.pegasus_thigh_frL.render(f5);
        this.pegasus_wingbase2_R.render(f5);
        this.pegasus_wing1_L.render(f5);
        this.pegasus_wingbase1_R.render(f5);
        this.pegasus_hoof_frL.render(f5);
        this.pegasus_hoof_bkR.render(f5);
        this.pegasus_hoof_frR.render(f5);
        this.pegasus_ear_R.render(f5);
        this.pegasus_calf_frR.render(f5);
        this.pegasus_wing2_R.render(f5);
        this.pegasus_wing1_R.render(f5);
        this.pegasus_thigh_bkL.render(f5);
        this.pegasus_neck.render(f5);
        this.pegasus_mane.render(f5);
        this.pegasus_thigh_frR.render(f5);
        this.pegasus_calf_bkL.render(f5);
        this.pegasus_ear_L.render(f5);
        this.pegasus_hoof_bkL.render(f5);
        this.pegasus_tail_mid.render(f5);
        this.pegasus_wingbase2_L.render(f5);
        this.pegasus_body.render(f5);
        this.pegasus_thigh_bkR.render(f5);
        this.pegasus_calf_frL.render(f5);
        this.pegasus_tail_top.render(f5);
        this.pegasus_tail_bot.render(f5);
        this.pegasus_calf_bkR.render(f5);
        this.pegasus_head_top.render(f5);
        this.pegasus_wing2_L.render(f5);
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
