package Cryingobsidian.client;
 
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Cryingobsidian.common.mod_Cryingobsidian;
 
 public class BlockCryingobsidian extends Block
 {
   public BlockCryingobsidian(int i, int j)
   {
     super(i, j, Material.rock);
   }
 
   public int idDropped(int i, Random random)
   {
     int n = random.nextInt(10);
     if (n == 5)
     {
       return mod_Cryingobsidian.BlockCryingobsidian.blockID;
     }
     return 0;
   }
 }