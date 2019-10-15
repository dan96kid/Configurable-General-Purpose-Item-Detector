package dan96kid.cgpid.common.tempitem;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
		public static final ItemBase configItemDetector = new ItemBase("CGPItemDetector").setCreativeTab(CreativeTabs.REDSTONE);
	
		public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				configItemDetector
				);
		}
		public static void registerModels() {
		configItemDetector.registerItemModel();
		}
}
