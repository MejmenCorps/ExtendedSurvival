package dev.mejmenCorps.extendedSurvival.CustomItems;

import dev.mejmenCorps.extendedSurvival.CustomItems.BackpackItem;
import org.bukkit.plugin.Plugin;

public class LoadCustomItems {
    public void loadItems(Plugin plugin){
        //backpack
        BackpackItem backpackItem = new BackpackItem();
        backpackItem.createBackpack();
        //other item
        //OtherItem otherItem = new OtherItem();
        //otherItem.createItem();
        //...
    }
}
