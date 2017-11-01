package theminekay.lootbags.lootbags.register;

import theminekay.lootbags.LootBags;
import theminekay.lootbags.lootbags.commands.Commands;
import theminekay.lootbags.lootbags.events.Events;

public class RegisterlootBags {


    public static void register(LootBags lootBags) {
        lootBags.getCommand("lootbags").setExecutor(new Commands());
        lootBags.getCommand("lootbags").setTabCompleter(new Commands());
        lootBags.getServer().getPluginManager().registerEvents(new Events() , lootBags);
    }
}
