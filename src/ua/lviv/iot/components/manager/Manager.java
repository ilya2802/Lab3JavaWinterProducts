package ua.lviv.iot.components.manager;

import ua.lviv.iot.components.models.Equipment;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {
    private List<Equipment> products;

    public Manager(List<Equipment> products) {
        this.products = products;
    }

    public List<Equipment> sortByPrice(boolean reverse) {

        if (reverse) {
            Collections.sort(products, Comparator.comparing(Equipment::getPrice).reversed());
        } else {
            Collections.sort(products, Comparator.comparing(Equipment::getPrice));
        }
        return products;

    }

    public List<Equipment> sortByProductName(boolean reverse) {
        if (reverse)
            Collections.sort(products, Comparator.comparing(Equipment::getBrand).reversed());
        else {
            Collections.sort(products, Comparator.comparing(Equipment::getPrice));
        }

        return products;
    }

    public List<Equipment> sortByType(boolean reverse) {
        if (reverse)
            Collections.sort(products, Comparator.comparing(Equipment::getForkids).reversed());
        else {
            Collections.sort(products, Comparator.comparing(Equipment::getForkids));

        }

        return products;
    }
}

