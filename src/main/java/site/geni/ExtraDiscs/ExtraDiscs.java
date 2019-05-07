package site.geni.ExtraDiscs;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import site.geni.ExtraDiscs.init.ExtraDiscsItems;
import site.geni.ExtraDiscs.proxy.CommonProxy;

@Mod(modid = ExtraDiscs.MODID, name = ExtraDiscs.NAME, version = ExtraDiscs.VERSION)
public class ExtraDiscs {
	public static final String MODID = "extradiscs";
	public static final String NAME = "ExtraDiscs";
	public static final String VERSION = "1.0.1-forge1.12.2+build.4";

	@SidedProxy(serverSide = "site.geni.ExtraDiscs.proxy.CommonProxy", clientSide = "site.geni.ExtraDiscs.proxy.ClientProxy")
	public static CommonProxy proxy;

	private static Logger logger;

	@Mod.EventHandler
	public void preInit(final FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@Mod.EventHandler
	public void init(final FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation(ExtraDiscs.MODID, "inject/simple_dungeon"));

		logger.info("Version " + VERSION + " initialized");
	}

	@Mod.EventBusSubscriber(modid = ExtraDiscs.MODID)
	public static class LootHandler {
		private static final LootEntry INJECT_ENTRY = new LootEntryTable(new ResourceLocation(MODID, "inject/simple_dungeon"), 1, 0, new LootCondition[0], "extradiscs_inject_entry");
		private static final LootPool INJECT_POOL = new LootPool(new LootEntry[]{INJECT_ENTRY}, new LootCondition[0], new RandomValueRange(1, 3), new RandomValueRange(0), "extradiscs_inject_pool");

		@SubscribeEvent
		public static void addDiscsToDungeonLoot(final LootTableLoadEvent event) {
			if (event.getName().toString().equals("minecraft:chests/simple_dungeon")) {
				event.getTable().addPool(INJECT_POOL);
			}
		}

		@SubscribeEvent
		public static void onCreeperDeath(final LivingDeathEvent event) {
			if (event.getEntity() instanceof EntityCreeper) {
				if (event.getSource().getTrueSource() instanceof EntitySkeleton && ((EntityCreeper) event.getEntity()).getRNG().nextInt(2) == 1) {
					Item disc = ExtraDiscsItems.ITEMS.get(((EntityCreeper) event.getEntity()).getRNG().nextInt(ExtraDiscsItems.ITEMS.size() + 1));
					event.getEntity().dropItem(disc, 1);
				}
			}
		}
	}
}
