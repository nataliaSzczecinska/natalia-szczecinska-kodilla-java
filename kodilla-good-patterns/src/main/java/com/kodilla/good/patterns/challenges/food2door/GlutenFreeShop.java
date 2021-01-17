package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class GlutenFreeShop extends Producent {

    private final CheckOrder checkOrder = new CheckOrderList();
    private List<Product> productList;

    public GlutenFreeShop(String name,
                          String address,
                          InformationService informationService,
                          List<Product> productList) {
        super(name, address, informationService);
        this.productList = productList;
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
    public List<Product> getProductsList() {
        return productList;
    }
}
