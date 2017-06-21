package theminekay.lootbags.shop.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import theminekay.lootbags.shop.inventory.InventoryManager;

public class OnInvClick implements Listener{

	@EventHandler
	public void on(InventoryClickEvent e){
		
		Inventory inv = e.getInventory();
		if(inv == InventoryManager.lootBagsShop){
			ItemStack item = e.getCurrentItem();
			ItemMeta itemMeta = item.getItemMeta();
			if(item == InventoryManager.add1){
				
			}
		}
		
	}
}
