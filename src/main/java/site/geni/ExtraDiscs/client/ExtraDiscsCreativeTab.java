package site.geni.ExtraDiscs.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import site.geni.ExtraDiscs.ExtraDiscs;
import site.geni.ExtraDiscs.init.ExtraDiscsItems;

public class ExtraDiscsCreativeTab extends CreativeTabs {
	public ExtraDiscsCreativeTab() {
		super(ExtraDiscs.MODID);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ExtraDiscsItems.MUSIC_DISC_SWEDEN);
	}
}
