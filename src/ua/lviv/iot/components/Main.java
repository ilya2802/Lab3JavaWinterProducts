package ua.lviv.iot.components;


import ua.lviv.iot.components.manager.Manager;
import ua.lviv.iot.components.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<Equipment> products = new ArrayList<>();
            products.add(new Baffy("GM", 300, "yes"));
            products.add(new Sled("handmade", 400, "yes"));
            products.add(new ChildrensSkiing("snowman", 1000, "no"));
            products.add(new Skates("hq", 500, "no"));
            products.add(new SkiingBoots("terranova", 600, "yes"));

            Manager manager = new Manager(products);
            System.out.println("sorted price :");
            System.out.println(manager.sortByPrice(true));


            System.out.println("sorted brand :");
            System.out.println(manager.sortByProductName(true));

            System.out.println("sorted forkids:");
            System.out.println(manager.sortByType(true));
        }
    }
