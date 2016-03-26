package reticality.flowoftime.client.render.items;

import reticality.flowoftime.Main;
import reticality.flowoftime.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

	public static void registerItemRenderer() {
		/*for (Item i: ModItems.allItems) {
			reg(i);
		}*/
		reg(ModItems.tutorialItem);
		reg(ModItems.glassEye);
		reg(ModItems.compressedEyeball);
	}
	
	public static String modid = Main.MODID;
	
	public static void reg(Item item, int meta) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, meta, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void reg(Item item) {
		reg(item, 0);
	}
}
