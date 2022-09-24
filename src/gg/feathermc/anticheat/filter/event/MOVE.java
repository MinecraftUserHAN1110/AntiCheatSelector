package gg.feathermc.anticheat.filter.event;

import gg.feathermc.anticheat.filter.Filter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MOVE extends Filter implements Listener {
    private static final MOVE move = new MOVE(getInstanceMove().movePlayer);
    private Player movePlayer;
    public MOVE(Player p) {
        this.movePlayer = p;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (getFilterUsingPlayer().getName() == p.getName()) {
                if (this.isCancelled()) {
                    e.setCancelled(true);
                    return;
                }
            }
        }
    }

    public static final MOVE getInstanceMove() {
        return move;
    }
}
