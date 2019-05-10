package ua.lviv.iot.components.models;

public class ChildrensSkiing extends Equipment {
    private double length;
    private int year;

    public ChildrensSkiing() {
    }

    public ChildrensSkiing(String brand, double price, String forkids) {
        super(brand, price, forkids);

    }

    public double getLength() {
        return length;
    }

    public void setLength() {
        this.length = length;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }
}
