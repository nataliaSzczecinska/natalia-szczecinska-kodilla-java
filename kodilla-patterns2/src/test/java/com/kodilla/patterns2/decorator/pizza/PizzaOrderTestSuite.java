package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        // When
        BigDecimal calculatedCost = theOrder.getCost();

        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Basic pizza (pizza base + cheese + tomato sauce)", description);
    }

    @Test
    public void testAdditionalCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithAdditionalCheeseDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(18), theCost);
    }

    @Test
    public void testAdditionalCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithAdditionalCheeseDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic pizza (pizza base + cheese + tomato sauce) + additional cheese", description);
    }

    @Test
    public void testAdditionalSauceGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithAdditionalSauce(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(17), theCost);
    }

    @Test
    public void testAdditionalSauceGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithAdditionalSauce(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic pizza (pizza base + cheese + tomato sauce) + additional sauce", description);
    }

    @Test
    public void testWithHamGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithHamDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(19), theCost);
    }

    @Test
    public void testWithHamGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithHamDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic pizza (pizza base + cheese + tomato sauce) + ham", description);
    }

    @Test
    public void testSalamiGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithSalamiDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(19), theCost);
    }

    @Test
    public void testSalamiGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithSalamiDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic pizza (pizza base + cheese + tomato sauce) + salami", description);
    }

    @Test
    public void testMushroomGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testMushroomGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic pizza (pizza base + cheese + tomato sauce) + mushrooms", description);
    }

    @Test
    public void testAllToppingsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithAdditionalCheeseDecorator(theOrder);
        theOrder = new PizzaWithAdditionalSauce(theOrder);
        theOrder = new PizzaWithHamDecorator(theOrder);
        theOrder = new PizzaWithSalamiDecorator(theOrder);
        theOrder = new PizzaWithMushroomDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(33), theCost);
    }

    @Test
    public void testAllToppingsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithAdditionalCheeseDecorator(theOrder);
        theOrder = new PizzaWithAdditionalSauce(theOrder);
        theOrder = new PizzaWithHamDecorator(theOrder);
        theOrder = new PizzaWithSalamiDecorator(theOrder);
        theOrder = new PizzaWithMushroomDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic pizza (pizza base + cheese + tomato sauce) + additional cheese + additional sauce" +
                " + ham + salami + mushrooms", description);
    }
}