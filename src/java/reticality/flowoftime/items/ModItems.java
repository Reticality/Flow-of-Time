package reticality.flowoftime.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item tutorialItem;
	public static Item glassEye;
	public static Item compressedEyeball;
	
	public static Item[] allItems = {tutorialItem, glassEye, compressedEyeball};
	
	public static void createItems() {
		GameRegistry.registerItem(tutorialItem = new BasicItem("tutorial_item"), "tutorial_item");
		GameRegistry.registerItem(glassEye = new BasicItem("glass_eye"), "glass_eye");
		GameRegistry.registerItem(compressedEyeball = new BasicItem("compressed_eyeball"), "compressed_eyeball");
	}
}
