package site.geni.ExtraDiscs;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import site.geni.ExtraDiscs.proxy.CommonProxy;

@Mod(modid = ExtraDiscs.MODID, name = ExtraDiscs.NAME, version = ExtraDiscs.VERSION)
public class ExtraDiscs {
	public static final String MODID = "extradiscs";
	public static final String NAME = "ExtraDiscs";
	public static final String VERSION = "1.0.0-forge1.12.2+build.1";

	@SidedProxy(serverSide = "site.geni.ExtraDiscs.proxy.CommonProxy", clientSide = "site.geni.ExtraDiscs.proxy.ClientProxy")
	public static CommonProxy proxy;

	private static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("Initialized");
	}
}
