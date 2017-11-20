package theminekay.lootbags.lootbags.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import theminekay.lootbags.LootBags;
import theminekay.lootbags.lootbags.inventory.InventoryManager;
import theminekay.lootbags.lootbags.loot.Loot;
import theminekay.lootbags.utils.Items;

public class Events implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        LootBags lb = LootBags.getLootBags();
        if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getType() == Material.BLAZE_ROD
                    && player.getInventory().getItemInMainHand().getItemMeta().equals(Items.lootBagMeta)) {
                Loot.setItems(lb);
                player.openInventory(InventoryManager.lootBags);
                player.getInventory().removeItem(Items.lootBag);

            }
        } else {
            if (player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getType() == Material.BLAZE_ROD
                    && player.getInventory().getItemInMainHand().getItemMeta().equals(Items.lootBagMeta)) {
                e.setCancelled(true);
            }
        }

    }
}
