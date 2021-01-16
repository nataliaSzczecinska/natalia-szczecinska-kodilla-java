package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class ProductDatabase {
    private Map<String, Product> productMap;

    public ProductDatabase(Map<String, Product> productMap) {
        this.productMap = productMap;
    }

    public Map<String, Product> getProductMap() {
        return productMap;
    }
}
