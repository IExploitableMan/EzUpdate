package gg.dressedshulkers;

import gg.dressedshulkers.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = DressedShulkers.ID, version = DressedShulkers.VERSION, useMetadata = true)
public class DressedShulkers {
    public static final String ID = "dressedshulkers";
    public static final String VERSION = "1.1a";

    @Mod.Instance
    public static DressedShulkers instance;
    @SidedProxy(clientSide = "gg.dressedshulkers.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        //GuiInventory
        //ContainerPlayer
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
