package ru.cha0sf4me.sausages.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.cha0sf4me.sausages.ItemsRegister;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemsRegister.register();
        //MinecraftForge.EVENT_BUS.register(new EventsHandler());
    }

    public void init(FMLInitializationEvent event)
    {
        ItemsRegister.registerRender();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}