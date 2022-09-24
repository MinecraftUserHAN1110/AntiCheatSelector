package gg.feathermc.anticheat.api;

import gg.feathermc.anticheat.filter.Filter;
import org.bukkit.entity.Player;

public class FilterAPI {
    private static Player p;
    public FilterAPI(Player p) {
        this.p = p;
    }

    public static final Filter getFilter() {
        return new Filter(p);
    }
}
