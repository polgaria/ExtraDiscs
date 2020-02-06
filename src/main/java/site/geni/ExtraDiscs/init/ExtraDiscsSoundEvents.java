package site.geni.ExtraDiscs.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import site.geni.ExtraDiscs.ExtraDiscs;
import site.geni.ExtraDiscs.ExtraDiscsSoundEvent;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class ExtraDiscsSoundEvents {
	public static final List<ExtraDiscsSoundEvent> SOUND_EVENTS = new ArrayList<>();

	public static final ExtraDiscsSoundEvent MUSIC_DISC_SWEDEN = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.sweden"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_MINECRAFT = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.minecraft"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_CLARK = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.clark"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_BIOME_FEST = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.biome_fest"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_BLIND_SPOTS = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.blind_spots"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_HAUNT_MUSKIE = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.haunt_muskie"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_ARIA_MATH = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.aria_math"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_DREITON = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.dreiton"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_TASWELL = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.taswell"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_ALPHA = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.alpha"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_THE_END = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.the_end"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_SUBWOOFER_LULLABY = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.subwoofer_lullaby"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_LIVING_MICE = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.living_mice"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_HAGGSTROM = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.haggstrom"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_DANNY = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.danny"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_MUTATION = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.mutation"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_MOOG_CITY_2 = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.moog_city_2"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_BEGINNING_2 = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.beginning_2"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_FLOATING_TREES = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.floating_trees"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_CONCRETE_HALLS = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.concrete_halls"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_DEAD_VOXEL = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.dead_voxel"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_WARMTH = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.warmth"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_BALLAD_OF_THE_CATS = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.ballad_of_the_cats"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_KEY = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.key"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_OXYGENE = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.oxygene"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_DRY_HANDS = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.dry_hands"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_WET_HANDS = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.wet_hands"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_MICE_ON_VENUS = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.mice_on_venus"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_DRAGON_FISH = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.dragon_fish"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_AXOLOTL = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.axolotl"));
	public static final ExtraDiscsSoundEvent MUSIC_DISC_SHUNIJI = new ExtraDiscsSoundEvent(new ResourceLocation(ExtraDiscs.MODID, "music_disc.shuniji"));


	@SuppressWarnings("unused")
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onSoundEventRegistry(final RegistryEvent.Register<SoundEvent> event) {
			for (final SoundEvent soundEvent : SOUND_EVENTS) {
				event.getRegistry().register(soundEvent);
			}
		}
	}
}
