package gg.feathermc.anticheat.filter;

import org.bukkit.entity.Player;

public class Filter {
    private FilterType type;
    private String filterName;
    private int filterID;

    private boolean cancelled;

    private Player p;

    protected Filter(FilterType type, String filterName, int filterID) {
        this.type = type;
        this.filterName = filterName;
        this.filterID = filterID;
    }

    public Filter() {}

    public Filter(Player p) {
        this.p = p;
    }

    public Player getFilterUsingPlayer() {
        return p;
    }

    public FilterType getFilterType() {
        return type;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public int getFilterID() {
        return filterID;
    }

    public Filter getInstance() {
        return new Filter();
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public boolean isFilterName(String name) {
        return getFilterName() == name;
    }

    public boolean isFilterID(int id) {
        return getFilterID() == id;
    }
}
