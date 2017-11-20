package theminekay.lootbags.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import theminekay.lootbags.LootBags;
import theminekay.lootbags.lootbags.loot.Loot;

import java.util.ArrayList;

public class Items {


    public static ItemStack lootBag = new ItemStack(Material.BLAZE_ROD);
    public static ItemMeta lootBagMeta = lootBag.getItemMeta();
    private static ArrayList<String> lootBagLore = new ArrayList<>();

    public static void setItemMeta() {
        lootBagLore.clear();
        lootBagLore.add(LootBags.format("&FUse right mouse click"));
        lootBagLore.add(LootBags.format("&FTo open this LootBag"));
        lootBagMeta.setLore(lootBagLore);
        lootBagMeta.addEnchant(Enchantment.DURABILITY, 1, true);
        lootBagMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        lootBagMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.AQUA + "LootBag");
        lootBag.setItemMeta(lootBagMeta);
    }
}
