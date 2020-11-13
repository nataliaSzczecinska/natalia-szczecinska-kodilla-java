package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    private static int testCounter = 0;

    static Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeAll
    public static void beforeAllTests() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    private Temperature temperaturesMock;

    @DisplayName("CalculateForecast test")
    @Test
    void testCalculateForecastWithMock() {
        //Given
        Temperature temperaturesMock = mock(Temperature.class);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Average temperature test")
    @Test
    void testAverageTempWithMock() {
        //Given
        Temperature temperaturesMock = mock(Temperature.class);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When
        double average = weatherForecast.averageTemp();

        //Then
        Assertions.assertEquals(25.56, average);
    }

    @DisplayName("Median temperature test")
    @Test
    void testMedianTempWithMock() {
        //Given
        Temperature temperaturesMock = mock(Temperature.class);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When
        double median = weatherForecast.medianTemp();

        //Then
        Assertions.assertEquals(25.5, median);
    }
}
