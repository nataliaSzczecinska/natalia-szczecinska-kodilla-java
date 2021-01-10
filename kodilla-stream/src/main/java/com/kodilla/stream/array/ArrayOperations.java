package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.*;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        OptionalDouble avg = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        return avg.getAsDouble();
    }
}
