package theminekay.lootbags.lootbags.shop.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import theminekay.lootbags.LootBags;
import theminekay.lootbags.lootbags.shop.inventory.InventoryManager;
import theminekay.lootbags.lootbags.shop.utils.PriceCalculator;

public class OnInvClick implements Listener{




	@EventHandler
	public void on(InventoryClickEvent e){
		Inventory inv = e.getInventory();
		if(inv.equals(InventoryManager.lootBagsShop)){
			ItemStack item = e.getCurrentItem();
			Player player = (Player) e.getWhoClicked();

			if (e.getSlotType() == InventoryType.SlotType.OUTSIDE) {
				InventoryManager.lootBagsShop.clear();
				player.closeInventory();
				return;
			}

			if(item.equals(null) || e.getRawSlot() == -999 || e.getCurrentItem() == null){
				e.setCancelled(true);
				return;
			}
			if(item.equals(InventoryManager.remove10)){
				if(InventoryManager.lootBagAmount > 1){
					InventoryManager.lootBagAmount = new Integer(InventoryManager.lootBagAmount - 10);
					setLootBag();
					priceLore();
				}
				if(InventoryManager.lootBagAmount < 1){
					InventoryManager.lootBagAmount = 1;
					priceLore();
					setLootBag();
				}
				e.setCancelled(true);
			}
			if(item.equals(InventoryManager.remove5)){
				if(InventoryManager.lootBagAmount > 1){
					InventoryManager.lootBagAmount = new Integer(InventoryManager.lootBagAmount - 5);
					setLootBag();
					priceLore();
				}
				if(InventoryManager.lootBagAmount < 1){
					InventoryManager.lootBagAmount = 1;
					setLootBag();
					priceLore();
				}
				e.setCancelled(true);
			}
			if(item.equals(InventoryManager.remove1)){
				if(InventoryManager.lootBagAmount > 1){
					InventoryManager.lootBagAmount = new Integer(InventoryManager.lootBagAmount - 1);
					setLootBag();
					priceLore();
				}
				if(InventoryManager.lootBagAmount < 1){
					InventoryManager.lootBagAmount = 1;
					setLootBag();
					priceLore();
				}
				e.setCancelled(true);
			}

			if(item.equals(InventoryManager.buy)){
				e.setCancelled(true);
				ItemStack lootbag = new ItemStack(Material.BLAZE_ROD);
				if(player.getInventory().contains(lootbag)){
					player.sendMessage("lootbags");
					if(lootbag.getAmount() != 64) {
						player.getInventory().addItem(lootbag);
					}else{
						player.sendMessage("TEST");
					}
				}else{
					if(invFull(player)){
						player.sendMessage(LootBags.format("Your Inventory Is Full"));
					}
					return;
				}

			}

			if(item.equals(InventoryManager.add1)){
					InventoryManager.lootBagAmount = new Integer(InventoryManager.lootBagAmount + 1);
				setLootBag();
				priceLore();

				e.setCancelled(true);

			}
			if(item.equals(InventoryManager.add5)){
				InventoryManager.lootBagAmount = new Integer(InventoryManager.lootBagAmount + 5);
				setLootBag();
				priceLore();

			e.setCancelled(true);

		}
			if(item.equals(InventoryManager.add10)){
				InventoryManager.lootBagAmount = new Integer(InventoryManager.lootBagAmount + 10);
				setLootBag();
				priceLore();

			e.setCancelled(true);

		}
			System.out.println(InventoryManager.lootBagAmount + " " + 100.50 * InventoryManager.lootBagAmount + " " + PriceCalculator.normalPrice);
		}
	}

	private void setLootBag() {
		ItemStack lootbag = new ItemStack(Material.BLAZE_ROD , InventoryManager.lootBagAmount);
		InventoryManager.lootBagsShop.remove(lootbag);
		InventoryManager.lootBagsShop.setItem(4 , lootbag);
	}

	public static void priceLore(){
		ItemStack buy = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta buyMeta = buy.getItemMeta();
		buyMeta.setDisplayName(LootBags.format("&8Buy"));
		buy.setDurability((short) 15);
		List<String> lore = new ArrayList<>();
		lore.clear();
		lore.add("$" + PriceCalculator.calculatedPrice);
		buyMeta.setLore(lore);
		buy.setItemMeta(buyMeta);
		InventoryManager.lootBagsShop.remove(buy);
		InventoryManager.lootBagsShop.setItem(15 , buy);
	}

	public boolean invFull(Player player) {
		return player.getInventory().firstEmpty() == -1;
	}
}
