package ru.cha0sf4me.sausages.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.cha0sf4me.sausages.register.BlocksRegistry;
import ru.cha0sf4me.sausages.EventsHandler;
import ru.cha0sf4me.sausages.register.ItemsRegistry;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemsRegistry.register();
        BlocksRegistry.register();
        MinecraftForge.EVENT_BUS.register(new EventsHandler());
    }

    public void init(FMLInitializationEvent event)
    {
        ItemsRegistry.registerRender();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}