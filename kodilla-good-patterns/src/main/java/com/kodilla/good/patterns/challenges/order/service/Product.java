package com.kodilla.good.patterns.challenges.order.service;

import java.util.Objects;

public class Product {
    protected String productName;
    protected double productPrice;
    protected boolean isAvailable;

    public Product(String productName, double productPrice, boolean isAvailable) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.isAvailable = isAvailable;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Product: " + productName +
                "\nPrice: " + productPrice ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.productPrice, productPrice) == 0 &&
                isAvailable == product.isAvailable &&
                Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, isAvailable);
    }
}
