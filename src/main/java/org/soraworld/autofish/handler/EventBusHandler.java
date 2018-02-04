package org.soraworld.autofish.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.event.sound.PlaySoundEvent17;
import org.soraworld.autofish.util.FishUtils;

@SideOnly(Side.CLIENT)
public class EventBusHandler {

    @SubscribeEvent
    public void on(PlaySoundEvent17 event) {
        if (FishUtils.isEnable() && event.name.equals("random.splash")) {
            FishUtils.rightClick();
            FishUtils.rightClick();
        }
    }
}
