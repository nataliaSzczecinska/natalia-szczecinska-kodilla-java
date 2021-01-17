package com.kodilla.good.patterns.challenges.flight.company;

import java.util.*;

public class DisplayFlights {

    public void displayFlightDatabase(FlightDatabase flightDatabase) {
        System.out.println("***THE FLIGHT DATABASE***");
        flightDatabase.getFlightSet().stream().forEach(System.out::println);
        System.out.println();
    }

    public void displayList(String startingText, List<Flight> list){
        if (list.isEmpty()) {
            System.out.println(startingText);
            System.out.println("There is no flight with given parameters");
            System.out.println();
        } else {
            System.out.println(startingText);
            list.stream().forEach(System.out::println);
            System.out.println();
        }
    }

    public void displayMap(String startingText, Map<Flight, List<Flight>> map) {
        if (map.isEmpty()) {
            System.out.println(startingText);
            System.out.println("There is no flight with given parameters");
            System.out.println();
        } else {
            System.out.println(startingText);
            map.entrySet().stream().forEach(System.out::println);
            System.out.println();
        }
    }
}
