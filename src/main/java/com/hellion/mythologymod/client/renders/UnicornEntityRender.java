package com.hellion.mythologymod.client.renders;

import com.hellion.mythologymod.MythologyModRegistries;
import com.hellion.mythologymod.client.models.UnicornModel;
import com.hellion.mythologymod.entities.UnicornEntity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class UnicornEntityRender extends LivingRenderer<UnicornEntity, UnicornModel>{
	
	public UnicornEntityRender(EntityRendererManager manager) {
		super(manager, new UnicornModel(), 0f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(UnicornEntity entity)
	{
		return MythologyModRegistries.location("textures/entity/unicorn_entity.png");
	}
	
	public static class RenderFactory implements IRenderFactory<UnicornEntity>
	{

		@Override
		public EntityRenderer<? super UnicornEntity> createRenderFor(EntityRendererManager manager) {
			return new UnicornEntityRender(manager);
		}
		
	}
}
