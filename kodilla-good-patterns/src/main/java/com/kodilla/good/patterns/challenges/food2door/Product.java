package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class Product {
    private String name;
    private String id;
    private double amount;

    public Product(String name, String id, double amount) {
        this.name = name;
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", product " + name +
                ", amount " + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
               Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, amount);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
