package ua.lviv.iot.components.models;

public class Sled extends Equipment {
    private String type;
    private String matter;

    public Sled() {
    }

    public Sled(String brand, double price, String forkids) {
        super(brand, price, forkids);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }
}
