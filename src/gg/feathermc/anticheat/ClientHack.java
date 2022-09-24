package gg.feathermc.anticheat;

import gg.feathermc.anticheat.commands.Anticheat;
import gg.feathermc.anticheat.commands.FilterSystem;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ClientHack extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("ClientHack Plugin was Enabled");

        PluginManager pm = Bukkit.getPluginManager();

        getCommand("anticheat").setExecutor(new Anticheat());
        getCommand("ac").setExecutor(new Anticheat());
        getCommand("fs").setExecutor(new FilterSystem());

        pm.registerEvents(new Anticheat(), this);
        pm.registerEvents(new FilterSystem(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("ClientHack Plugin was Disabled");
    }

    @Override
    public void onLoad() {
        System.out.println("ClientHack Plugin was Loaded");
    }
}
