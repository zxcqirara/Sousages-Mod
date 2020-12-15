package ru.cha0sf4me.sausages.Items;

import net.minecraft.item.Item;
import ru.cha0sf4me.sausages.Main;

public class Sausage extends Item {
    public Sausage(String string) {
        this.setUnlocalizedName(string);
        this.setRegistryName(string);
        this.setMaxStackSize(64);
        this.setCreativeTab(Main.modTab);
    }
}