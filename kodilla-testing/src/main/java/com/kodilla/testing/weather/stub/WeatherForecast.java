package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast{
    private Temperature temperatures;

    public WeatherForecast(Temperature temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemp(){
        double avg = 0.0;

        for (Map.Entry<String, Double> temp :
                temperatures.getTemperatures().entrySet()) {
            avg += temp.getValue();
        }

        return avg / temperatures.getTemperatures().size();
    }

    public double medianTemp(){
        double median = 0.0;
        List<Double> tempList = new ArrayList<>();

        for (Map.Entry<String, Double> temp :
                temperatures.getTemperatures().entrySet()) {
            tempList.add(temp.getValue());
        }

        //Sortowanie listy
        int changeQuantity;
        do {
            changeQuantity = 0;
            for (int i = 0 ; i < tempList.size() - 1; i++){
                if (tempList.get(i) > tempList.get(i + 1)){
                    double value = tempList.get(i);
                    tempList.set(i, tempList.get(i + 1));
                    tempList.set(i + 1, value);
                    changeQuantity++;
                }
            }
        }while(changeQuantity != 0);

        int value = tempList.size() / 2;
        if (tempList.size() % 2 == 0) {
            median = 0.5 * (tempList.get(value) + tempList.get(value - 1));
        } else {
            median = tempList.get(value);
        }
        return median;
    }
}
