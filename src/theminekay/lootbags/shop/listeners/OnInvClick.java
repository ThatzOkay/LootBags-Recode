package theminekay.lootbags.shop.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import theminekay.lootbags.shop.inventory.InventoryManager;
import theminekay.lootbags.shop.utils.PriceCalculator;

public class OnInvClick implements Listener{
	
	@EventHandler
	public void on(InventoryClickEvent e){
		Inventory inv = e.getInventory();
		if(inv.equals(InventoryManager.lootBagsShop)){
			ItemStack item = e.getCurrentItem();
			if(item.getItemMeta().equals(InventoryManager.add1.getItemMeta())){
				
			}
		}
	}
	
	public static void priceLore(){
		ItemMeta meta = InventoryManager.buyMeta;
		List<String> lore = new ArrayList<>();
		lore.clear();
		lore.add("$" + PriceCalculator.calculatedPrice);
		meta.setLore(lore);
		InventoryManager.buy.setItemMeta(meta);
	}
}
