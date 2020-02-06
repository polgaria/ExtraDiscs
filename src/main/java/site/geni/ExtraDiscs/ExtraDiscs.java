package site.geni.ExtraDiscs;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod("extradiscs")
public class ExtraDiscs {
	public static final String MODID = "extradiscs";

	public ExtraDiscs() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SuppressWarnings("unused")
	@Mod.EventBusSubscriber(modid = ExtraDiscs.MODID)
	public static class Events {
		@SubscribeEvent
		public static void addDiscsToDungeonLoot(final LootTableLoadEvent event) {
			if (event.getName().getPath().equals("chests/simple_dungeon")) {
				LootPool pool = LootPool.builder()
					.addEntry(TableLootEntry.builder(new ResourceLocation(ExtraDiscs.MODID, "inject/simple_dungeon"))
						.weight(1))
					.bonusRolls(1, 3)
					.name("extradiscs_inject")
					.build();
				event.getTable().addPool(pool);
			}
		}
	}
}
