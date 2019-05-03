package site.geni.ExtraDiscs.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import site.geni.ExtraDiscs.ExtraDiscs;
import site.geni.ExtraDiscs.init.ExtraDiscsItems;

public class ExtraDiscsItemRecord extends ItemRecord {
	private String name;

	public ExtraDiscsItemRecord(String name, SoundEvent sound) {
		super(name, sound);

		this.name = name;

		this.setTranslationKey("record");
		this.setRegistryName(new ResourceLocation(ExtraDiscs.MODID, name));
		this.setCreativeTab(CreativeTabs.MISC);

		ExtraDiscsItems.ITEMS.add(this);
	}

	public void registerItemModel() {
		ExtraDiscs.proxy.registerItemRenderer(this, 0, this.name);
	}
}
