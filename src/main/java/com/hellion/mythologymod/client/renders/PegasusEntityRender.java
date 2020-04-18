package com.hellion.mythologymod.client.renders;

import com.hellion.mythologymod.MythologyModRegistries;
import com.hellion.mythologymod.client.models.PegasusModel;
import com.hellion.mythologymod.entities.PegasusEntity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class PegasusEntityRender extends LivingRenderer<PegasusEntity, PegasusModel>
{
	public PegasusEntityRender(EntityRendererManager manager) {
		super(manager, new PegasusModel(), 0f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(PegasusEntity entity)
	{
		return MythologyModRegistries.location("textures/entity/pegasus_entity.png");
	}
	
	public static class RenderFactory implements IRenderFactory<PegasusEntity>
	{

		@Override
		public EntityRenderer<? super PegasusEntity> createRenderFor(EntityRendererManager manager) {
			return new PegasusEntityRender(manager);
		}
		
	}
}
