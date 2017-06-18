package theminekay.lootbags.shop.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.milkbowl.vault.economy.Economy;
import theminekay.lootbags.LootBags;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String name, String[] args) {
		if(sender instanceof Player){
			if(cmd.getName().equalsIgnoreCase("lootbagshop") || cmd.getName().equalsIgnoreCase("lbhop")){
				Player player = (Player)sender;
				Economy economy = LootBags.getEcon();
				player.sendMessage("Balance:" + economy.getBalance(player));
			}
		}
		return false;
	}

}
