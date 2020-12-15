package ru.cha0sf4me.sausages.Items;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import ru.cha0sf4me.sausages.Main;

public class Knife extends Item {
    private static final Integer MobDamage = 4;

    public Knife(String string) {
        this.setUnlocalizedName(string);
        this.setRegistryName(string);
        this.setCreativeTab(Main.modTab);
        this.setMaxStackSize(1);
        this.setMaxDamage(40);
        this.setNoRepair();
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack result = itemStack.copy();
        result.setItemDamage(result.getItemDamage() + 1);
        if (result.getItemDamage() >= result.getMaxDamage())
            return ItemStack.EMPTY;
        return result;
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, EntityLivingBase entity1, EntityLivingBase entity2) {
        itemStack.damageItem(2, entity2);//Повреждение предмета
        if (entity2 instanceof EntityPlayer) {
            entity1.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)entity2), 3F);//Урон
        }
        return true;
    }
}
