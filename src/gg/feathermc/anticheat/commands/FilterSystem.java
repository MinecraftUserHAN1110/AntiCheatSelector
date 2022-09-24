package gg.feathermc.anticheat.commands;

import gg.feathermc.anticheat.api.FilterAPI;
import gg.feathermc.anticheat.filter.event.MOVE;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class FilterSystem implements CommandExecutor, Listener {
    Inventory i = Bukkit.createInventory(null, 9, "Filter Handler");
    ItemStack move = new ItemStack(Material.EMERALD_BLOCK);
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            ItemMeta movemeta = move.getItemMeta();
            movemeta.setDisplayName(ChatColor.WHITE + "PlayerMoveEvent");
            movemeta.setLore(Arrays.asList(
                    ChatColor.AQUA + "Type: " + ChatColor.WHITE + MOVE.getInstanceMove().getFilterType() + "",
                    ChatColor.AQUA + "Packet: " + ChatColor.WHITE + "C04PacketPlayerPosition, C06PacketPlayerPositionLook",
                    ChatColor.AQUA + "Description: event sending on move or rotations change"
            ));
            move.setItemMeta(movemeta);
            i.setItem(1, move);
            p.openInventory(i);
        }
        return false;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getClickedInventory().getName().equalsIgnoreCase("Filter Handler")) {
            if (e.getCurrentItem().getType().equals(move)) {
                FilterAPI.getFilter().setCancelled(true);
                p.sendMessage("PlayerMoveEvent Enabled!");
            }
        }
    }
}
