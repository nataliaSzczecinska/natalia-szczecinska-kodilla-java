package com.kodilla.good.patterns.challenges.food2door;

public interface Recipient {
    public void getConfirmationOfOrder(CheckOrder checkOrder, ProductDatabase productDatabase, OrderRequest orderRequest);
}
