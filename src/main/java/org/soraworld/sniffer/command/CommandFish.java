package org.soraworld.sniffer.command;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import org.soraworld.sniffer.constant.Constants;
import org.soraworld.sniffer.util.FishUtils;

import java.util.ArrayList;

@SideOnly(Side.CLIENT)
public class CommandFish extends IICommand {

    public CommandFish() {
        super(Constants.MODID, "fish");
    }

    @Override
    public void execute(ICommandSender sender, ArrayList<String> args) {
        FishUtils.setEnable(!FishUtils.isEnable());
        sender.addChatMessage(new ChatComponentText("AutoFishing is " + FishUtils.isEnable()));
    }
}
