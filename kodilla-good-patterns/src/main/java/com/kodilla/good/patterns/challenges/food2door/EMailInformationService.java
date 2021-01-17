package com.kodilla.good.patterns.challenges.food2door;

public class EMailInformationService implements InformationService {

    private String eMail;

    public EMailInformationService(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public void sendConfirmation(String message, OrderRequest orderRequest) {
        System.out.println(message);
    }

    @Override
    public String getAddress() {
        return eMail;
    }
}
