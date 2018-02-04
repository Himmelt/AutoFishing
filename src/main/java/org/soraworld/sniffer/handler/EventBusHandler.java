package org.soraworld.sniffer.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;
import org.soraworld.sniffer.util.FishUtils;

@SideOnly(Side.CLIENT)
public class EventBusHandler {

    @SubscribeEvent
    public void onPlaySound(PlaySoundAtEntityEvent event) {
        if (FishUtils.isEnable() && event.name.equals("random.splash")) {
            FishUtils.rightClick();
            FishUtils.rightClick();
        }
    }
}
