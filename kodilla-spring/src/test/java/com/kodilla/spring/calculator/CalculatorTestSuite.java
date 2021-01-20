package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculationsAdd() {
        //Given

        //When
        double result = calculator.add(3.5, 1.5);

        //Then
        Assert.assertEquals(5.0, result, 0.01);
    }

    @Test
    public void testCalculationsSub() {
        //Given

        //When
        double result = calculator.sub(3.5, 1.5);

        //Then
        Assert.assertEquals(2.0, result, 0.01);
    }

    @Test
    public void testCalculationsMul() {
        //Given

        //When
        double result = calculator.mul(3.5, 1.5);

        //Then
        Assert.assertEquals(5.25, result, 0.01);
    }

    @Test
    public void testCalculationsDiv() {
        //Given

        //When
        double result = calculator.div(3.5, 1.5);

        //Then
        Assert.assertEquals(2.33, result, 0.01);
    }
}
