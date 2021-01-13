package com.kodilla.good.patterns.challenges.food2door;

public class User implements Recipient {
    private String nameAndSurname;
    private String userID;
    private String userName;
    private String deliveryAddress;
    private String eMail;
    private InformationService informationService;

    public User(String nameAndSurname, String userID, String userName, String deliveryAddress, String eMail, InformationService informationService) {
        this.nameAndSurname = nameAndSurname;
        this.userID = userID;
        this.userName = userName;
        this.deliveryAddress = deliveryAddress;
        this.eMail = eMail;
        this.informationService = informationService;
    }

    @Override
    public void getConfirmationOfOrder(CheckOrder checkOrder, ProductDatabase productDatabase, OrderRequest orderRequest) {
        if (checkOrder.isOrderPossible(productDatabase, orderRequest)) {
            informationService.sendConfirmationMessageToRecipient(this);
            System.out.println("The order can be realised");
        } else {
            System.out.println("Sorry. We cannot realise yor order " +
                    "because one of this options: " +
                    "\n the product you want to order is not available now " +
                    "\n there is/are not this/these product(s) in our shop");
        }
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getUserID() {
        return userID;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getEMail() {
        return eMail;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    @Override
    public String toString() {
        return "User: " + userName + ", ID: " + userID;
    }
}
