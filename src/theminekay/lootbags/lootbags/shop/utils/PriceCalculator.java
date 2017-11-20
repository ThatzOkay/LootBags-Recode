package theminekay.lootbags.lootbags.shop.utils;


import org.bukkit.entity.Player;
import theminekay.lootbags.LootBags;
import theminekay.lootbags.lootbags.shop.inventory.InventoryManager;

public class PriceCalculator {


    public static double normalPrice = 100.50;

    public static double calculatePrice() {
        double normalPrice = 100.50;
        double lootBagAmount = InventoryManager.lootBagAmount;
        return normalPrice * lootBagAmount;
    }

    public void removeMoney(Player player, LootBags lb) {
        lb.getEcon().depositPlayer(player, calculatePrice());
    }
}
