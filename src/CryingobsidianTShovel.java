package Cryingobsidian.client;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

 
public class CryingobsidianTShovel extends ItemSpade
{
	 /** an array of the blocks this spade is effective against */
    public static final Block[] blocksEffectiveAgainst = new Block[] {Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};

    public CryingobsidianTShovel(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
    }
}
