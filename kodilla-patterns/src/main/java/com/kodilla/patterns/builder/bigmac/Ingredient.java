package com.kodilla.patterns.builder.bigmac;

public enum Ingredient {
    SALAD ("salad"),
    ONION ("onion"),
    BACON ("bacon"),
    CUCUMBER ("cucumber"),
    CHILI_PEPPER ("chili pepper"),
    MUSHROOMS ("mushrooms"),
    SHRIMPS ("shrimps"),
    CHEESE ("cheese");

    private String ingredient;

    Ingredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }
}
