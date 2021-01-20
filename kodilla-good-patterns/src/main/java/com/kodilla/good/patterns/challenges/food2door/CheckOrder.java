package com.kodilla.good.patterns.challenges.food2door;

public class CheckOrder {
    public boolean isOrderPossible(Product product, Producer producer) {
        if (producer.equals(product.getProducer())) {
            return true;
        }
        System.out.println("Something has gone wrong, the order cannot be realised");
        return false;
    }
}
