package com.kodilla.good.patterns.challenges.food2door;

public class EMailInformationService implements InformationService {
    private String eMailAddress;

    public EMailInformationService(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    @Override
    public void sendConfirmationMessage(InformationRecipient recipient) {
        System.out.println("The confirmation is sent to " + recipient);
    }

    public String getEMailAddress() {
        return eMailAddress;
    }
}
