package ru.cha0sf4me.sausages;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
    public static void registerAll() {
        // Slice
        GameRegistry.addShapelessRecipe(new ResourceLocation("slice"), new ResourceLocation("slice"),
                new ItemStack(ItemsRegister.SLICE, 4),
                Ingredient.fromItem(ItemsRegister.KNIFE), Ingredient.fromItem(ItemsRegister.SAUSAGE));

        // Knife
        GameRegistry.addShapedRecipe(new ResourceLocation("knife"), new ResourceLocation("knife"),
                new ItemStack(ItemsRegister.KNIFE, 1),
                "X ", " #",
                ('X'), Items.IRON_INGOT, ('#'), Items.STICK);

        // Fried Slice
        GameRegistry.addSmelting(ItemsRegister.SLICE, new ItemStack(ItemsRegister.FRIED_SLICE, 1), 1.0F);
    }
}
