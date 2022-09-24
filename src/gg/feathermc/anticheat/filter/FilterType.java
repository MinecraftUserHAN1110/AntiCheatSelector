package gg.feathermc.anticheat.filter;

public enum FilterType {
    EVENT("Event Filter", 1, "Event Filter disable bukkit event"),
    PACKET("Packet Filter", 2, "Packet Filter disable protocollib packet event");

    private String name;
    private int id;
    private String description;
    private FilterType(String name, int id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public int getID() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
