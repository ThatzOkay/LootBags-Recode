package theminekay.lootbags.utils;

import org.bukkit.entity.Player;

public class Utils {
    public static boolean invFull(Player player) {
        return player.getInventory().firstEmpty() == -1;
    }
}
