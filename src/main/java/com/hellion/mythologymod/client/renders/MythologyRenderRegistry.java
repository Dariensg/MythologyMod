package com.hellion.mythologymod.client.renders;

import com.hellion.mythologymod.entities.CentaurEntity;
import com.hellion.mythologymod.entities.PegasusEntity;
import com.hellion.mythologymod.entities.UnicornEntity;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class MythologyRenderRegistry 
{
	public static void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(CentaurEntity.class, new CentaurEntityRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(UnicornEntity.class, new UnicornEntityRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(PegasusEntity.class, new PegasusEntityRender.RenderFactory());
	}
}
