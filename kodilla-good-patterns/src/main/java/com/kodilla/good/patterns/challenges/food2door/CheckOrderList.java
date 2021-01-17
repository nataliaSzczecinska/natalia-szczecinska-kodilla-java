package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class CheckOrderList implements CheckOrder {

    @Override
    public boolean isOrderPossible(OrderRequest order, Producent producent) {
        for (Product product : order.getShoppingList()) {
            int count = 0 ;
            for (Product productFromDatabase : producent.getProductsList()) {
                if (product.equals(productFromDatabase)) {
                    count++;
                }
            }
            if (0 == count) {
                return false;
            }
        }
        return true;
    }
}
