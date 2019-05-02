package site.geni.ExtraDiscs;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import site.geni.ExtraDiscs.init.ExtraDiscsSoundEvents;

public class ExtraDiscsSoundEvent extends SoundEvent {
	public ExtraDiscsSoundEvent(String name) {
		super(new ResourceLocation(ExtraDiscs.MODID, name));

		this.setRegistryName(new ResourceLocation(ExtraDiscs.MODID, name));

		ExtraDiscsSoundEvents.SOUND_EVENTS.add(this);
	}
}
