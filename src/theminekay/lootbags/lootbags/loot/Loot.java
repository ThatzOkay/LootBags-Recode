package theminekay.lootbags.lootbags.loot;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import theminekay.lootbags.LootBags;
import theminekay.lootbags.lootbags.inventory.InventoryManager;
import theminekay.lootbags.utils.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Loot {

    private static List<Material> loot = new ArrayList<>();

    public static void setItems(LootBags lb) {
        for(Material m : Material.values()){
            loot.add(m);
        }
        if(loot.contains(Material.AIR)) {
            loot.remove(Material.AIR);
        }



        Random random = new Random();
        int randomloot = random.nextInt(loot.size());
        int randomloot2 = random.nextInt(loot.size());
        int randomloot3 = random.nextInt(loot.size());
        int randomloot4 = random.nextInt(loot.size());
        int randomloot5 = random.nextInt(loot.size());
        int randomloot6 = random.nextInt(loot.size());
        int randomloot7 = random.nextInt(loot.size());
        int randomloot8 = random.nextInt(loot.size());
        int randomloot9 = random.nextInt(loot.size());
        Material lootInBag = loot.get(randomloot);
        Material lootInBag2 = loot.get(randomloot2);
        Material lootInBag3 = loot.get(randomloot3);
        Material lootInBag4 = loot.get(randomloot4);
        Material lootInBag5 = loot.get(randomloot5);
        Material lootInBag6 = loot.get(randomloot6);
        Material lootInBag7 = loot.get(randomloot7);
        Material lootInBag8 = loot.get(randomloot8);
        Material lootInBag9 = loot.get(randomloot9);
        System.out.println(lootInBag.getData().getName() + lootInBag2.getData().getName() + lootInBag3.getData().getName()
                + lootInBag4.getData().getName() + lootInBag5.getData().getName() + lootInBag6.getData().getName()
                + lootInBag7.getData().getName() + lootInBag8.getData().getName() + lootInBag9.getData().getName());
        InventoryManager.lootBags.clear();
        Items.setItemMeta();
        InventoryManager.lootBags.setItem(0, new ItemStack(lootInBag));
        InventoryManager.lootBags.setItem(1, new ItemStack(lootInBag2));
        InventoryManager.lootBags.setItem(2, new ItemStack(lootInBag3));
        InventoryManager.lootBags.setItem(3, new ItemStack(lootInBag4));
        InventoryManager.lootBags.setItem(4, new ItemStack(lootInBag5));
        InventoryManager.lootBags.setItem(5, new ItemStack(lootInBag6));
        InventoryManager.lootBags.setItem(6, new ItemStack(lootInBag7));
        InventoryManager.lootBags.setItem(7, new ItemStack(lootInBag8));
        InventoryManager.lootBags.setItem(8,new ItemStack( lootInBag9));
    }
}
