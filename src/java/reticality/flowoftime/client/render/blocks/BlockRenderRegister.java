package reticality.flowoftime.client.render.blocks;

import reticality.flowoftime.Main;
import reticality.flowoftime.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	
	public static void registerBlockRenderer(){
		reg(ModBlocks.tutorialBlock);
		reg(ModBlocks.tutorialOre);
		reg(ModBlocks.eyeStalk);
		reg(ModBlocks.modBlockTileEntity);
		reg(ModBlocks.modContainer);
	}
	
	public static String modid = Main.MODID;

	public static void reg(Block block, int meta) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void reg(Block block) {
		reg(block, 0);
	}
}
