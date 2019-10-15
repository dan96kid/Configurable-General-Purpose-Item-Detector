package dan96kid.cgpid.client.proxy;

import dan96kid.cgpid.common.proxy.CommonProxy;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ConfigurableGeneralPurposeItemDetector.modId + ":" + "id", "inventory"));
	}
}
