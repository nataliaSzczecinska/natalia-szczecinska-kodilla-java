package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {

    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightArrivalMap = arrivalAirportMap();
        String arrivalAirport = flight.getArrivalAirport();
        boolean isExist = false;
        isExist = flightArrivalMap.containsKey(arrivalAirport);

        if (!isExist) {
            throw new RouteNotFoundException("Exception! " +
                    "This arrival airport do not exist");
        }

        return isExist;
    }

    public Map<String, Boolean> arrivalAirportMap() {
        Map<String, Boolean> maps = new HashMap<>();

        maps.put("Berlin", true);
        maps.put("London", false);
        maps.put("Athen", true);
        maps.put("Warsaw", true);
        maps.put("Vienna", true);
        maps.put("Madrid", false);
        maps.put("Lisbon", false);

        return maps;
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("London", "Lodz"));
        flightList.add(new Flight("London", "Berlin"));
        boolean isFlightExist;

        for (Flight flights : flightList) {
            try {
                isFlightExist = flightFinder.findFilght(flights);
                if (isFlightExist) {
                    System.out.println("This arrival airport exists!");
                }
            } catch (RouteNotFoundException exception) {
                System.out.println(exception);
            } finally {
                System.out.println("The flight from " + flights.getDepartureAirport() +
                        " to " + flights.getArrivalAirport() + " was checking ");
            }
        }
    }
}
