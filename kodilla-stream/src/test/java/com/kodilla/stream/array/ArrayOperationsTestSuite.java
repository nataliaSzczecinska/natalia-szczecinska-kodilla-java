package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ArrayOperationsTestSuite {

    int[] tableGenerator(int number) {
        int [] tab = new int[number];

        for (int i = 0 ; i < number ; i++) {
            tab[i] = i + 1;
        }

        return tab;
    }

    @Mock
    private ArrayOperations arrayOperationsMock = Mockito.mock(ArrayOperations.class);

    @Test
    void testGetAverage() {
        //Given
        int [] table = tableGenerator(10);
        double expectedAvg =  5.5;

        //When
        double result = ArrayOperations.getAverage(table);

        //Then
        assertEquals(expectedAvg, result);
    }
}
