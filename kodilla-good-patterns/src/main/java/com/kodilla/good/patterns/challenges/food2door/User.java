package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class User {
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
        return userName +
                ", id: " + id ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nameAndSurname, user.nameAndSurname) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(id, user.id) &&
                Objects.equals(informationService, user.informationService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAndSurname, userName, id, informationService);
    }
}
