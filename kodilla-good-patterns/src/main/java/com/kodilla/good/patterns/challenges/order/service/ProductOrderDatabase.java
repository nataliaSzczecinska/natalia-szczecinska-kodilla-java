package com.kodilla.good.patterns.challenges.order.service;

public class ProductOrderDatabase implements OrderDatabase {
    @Override
    public void saveOrderInformation(OrderRequesting orderRequesting) {
        System.out.println("The order is saved in Product Order Database");
    }
}
