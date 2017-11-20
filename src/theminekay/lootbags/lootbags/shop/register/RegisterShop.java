package theminekay.lootbags.lootbags.shop.register;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import theminekay.lootbags.lootbags.shop.commands.Commands;
import theminekay.lootbags.lootbags.shop.listeners.OnInvClick;

public class RegisterShop {

    public static void register(JavaPlugin plugin) {
        Bukkit.getPluginManager().registerEvents(new OnInvClick(), plugin);
        plugin.getCommand("lootbagshop").setExecutor(new Commands());
    }

}
