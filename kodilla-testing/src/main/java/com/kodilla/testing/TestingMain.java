package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.*;

public class TestingMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerEvenList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        for (int i = 0 ; i < 10 ; i++) {
            integerList.add(i + 1);
        }

        integerEvenList = exterminator.exterminate(integerList);

        System.out.println("First List");
        for (Integer list : integerList ) {
            System.out.println(list);
        }

        System.out.println("Second List");
        for (Integer list : integerEvenList ) {
            System.out.println(list);
        }
    }
}
