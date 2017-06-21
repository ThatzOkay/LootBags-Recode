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
		if(inv == InventoryManager.lootBagsShop){
			ItemStack item = e.getCurrentItem();
			if(item == InventoryManager.add1){
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount + 1;
				e.setCancelled(true);
				pirceLore();
			}
			if(item == InventoryManager.add5){
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount + 5;
				e.setCancelled(true);
				pirceLore();
			}
			if(item == InventoryManager.add10){
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount + 10;
				e.setCancelled(true);
				pirceLore();
			}
			if(item == InventoryManager.LootBag){
				e.setCancelled(true);
			}
			if(item == InventoryManager.remove10){
				if(InventoryManager.lootBagAmount == 1){
					e.setCancelled(true);
				}
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount - 10;
				e.setCancelled(true);
				pirceLore();
			}
			if(item == InventoryManager.remove5){
				if(InventoryManager.lootBagAmount == 1){
					e.setCancelled(true);
				}
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount - 5;
				e.setCancelled(true);
				pirceLore();
			}
			if(item == InventoryManager.remove1){
				if(InventoryManager.lootBagAmount == 1){
					e.setCancelled(true);
				}
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount - 1;
				e.setCancelled(true);
				pirceLore();
			}
		}
		
	}
	
	public void pirceLore(){
		ItemMeta meta = InventoryManager.buyMeta;
		List<String> lore = new ArrayList<>();
		lore.add("$" + PriceCalculator.calculatedPrice);
		meta.setLore(lore);
		InventoryManager.buy.setItemMeta(meta);
	}
}
