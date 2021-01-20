package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class GlutenFreeShop extends Producer {

    private final CheckOrder checkOrder = new CheckOrder();
    private List<Product> productList;

    public GlutenFreeShop(String name,
                          String address,
                          List<Product> productList) {
        super(name, address);
        this.productList = productList;
    }

    @Override
    public void addProduct(Product product) {
        this.productList.add(product);
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
    public List<Product> getProductsList() {
        return productList;
    }
}
