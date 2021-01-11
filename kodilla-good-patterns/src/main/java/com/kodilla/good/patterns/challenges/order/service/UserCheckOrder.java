package com.kodilla.good.patterns.challenges.order.service;

public class UserCheckOrder implements CheckOrder {
    @Override
    public boolean isOrderPossible(ProductDatabase productDatabase,
                                   OrderRequesting orderRequesting) {
        if (productDatabase.checkAvailabilityOfProducts(orderRequesting.getProductOrderList())) {
            System.out.println("The order is possible");
            return true;
        }
        System.out.println("The order is not possible");
        return false;
    }
}
