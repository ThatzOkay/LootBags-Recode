package theminekay.lootbags.shop.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import net.milkbowl.vault.economy.Economy;
import theminekay.lootbags.LootBags;
import theminekay.lootbags.shop.inventory.InventoryManager;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String name, String[] args) {
		if(sender instanceof Player){
			if(cmd.getName().equalsIgnoreCase("lootbagshop") || cmd.getName().equalsIgnoreCase("lbhop")){
				Player player = (Player)sender;
				Economy economy = LootBags.getEcon();
				Inventory shop = InventoryManager.lootBagsShop;
				player.sendMessage("Balance:" + economy.getBalance(player));
				InventoryManager.setItems();
				player.openInventory(shop);
				player.playSound(player.getLocation(), Sound.BLOCK_NOTE_PLING, 1, 1);
			}
		}
		return true;
	}

}
