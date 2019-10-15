package dan96kid.cgpid;

import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import dan96kid.cgpid.common.proxy.CommonProxy;

@Mod(modid = ConfigurableGeneralPurposeItemDetector.MODID, name = ConfigurableGeneralPurposeItemDetector.NAME, version = ConfigurableGeneralPurposeItemDetector.VERSION, acceptedMinecraftVersions = ConfigurableGeneralPurposeItemDetector.MC_VERSION, useMetadata = true)
public class ConfigurableGeneralPurposeItemDetector
{
    public static final String MODID = "configurablegpitemdetector";
    public static final String NAME = "Dan96kid's Configurable General Purpose Item Detector";
    public static final String VERSION = "0.01";
    public static final String MC_VERSION = "[1.12.2]";

    private static Logger logger;
    
    @Mod.Instance(MODID)
    public static ConfigurableGeneralPurposeItemDetector instance;
    
    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
    	
    	@SubscribeEvent
    	public static void registerItems(RegistryEvent.Register<Item> event) {
    		ModItems.register(event.getRegistry());
    	}
    	
    	@SubscribeEvent
    	public static void registerItems(ModelRegistryEvent event) {
    		ModItems.registerModels();
    	}
    }
    
    @SidedProxy(serverSide="dan96kid.cgpid.common.proxy.CommonProxy", clientSide="dan96kid.cgpid.client.proxy.ClientProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    { 
        logger = event.getModLog();
        //Temp Console
        System.out.println(NAME + " Pre Initiation");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        //Temp Console
        System.out.println(NAME + " Initiation");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	//Temp Console
    	System.out.println(NAME + " Post Initiation");
    }
}
