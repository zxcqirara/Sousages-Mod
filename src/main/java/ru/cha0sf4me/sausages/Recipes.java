package ru.cha0sf4me.sausages;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.cha0sf4me.sausages.register.ItemsRegistry;

public class Recipes {
    public static void registerAll() {
        // Slice
        GameRegistry.addShapelessRecipe(new ResourceLocation("slice"), new ResourceLocation("slice"),
                new ItemStack(ItemsRegistry.SLICE, 4),
                Ingredient.fromItem(ItemsRegistry.KNIFE), Ingredient.fromItem(ItemsRegistry.SAUSAGE));

        // Knife
        GameRegistry.addShapedRecipe(new ResourceLocation("knife"), new ResourceLocation("knife"),
                new ItemStack(ItemsRegistry.KNIFE, 1),
                "X ", " #",
                ('X'), Items.IRON_INGOT, ('#'), Items.STICK);

        // Fried Slice
        GameRegistry.addSmelting(ItemsRegistry.SLICE, new ItemStack(ItemsRegistry.FRIED_SLICE, 1), 1.0F);
    }
}
