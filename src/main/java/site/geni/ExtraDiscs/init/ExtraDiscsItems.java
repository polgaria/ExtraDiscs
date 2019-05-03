package site.geni.ExtraDiscs.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import site.geni.ExtraDiscs.ExtraDiscs;
import site.geni.ExtraDiscs.item.ExtraDiscsItemRecord;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ExtraDiscsItems {
	public static final List<ExtraDiscsItemRecord> ITEMS = new ArrayList<>();

	public static final Item MUSIC_DISC_MINECRAFT = new ExtraDiscsItemRecord("record_minecraft", ExtraDiscsSoundEvents.MUSIC_DISC_MINECRAFT);
	public static final Item MUSIC_DISC_CLARK = new ExtraDiscsItemRecord("record_clark", ExtraDiscsSoundEvents.MUSIC_DISC_CLARK);
	public static final Item MUSIC_DISC_SWEDEN = new ExtraDiscsItemRecord("record_sweden", ExtraDiscsSoundEvents.MUSIC_DISC_SWEDEN);
	public static final Item MUSIC_DISC_BIOME_FEST = new ExtraDiscsItemRecord("record_biome_fest", ExtraDiscsSoundEvents.MUSIC_DISC_BIOME_FEST);
	public static final Item MUSIC_DISC_BLIND_SPOTS = new ExtraDiscsItemRecord("record_blind_spots", ExtraDiscsSoundEvents.MUSIC_DISC_BLIND_SPOTS);
	public static final Item MUSIC_DISC_HAUNT_MUSKIE = new ExtraDiscsItemRecord("record_haunt_muskie", ExtraDiscsSoundEvents.MUSIC_DISC_HAUNT_MUSKIE);
	public static final Item MUSIC_DISC_ARIA_MATH = new ExtraDiscsItemRecord("record_aria_math", ExtraDiscsSoundEvents.MUSIC_DISC_ARIA_MATH);
	public static final Item MUSIC_DISC_DREITON = new ExtraDiscsItemRecord("record_dreiton", ExtraDiscsSoundEvents.MUSIC_DISC_DREITON);
	public static final Item MUSIC_DISC_TASWELL = new ExtraDiscsItemRecord("record_taswell", ExtraDiscsSoundEvents.MUSIC_DISC_TASWELL);
	public static final Item MUSIC_DISC_ALPHA = new ExtraDiscsItemRecord("record_alpha", ExtraDiscsSoundEvents.MUSIC_DISC_ALPHA);
	public static final Item MUSIC_DISC_THE_END = new ExtraDiscsItemRecord("record_the_end", ExtraDiscsSoundEvents.MUSIC_DISC_THE_END);
	public static final Item MUSIC_DISC_SUBWOOFER_LULLABY = new ExtraDiscsItemRecord("record_subwoofer_lullaby", ExtraDiscsSoundEvents.MUSIC_DISC_SUBWOOFER_LULLABY);
	public static final Item MUSIC_DISC_LIVING_MICE = new ExtraDiscsItemRecord("record_living_mice", ExtraDiscsSoundEvents.MUSIC_DISC_LIVING_MICE);
	public static final Item MUSIC_DISC_HAGGSTROM = new ExtraDiscsItemRecord("record_haggstrom", ExtraDiscsSoundEvents.MUSIC_DISC_HAGGSTROM);
	public static final Item MUSIC_DISC_DANNY = new ExtraDiscsItemRecord("record_danny", ExtraDiscsSoundEvents.MUSIC_DISC_DANNY);
	public static final Item MUSIC_DISC_MUTATION = new ExtraDiscsItemRecord("record_mutation", ExtraDiscsSoundEvents.MUSIC_DISC_MUTATION);
	public static final Item MUSIC_DISC_MOOG_CITY_2 = new ExtraDiscsItemRecord("record_moog_city_2", ExtraDiscsSoundEvents.MUSIC_DISC_MOOG_CITY_2);
	public static final Item MUSIC_DISC_BEGINNING_2 = new ExtraDiscsItemRecord("record_beginning_2", ExtraDiscsSoundEvents.MUSIC_DISC_BEGINNING_2);
	public static final Item MUSIC_DISC_FLOATING_TREES = new ExtraDiscsItemRecord("record_floating_trees", ExtraDiscsSoundEvents.MUSIC_DISC_FLOATING_TREES);
	public static final Item MUSIC_DISC_CONCRETE_HALLS = new ExtraDiscsItemRecord("record_concrete_halls", ExtraDiscsSoundEvents.MUSIC_DISC_CONCRETE_HALLS);
	public static final Item MUSIC_DISC_DEAD_VOXEL = new ExtraDiscsItemRecord("record_dead_voxel", ExtraDiscsSoundEvents.MUSIC_DISC_DEAD_VOXEL);
	public static final Item MUSIC_DISC_WARMTH = new ExtraDiscsItemRecord("record_warmth", ExtraDiscsSoundEvents.MUSIC_DISC_WARMTH);
	public static final Item MUSIC_DISC_BALLAD_OF_THE_CATS = new ExtraDiscsItemRecord("record_ballad_of_the_cats", ExtraDiscsSoundEvents.MUSIC_DISC_BALLAD_OF_THE_CATS);
	public static final Item MUSIC_DISC_KEY = new ExtraDiscsItemRecord("record_key", ExtraDiscsSoundEvents.MUSIC_DISC_KEY);
	public static final Item MUSIC_DISC_OXYGENE = new ExtraDiscsItemRecord("record_oxygene", ExtraDiscsSoundEvents.MUSIC_DISC_OXYGENE);
	public static final Item MUSIC_DISC_DRY_HANDS = new ExtraDiscsItemRecord("record_dry_hands", ExtraDiscsSoundEvents.MUSIC_DISC_DRY_HANDS);
	public static final Item MUSIC_DISC_WET_HANDS = new ExtraDiscsItemRecord("record_wet_hands", ExtraDiscsSoundEvents.MUSIC_DISC_WET_HANDS);
	public static final Item MUSIC_DISC_MICE_ON_VENUS = new ExtraDiscsItemRecord("record_mice_on_venus", ExtraDiscsSoundEvents.MUSIC_DISC_MICE_ON_VENUS);
	public static final Item MUSIC_DISC_DRAGON_FISH = new ExtraDiscsItemRecord("record_dragon_fish", ExtraDiscsSoundEvents.MUSIC_DISC_DRAGON_FISH);
	public static final Item MUSIC_DISC_AXOLOTL = new ExtraDiscsItemRecord("record_axolotl", ExtraDiscsSoundEvents.MUSIC_DISC_AXOLOTL);
	public static final Item MUSIC_DISC_SHUNIJI = new ExtraDiscsItemRecord("record_shuniji", ExtraDiscsSoundEvents.MUSIC_DISC_SHUNIJI);

	@Mod.EventBusSubscriber(modid = ExtraDiscs.MODID)
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			for (ExtraDiscsItemRecord item : ITEMS) {
				event.getRegistry().register(item);
				item.registerItemModel();
			}
		}
	}
}
