package gg.feathermc.anticheat.commands;

import gg.feathermc.anticheat.utils.AntiCheatUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Anticheat implements CommandExecutor, Listener {
    private Inventory i = Bukkit.createInventory(null, 9);
    ItemStack vanilla = new ItemStack(Material.GRASS);
    ItemStack ncp = new ItemStack(Material.STONE);
    ItemStack aac = new ItemStack(Material.IRON_ORE);
    ItemStack vulcan = new ItemStack(Material.IRON_INGOT);
    ItemStack matrix = new ItemStack(Material.GOLD_INGOT);
    ItemStack intave = new ItemStack(Material.EMERALD);
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            ItemMeta vanillameta = vanilla.getItemMeta();
            vanillameta.setDisplayName(ChatColor.WHITE + "Vanilla");
            vanillameta.setLore(Arrays.asList(ChatColor.AQUA + "version: " + ChatColor.WHITE + "v1_8_R3", ChatColor.AQUA + "Developer(s): " + ChatColor.WHITE +
                    "Mojang"));
            vanilla.setItemMeta(vanillameta);
            i.setItem(0, vanilla);
            ItemMeta ncpmeta = ncp.getItemMeta();
            ncpmeta.setDisplayName(ChatColor.WHITE + "NCP");
            ncpmeta.setLore(Arrays.asList(ChatColor.AQUA + "version: " + ChatColor.WHITE + "Updated-NCP Build 147", ChatColor.AQUA + "Developer(s): " +
                    ChatColor.WHITE + "NoCheat+"));
            ncp.setItemMeta(ncpmeta);
            i.setItem(1, ncp);
            ItemMeta aacmeta = aac.getItemMeta();
            aacmeta.setDisplayName(ChatColor.WHITE + "AAC");
            aacmeta.setLore(Arrays.asList(ChatColor.AQUA + "version:" + ChatColor.WHITE + " 1.9.10", ChatColor.AQUA +
                    "Developer(s): " + ChatColor.WHITE + "Photon, Rqcco, Celebrimbor, Janmm14, geNAZt, Elevated"));
            aac.setItemMeta(aacmeta);
            i.setItem(2, aac);
            ItemMeta vulcanmeta = vulcan.getItemMeta();
            vulcanmeta.setDisplayName(ChatColor.WHITE + "Vulcan");
            vulcanmeta.setLore(Arrays.asList(ChatColor.AQUA + "version: " + ChatColor.WHITE + "2.6.7-HOTFIX1", ChatColor.AQUA +
                    "Developer(s): " + ChatColor.WHITE + "Elevated, Ghast, Joshb_, retrooper (PacketEvents), GladUrBad"));
            vulcan.setItemMeta(vulcanmeta);
            i.setItem(3, vulcan);
            ItemMeta matrixmeta = matrix.getItemMeta();
            matrixmeta.setDisplayName(ChatColor.WHITE + "Matrix");
            matrixmeta.setLore(Arrays.asList(ChatColor.AQUA + "version: " + ChatColor.WHITE + "2.8.4 Trial", ChatColor.AQUA + "Developer(s): " +
                    ChatColor.WHITE + "RE"));
            matrix.setItemMeta(matrixmeta);
            i.setItem(4, matrix);
            ItemMeta intavemeta = intave.getItemMeta();
            intavemeta.setDisplayName(ChatColor.WHITE + "Intave");
            intavemeta.setLore(Arrays.asList(ChatColor.AQUA + "version: " + ChatColor.WHITE + "12.5.5", ChatColor.AQUA + "Developer(s): " +
                    ChatColor.WHITE + "DarkAndBlue, iTz_Lucky, Vento"));
            intave.setItemMeta(intavemeta);
            i.setItem(5, intave);
            p.openInventory(i);
            p.sendMessage(ChatColor.GREEN + "Show Anticheat!");
            return true;
        }

        sender.sendMessage(ChatColor.RED + "You can't use this command on console!");
        return false;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        // if (e.getClickedInventory().equals(i)) {
        //}

        if (e.getClickedInventory().getTitle() == "Chest") {
            if (e.getCurrentItem().getType().equals(Material.GRASS)) {
                p.sendMessage(ChatColor.GREEN + "Anticheat changed to Vanilla!");
                AntiCheatUtils.toVanilla(p);
                e.setCancelled(true);
            }

            if (e.getCurrentItem().getType().equals(Material.STONE)) {
                p.sendMessage(ChatColor.GREEN + "Anticheat changed to NCP!");
                AntiCheatUtils.toNCP(p);
                e.setCancelled(true);
            }

            if (e.getCurrentItem().getType().equals(Material.IRON_ORE)) {
                p.sendMessage(ChatColor.GREEN + "Anticheat changed to AAC!");
                AntiCheatUtils.toAAC(p);
                e.setCancelled(true);
            }

            if (e.getCurrentItem().getType().equals(Material.IRON_INGOT)) {
                p.sendMessage(ChatColor.GREEN + "Anticheat changed to Vulcan");
                AntiCheatUtils.toVulcan(p);
                e.setCancelled(true);
            }

            if (e.getCurrentItem().getType().equals(Material.GOLD_INGOT)) {
                p.sendMessage(ChatColor.GREEN + "Anticheat changed to Matrix");
                AntiCheatUtils.toMatrix(p);
                e.setCancelled(true);
            }

            if (e.getCurrentItem().getType().equals(Material.EMERALD)) {
                p.sendMessage(ChatColor.GREEN + "Anticheat changed to Intave");
                AntiCheatUtils.toIntave(p);
                e.setCancelled(true);
            }
        }
    }


}
