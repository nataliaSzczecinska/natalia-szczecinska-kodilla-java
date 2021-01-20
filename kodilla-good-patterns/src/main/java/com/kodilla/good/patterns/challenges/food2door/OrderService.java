package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {

    public OrderDto orderProcess(OrderRequest request) {

        for (Product product : request.getShoppingList()) {
            if (!(product.getProducer().process(product))) {
                return new OrderDto(request.getUser(), request.getShoppingList(), false);
            }
        }
        return new OrderDto(request.getUser(), request.getShoppingList(), true);
    }
}
