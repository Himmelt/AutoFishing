package org.soraworld.autofish;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import org.soraworld.autofish.command.CommandFish;
import org.soraworld.autofish.constant.Constants;
import org.soraworld.autofish.handler.EventBusHandler;
import org.soraworld.autofish.handler.FMLEventHandler;

@Mod(
        modid = Constants.MODID,
        name = Constants.NAME,
        version = Constants.VERSION,
        acceptedMinecraftVersions = Constants.ACMCVERSION
)
@SideOnly(Side.CLIENT)
public class AutoFishing {

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ClientRegistry.registerKeyBinding(Constants.KEY_SWITCH);
        ClientCommandHandler.instance.registerCommand(new CommandFish());
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new EventBusHandler());
        FMLCommonHandler.instance().bus().register(new FMLEventHandler());
    }
}
