package com.kodilla.good.patterns.challenges.food2doormistake;

import java.util.*;

public class Application {
    public static void main (String [] args) {
        Product product1 = new Product("apple", "01.001.001", 140.5);
        Product product2 = new Product("pear", "01.002.001", 100.0);
        Product product3 = new Product("banana", "01.003.001", 45.89);
        Product product4 = new Product("orange", "01.004.001", 345.6);
        Product product5 = new Product("tangerine", "01.005.001", 342.5);
        Product product6 = new Product("cherry", "01.006.001", 123.9);
        Product product7 = new Product("sweet cherry", "01.007.001", 543.7);
        Product product8 = new Product("raspberry", "01.008.001", 647.0);
        Product product9 = new Product("blueberry", "01.009.001", 123.4);
        Product product10 = new Product("strawberry", "01.010.001", 231.5);

        Map<String, Product> extraFoodShop = new HashMap<>();
        Map<String, Product> healthyShop = new HashMap<>();
        Map<String, Product> glutenFreeShop = new HashMap<>();

        extraFoodShop.put(product1.getId(), product1);
        extraFoodShop.put(product2.getId(), product2);
        extraFoodShop.put(product3.getId(), product3);
        healthyShop.put(product4.getId(), product4);
        healthyShop.put(product5.getId(), product5);
        healthyShop.put(product6.getId(), product6);
        healthyShop.put(product7.getId(), product7);
        glutenFreeShop.put(product8.getId(), product8);
        glutenFreeShop.put(product9.getId(), product9);
        glutenFreeShop.put(product10.getId(), product10);

        SupplierCompany extraFoodShopCompany = new SupplierCompany("Extra Food Shop",
                "00-123 Warsaw",
                "EFS 01.129.00",
                new ProductDatabase(extraFoodShop),
                new EMailInformationService("extra.food.shop@extra.food.shop.com"));
        SupplierCompany healthyShopCompany = new SupplierCompany("Healthy Shop",
                "12-345 Krakow",
                "HF 01.124.29",
                new ProductDatabase(healthyShop),
                new EMailInformationService("healthyfood@healthyfood.eu"));
        SupplierCompany glutenFreeShopCompany = new SupplierCompany("Gluten-Free Shop",
                "45-389 Poznan",
                "GFS 02.392.10",
                new ProductDatabase(glutenFreeShop),
                new EMailInformationService("gluten-free@gluten-free-shop.com"));


        Map<String, SupplierCompany> supplierCompanyMap = new HashMap<>();
        supplierCompanyMap.put(extraFoodShopCompany.getCompanyId(), extraFoodShopCompany);
        supplierCompanyMap.put(healthyShopCompany.getCompanyId(), healthyShopCompany);
        supplierCompanyMap.put(glutenFreeShopCompany.getCompanyId(), glutenFreeShopCompany);

        SupplierCompanyDatabase supplierCompanyDatabase = new SupplierCompanyDatabase(supplierCompanyMap);

        ProductOrderService productOrderService = new ProductOrderService(supplierCompanyDatabase);

        User user = new User ("Jan Kowalski",
                "jan.kowalski",
                "JK 123456",
                new EMailInformationService("jan.kowalski@op.pl"));

        Product newProduct1 = new Product("apple", "01.001.001", 2.5);
        Product newProduct7 = new Product("sweet cherry", "01.007.001", 1.5);
        Product newProduct8 = new Product("raspberry", "01.008.001", 0.5);

        List<Product> shoppingList = new ArrayList<>();
        shoppingList.add(newProduct1);
        shoppingList.add(newProduct7);
        shoppingList.add(newProduct8);

        OrderRequest orderRequest = new OrderRequest(user, shoppingList);

        System.out.println(productOrderService.orderProcess(orderRequest));
    }
}
