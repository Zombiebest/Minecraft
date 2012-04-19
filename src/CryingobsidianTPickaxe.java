/*    */ package net.minecraft.src;
/*    */ 
public class CryingobsidianTPickaxe extends ItemTool
{
    protected CryingobsidianTPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, 2, par2EnumToolMaterial);
    }

    protected CryingobsidianTPickaxe(int var1, ToolMaterial var2)
    {
        super(var1, 2, var2);
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block)
    {
        return ToolManager.isDeclared(par1Block) ? (this.toolMaterial != null ? this.toolMaterial.getHarvestLevel() >= ToolManager.getBlockLevel(par1Block) : this.toolHarvestLevel >= ToolManager.getBlockLevel(par1Block)) : (par1Block.blockMaterial == Material.rock ? true : par1Block.blockMaterial == Material.iron);
    }

    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        if (!ScotTools.hasUpdated)
        {
            ScotTools.updateMiningLists();
        }

        return par2Block != null && this.canHarvestBlock(par2Block) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }
}
