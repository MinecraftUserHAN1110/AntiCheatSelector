package gg.feathermc.anticheat.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class AntiCheatUtils {
    public static void disableNCP(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.bypass true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.bypass.* true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.checks true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.checks.* true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.notify false");
    }

    public static void enableNCP(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.bypass false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.bypass.* false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.checks false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.checks.* false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set nocheatplus.notify true");
    }

    public static void enableAAC(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set aac.bypass false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set aac.bypass.* false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set aac.alerts true");
    }
    public static void disableAAC(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set aac.bypass true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set aac.bypass.* true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set aac.alerts false");
    }
    public static void enableVulcan(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set vulcan.bypass false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set vulcan.bypass.* false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set vulcan.alerts true");
    }

    public static void disableVulcan(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set vulcan.bypass true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set vulcan.bypass.* true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set vulcan.alerts false");
    }

    public static void enableVerus() {}
    public static void disableVerus() {}
    public static void enableWatchdog(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set watchdog.fullbypass false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set watchdog.notify true");

    }
    public static void disableWatchdog(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set watchdog.fullbypass true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set watchdog.notify false");
    }
    public static void enableMatrix(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set matrix.notify true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set matrix.checks false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set matrix.checks.* false");
    }
    public static void disableMatrix(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set matrix.notify false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set matrix.checks true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set matrix.checks.* true");
    }
    public static void enableAlice() {}
    public static void disableAlice() {}

    public static void disableIntave(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set intave.bypass true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set intave.bypass.* true");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set intave.admin.verbose false");
    }

    public static void enableIntave(Player p) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set intave.bypass false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set intave.bypass.* false");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + p.getName() + " permission set intave.admin.verbose true");
    }

    public static void toNCP(Player p) {
        enableNCP(p);
        disableAAC(p);
        disableWatchdog(p);
        disableVulcan(p);
        disableMatrix(p);
        disableIntave(p);
    }

    public static void toVanilla(Player p) {
        disableNCP(p);
        disableAAC(p);
        disableWatchdog(p);
        disableVulcan(p);
        disableMatrix(p);
        disableIntave(p);
    }

    public static void toAAC(Player p) {
        disableNCP(p);
        enableAAC(p);
        disableWatchdog(p);
        disableVulcan(p);
        disableMatrix(p);
        disableIntave(p);
    }

    public static void toVulcan(Player p) {
        enableVulcan(p);
        disableAAC(p);
        disableNCP(p);
        disableWatchdog(p);
        disableMatrix(p);
        disableIntave(p);
    }

    public static void toMatrix(Player p) {
        disableVulcan(p);
        disableAAC(p);
        disableNCP(p);
        disableWatchdog(p);
        enableMatrix(p);
        disableIntave(p);
    }

    public static void toIntave(Player p) {
        disableVulcan(p);
        disableAAC(p);
        disableNCP(p);
        disableWatchdog(p);
        disableMatrix(p);
        enableIntave(p);
    }
}
