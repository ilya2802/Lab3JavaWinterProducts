package ua.lviv.iot.components.models;


import ua.lviv.iot.components.Main;

public class Equipment extends Main {
    private String brand;
    private double price;
    public String forkids;

    @Override
    public String toString() {
        return "Equipment{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", forkids=" + forkids +
                '}';
    }

    public Equipment(String brand, double price, String forkids) {
        this.brand = brand;
        this.price = price;
        this.forkids = forkids;

    }

    public Equipment() {

    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String getForkids() {
        return forkids;
    }


    public void setForkids(String forkids) {
        this.forkids = forkids;
    }

}