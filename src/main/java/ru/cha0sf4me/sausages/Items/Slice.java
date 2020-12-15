package ru.cha0sf4me.sausages.Items;

import net.minecraft.item.Item;
import ru.cha0sf4me.sausages.Main;

public class Slice extends Item {
    public Slice(String string) {
        this.setUnlocalizedName(string);
        this.setRegistryName(string);
        this.setCreativeTab(Main.modTab);
    }
}
