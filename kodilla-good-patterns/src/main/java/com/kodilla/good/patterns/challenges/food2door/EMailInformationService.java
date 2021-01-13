package com.kodilla.good.patterns.challenges.food2door;

public class EMailInformationService implements InformationService {

    private String eMailAddress;

    public EMailInformationService(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    public String getEMailAddress() {
        return eMailAddress;
    }

    @Override
    public void sendConfirmationMessageToRecipient(Recipient recipient) {
        System.out.println("The confirmation message is sent on the e-mail: " + eMailAddress);
    }
}
