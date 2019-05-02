package site.geni.ExtraDiscs.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import site.geni.ExtraDiscs.ExtraDiscs;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(ExtraDiscs.MODID, id), "inventory"));
	}
}
