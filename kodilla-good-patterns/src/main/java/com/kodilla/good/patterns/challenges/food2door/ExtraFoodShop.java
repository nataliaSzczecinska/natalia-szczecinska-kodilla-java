package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class ExtraFoodShop extends Producent {

    private CheckOrder checkOrder = new CheckOrderMap();
    private Map<String, Product> productMap;

    public ExtraFoodShop(String name,
                         String address,
                         InformationService informationService,
                         Map<String, Product> productMap) {
        super(name, address, informationService);
        this.productMap = productMap;
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
    public Map<String, Product> getProductMap() {
        return productMap;
    }
}
