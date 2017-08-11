package theminekay.lootbags.lootbags.loot;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import theminekay.lootbags.lootbags.ivnetory.InventoryManager;
import theminekay.lootbags.utils.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Loot {

    public static List<ItemStack> loot = new ArrayList<>();

    public static void setItems(){
        Random rand = new Random();
        short data = ((short) rand.nextInt(15));
        int amount = rand.nextInt(7) + 1;
        int amount2 = rand.nextInt(7) + 1;
        int amount3 = rand.nextInt(7) + 1;
        int amount4 = rand.nextInt(7) + 1;
        int amount5 = rand.nextInt(7) + 1;
        int amount6 = rand.nextInt(7) + 1;
        int amount7 = rand.nextInt(7) + 1;
        int amount8 = rand.nextInt(7) + 1;
        int amount9 = rand.nextInt(7) + 1;
        loot.add(new ItemStack(Material.ACACIA_DOOR_ITEM , amount));
        loot.add(new ItemStack(Material.ACACIA_FENCE , amount2));
        loot.add(new ItemStack(Material.ACACIA_FENCE_GATE , amount3));
        loot.add(new ItemStack(Material.ACACIA_STAIRS , amount4));
        loot.add(new ItemStack(Material.ACTIVATOR_RAIL , amount5));
        loot.add(new ItemStack(Material.ANVIL));
        loot.add(new ItemStack(Material.APPLE , amount6));
        loot.add(new ItemStack(Material.ARMOR_STAND));
        loot.add(new ItemStack(Material.ARROW , amount7));
        loot.add(new ItemStack(Material.BAKED_POTATO , amount8));
        loot.add(new ItemStack(Material.BANNER , amount9 , data));
        loot.add(new ItemStack(Material.BEACON));
        loot.add(new ItemStack(Material.BED , 1 , data));
        loot.add(new ItemStack(Material.BEETROOT , amount));
        loot.add(new ItemStack(Material.BEETROOT_SEEDS , amount2));
        loot.add(new ItemStack(Material.BEETROOT_SOUP));
        loot.add(new ItemStack(Material.BIRCH_DOOR_ITEM , amount3));



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

        System.out.println(amount + "  " + amount2 + "  " +amount3 + "  " +amount4 + "  " +amount5 + "  " +amount6 + "  " +amount7 + "  " +amount8 + "  " +amount9);
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
