package org.soraworld.autofish.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import org.soraworld.autofish.constant.Constants;
import org.soraworld.autofish.util.FishUtils;

@SideOnly(Side.CLIENT)
public class FMLEventHandler {

    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event) {
        if (Minecraft.getMinecraft().currentScreen == null && Constants.KEY_SWITCH.isPressed()) {
            FishUtils.setEnable(!FishUtils.isEnable());
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("AutoFishing is " + FishUtils.isEnable()));
        }
    }
}
