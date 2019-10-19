package dan96kid.cgpid.client.proxy;

import dan96kid.cgpid.ConfigurableGeneralPurposeItemDetector;
import dan96kid.cgpid.common.proxy.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ConfigurableGeneralPurposeItemDetector.MODID + ":" + "id", "inventory"));
	}
}
