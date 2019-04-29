package site.geni.ExtraDiscs;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import site.geni.ExtraDiscs.init.ExtraDiscsItems;

@SuppressWarnings("unused")
public class ExtraDiscs implements ModInitializer {
	public static final String DOMAIN = "extradiscs";

	@Override
	public void onInitialize() {
		ExtraDiscsItems.init();

		LogManager.getLogger("ExtraDiscs").info("[ExtraDiscs] Initialized");
	}
}
