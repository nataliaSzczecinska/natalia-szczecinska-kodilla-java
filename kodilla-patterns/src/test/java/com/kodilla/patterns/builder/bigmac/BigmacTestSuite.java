package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(Bun.BUN_WITH_SESAME_SEEDS)
                .burgersAmount(3)
                .sauce(Sauce.BARBECUE)
                .ingredients(Ingredient.BACON)
                .ingredients(Ingredient.ONION)
                .ingredients(Ingredient.MUSHROOMS)
                .ingredients(Ingredient.CHILI_PEPPER)
                .ingredients(Ingredient.CHEESE)
                .build();

        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();
        int howManyBurgers = bigMac.getBurgersAmount();

        //Then
        assertEquals(5, howManyIngredients);
        assertEquals(3, howManyBurgers);
    }
}
