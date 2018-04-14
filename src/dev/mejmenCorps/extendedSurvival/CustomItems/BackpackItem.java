package dev.mejmenCorps.extendedSurvival.CustomItems;

//import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.NamespacedKey;

// u pick the wrong house fool
public class BackpackItem {
ItemStack backpackItem = null;
    public void createBackpack(){
        //creating item
        backpackItem = new ItemStack(Material.CHEST);
        backpackItem.addUnsafeEnchantment(Enchantment.LUCK, 1);
        backpackItem.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);//backpack it
        ItemMeta bMeta = backpackItem.getItemMeta();
        bMeta.setDisplayName("Backpack");
        backpackItem.setItemMeta(bMeta);
        
        //creating crafting shape
        NamespacedKey recipeKey = new NamespacedKey();
        ShapedRecipe backpackCrafting = new ShapedRecipe(,backpackItem);
        
        backpackCrafting.shape("%","%","%");
        backpackCrafting.shape("#","%","#");
        backpackCrafting.shape("%","%","%");
        
        backpackCrafting.setIngredient('%',Material.LEATHER);
        backpackCrafting.setIngredient('#',Material.STRING);
        
    }
}

//plecak ma nazwe i jakis niecodzienny enchant z lvlem reprezentujacym id
