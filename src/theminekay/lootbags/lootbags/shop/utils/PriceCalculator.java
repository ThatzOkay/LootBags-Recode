package theminekay.lootbags.lootbags.shop.utils;


import org.bukkit.entity.Player;

import theminekay.lootbags.LootBags;
import theminekay.lootbags.lootbags.shop.inventory.InventoryManager;

public class PriceCalculator {

	public static int lootBagAmount = InventoryManager.lootBagAmount;

	public static double normalPrice = 100.50;
	
	public static double calculatedPrice = normalPrice * lootBagAmount;
	
	public void removeMoney(Player player){
		LootBags.getEcon().depositPlayer(player, calculatedPrice);
	}
}
