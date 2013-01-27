package Cryingobsidian.common;

import net.minecraft.block.Block;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import Cryingobsidian.client.BlockCryingobsidian;

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
