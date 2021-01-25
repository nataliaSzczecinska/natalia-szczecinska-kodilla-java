package com.kodilla.patterns.builder.bigmac;

public enum Sauce {
    STANDARD ("standard"),
    A_1000_OF_ISLANDS ("1000 islands"),
    BARBECUE ("barbecue");

    private String sauce;

    Sauce(String sauce) {
        this.sauce = sauce;
    }

    public String getSauce() {
        return sauce;
    }
}
