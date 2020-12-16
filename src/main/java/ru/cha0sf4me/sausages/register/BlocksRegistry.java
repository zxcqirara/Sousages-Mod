package ru.cha0sf4me.sausages.register;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import ru.cha0sf4me.sausages.Blocks.BlockCropSausage;

public class BlocksRegistry {
    public static final Block
            CROP_CORN = new BlockCropSausage("crop_sausage");

    public static void register() {

        setBlockRegister(CROP_CORN);
    }

    private static void setBlockRegister(Block block) {

        ForgeRegistries.BLOCKS.register(block);
    }
}
