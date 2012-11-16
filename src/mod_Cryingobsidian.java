package Cryingobsidian.Common;

import net.minecraft.src.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import Cryingobsidian.Client.*;

@Mod(modid="Zombie-Cryingobsidian", name="Cryingobsidian", version="Cryingobsidian private alpha v 0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)
public class mod_Cryingobsidian{
	
	public static Block BlockCryingobsidian;
	
	
	@Init
	public void load(FMLInitializationEvent event){
		
		BlockCryingobsidian=(new BlockCryingobsidian(146, 0));
		
	}

}
