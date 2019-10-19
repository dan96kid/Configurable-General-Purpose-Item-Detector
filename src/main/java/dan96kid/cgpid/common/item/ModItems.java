package dan96kid.cgpid.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.event.RegistryEvent;

public class ModItems {
	
		public static final ItemBase config_gp_item_detector = new ItemBase("CGPItemDetector").setCreativeTab(CreativeTabs.REDSTONE);
	
		public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				config_gp_item_detector
				);
		}
		public static void registerModels() {
		config_gp_item_detector.registerItemModel();
		}
}
