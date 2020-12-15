package ru.cha0sf4me.sausages;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.cha0sf4me.sausages.proxy.CommonProxy;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VER)
public class Main {
    public static final String MODID = "sausages";
    public static final String NAME = "Sausages Mod";
    public static final String VER = "1.12+";

    @SidedProxy(clientSide = "ru.cha0sf4me.sausages.proxy.ClientProxy", serverSide = "ru.cha0sf4me.sausages.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs modTab = new CreativeTabs("modTab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemsRegister.SAUSAGE);
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        Recipes.registerAll();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
