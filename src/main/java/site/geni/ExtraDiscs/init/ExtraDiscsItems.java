package site.geni.ExtraDiscs.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import site.geni.ExtraDiscs.item.ExtraDiscsMusicDiscItem;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ExtraDiscsItems {
	private static final Item.Properties PROPERTIES = new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE);

	public static final List<ExtraDiscsMusicDiscItem> ITEMS = new ArrayList<>();

	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_MINECRAFT = new ExtraDiscsMusicDiscItem("music_disc_minecraft", 13, ExtraDiscsSoundEvents.MUSIC_DISC_MINECRAFT, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_CLARK = new ExtraDiscsMusicDiscItem("music_disc_clark", 14, ExtraDiscsSoundEvents.MUSIC_DISC_CLARK, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_SWEDEN = new ExtraDiscsMusicDiscItem("music_disc_sweden", 15, ExtraDiscsSoundEvents.MUSIC_DISC_SWEDEN, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_BIOME_FEST = new ExtraDiscsMusicDiscItem("music_disc_biome_fest", 16, ExtraDiscsSoundEvents.MUSIC_DISC_BIOME_FEST, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_BLIND_SPOTS = new ExtraDiscsMusicDiscItem("music_disc_blind_spots", 17, ExtraDiscsSoundEvents.MUSIC_DISC_BLIND_SPOTS, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_HAUNT_MUSKIE = new ExtraDiscsMusicDiscItem("music_disc_haunt_muskie", 18, ExtraDiscsSoundEvents.MUSIC_DISC_HAUNT_MUSKIE, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_ARIA_MATH = new ExtraDiscsMusicDiscItem("music_disc_aria_math", 19, ExtraDiscsSoundEvents.MUSIC_DISC_ARIA_MATH, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_DREITON = new ExtraDiscsMusicDiscItem("music_disc_dreiton", 20, ExtraDiscsSoundEvents.MUSIC_DISC_DREITON, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_TASWELL = new ExtraDiscsMusicDiscItem("music_disc_taswell", 21, ExtraDiscsSoundEvents.MUSIC_DISC_TASWELL, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_ALPHA = new ExtraDiscsMusicDiscItem("music_disc_alpha", 22, ExtraDiscsSoundEvents.MUSIC_DISC_ALPHA, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_THE_END = new ExtraDiscsMusicDiscItem("music_disc_the_end", 23, ExtraDiscsSoundEvents.MUSIC_DISC_THE_END, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_SUBWOOFER_LULLABY = new ExtraDiscsMusicDiscItem("music_disc_subwoofer_lullaby", 24, ExtraDiscsSoundEvents.MUSIC_DISC_SUBWOOFER_LULLABY, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_LIVING_MICE = new ExtraDiscsMusicDiscItem("music_disc_living_mice", 25, ExtraDiscsSoundEvents.MUSIC_DISC_LIVING_MICE, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_HAGGSTROM = new ExtraDiscsMusicDiscItem("music_disc_haggstrom", 26, ExtraDiscsSoundEvents.MUSIC_DISC_HAGGSTROM, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_DANNY = new ExtraDiscsMusicDiscItem("music_disc_danny", 27, ExtraDiscsSoundEvents.MUSIC_DISC_DANNY, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_MUTATION = new ExtraDiscsMusicDiscItem("music_disc_mutation", 28, ExtraDiscsSoundEvents.MUSIC_DISC_MUTATION, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_MOOG_CITY_2 = new ExtraDiscsMusicDiscItem("music_disc_moog_city_2", 29, ExtraDiscsSoundEvents.MUSIC_DISC_MOOG_CITY_2, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_BEGINNING_2 = new ExtraDiscsMusicDiscItem("music_disc_beginning_2", 30, ExtraDiscsSoundEvents.MUSIC_DISC_BEGINNING_2, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_FLOATING_TREES = new ExtraDiscsMusicDiscItem("music_disc_floating_trees", 31, ExtraDiscsSoundEvents.MUSIC_DISC_FLOATING_TREES, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_CONCRETE_HALLS = new ExtraDiscsMusicDiscItem("music_disc_concrete_halls", 32, ExtraDiscsSoundEvents.MUSIC_DISC_CONCRETE_HALLS, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_DEAD_VOXEL = new ExtraDiscsMusicDiscItem("music_disc_dead_voxel", 33, ExtraDiscsSoundEvents.MUSIC_DISC_DEAD_VOXEL, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_WARMTH = new ExtraDiscsMusicDiscItem("music_disc_warmth", 34, ExtraDiscsSoundEvents.MUSIC_DISC_WARMTH, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_BALLAD_OF_THE_CATS = new ExtraDiscsMusicDiscItem("music_disc_ballad_of_the_cats", 35, ExtraDiscsSoundEvents.MUSIC_DISC_BALLAD_OF_THE_CATS, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_KEY = new ExtraDiscsMusicDiscItem("music_disc_key", 36, ExtraDiscsSoundEvents.MUSIC_DISC_KEY, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_OXYGENE = new ExtraDiscsMusicDiscItem("music_disc_oxygene", 37, ExtraDiscsSoundEvents.MUSIC_DISC_OXYGENE, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_DRY_HANDS = new ExtraDiscsMusicDiscItem("music_disc_dry_hands", 38, ExtraDiscsSoundEvents.MUSIC_DISC_DRY_HANDS, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_WET_HANDS = new ExtraDiscsMusicDiscItem("music_disc_wet_hands", 39, ExtraDiscsSoundEvents.MUSIC_DISC_WET_HANDS, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_MICE_ON_VENUS = new ExtraDiscsMusicDiscItem("music_disc_mice_on_venus", 40, ExtraDiscsSoundEvents.MUSIC_DISC_MICE_ON_VENUS, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_DRAGON_FISH = new ExtraDiscsMusicDiscItem("music_disc_dragon_fish", 41, ExtraDiscsSoundEvents.MUSIC_DISC_DRAGON_FISH, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_AXOLOTL = new ExtraDiscsMusicDiscItem("music_disc_axolotl", 42, ExtraDiscsSoundEvents.MUSIC_DISC_AXOLOTL, PROPERTIES);
	public static final ExtraDiscsMusicDiscItem MUSIC_DISC_SHUNIJI = new ExtraDiscsMusicDiscItem("music_disc_shuniji", 43, ExtraDiscsSoundEvents.MUSIC_DISC_SHUNIJI, PROPERTIES);

	@SuppressWarnings("unused")
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onSoundEventRegistry(final RegistryEvent.Register<Item> event) {
			for (ExtraDiscsMusicDiscItem musicDiscItem : ITEMS) {
				event.getRegistry().register(musicDiscItem);
			}
		}
	}
}
