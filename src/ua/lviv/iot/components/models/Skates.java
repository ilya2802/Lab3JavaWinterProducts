package ua.lviv.iot.components.models;

public class Skates extends Equipment {
    private int size;
    private String color;

    public Skates() {
    }

    public Skates(String brand, double price, String forkids) {
        super(brand, price, forkids);

    }

    public int getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }
}
