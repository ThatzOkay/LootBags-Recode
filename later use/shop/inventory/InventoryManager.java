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
	public static ItemStack lootBag = new ItemStack(Material.BLAZE_ROD , lootBagAmount);
	public static ItemMeta lootBagMeta = lootBag.getItemMeta();
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
		remove10Meta.setDisplayName(LootBags.format("&4Remove 10"));
		remove10.setDurability((short) 14);
		remove10.setItemMeta(remove10Meta);
		lootBagsShop.setItem(1, remove10);		
		remove5Meta.setDisplayName(LootBags.format("&4Remove 5"));
		remove5.setDurability((short) 14);
		remove5.setItemMeta(remove5Meta);
		lootBagsShop.setItem(2, remove5);
		ArrayList<String> remove1Lore = new ArrayList<>();
		remove1Lore.add(LootBags.format("&4Remove 1 Lootbags"));
		remove1Meta.setDisplayName(LootBags.format("&4Remove 1"));
		remove1.setDurability((short) 14);
		remove1.setItemMeta(remove1Meta);
		lootBagsShop.setItem(3, remove1);
		
		lootBagsShop.setItem(4, lootBag);
		add1Meta.setDisplayName(LootBags.format("&2Add 1"));
		add1.setDurability((short) 5);
		add1.setItemMeta(add1Meta);
		lootBagsShop.setItem(5, add1);
		add5Meta.setDisplayName(LootBags.format("&2Add 5"));
		add5.setDurability((short) 5);
		add5.setItemMeta(add5Meta);
		lootBagsShop.setItem(6, add5);
		add10Meta.setDisplayName(LootBags.format("&2Add 10"));
		add10.setDurability((short) 5);
		add10.setItemMeta(add10Meta);
		lootBagsShop.setItem(7, add10);
		buyMeta.setDisplayName(LootBags.format("&8Buy"));
		buy.setDurability((short) 15);
		buy.setItemMeta(buyMeta);
		lootBagsShop.setItem(13, buy);
		
		
	}

}
