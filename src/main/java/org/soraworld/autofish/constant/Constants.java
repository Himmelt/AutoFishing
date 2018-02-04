package org.soraworld.autofish.constant;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

@SideOnly(Side.CLIENT)
public final class Constants {

    public static final String MODID = "autofish";
    public static final String NAME = "AutoFishing";
    public static final String VERSION = "1.7.10-1.0.0";
    public static final String ACMCVERSION = "[1.7.10]";

    public static final KeyBinding KEY_SWITCH = new KeyBinding("AutoFishing Switch", Keyboard.KEY_F, "key.categories.gameplay");

}
