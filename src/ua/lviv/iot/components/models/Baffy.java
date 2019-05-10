package ua.lviv.iot.components.models;

public class Baffy extends Equipment {
    private String material;
    private int varranty;

    public Baffy() {
    }

    public Baffy(String brand, double price, String forkids) {
        super(brand, price, forkids);
    }

    public int getVarranty() {
        return varranty;
    }

    public void setVarranty(int varranty) {
        this.varranty = varranty;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

