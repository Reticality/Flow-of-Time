package reticality.flowoftime.crafting;

import reticality.flowoftime.blocks.ModBlocks;
import reticality.flowoftime.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCrafting {
	
	public static void initCrafting() {
		// Shaped crafting
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), "##", "##", '#', ModItems.tutorialItem);
		GameRegistry.addRecipe(new ItemStack(ModItems.compressedEyeball), "EEE", "EFE", "EEE", 'E', Items.spider_eye, 'F', Items.fermented_spider_eye);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.glassEye), ".G.", "GCG", ".G.", 'C', ModItems.compressedEyeball, 'G', "paneGlass"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.eyeStalk), "BEB", " B ", "SSS", 'B', Items.bone, 'E', ModItems.glassEye, 'S', "stone"));
		
		// Shapeless crafting
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.tutorialOre), Blocks.redstone_ore, new ItemStack(Items.dye, 1, 4));
		
		// Furnace smelting
		GameRegistry.addSmelting(ModBlocks.tutorialOre, new ItemStack(ModItems.tutorialItem), 1.0F);
	}
}
