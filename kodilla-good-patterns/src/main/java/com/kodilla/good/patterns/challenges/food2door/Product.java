package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class Product {
    private String name;
    private String productID;
    private Units unit;
    private double availableQuality;

    public Product(String name, String productID, Units unit, double availableQuality) {
        this.name = name;
        this.productID = productID;
        this.unit = unit;
        this.availableQuality = availableQuality;
    }

    public String getName() {
        return name;
    }

    public String getProductID() {
        return productID;
    }

    public Units getUnit() {
        return unit;
    }

    public double getAvailableQuality() {
        return availableQuality;
    }

    @Override
    public String toString() {
        return "Product: " + name +
                ", productID: " + productID +
                ", unit: " + unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(name, product.name) &&
                Objects.equals(productID, product.productID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productID, unit, availableQuality);
    }
}
