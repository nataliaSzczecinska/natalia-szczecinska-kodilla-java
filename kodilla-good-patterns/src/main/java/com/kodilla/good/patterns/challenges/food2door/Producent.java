package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public abstract class Producent {
    private String name;
    private String address;
    private InformationService informationService;

    public Producent(String name, String address, InformationService informationService) {
        this.name = name;
        this.address = address;
        this.informationService = informationService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        return new OrderDto(orderRequest.getUser(), orderRequest.getShoppingList(), false);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    public List<Product> getProductsList() {
        return new ArrayList<>();
    }

    public Set<Product> getProductSet() {
        return new HashSet<>();
    }

    public Map<String, Product> getProductMap() {
        return new HashMap<>();
    }

    @Override
    public String toString() {
        return "Company: " + name;
    }
}
