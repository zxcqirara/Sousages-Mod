package ru.cha0sf4me.sausages.Items;

import net.minecraft.item.ItemFood;
import ru.cha0sf4me.sausages.Main;

public class FriedSlice extends ItemFood {
    public FriedSlice(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Main.modTab);
    }
}
