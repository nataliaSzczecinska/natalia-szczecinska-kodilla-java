package com.kodilla.good.patterns.challenges.food2doormistake;

import java.util.*;

public class OrderRequest {
    private User user;
    private List<Product> shoppingList;

    public OrderRequest(User user, List<Product> shoppingList) {
        this.user = user;
        this.shoppingList = shoppingList;
    }

    public boolean isOrderPossible(OrderRequest orderRequest, ProductDatabase productDatabase) {
        for (Product product : orderRequest.getShoppingList()) {
            if (!(productDatabase.getProductMap().containsKey(product.getId()))) {
                System.out.println("The product: \n" + product +
                        " do not exist in database");
                return false;
            }
            if (productDatabase.getProductMap().get(product.getId()).getAmount() < product.getAmount()) {
                System.out.println("The available amount of product : \n" + product +
                        " is not enough");
                return false;
            }
        }
        System.out.println("The order is possible");
        return true;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getShoppingList() {
        return shoppingList;
    }
}
