package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        //Test kalkulatora
        Calculator calculator = new Calculator();

        int calculatorResults = calculator.add(5, 4);

        if (calculatorResults == (5 + 4)){
            System.out.println("Adding works fine");
        } else {
            System.out.println("Error! Adding does not work fine");
        }

        calculatorResults = calculator.subtract(5, 4);

        if (calculatorResults == (5 - 4)){
            System.out.println("Subtraction works fine");
        } else {
            System.out.println("Error! Subtraction does not work fine");
        }
    }
}
