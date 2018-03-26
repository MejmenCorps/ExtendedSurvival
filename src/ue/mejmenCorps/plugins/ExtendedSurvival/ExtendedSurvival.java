package ue.mejmenCorps.plugins.ExtendedSurvival;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ExtendedSurvival extends JavaPlugin {
    
    @Override
    public void onEnable(){
        Logger logger = Logger.getLogger("Minecraft");
        PluginDescriptionFile pdf = getDescription();
        
        logger.info(pdf.getName() + " is now enabled, be amazed! (" + pdf.getVersion() + "v)");
    }
    
    @Override
    public void onDisable(){
        
    }
}
