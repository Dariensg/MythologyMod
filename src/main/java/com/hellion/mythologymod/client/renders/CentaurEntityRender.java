package com.hellion.mythologymod.client.renders;

import com.hellion.mythologymod.MythologyModRegistries;
import com.hellion.mythologymod.client.models.CentaurModel;
import com.hellion.mythologymod.entities.CentaurEntity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class CentaurEntityRender extends LivingRenderer<CentaurEntity, CentaurModel>{

	public CentaurEntityRender(EntityRendererManager manager) {
		super(manager, new CentaurModel(), 0f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(CentaurEntity entity)
	{
		return MythologyModRegistries.location("textures/entity/centaur_entity.png");
	}
	
	public static class RenderFactory implements IRenderFactory<CentaurEntity>
	{

		@Override
		public EntityRenderer<? super CentaurEntity> createRenderFor(EntityRendererManager manager) {
			return new CentaurEntityRender(manager);
		}
		
	}

}
