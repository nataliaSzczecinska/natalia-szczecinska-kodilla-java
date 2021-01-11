package com.kodilla.good.patterns.challenges.order.service;

public class EmailInformationService implements InformationService {

    @Override
    public void sendInformationAboutOrderToUser(User user) {
        System.out.println("Send information about order to user by e-mail");
    }
}
