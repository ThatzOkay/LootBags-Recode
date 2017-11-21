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

    private static List<ItemStack> loot = new ArrayList<>();

    public static void setItems(LootBags lb) {
        for(Material m : Material.values()){
            loot.add(new ItemStack(m));
        }
        if(loot.contains(new ItemStack(Material.AIR))) {
            ItemStack air = new ItemStack(Material.AIR);
            loot.remove(air);
        }
        if(loot.contains(new ItemStack(Material.STONE))){
            ItemStack stone = new ItemStack(Material.STONE);
            loot.remove(stone);
            Random rand = new Random();
            int stoneType = rand.nextInt(6);
            stone = new ItemStack(Material.STONE , 1 , (short)stoneType);
            loot.add(stone);
        }
        if (loot.contains(new ItemStack(Material.DIRT))){
            ItemStack dirt = new ItemStack(Material.DIRT);
            loot.remove(dirt);
            Random rand = new Random();
            int dirtType = rand.nextInt(2);
            dirt = new ItemStack(Material.DIRT , 1 , (short)dirtType);
            loot.add(dirt);
        }
        if (loot.contains(new ItemStack(Material.WOOD))){
            ItemStack wood = new ItemStack(Material.WOOD);
            loot.remove(wood);
            Random rand = new Random();
            int dirtType = rand.nextInt(5);
            wood = new ItemStack(Material.WOOD , 1 , (short)dirtType);
            loot.add(wood);
        }
        if(loot.contains(new ItemStack(Material.SAPLING))){
            ItemStack sapling = new ItemStack(Material.SAPLING);
            loot.remove(sapling);
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
        ItemStack lootInBag = loot.get(randomloot);
        ItemStack lootInBag2 = loot.get(randomloot2);
        ItemStack lootInBag3 = loot.get(randomloot3);
        ItemStack lootInBag4 = loot.get(randomloot4);
        ItemStack lootInBag5 = loot.get(randomloot5);
        ItemStack lootInBag6 = loot.get(randomloot6);
        ItemStack lootInBag7 = loot.get(randomloot7);
        ItemStack lootInBag8 = loot.get(randomloot8);
        ItemStack lootInBag9 = loot.get(randomloot9);

        InventoryManager.lootBags.clear();
        Items.setItemMeta();
        InventoryManager.lootBags.setItem(0, lootInBag);
        InventoryManager.lootBags.setItem(1, lootInBag2);
        InventoryManager.lootBags.setItem(2, lootInBag3);
        InventoryManager.lootBags.setItem(3, lootInBag4);
        InventoryManager.lootBags.setItem(4, lootInBag5);
        InventoryManager.lootBags.setItem(5, lootInBag6);
        InventoryManager.lootBags.setItem(6, lootInBag7);
        InventoryManager.lootBags.setItem(7, lootInBag8);
        InventoryManager.lootBags.setItem(8, lootInBag9);
    }
}
