package ua.lviv.iot.components.models;

public class SkiingBoots extends Equipment {
    private int size;
    private String textile;

    public SkiingBoots() {
    }

    public SkiingBoots(String brand, double price, String forkids) {
        super(brand, price, forkids);

    }

    private int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTextile() {
        return textile;
    }

    public void setTextile() {
        this.textile = textile;
    }
}

