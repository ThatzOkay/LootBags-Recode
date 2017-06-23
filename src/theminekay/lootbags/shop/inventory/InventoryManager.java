package theminekay.lootbags.shop.inventory;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import theminekay.lootbags.LootBags;
import theminekay.lootbags.shop.listeners.OnInvClick;

public class InventoryManager {

	public static int lootBagAmount = 1;
	
	public static ItemStack remove10 = new ItemStack(Material.STAINED_GLASS_PANE);
	public static ItemMeta remove10Meta = remove10.getItemMeta();
	public static ItemStack remove5 = new ItemStack(Material.STAINED_GLASS_PANE);
	public static ItemMeta remove5Meta = remove5.getItemMeta();
	public static ItemStack remove1 = new ItemStack(Material.STAINED_GLASS_PANE);
	public static ItemMeta remove1Meta = remove1.getItemMeta();
	public static ItemStack LootBag = new ItemStack(Material.BLAZE_ROD , lootBagAmount);
	public static ItemMeta LootBagMeta = LootBag.getItemMeta();
	public static ItemStack add1 = new ItemStack(Material.STAINED_GLASS_PANE);
	public static ItemMeta add1Meta = add1.getItemMeta();
	public static ItemStack add5 = new ItemStack(Material.STAINED_GLASS_PANE);
	public static ItemMeta add5Meta = add5.getItemMeta();
	public static ItemStack add10 = new ItemStack(Material.STAINED_GLASS_PANE);
	public static ItemMeta add10Meta = add10.getItemMeta();
	public static ItemStack buy = new ItemStack(Material.STAINED_GLASS_PANE);
	public static ItemMeta buyMeta = add10.getItemMeta();
	
	public static Inventory lootBagsShop = Bukkit.createInventory(null, 18 , LootBags.format("&5&lLootBags Shop"));

	public static void setItems() {
		lootBagAmount = 1;
		lootBagsShop.clear();
		OnInvClick.priceLore();
		ArrayList<String> remove10Lore = new ArrayList<>();
		remove10Lore.add("Remove 10");
		remove10Lore.add("LootBags");
		remove10Meta.setDisplayName(LootBags.format("&4Remove 10"));
		remove10Meta.setLore(remove10Lore);
		remove10.setDurability((short) 14);
		remove10.setItemMeta(remove10Meta);
		lootBagsShop.setItem(1, remove10);
		lootBagsShop.setItem(2, remove5);
		lootBagsShop.setItem(3, remove1);
		lootBagsShop.setItem(4, LootBag);
		lootBagsShop.setItem(5, add1);
		lootBagsShop.setItem(6, add5);
		lootBagsShop.setItem(7, add10);
		lootBagsShop.setItem(13, buy);
		
		
	}
	
	public void setLootBag(){
		lootBagsShop.setItem(4, LootBag);
	}

}
