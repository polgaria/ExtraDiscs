package site.geni.ExtraDiscs.init;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import site.geni.ExtraDiscs.ExtraDiscs;

public class ExtraDiscsSoundEvents {
	public static final SoundEvent MUSIC_DISC_SWEDEN = register("music_disc.sweden");
	public static final SoundEvent MUSIC_DISC_MINECRAFT = register("music_disc.minecraft");
	public static final SoundEvent MUSIC_DISC_CLARK = register("music_disc.clark");
	public static final SoundEvent MUSIC_DISC_BIOME_FEST = register("music_disc.biome_fest");
	public static final SoundEvent MUSIC_DISC_BLIND_SPOTS = register("music_disc.blind_spots");
	public static final SoundEvent MUSIC_DISC_HAUNT_MUSKIE= register("music_disc.haunt_muskie");
	public static final SoundEvent MUSIC_DISC_ARIA_MATH = register("music_disc.aria_math");
	public static final SoundEvent MUSIC_DISC_DREITON = register("music_disc.dreiton");
	public static final SoundEvent MUSIC_DISC_TASWELL = register("music_disc.taswell");
	public static final SoundEvent MUSIC_DISC_ALPHA = register("music_disc.alpha");
	public static final SoundEvent MUSIC_DISC_THE_END = register("music_disc.the_end");
	public static final SoundEvent MUSIC_DISC_SUBWOOFER_LULLABY = register("music_disc.subwoofer_lullaby");
	public static final SoundEvent MUSIC_DISC_LIVING_MICE = register("music_disc.living_mice");
	public static final SoundEvent MUSIC_DISC_HAGGSTROM = register("music_disc.haggstrom");
	public static final SoundEvent MUSIC_DISC_DANNY = register("music_disc.danny");
	public static final SoundEvent MUSIC_DISC_MUTATION = register("music_disc.mutation");
	public static final SoundEvent MUSIC_DISC_MOOG_CITY_2 = register("music_disc.moog_city_2");
	public static final SoundEvent MUSIC_DISC_BEGINNING_2 = register("music_disc.beginning_2");
	public static final SoundEvent MUSIC_DISC_FLOATING_TREES = register("music_disc.floating_trees");
	public static final SoundEvent MUSIC_DISC_CONCRETE_HALLS = register("music_disc.concrete_halls");
	public static final SoundEvent MUSIC_DISC_DEAD_VOXEL = register("music_disc.dead_voxel");
	public static final SoundEvent MUSIC_DISC_WARMTH= register("music_disc.warmth");
	public static final SoundEvent MUSIC_DISC_BALLAD_OF_THE_CATS = register("music_disc.ballad_of_the_cats");
	public static final SoundEvent MUSIC_DISC_KEY = register("music_disc.key");
	public static final SoundEvent MUSIC_DISC_OXYGENE = register("music_disc.oxygene");
	public static final SoundEvent MUSIC_DISC_DRY_HANDS = register("music_disc.dry_hands");
	public static final SoundEvent MUSIC_DISC_WET_HANDS = register("music_disc.wet_hands");
	public static final SoundEvent MUSIC_DISC_MICE_ON_VENUS = register("music_disc.mice_on_venus");
	public static final SoundEvent MUSIC_DISC_DRAGON_FISH = register("music_disc.dragon_fish");
	public static final SoundEvent MUSIC_DISC_AXOLOTL = register("music_disc.axolotl");
	public static final SoundEvent MUSIC_DISC_SHUNIJI = register("music_disc.shuniji");


	private static SoundEvent register(String name) {
		Identifier id = new Identifier(ExtraDiscs.DOMAIN, name);
		return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
	}
}
