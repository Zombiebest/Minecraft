/*    */ package net.minecraft.src;
/*    */ 
/*    */ public class CryingobsidianTShovel extends ItemSpade
/*    */ {
/* 15 */   private static Block[] blocksEffectiveAgainst = { Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, 
/* 16 */     Block.tilledField, Block.slowSand, Block.mycelium };
/*    */ 
/*    */   public CryingobsidianTShovel(int i, EnumToolMaterial enumtoolmaterial)
/*    */   {
/* 21 */     super(i, enumtoolmaterial);
/*    */   }
/*    */ 
/*    */   public boolean canHarvestBlock(Block block)
/*    */   {
/* 27 */     if (block == Block.snow)
/*    */     {
/* 29 */       return true;
/*    */     }
/* 31 */     return block == Block.blockSnow;
/*    */   }
/*    */ }

/* Location:           C:\Users\thuresasbrother\Documents\Cryingobsidian.jar
 * Qualified Name:     net.minecraft.src.CryingobsidianTShovel
 * JD-Core Version:    0.6.0
 */