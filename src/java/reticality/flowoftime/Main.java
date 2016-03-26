package reticality.flowoftime;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


/**
 * @author Reticality
 *
 */
@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "flowoftime";
	public static final String MODNAME = "Flow of Time";
	public static final String VERSION = "1.0.0";

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide="com.reticality.flowoftime.ClientProxy", serverSide="com.reticality.flowoftime.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		Main.proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		Main.proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		Main.proxy.postInit(e);
	}
}
