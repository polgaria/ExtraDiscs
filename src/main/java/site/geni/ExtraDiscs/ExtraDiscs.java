package site.geni.ExtraDiscs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import site.geni.ExtraDiscs.init.ExtraDiscsItems;

@SuppressWarnings("unused")
public class ExtraDiscs implements ModInitializer {
	public static final String DOMAIN = "extradiscs";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier(DOMAIN, DOMAIN),
		() -> new ItemStack(ExtraDiscsItems.MUSIC_DISC_SWEDEN)
	);

	@Override
	public void onInitialize() {
		ExtraDiscsItems.init();

		LogManager.getLogger("ExtraDiscs").info("[ExtraDiscs] Initialized");
	}
}
