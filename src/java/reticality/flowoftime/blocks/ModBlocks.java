package reticality.flowoftime.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block tutorialBlock;
	public static Block tutorialOre;
	public static Block eyeStalk;
	public static Block modBlockTileEntity;
	public static Block modContainer;
	
	public static void createBlocks() {
		GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block").setLightLevel(1.0f), "tutorial_block");
		GameRegistry.registerBlock(tutorialOre = new BasicBlock("tutorial_ore"), "tutorial_ore");
		GameRegistry.registerBlock(eyeStalk = new BasicBlock("eye_stalk", Material.circuits, 2.0f, 10.0f), "eye_stalk");
		GameRegistry.registerBlock(modBlockTileEntity = new ModBlockTileEntity("tile_entity"), "tile_entity");
		GameRegistry.registerBlock(modContainer = new ModBlockTileEntity("container"), "container");
	}
}
