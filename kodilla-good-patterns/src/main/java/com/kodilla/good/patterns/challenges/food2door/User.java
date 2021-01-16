package com.kodilla.good.patterns.challenges.food2door;

public class User implements InformationRecipient {
    private String nameAndSurname;
    private String userName;
    private String id;
    private InformationService informationService;

    public User(String nameAndSurname,
                String userName,
                String id,
                InformationService informationService) {
        this.nameAndSurname = nameAndSurname;
        this.userName = userName;
        this.id = id;
        this.informationService = informationService;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getUserName() {
        return userName;
    }

    public String getId() {
        return id;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    @Override
    public String toString() {
        return "User: " + userName +
                ", id: " + id;
    }
}
