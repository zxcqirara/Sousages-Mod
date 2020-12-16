package ru.cha0sf4me.sausages.Blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import ru.cha0sf4me.sausages.ItemsRegister;

import java.util.Random;

public class BlockCropSausage extends BlockCrops {
    private static final AxisAlignedBB[] CROPS_AABB = new AxisAlignedBB[] {
            new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.25D, 0.5625D),
            new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.375D, 0.625D),
            new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.5D, 0.625D),
            new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.5625D, 0.625D),
            new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.6875D, 0.625D),
            new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.875D, 0.625D),
            new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 1.0D, 0.6875D),
            new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 1.0D, 0.6875D)
    };

    public BlockCropSausage(String cropName) {
        this.setUnlocalizedName(cropName);
        this.setRegistryName(cropName);
    }

    @SuppressWarnings("NullableProblems")
    public AxisAlignedBB getBoundingBox(IBlockState blockState, IBlockAccess source, BlockPos position) {
        return CROPS_AABB[blockState.getValue(this.getAgeProperty())];
    }

    @Override
    protected Item getSeed() {
        return ItemsRegister.SAUSAGE_SEED;
    }

    @Override
    protected Item getCrop() {
        if (new Random().nextInt(100) <= 10)
            return ItemsRegister.SAUSAGE;
        else
            return Items.AIR;
    }

    protected int getBonemealAgeIncrease(World world) {
        return MathHelper.getInt(world.rand, 1, 2);
    }

    public EnumPlantType getPlantType(IBlockAccess world, BlockPos position) {
        return EnumPlantType.Crop;
    }
}
