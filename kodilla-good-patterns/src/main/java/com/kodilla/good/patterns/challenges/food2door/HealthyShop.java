package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class HealthyShop extends Producent {

    private final CheckOrder checkOrder = new CheckOrderSet();
    private Set<Product> productSet;

    public HealthyShop(String name,
                       String address,
                       InformationService informationService,
                       Set<Product> productSet) {
        super(name, address, informationService);
        this.productSet = productSet;
    }

    @Override
    public OrderDto process(OrderRequest orderRequest) {
        if (checkOrder.isOrderPossible(orderRequest, this)) {
            this.getInformationService().sendConfirmation(this.toString() + " is requested to realised the order", orderRequest);
            return new OrderDto(orderRequest.getUser(),
                    orderRequest.getShoppingList(),
                    true);
        }
        return new OrderDto(orderRequest.getUser(), orderRequest.getShoppingList(), false);
    }

    @Override
    public Set<Product> getProductSet() {
        return productSet;
    }

    public CheckOrder getCheckOrder() {
        return checkOrder;
    }
}
