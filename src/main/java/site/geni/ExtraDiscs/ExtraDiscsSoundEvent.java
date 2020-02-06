package site.geni.ExtraDiscs;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import site.geni.ExtraDiscs.init.ExtraDiscsSoundEvents;

public class ExtraDiscsSoundEvent extends SoundEvent {
	public ExtraDiscsSoundEvent(ResourceLocation resourceLocation) {
		super(resourceLocation);

		this.setRegistryName(resourceLocation);
		ExtraDiscsSoundEvents.SOUND_EVENTS.add(this);
	}
}
