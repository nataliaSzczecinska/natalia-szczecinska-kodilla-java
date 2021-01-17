package com.kodilla.good.patterns.challenges.food2doormistake;

import java.util.*;

public class OrderDto {
    private User user;
    private List<Product> shoppingList;
    private boolean isOrderBeRealised;

    public OrderDto(User user, List<Product> shoppingList, boolean isOrderBeRealised) {
        this.user = user;
        this.shoppingList = shoppingList;
        this.isOrderBeRealised = isOrderBeRealised;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getShoppingList() {
        return shoppingList;
    }

    public boolean isOrderBeRealised() {
        return isOrderBeRealised;
    }

    @Override
    public String toString() {
        String text = user + ", the order ";

        if (isOrderBeRealised) {
            text += "will be realised";
        } else {
            text += "will not be realised";
        }

        return text;
    }
}
