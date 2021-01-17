package com.kodilla.good.patterns.challenges.food2door;

public class CheckOrderMap implements CheckOrder {

    public CheckOrderMap() {
    }

    @Override
    public boolean isOrderPossible(OrderRequest order, Producent producent) {

        for (Product product : order.getShoppingList()) {
            if (!(producent.getProductMap().containsKey(product.getId()))) {
                return false;
            }
        }
        return true;
    }
}
