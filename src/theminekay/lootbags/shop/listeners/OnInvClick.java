package theminekay.lootbags.shop.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import theminekay.lootbags.LootBags;
import theminekay.lootbags.shop.inventory.InventoryManager;
import theminekay.lootbags.shop.utils.PriceCalculator;

public class OnInvClick implements Listener{
	
	@EventHandler
	public void on(InventoryClickEvent e){
		int lootBagAmount = InventoryManager.lootBagAmount;
		Inventory inv = e.getInventory();
		Player player = (Player) e.getWhoClicked();
		if(inv.equals(InventoryManager.lootBagsShop)){
			ItemStack item = e.getCurrentItem();
			if(item.equals(InventoryManager.add1)){
				lootBagAmount = new Integer(lootBagAmount + 1);
				e.setCancelled(true);
				System.out.println(InventoryManager.lootBagAmount);
				priceLore();
			}
			if(item.equals(InventoryManager.add5)){
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount + 10;
				e.setCancelled(true);
				priceLore();
			}
			if(item.equals(InventoryManager.add10)){
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount + 10;
				e.setCancelled(true);
				priceLore();
			}
			if(item.equals(InventoryManager.LootBag)){
				e.setCancelled(true);
			}
			if(item.equals(InventoryManager.remove10)){
				if(InventoryManager.lootBagAmount == 1){
					e.setCancelled(true);
				}
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount - 10;
				e.setCancelled(true);
				priceLore();
			}
			if(item.equals(InventoryManager.remove5)){
				if(InventoryManager.lootBagAmount == 1){
					e.setCancelled(true);
				}
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount - 5;
				e.setCancelled(true);
				priceLore();
			}
			if(item.equals(InventoryManager.remove1)){
				if(InventoryManager.lootBagAmount == 1){
					e.setCancelled(true);
				}
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount - 1;
				e.setCancelled(true);
				priceLore();
			}		
			if(item.equals(InventoryManager.buy)){
				e.setCancelled(true);
			}
			/*if(item.equals(InventoryManager.buy)){
				InventoryManager.lootBagAmount = InventoryManager.lootBagAmount - 1;
				e.setCancelled(true);
				if(LootBags.getEcon().getBalance(player) <= PriceCalculator.calculatedPrice)
				LootBags.getEcon().withdrawPlayer(player, PriceCalculator.calculatedPrice);
				ItemStack lootBag = new ItemStack(Material.BLAZE_ROD, InventoryManager.lootBagAmount);
				player.getInventory().addItem(lootBag);
			}else{
				player.sendMessage("");
			}*/
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
