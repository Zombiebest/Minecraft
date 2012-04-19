 package net.minecraft.src;
 
 public class mod_Cryingobsidian extends BaseMod
 {
	 public static Block Cryingobsidian;
	 public static ItemAxe CryingobsidianTAxe;
	 public static ItemHoe CryingobsidianTHoe;
	 public static ItemPickaxe CryingobsidianTPickaxe;
	 public static ItemSpade CryingobsidianTShovel;
	 public static ItemSword CryingobsidianTSword;
	 public static EnumToolMaterial EnumToolMaterial;
 
   @Override
public String getVersion()
   {
     return "Cryingobsidian v0.1 for MC1.2.3";
   }
 
   public String info()
   {
     return "ModLoader.VERSION";
   }
 
   @Override
public void load()
   {
	   
	   ModLoader.registerBlock(Cryingobsidian);
 
	   Cryingobsidian.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/ZombieBest/Cryingobsidian.png");
 
	   ModLoader.addName(Cryingobsidian, "Cryingobsidian");
 
	   CryingobsidianTPickaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/ZombieBest/CryingobsidianItems.png");
 
	   ModLoader.addName(CryingobsidianTPickaxe, "CryingobsidianPickaxe");
 
	   CryingobsidianTAxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/ZombieBest/CryingobsidianItems.png");
 
	   ModLoader.addName(CryingobsidianTAxe, "CryingobsidianAxe");
 
	   CryingobsidianTHoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/ZombieBest/CryingobsidianItems.png");
 
	   ModLoader.addName(CryingobsidianTHoe, "CryingobsidianHoe");
 
	   CryingobsidianTShovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/ZombieBest/CryingobsidianItems.png");
 
	   ModLoader.addName(CryingobsidianTShovel, "CryingobsidianShovel");
	   
	   CryingobsidianTSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/ZombieBest/CryingobsidianItems.png");

	   ModLoader.addName(CryingobsidianTSword, "CryingobsidianSword");
     
	   ModLoader.addRecipe(new ItemStack(Cryingobsidian, 6), new Object[] { "#W#", "#W#", "#W#", Character.valueOf('#'), Block.obsidian, 
       Character.valueOf('W'), Item.bucketWater });

	   ModLoader.addRecipe(new ItemStack(CryingobsidianTPickaxe, 1), new Object[] { "###", " S ", " S ", Character.valueOf('#'), Cryingobsidian, 
		   Character.valueOf('S'), Item.stick });
     
	   ModLoader.addRecipe(new ItemStack(CryingobsidianTAxe, 1), new Object[] { "## ", " #S ", " S ", Character.valueOf('#'), Cryingobsidian, 
		   Character.valueOf('S'), Item.stick });
	   
	   ModLoader.addRecipe(new ItemStack(CryingobsidianTHoe, 1), new Object[] { "## ", "  S ", " S ", Character.valueOf('#'), Cryingobsidian, 
		   Character.valueOf('S'), Item.stick });

	   ModLoader.addRecipe(new ItemStack(CryingobsidianTShovel, 1), new Object[] { " # ", " #S ", " S ", Character.valueOf('#'), Cryingobsidian, 
		   Character.valueOf('S'), Item.stick });

	   ModLoader.addRecipe(new ItemStack(CryingobsidianTSword, 1), new Object[] { " # ", "  # ", " S ", Character.valueOf('#'), Cryingobsidian, 
		   Character.valueOf('S'), Item.stick });
     
   }
}