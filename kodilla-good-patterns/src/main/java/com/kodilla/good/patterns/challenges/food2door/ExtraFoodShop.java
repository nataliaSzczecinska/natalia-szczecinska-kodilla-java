package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class ExtraFoodShop extends Producer {

    private CheckOrder checkOrder = new CheckOrder();
    private Map<String, Product> productMap;

    public ExtraFoodShop(String name,
                         String address,
                         Map<String, Product> productMap) {
        super(name, address);
        this.productMap = productMap;
    }

    @Override
    public void addProduct(Product product) {
        this.productMap.put(product.getId(), product);
    }

    @Override
    public boolean process(Product product) {
        if (this.equals(product.getProducer())) {
            System.out.println("The order of " + product + " is send to " + this);
            return true;
        }
        System.out.println("There product " + product + " will not be realise by " + this);
        return false;
    }

    @Override
    public Map<String, Product> getProductMap() {
        return productMap;
    }
}
