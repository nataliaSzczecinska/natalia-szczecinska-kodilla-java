package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class OrderRequest {
    private User user;
    private List<Product> shoppingList;

    public OrderRequest(User user, List<Product> shoppingList) {
        this.user = user;
        this.shoppingList = shoppingList;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getShoppingList() {
        return shoppingList;
    }
}
