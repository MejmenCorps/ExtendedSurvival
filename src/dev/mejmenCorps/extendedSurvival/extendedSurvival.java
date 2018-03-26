package dev.mejmenCorps.extendedSurvival;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class extendedSurvival extends JavaPlugin {
    
    @Override
    public void onEnable(){
        Logger logger = Logger.getLogger("Minecraft");
        PluginDescriptionFile pdf = getDescription();
        
        logger.info(pdf.getName() + " is now enabled, be amazed! (" + pdf.getVersion() + "v)");
    }
    
    @Override
    public void onDisable(){
        Logger logger = Logger.getLogger("Minecraft");
        PluginDescriptionFile pdf = getDescription();
        
        logger.info("[" + pdf.getName() + "] nooooo Master whyyyyyy?!");
    }
}
