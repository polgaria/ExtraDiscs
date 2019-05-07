package site.geni.ExtraDiscs.init;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import site.geni.ExtraDiscs.ExtraDiscs;
import site.geni.ExtraDiscs.item.ModMusicDiscItem;

public class ExtraDiscsItems {
	private static final Item.Settings SETTINGS = new Item.Settings().stackSize(1).itemGroup(ExtraDiscs.ITEM_GROUP).rarity(Rarity.RARE);

	public static Item MUSIC_DISC_MINECRAFT;
	public static Item MUSIC_DISC_CLARK;
	public static Item MUSIC_DISC_SWEDEN;
	public static Item MUSIC_DISC_BIOME_FEST;
	public static Item MUSIC_DISC_BLIND_SPOTS;
	public static Item MUSIC_DISC_HAUNT_MUSKIE;
	public static Item MUSIC_DISC_ARIA_MATH;
	public static Item MUSIC_DISC_DREITON;
	public static Item MUSIC_DISC_TASWELL;
	public static Item MUSIC_DISC_ALPHA;
	public static Item MUSIC_DISC_THE_END;
	public static Item MUSIC_DISC_SUBWOOFER_LULLABY;
	public static Item MUSIC_DISC_LIVING_MICE;
	public static Item MUSIC_DISC_HAGGSTROM;
	public static Item MUSIC_DISC_DANNY;
	public static Item MUSIC_DISC_MUTATION;
	public static Item MUSIC_DISC_MOOG_CITY_2;
	public static Item MUSIC_DISC_BEGINNING_2;
	public static Item MUSIC_DISC_FLOATING_TREES;
	public static Item MUSIC_DISC_CONCRETE_HALLS;
	public static Item MUSIC_DISC_DEAD_VOXEL;
	public static Item MUSIC_DISC_WARMTH;
	public static Item MUSIC_DISC_BALLAD_OF_THE_CATS;
	public static Item MUSIC_DISC_KEY;
	public static Item MUSIC_DISC_OXYGENE;
	public static Item MUSIC_DISC_DRY_HANDS;
	public static Item MUSIC_DISC_WET_HANDS;
	public static Item MUSIC_DISC_MICE_ON_VENUS;
	public static Item MUSIC_DISC_DRAGON_FISH;
	public static Item MUSIC_DISC_AXOLOTL;
	public static Item MUSIC_DISC_SHUNIJI;

	public static void init() {
		MUSIC_DISC_MINECRAFT = register("music_disc_minecraft", new ModMusicDiscItem(13, ExtraDiscsSoundEvents.MUSIC_DISC_MINECRAFT, SETTINGS));
		MUSIC_DISC_CLARK = register("music_disc_clark", new ModMusicDiscItem(14, ExtraDiscsSoundEvents.MUSIC_DISC_CLARK, SETTINGS));
		MUSIC_DISC_SWEDEN = register("music_disc_sweden", new ModMusicDiscItem(15, ExtraDiscsSoundEvents.MUSIC_DISC_SWEDEN, SETTINGS));
		MUSIC_DISC_BIOME_FEST = register("music_disc_biome_fest", new ModMusicDiscItem(16, ExtraDiscsSoundEvents.MUSIC_DISC_BIOME_FEST, SETTINGS));
		MUSIC_DISC_BLIND_SPOTS = register("music_disc_blind_spots", new ModMusicDiscItem(17, ExtraDiscsSoundEvents.MUSIC_DISC_BLIND_SPOTS, SETTINGS));
		MUSIC_DISC_HAUNT_MUSKIE = register("music_disc_haunt_muskie", new ModMusicDiscItem(18, ExtraDiscsSoundEvents.MUSIC_DISC_HAUNT_MUSKIE, SETTINGS));
		MUSIC_DISC_ARIA_MATH = register("music_disc_aria_math", new ModMusicDiscItem(19, ExtraDiscsSoundEvents.MUSIC_DISC_ARIA_MATH, SETTINGS));
		MUSIC_DISC_DREITON = register("music_disc_dreiton", new ModMusicDiscItem(20, ExtraDiscsSoundEvents.MUSIC_DISC_DREITON, SETTINGS));
		MUSIC_DISC_TASWELL = register("music_disc_taswell", new ModMusicDiscItem(21, ExtraDiscsSoundEvents.MUSIC_DISC_TASWELL, SETTINGS));
		MUSIC_DISC_ALPHA = register("music_disc_alpha", new ModMusicDiscItem(22, ExtraDiscsSoundEvents.MUSIC_DISC_ALPHA, SETTINGS));
		MUSIC_DISC_THE_END = register("music_disc_the_end", new ModMusicDiscItem(23, ExtraDiscsSoundEvents.MUSIC_DISC_THE_END, SETTINGS));
		MUSIC_DISC_SUBWOOFER_LULLABY = register("music_disc_subwoofer_lullaby", new ModMusicDiscItem(24, ExtraDiscsSoundEvents.MUSIC_DISC_SUBWOOFER_LULLABY, SETTINGS));
		MUSIC_DISC_LIVING_MICE = register("music_disc_living_mice", new ModMusicDiscItem(25, ExtraDiscsSoundEvents.MUSIC_DISC_LIVING_MICE, SETTINGS));
		MUSIC_DISC_HAGGSTROM = register("music_disc_haggstrom", new ModMusicDiscItem(26, ExtraDiscsSoundEvents.MUSIC_DISC_HAGGSTROM, SETTINGS));
		MUSIC_DISC_DANNY = register("music_disc_danny", new ModMusicDiscItem(27, ExtraDiscsSoundEvents.MUSIC_DISC_DANNY, SETTINGS));
		MUSIC_DISC_MUTATION = register("music_disc_mutation", new ModMusicDiscItem(28, ExtraDiscsSoundEvents.MUSIC_DISC_MUTATION, SETTINGS));
		MUSIC_DISC_MOOG_CITY_2 = register("music_disc_moog_city_2", new ModMusicDiscItem(29, ExtraDiscsSoundEvents.MUSIC_DISC_MOOG_CITY_2, SETTINGS));
		MUSIC_DISC_BEGINNING_2 = register("music_disc_beginning_2", new ModMusicDiscItem(30, ExtraDiscsSoundEvents.MUSIC_DISC_BEGINNING_2, SETTINGS));
		MUSIC_DISC_FLOATING_TREES = register("music_disc_floating_trees", new ModMusicDiscItem(31, ExtraDiscsSoundEvents.MUSIC_DISC_FLOATING_TREES, SETTINGS));
		MUSIC_DISC_CONCRETE_HALLS = register("music_disc_concrete_halls", new ModMusicDiscItem(32, ExtraDiscsSoundEvents.MUSIC_DISC_CONCRETE_HALLS, SETTINGS));
		MUSIC_DISC_DEAD_VOXEL = register("music_disc_dead_voxel", new ModMusicDiscItem(33, ExtraDiscsSoundEvents.MUSIC_DISC_DEAD_VOXEL, SETTINGS));
		MUSIC_DISC_WARMTH = register("music_disc_warmth", new ModMusicDiscItem(34, ExtraDiscsSoundEvents.MUSIC_DISC_WARMTH, SETTINGS));
		MUSIC_DISC_BALLAD_OF_THE_CATS = register("music_disc_ballad_of_the_cats", new ModMusicDiscItem(35, ExtraDiscsSoundEvents.MUSIC_DISC_BALLAD_OF_THE_CATS, SETTINGS));
		MUSIC_DISC_KEY = register("music_disc_key", new ModMusicDiscItem(36, ExtraDiscsSoundEvents.MUSIC_DISC_KEY, SETTINGS));
		MUSIC_DISC_OXYGENE = register("music_disc_oxygene", new ModMusicDiscItem(37, ExtraDiscsSoundEvents.MUSIC_DISC_OXYGENE, SETTINGS));
		MUSIC_DISC_DRY_HANDS = register("music_disc_dry_hands", new ModMusicDiscItem(38, ExtraDiscsSoundEvents.MUSIC_DISC_DRY_HANDS, SETTINGS));
		MUSIC_DISC_WET_HANDS = register("music_disc_wet_hands", new ModMusicDiscItem(39, ExtraDiscsSoundEvents.MUSIC_DISC_WET_HANDS, SETTINGS));
		MUSIC_DISC_MICE_ON_VENUS = register("music_disc_mice_on_venus", new ModMusicDiscItem(40, ExtraDiscsSoundEvents.MUSIC_DISC_MICE_ON_VENUS, SETTINGS));
		MUSIC_DISC_DRAGON_FISH = register("music_disc_dragon_fish", new ModMusicDiscItem(41, ExtraDiscsSoundEvents.MUSIC_DISC_DRAGON_FISH, SETTINGS));
		MUSIC_DISC_AXOLOTL = register("music_disc_axolotl", new ModMusicDiscItem(42, ExtraDiscsSoundEvents.MUSIC_DISC_AXOLOTL, SETTINGS));
		MUSIC_DISC_SHUNIJI = register("music_disc_shuniji", new ModMusicDiscItem(43, ExtraDiscsSoundEvents.MUSIC_DISC_SHUNIJI, SETTINGS));
	}

	private static Item register(String name, Item item) {
		Identifier id = new Identifier(ExtraDiscs.DOMAIN, name);
		Registry.register(Registry.ITEM, id, item);

		return item;
	}
}
