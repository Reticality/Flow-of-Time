package reticality.flowoftime.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModTileEntities {

	public static void init() {
		GameRegistry.registerTileEntity(ModContainer.class, "flowoftime_container");
	}
}
