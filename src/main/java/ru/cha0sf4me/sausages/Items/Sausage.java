package ru.cha0sf4me.sausages.Items;

import net.minecraft.item.Item;
import ru.cha0sf4me.sausages.Main;

public class Sausage extends Item {
    public Sausage(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(64);
        this.setCreativeTab(Main.modTab);
    }
}