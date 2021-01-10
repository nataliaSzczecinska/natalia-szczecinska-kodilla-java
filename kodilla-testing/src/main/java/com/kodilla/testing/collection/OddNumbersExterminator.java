package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumberList = new ArrayList<>();

        if (numbers.isEmpty()) {
            System.out.println("The given list is empty");
            return evenNumberList;
        } else {
            for (Integer element : numbers) {
                if (element % 2 == 0) {
                    evenNumberList.add(element);
                }
            }
            return evenNumberList;
        }
    }
}
