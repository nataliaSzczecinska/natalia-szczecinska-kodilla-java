package com.kodilla.good.patterns.challenges.order.service;

public interface CheckOrder {
    public boolean isOrderPossible(ProductDatabase productDatabase,
                                   OrderRequesting orderRequesting);
}
