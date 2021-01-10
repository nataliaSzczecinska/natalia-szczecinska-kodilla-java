package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

import java.util.*;


public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Testing method exterminate if list is empty"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> integerList = new ArrayList<>();

        //When
        List<Integer> evenIntegerList = exterminator.exterminate(integerList);

        //Then
        Assertions.assertTrue(evenIntegerList.isEmpty()); //assertNull(evenIntegerList);
    }

    @DisplayName("Testing method exterminate if list is not empty " +
            "and check if all elements in new list are even"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedResult = Arrays.asList(2, 4, 6, 8, 10);

        //When
        List<Integer> integerEvenList = exterminator.exterminate(integerList);
        //Then
        assertEquals(expectedResult, integerEvenList);
    }
}
