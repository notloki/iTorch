package com.notloki.itorch;

import com.notloki.itorch.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid=Ref.MODID, name=Ref.NAME, version=Ref.VERSION)

public class ITorch {

    @Mod.Instance
    public static ITorch instance;

    @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.COMMON_PROXY)
    public static CommonProxy proxy;

    public static final Logger LOGGER = LogManager.getLogger(Ref.MODID);


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("iTorch is in the house");
        LOGGER.info("---Adding Torches---");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);

    }
}
