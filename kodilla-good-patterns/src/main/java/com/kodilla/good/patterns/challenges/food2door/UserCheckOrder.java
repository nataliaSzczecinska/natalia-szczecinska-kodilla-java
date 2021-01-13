package com.kodilla.good.patterns.challenges.food2door;

public class UserCheckOrder implements CheckOrder {

    @Override
    public boolean isOrderPossible(ProductDatabase productDatabase, OrderRequest orderRequest) {

        for (Product product: orderRequest.getShoppingList()) {
            if (!(productDatabase.getProductList().containsKey(product.getProductID()) &&
                    0 < productDatabase.getProductList().get(product.getProductID()).getAvailableQuality())) {
                return false;
            }
        }
        return true;
    }
}
