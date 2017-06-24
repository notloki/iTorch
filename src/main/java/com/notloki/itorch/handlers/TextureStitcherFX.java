package com.notloki.itorch.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;




    public class TextureStitcherFX
    {
        @SubscribeEvent
        public void stitcherEventPre(TextureStitchEvent.Pre event) {
            ResourceLocation flameCustom = new ResourceLocation("itorch:entity/flame_fx");
            event.getMap().registerSprite(flameCustom);
        }
}
