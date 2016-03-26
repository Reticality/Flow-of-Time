package reticality.flowoftime;

import reticality.flowoftime.blocks.ModBlocks;
import reticality.flowoftime.crafting.ModCrafting;
import reticality.flowoftime.items.ModItems;
import reticality.flowoftime.tileentity.ModTileEntities;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItems();
		ModBlocks.createBlocks();
		ModTileEntities.init();
	}

	public void init(FMLInitializationEvent e) {
		ModCrafting.initCrafting();
	}

	public void postInit(FMLPostInitializationEvent e) {
	}
}
