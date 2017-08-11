package theminekay.lootbags;

import java.util.logging.Logger;

import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.economy.Economy;
import theminekay.lootbags.lootbags.register.RegisterlootBags;

public class LootBags extends JavaPlugin{

    private static final Logger log = Logger.getLogger("Minecraft");
    private static Economy econ = null;
    
    public static Economy getEcon(){
    	return econ;
    }
	
    @Override
    public void onEnable() {
        if (!setupEconomy() ) {
            log.severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }else{
            RegisterlootBags.register(this);
        }
    }
    
    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

	public static String format(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}
}
