package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class ProductDatabase {
    private Map<String, Product> productList;

    public ProductDatabase(Map<String, Product> productList) {
        this.productList = productList;
    }

    public Map<String, Product> getProductList() {
        return productList;
    }

    public boolean isProductAvailable(Product product) {
        for (Map.Entry<String, Product> element : productList.entrySet()) {
            if (!(product.equals(element.getValue()) &&
                    0 < element.getValue().getAvailableQuality())) {
                return false;
            }
        }
        return true;
    }

    public boolean checkAvailabilityOfProducts(List<Product> givenProductList) {
        for (Product element: givenProductList) {
            if (!(isProductAvailable(element))) {
                return false;
            }
        }
        return true;
    }
}
