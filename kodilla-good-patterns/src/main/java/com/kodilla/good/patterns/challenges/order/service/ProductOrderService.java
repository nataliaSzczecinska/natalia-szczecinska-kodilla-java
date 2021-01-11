package com.kodilla.good.patterns.challenges.order.service;

public class ProductOrderService {
    private InformationService informationService;
    private CheckOrder checkOrder;
    private OrderDatabase orderDatabase;

    public ProductOrderService(InformationService informationService,
                               CheckOrder checkOrder,
                               OrderDatabase orderDatabase) {
        this.checkOrder = checkOrder;
        this.orderDatabase = orderDatabase;
        this.informationService = informationService;
    }

    public OrderDto process(OrderRequesting orderRequesting,
                            ProductDatabase productDatabase) {
        if (checkOrder.isOrderPossible(productDatabase, orderRequesting)) {
            informationService.sendInformationAboutOrderToUser(orderRequesting.getUser());
            orderDatabase.saveOrderInformation(orderRequesting);
            System.out.println("The order is accepted");
            return new OrderDto(orderRequesting.getUser(),
                    orderRequesting.getProductOrderList(),
                    true);
        }
        System.out.println("The order cannot be accepted");
        return new OrderDto(orderRequesting.getUser(),
                orderRequesting.getProductOrderList(),
                false);
    }
}
