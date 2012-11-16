package Cryingobsidian.Common;

import net.minecraft.src.Block;
import net.minecraft.src.ItemAxe;
import net.minecraft.src.ItemHoe;
import net.minecraft.src.ItemPickaxe;
import net.minecraft.src.ItemSpade;
import net.minecraft.src.ItemSword;
import Cryingobsidian.Client.BlockCryingobsidian;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="Zombie-Cryingobsidian", name="Cryingobsidian", version="Cryingobsidian private alpha v 0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)
public class mod_Cryingobsidian{
	
	public static Block BlockCryingobsidian;
	public static ItemPickaxe CryingobsidianTPickaxe;
	public static ItemSword CryingobsidianTSword;
	public static ItemHoe CryingobsidianTHoe;
	public static ItemAxe CryingobsidianTAxe;
	public static ItemSpade CryingobsidianTShovel;
	
	
	@Init
	public void load(FMLInitializationEvent event){
		
		BlockCryingobsidian=(new BlockCryingobsidian(146, 0));
		
	}

}
