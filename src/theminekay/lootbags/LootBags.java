package theminekay.lootbags;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import theminekay.lootbags.lootbags.register.RegisterlootBags;
import theminekay.lootbags.lootbags.shop.register.RegisterShop;

import java.util.logging.Logger;

public class LootBags extends JavaPlugin {

    private static LootBags lootBags;

    private final Logger log = Logger.getLogger("Minecraft");
    private  Economy econ = null;

    public  Economy getEcon() {
        return econ;
    }

    public static String format(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public static LootBags getLootBags(){
        return lootBags;
    }

    @Override
    public void onEnable() {
        if (!setupEconomy()) {
            log.severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        } else {
            RegisterlootBags.register(this);
            RegisterShop.register(this);
        }
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            System.out.println("test1");
            return false;

        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            System.out.println("test2");
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
}
