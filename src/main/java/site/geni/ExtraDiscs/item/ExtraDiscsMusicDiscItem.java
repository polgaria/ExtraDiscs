package site.geni.ExtraDiscs.item;

import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.ResourceLocation;
import site.geni.ExtraDiscs.ExtraDiscs;
import site.geni.ExtraDiscs.ExtraDiscsSoundEvent;
import site.geni.ExtraDiscs.init.ExtraDiscsItems;

public class ExtraDiscsMusicDiscItem extends MusicDiscItem {
	public ExtraDiscsMusicDiscItem(String name, int comparatorOutput, ExtraDiscsSoundEvent soundEvent, Item.Properties itemProperties) {
		super(comparatorOutput, soundEvent, itemProperties);

		this.setRegistryName(new ResourceLocation(ExtraDiscs.MODID, name));

		ExtraDiscsItems.ITEMS.add(this);
	}
}
