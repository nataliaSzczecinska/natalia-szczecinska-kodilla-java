package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public abstract class Producer {
    private String name;
    private String address;

    public Producer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public boolean process(Product product) {
        System.out.println("The order of " + product + " process...");
        return false;
    }

    public void addProduct(Product product) {
        System.out.println("The product has been added to Producer Database");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(name, producer.name) &&
                Objects.equals(address, producer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
