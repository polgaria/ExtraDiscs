package site.geni.ExtraDiscs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.LootJsonParser;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.world.loot.*;
import net.minecraft.world.loot.entry.LootEntry;
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

		LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
			if (id.toString().equals("minecraft:chests/simple_dungeon")) {
				LootEntry swedenLootEntry = LootJsonParser.read("{\"type\":\"minecraft:item\",\"weight\":15,\"name\":\"extradiscs:music_disc_sweden\"}", LootEntry.class);
				LootEntry ariaMathLootEntry = LootJsonParser.read("{\"type\":\"minecraft:item\",\"weight\":15,\"name\":\"extradiscs:music_disc_aria_math\"}", LootEntry.class);
				LootEntry emptyLootEntry = LootJsonParser.read("{\"type\":\"empty\",\"weight\":70}", LootEntry.class);

				LootPool pool = FabricLootPoolBuilder.builder()
					.withEntry(swedenLootEntry)
					.withEntry(ariaMathLootEntry)
					.withEntry(emptyLootEntry)
					.withRolls(UniformLootTableRange.between(1, 3))
					.build();

				supplier.withPool(pool);
			}
		});
	}
}
