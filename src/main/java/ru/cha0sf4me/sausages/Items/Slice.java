package ru.cha0sf4me.sausages.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ru.cha0sf4me.sausages.Main;

public class Slice extends ItemFood {
    public Slice(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Main.modTab);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);

        if (player.getFoodStats().getFoodLevel() > 2)
            player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 200, 4));
    }
}
