package com.kodilla.patterns.builder.bigmac;

import java.util.*;

public class BigMac {
    private final Bun bun;
    private final int burgersAmount;
    private final Sauce sauce;
    private final List<Ingredient> ingredients;

    private BigMac(Bun bun, int burgersAmount, Sauce sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgersAmount = burgersAmount;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigMacBuilder {
        private Bun bun;
        private int burgersAmount;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigMacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgersAmount(int burgersAmount) {
            if (burgersAmount >= 0) {
                this.burgersAmount = burgersAmount;
            } else {
                throw new IllegalStateException("The number of burgers is wrong");
            }
            return this;
        }

        public BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredients(Ingredient... ingredients) {
            for (Ingredient ingredient : ingredients) {
                this.ingredients.add(ingredient);
            }
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgersAmount, sauce, ingredients);
        }
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgersAmount() {
        return burgersAmount;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        String text = "The ordered BigMac:";

        text += ("\nbun " + bun.getBun());
        text += ("\nnumber of burgers " + burgersAmount);
        text += ("\nsauce " + sauce.getSauce() + "\ningredients: ");

        for (Ingredient ingredient : ingredients) {
            text += ("\n" + ingredient.getIngredient());
        }
        return text;
    }
}
