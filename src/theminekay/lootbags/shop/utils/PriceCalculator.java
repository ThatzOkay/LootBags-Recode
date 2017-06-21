package theminekay.lootbags.shop.utils;


import org.bukkit.entity.Player;

import theminekay.lootbags.LootBags;
import theminekay.lootbags.shop.inventory.InventoryManager;

public class PriceCalculator {

	private static double normalPrice = 100.50;
	
	public static double calculatedPrice = normalPrice * InventoryManager.lootBagAmount;
	
	public void removeMoney(Player player){
		LootBags.getEcon().depositPlayer(player, calculatedPrice);
	}
}
