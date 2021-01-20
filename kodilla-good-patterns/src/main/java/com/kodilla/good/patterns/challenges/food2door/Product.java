package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private double price;
    private Producer producer;

    public Product(String id, String name, double price, Producer producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
        producer.addProduct(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Producer getProducer() {
        return producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return name + ", price " + price +
                ",\n" + producer;
    }
}
