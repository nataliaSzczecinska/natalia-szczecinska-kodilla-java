package com.kodilla.good.patterns.challenges.food2door;

public interface CheckOrder {
    public boolean isOrderPossible(ProductDatabase productDatabase,
                                   OrderRequest orderRequest);
}
