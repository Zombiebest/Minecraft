 package net.minecraft.src;
 
 import java.util.Random;
 
 public class BlockCryingobsidian extends Block
 {
   protected BlockCryingobsidian(int i, int j)
   {
     super(i, j, Material.rock);
   }
 
   public int idDropped(int i, Random random)
   {
     int n = random.nextInt(10);
     if (n == 5)
     {
       return mod_Cryingobsidian.Cryingobsidian.blockID;
     }
     return 0;
   }
 }