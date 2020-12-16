package ru.cha0sf4me.sausages;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.cha0sf4me.sausages.Items.*;

public class ItemsRegister
{
    public static Item SAUSAGE = new Sausage("sausage", 1, 0F, true);
    public static Item KNIFE = new Knife("knife");
    public static Item SLICE = new Slice("slice", 1, 0F, true);
    public static Item FRIED_SLICE = new FriedSlice("fried_slice", 6, 0.2F, true);
    public static Item SAUSAGE_SEED = new SausageSeeds("sausage_seed");

    public static void register()
    {
        setRegister(SAUSAGE);
        setRegister(KNIFE);
        setRegister(SLICE);
        setRegister(FRIED_SLICE);
        setRegister(SAUSAGE_SEED);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender()
    {
        setRender(SAUSAGE);
        setRender(KNIFE);
        setRender(SLICE);
        setRender(FRIED_SLICE);
        setRender(SAUSAGE_SEED);
    }

    private static void setRegister(Item item)
    {
        ForgeRegistries.ITEMS.registerAll(item);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}