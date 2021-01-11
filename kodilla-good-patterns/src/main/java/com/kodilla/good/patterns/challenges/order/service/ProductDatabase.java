package com.kodilla.good.patterns.challenges.order.service;

import java.util.*;

public class ProductDatabase {
    private List<Product> productListInDatabase;

    public ProductDatabase(List<Product> productListInDatabase) {
        this.productListInDatabase = productListInDatabase;
        /*this.productListInDatabase.add();
        this.productListInDatabase.add(n);
        this.productListInDatabase.add();
        this.productListInDatabase.add(new Product("Book",
                59.99, true));
        this.productListInDatabase.add(new Product("Phone",
                899.0, false));*/
    }

    public List<Product> getProductListInDatabase() {
        return productListInDatabase;
    }

    public boolean isProductAvailable(Product product) {

        for (Product element : productListInDatabase) {
            if (!(product.equals(element) && element.isAvailable())) {
                return false;
            }
        }
        return false;
    }

    public boolean checkAvailabilityOfProducts(List<Product> productList) {
        for (Product element: productList) {
            if (!(isProductAvailable(element))) {
                return false;
            }
        }
        return true;
    }
}
