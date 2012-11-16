package Cryingobsidian.Client;
 
import java.util.Random;
import Cryingobsidian.Common.mod_Cryingobsidian;
import net.minecraft.src.Block;
import net.minecraft.src.Material;
 
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