package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class OrderDto {
    private User user;
    private List<Product> shoppingList;
    private boolean isOrdered;

    public OrderDto(User user, List<Product> shoppingList, boolean isOrdered) {
        this.user = user;
        this.shoppingList = shoppingList;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getShoppingList() {
        return shoppingList;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        String text = "The order placed by " + user;

        if (isOrdered) {
            text += " will be processed";
        } else {
            text += " will not be processed";
        }
        return text;
    }
}
