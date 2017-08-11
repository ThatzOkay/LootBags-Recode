package theminekay.lootbags.lootbags.commands;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import theminekay.lootbags.LootBags;
import theminekay.lootbags.lootbags.loot.Loot;
import theminekay.lootbags.utils.Items;
import theminekay.lootbags.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Commands implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            if (s.equalsIgnoreCase("lootbags")) {
                Player player = (Player) commandSender;
                if (strings.length == 0) {
                    player.sendMessage(LootBags.format(" &l&6----------------------------------------------"));
                    player.sendMessage(LootBags.format(" &l   &bgive a bag:/lootbags givebag {playername}"));
                    player.sendMessage(LootBags.format("  &l&bremove a bag:/lootbags removebag {playername}"));
                    player.sendMessage(LootBags.format("  &l&bgive a bag to all online player:/lootbags givebagg all"));
                    player.sendMessage(LootBags.format(" &l&6----------------------------------------------"));
                } else {
                    if (strings[0].equalsIgnoreCase("help")) {
                        player.sendMessage(LootBags.format(" &l&6----------------------------------------------"));
                        player.sendMessage(LootBags.format(" &l   &bgive a bag:/lootbags givebag {playername}"));
                        player.sendMessage(LootBags.format("  &l&bremove a bag:/lootbags removebag {playername}"));
                        player.sendMessage(LootBags.format("  &l&bgive a bag to all online player:/lootbags givebagg all"));
                        player.sendMessage(LootBags.format(" &l&6----------------------------------------------"));
                    }
                    if (strings[0].equalsIgnoreCase("givebag") || strings[0].equalsIgnoreCase("gb")) {

                        if (strings.length == 2) {
                            Player targetPlayer = player.getServer().getPlayer(strings[1]);
                            if (targetPlayer != null) {
                                    boolean invFull = Utils.invFull(targetPlayer);
                                    if (!invFull) {
                                        Items.setItemMeta();
                                        targetPlayer.playSound(targetPlayer.getLocation(), Sound.BLOCK_NOTE_PLING, 1, 1);
                                        targetPlayer.sendMessage(LootBags.format("Your recived a LootBag"));
                                        targetPlayer.getInventory().addItem(Items.lootBag);
                                    } else {
                                        Items.setItemMeta();
                                        player.sendMessage(LootBags.format(targetPlayer.getDisplayName() + " Has a full invetory."));
                                    }
                            }else{
                                player.sendMessage(LootBags.format("&f&lPlayer not Found"));
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String name, String[] strings) {
        for(Player p : Bukkit.getOnlinePlayers()){
            List<String> s1 = Arrays.asList("help","givebag" ,"gb", "removebag" , "rb" , "rainbowarmour" , "ra");
            List<String> FList = Lists.newArrayList();
            if(strings.length == 1){
                for(String s : s1){
                    if(s.toLowerCase().startsWith(strings[0].toLowerCase()))FList.add(s);

                }
                return FList;
            }
        }
        return null;
    }
}
