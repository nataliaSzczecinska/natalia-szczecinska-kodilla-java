package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        BigDecimal totalPeopleExpected = new BigDecimal("5555521038");

        //When
        BigDecimal totalPeopleCalulate = world.getPeopleQuantity();

        //Then
        assertEquals(totalPeopleExpected, totalPeopleCalulate);
    }
}
