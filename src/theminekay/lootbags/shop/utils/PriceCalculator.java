package theminekay.lootbags.shop.utils;


import org.bukkit.entity.Player;

import theminekay.lootbags.LootBags;
import theminekay.lootbags.shop.inventory.InventoryManager;

public class PriceCalculator {

	public static int normalPrice = (int) 100.50;
	
	public static double calculatedPrice = new Double(normalPrice * InventoryManager.lootBagAmount);
	
	public void removeMoney(Player player){
		LootBags.getEcon().depositPlayer(player, calculatedPrice);
	}
}
