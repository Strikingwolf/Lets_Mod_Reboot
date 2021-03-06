package mods.letsmodreboot.handler;

import java.io.File;

import mods.letsmodreboot.reference.ConfigSettings;
import mods.letsmodreboot.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {

        //create configuration object from the given file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        ConfigSettings.LOVE_POTION_ID = configuration.getInt("lovePotionId", Configuration.CATEGORY_GENERAL, 26, 26, 31, "ID for the love potion effect.");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}