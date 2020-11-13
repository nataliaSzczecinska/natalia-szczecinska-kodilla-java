package com.kodilla.testing.weather.stub;

import java.util.*;

public interface Temperature {

    //first element of the map is an identifier of weather station
    //second element of the map is a temperature in Celsius degrees
    public Map<String, Double> getTemperatures();
}
