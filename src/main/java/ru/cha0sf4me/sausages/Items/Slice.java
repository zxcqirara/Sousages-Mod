package ru.cha0sf4me.sausages.Items;

import net.minecraft.item.Item;
import ru.cha0sf4me.sausages.Main;

public class Slice extends Item {
    public Slice(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Main.modTab);
    }
}
