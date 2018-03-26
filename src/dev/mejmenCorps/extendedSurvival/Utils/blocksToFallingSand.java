package dev.mejmenCorps.extendedSurvival.Utils;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.material.MaterialData;


public class blocksToFallingSand {
    
    public static void dropBlock(Block b) {
        if(b.getType() == Material.CHEST && b.getType() == Material.BEDROCK && b.getType() == Material.FURNACE && b.getType() == Material.PAINTING)
            return;
        
        Block b2 = b;
        b.setType(Material.AIR);
        b2.getWorld().spawnFallingBlock(b2.getLocation(), new MaterialData(b2.getType()));
    }
    
}
