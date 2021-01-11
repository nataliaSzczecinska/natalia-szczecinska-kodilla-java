package com.kodilla.good.patterns.challenges.order.service;

import java.util.*;

public class OrderDto {
    private User user;
    private List<Product> productList;
    private boolean isItOrder;

    public OrderDto(User user, List<Product> productList, boolean isItOrder) {
        this.user = user;
        this.productList = productList;
        this.isItOrder = isItOrder;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public boolean isItOrder() {
        return isItOrder;
    }

    @Override
    public String toString() {
        String text = "User: " + user + "\n";

        for (Product element : productList) {
            text += (element + "\n");
        }

        text += "isItOrder: " + isItOrder;

        return text;
    }
}
