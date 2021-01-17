package com.kodilla.good.patterns.challenges.food2door;

public class CheckOrderSet implements CheckOrder {

    @Override
    public boolean isOrderPossible(OrderRequest order, Producent producent) {

        if (producent.getProductSet().containsAll(order.getShoppingList())) {
            return true;
        }
        return true;
    }
}
