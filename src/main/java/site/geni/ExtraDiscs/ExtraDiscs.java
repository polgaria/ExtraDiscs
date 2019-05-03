package site.geni.ExtraDiscs;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.apache.logging.log4j.Logger;
import site.geni.ExtraDiscs.init.ExtraDiscsItems;
import site.geni.ExtraDiscs.item.ExtraDiscsItemRecord;
import site.geni.ExtraDiscs.proxy.CommonProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mod(modid = ExtraDiscs.MODID, name = ExtraDiscs.NAME, version = ExtraDiscs.VERSION)
public class ExtraDiscs {
	public static final String MODID = "extradiscs";
	public static final String NAME = "ExtraDiscs";
	public static final String VERSION = "1.0.1-forge1.12.2+build.3";

	@SidedProxy(serverSide = "site.geni.ExtraDiscs.proxy.CommonProxy", clientSide = "site.geni.ExtraDiscs.proxy.ClientProxy")
	public static CommonProxy proxy;

	private static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation(ExtraDiscs.MODID, "inject/simple_dungeon"));

		logger.info("Initialized");
	}

	@Mod.EventBusSubscriber(modid = ExtraDiscs.MODID)
	public static class Events {
		private static final LootEntry INJECT_ENTRY = new LootEntryTable(new ResourceLocation("extradiscs:inject/simple_dungeon"), 8, 0, new LootCondition[0], "extradiscs_inject_entry");

		@SubscribeEvent
		public static void addDiscsToDungeonLoot(final LootTableLoadEvent event) {
			if (event.getName().getPath().equals("chests/simple_dungeon")) {
				final LootPool main = event.getTable().getPool("main");

				main.addEntry(INJECT_ENTRY);
			}
		}

		@SubscribeEvent
		public static void onCreeperDeath(final LivingDeathEvent event) {
			if (event.getEntity() instanceof EntityCreeper) {
				if (event.getSource().getTrueSource() instanceof EntitySkeleton && ((EntityCreeper) event.getEntity()).getRNG().nextInt(2) == 1) {
					Item item = ExtraDiscsItems.ITEMS.get(((EntityCreeper) event.getEntity()).getRNG().nextInt(ExtraDiscsItems.ITEMS.size() + 1));
					event.getEntity().dropItem(item, 1);
				}
			}
		}
	}
}
