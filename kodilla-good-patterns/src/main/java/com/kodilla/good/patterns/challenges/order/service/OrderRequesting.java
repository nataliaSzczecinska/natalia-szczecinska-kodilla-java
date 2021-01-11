package com.kodilla.good.patterns.challenges.order.service;

import java.util.*;

public class OrderRequesting {
    private User user;
    private List<Product> productOrderList;

    public OrderRequesting(User user, List<Product> productOrderList) {
        this.user = user;
        this.productOrderList = productOrderList;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProductOrderList() {
        return productOrderList;
    }
}
