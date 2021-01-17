package com.kodilla.good.patterns.challenges.food2door;

public interface InformationService {
    public void sendConfirmation(String message, OrderRequest orderRequest);
    public String getAddress();
}
