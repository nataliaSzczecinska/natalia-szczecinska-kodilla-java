package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class Application {
    public static void main (String [] args) {
        Product product1 = new Product("apple", "01.001.001", 1.43);
        Product product2 = new Product("pear", "01.002.001", 2.31);
        Product product3 = new Product("banana", "01.003.001", 3.43);
        Product product4 = new Product("orange", "01.004.001", 2.34);
        Product product5 = new Product("tangerine", "01.005.001", 3.25);
        Product product6 = new Product("cherry", "01.006.001", 13.92);
        Product product7 = new Product("sweet cherry", "01.007.001", 15.75);
        Product product8 = new Product("raspberry", "01.008.001", 8.90);
        Product product9 = new Product("blueberry", "01.009.001", 25.00);
        Product product10 = new Product("strawberry", "01.010.001", 7.99);


        List<Product> producentProductList = new ArrayList<>();
        Set<Product> producentProductSet = new HashSet<>();
        Map<String, Product> producentProductMap = new HashMap<>();

        producentProductList.add(product1);
        producentProductList.add(product2);
        producentProductList.add(product3);

        producentProductSet.add(product4);
        producentProductSet.add(product5);
        producentProductSet.add(product6);
        producentProductSet.add(product7);

        producentProductMap.put(product8.getId(), product8);
        producentProductMap.put(product9.getId(), product9);
        producentProductMap.put(product10.getId(), product10);

        Producent producent1 = new ExtraFoodShop("Extra Food Shop",
                "00-123 Warsaw, Dluga Street 23",
                new EMailInformationService("extra-food-shop@extra-food-shop.com"),
                producentProductMap);
        Producent producent2 = new HealthyShop("Healthy Shop",
                "23-329 Krakow, Glowna Street 123A",
                new EMailInformationService("healthy.shop@healthy-shop.eu"),
                producentProductSet);
        Producent producent3 = new GlutenFreeShop("Gluten Free Shop",
                "28-212 Poznan, Szeroka Street 43/47",
                new EMailInformationService("glutene.free@glutene-free-shop.com"),
                producentProductList);

        User user1 = new User("Jan Kowalski",
                "jan.kowalski",
                "JK 123456", new EMailInformationService("jan.kowalski@interia.pl"));
        User user2 = new User("Anna Kowalczyk",
                "annakowalczyk",
                "AK 123213",
                new EMailInformationService("a.kowalczyk@wp.pl"));
        User user3 = new User("Adam Nowak",
                "adamek1234",
                "AN 948392",
                new EMailInformationService("adamek1234@onet.pl"));

        List<Product> shoppingList1 = new ArrayList<>();
        List<Product> shoppingList2 = new ArrayList<>();
        List<Product> shoppingList3 = new ArrayList<>();

        shoppingList1.add(product1);
        shoppingList1.add(product10);
        shoppingList2.add(product4);
        shoppingList3.add(product8);
        shoppingList3.add(product9);

        System.out.println(producent1.process(new OrderRequest(user1, shoppingList3)));
        System.out.println(producent2.process(new OrderRequest(user2, shoppingList2)));
        System.out.println(producent3.process(new OrderRequest(user3, shoppingList1)));
    }
}
