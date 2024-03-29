package dan96kid.cgpid.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import dan96kid.cgpid.ConfigurableGeneralPurposeItemDetector;

public class ItemBase extends Item {
	protected String name;
	
	public ItemBase (String name) {
		this.name = name;
		setTranslationKey(name);
		setRegistryName(name);
	}
	public void registerItemModel() {
		ConfigurableGeneralPurposeItemDetector.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
