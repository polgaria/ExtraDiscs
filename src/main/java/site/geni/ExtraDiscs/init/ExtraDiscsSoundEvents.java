package site.geni.ExtraDiscs.init;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import site.geni.ExtraDiscs.ExtraDiscs;
import site.geni.ExtraDiscs.ExtraDiscsSoundEvent;

import java.util.ArrayList;
import java.util.List;

public class ExtraDiscsSoundEvents {
	public static final List<SoundEvent> SOUND_EVENTS = new ArrayList<>();

	public static final SoundEvent MUSIC_DISC_SWEDEN = new ExtraDiscsSoundEvent("music_disc.sweden");
	public static final SoundEvent MUSIC_DISC_MINECRAFT = new ExtraDiscsSoundEvent("music_disc.minecraft");
	public static final SoundEvent MUSIC_DISC_CLARK = new ExtraDiscsSoundEvent("music_disc.clark");
	public static final SoundEvent MUSIC_DISC_BIOME_FEST = new ExtraDiscsSoundEvent("music_disc.biome_fest");
	public static final SoundEvent MUSIC_DISC_BLIND_SPOTS = new ExtraDiscsSoundEvent("music_disc.blind_spots");
	public static final SoundEvent MUSIC_DISC_HAUNT_MUSKIE = new ExtraDiscsSoundEvent("music_disc.haunt_muskie");
	public static final SoundEvent MUSIC_DISC_ARIA_MATH = new ExtraDiscsSoundEvent("music_disc.aria_math");
	public static final SoundEvent MUSIC_DISC_DREITON = new ExtraDiscsSoundEvent("music_disc.dreiton");
	public static final SoundEvent MUSIC_DISC_TASWELL = new ExtraDiscsSoundEvent("music_disc.taswell");
	public static final SoundEvent MUSIC_DISC_ALPHA = new ExtraDiscsSoundEvent("music_disc.alpha");
	public static final SoundEvent MUSIC_DISC_THE_END = new ExtraDiscsSoundEvent("music_disc.the_end");
	public static final SoundEvent MUSIC_DISC_SUBWOOFER_LULLABY = new ExtraDiscsSoundEvent("music_disc.subwoofer_lullaby");
	public static final SoundEvent MUSIC_DISC_LIVING_MICE = new ExtraDiscsSoundEvent("music_disc.living_mice");
	public static final SoundEvent MUSIC_DISC_HAGGSTROM = new ExtraDiscsSoundEvent("music_disc.haggstrom");
	public static final SoundEvent MUSIC_DISC_DANNY = new ExtraDiscsSoundEvent("music_disc.danny");
	public static final SoundEvent MUSIC_DISC_MUTATION = new ExtraDiscsSoundEvent("music_disc.mutation");
	public static final SoundEvent MUSIC_DISC_MOOG_CITY_2 = new ExtraDiscsSoundEvent("music_disc.moog_city_2");
	public static final SoundEvent MUSIC_DISC_BEGINNING_2 = new ExtraDiscsSoundEvent("music_disc.beginning_2");
	public static final SoundEvent MUSIC_DISC_FLOATING_TREES = new ExtraDiscsSoundEvent("music_disc.floating_trees");
	public static final SoundEvent MUSIC_DISC_CONCRETE_HALLS = new ExtraDiscsSoundEvent("music_disc.concrete_halls");
	public static final SoundEvent MUSIC_DISC_DEAD_VOXEL = new ExtraDiscsSoundEvent("music_disc.dead_voxel");
	public static final SoundEvent MUSIC_DISC_WARMTH = new ExtraDiscsSoundEvent("music_disc.warmth");
	public static final SoundEvent MUSIC_DISC_BALLAD_OF_THE_CATS = new ExtraDiscsSoundEvent("music_disc.ballad_of_the_cats");
	public static final SoundEvent MUSIC_DISC_KEY = new ExtraDiscsSoundEvent("music_disc.key");
	public static final SoundEvent MUSIC_DISC_OXYGENE = new ExtraDiscsSoundEvent("music_disc.oxygene");
	public static final SoundEvent MUSIC_DISC_DRY_HANDS = new ExtraDiscsSoundEvent("music_disc.dry_hands");
	public static final SoundEvent MUSIC_DISC_WET_HANDS = new ExtraDiscsSoundEvent("music_disc.wet_hands");
	public static final SoundEvent MUSIC_DISC_MICE_ON_VENUS = new ExtraDiscsSoundEvent("music_disc.mice_on_venus");
	public static final SoundEvent MUSIC_DISC_DRAGON_FISH = new ExtraDiscsSoundEvent("music_disc.dragon_fish");
	public static final SoundEvent MUSIC_DISC_AXOLOTL = new ExtraDiscsSoundEvent("music_disc.axolotl");
	public static final SoundEvent MUSIC_DISC_SHUNIJI = new ExtraDiscsSoundEvent("music_disc.shuniji");

	@Mod.EventBusSubscriber(modid = ExtraDiscs.MODID)
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerSoundEvents(final RegistryEvent.Register<SoundEvent> event) {
			for (SoundEvent soundEvent : SOUND_EVENTS) {
				event.getRegistry().register(soundEvent);
			}
		}
	}
}
