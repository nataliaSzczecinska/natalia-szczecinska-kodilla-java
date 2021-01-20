package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class HealthyShop extends Producer {

    private final CheckOrder checkOrder = new CheckOrder();
    private Set<Product> productSet;

    public HealthyShop(String name,
                       String address,
                       Set<Product> productSet) {
        super(name, address);
        this.productSet = productSet;
    }

    @Override
    public void addProduct(Product product) {
        this.productSet.add(product);
    }

    @Override
    public boolean process(Product product) {
        if (checkOrder.isOrderPossible(product, this)) {
            System.out.println("The order of " + product + " is send to " + this);
            return true;
        }
        System.out.println("There product " + product + " will not be realise by " + this);
        return false;
    }

    @Override
    public Set<Product> getProductSet() {
        return productSet;
    }
}
