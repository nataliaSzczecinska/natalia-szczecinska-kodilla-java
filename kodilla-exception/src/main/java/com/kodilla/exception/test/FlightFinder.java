package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightArrivalMap = arrivalAirportMap();
        String arrivalAirport = flight.getArrivalAirport();
        boolean isExist = false;

            for (Map.Entry<String, Boolean> entry : flightArrivalMap.entrySet()) {
                if (arrivalAirport.equals(entry.getKey())) {
                    System.out.println("There is a possibility to arrive to " + entry.getKey());
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                throw new RouteNotFoundException("Exception! " +
                        "This arrival airport do not exist");
            }
    }

    public Map<String, Boolean> arrivalAirportMap(){
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
        List <Flight> flightList = new ArrayList <>();
        flightList.add(new Flight("London", "Lodz"));
        flightList.add(new Flight("London", "Berlin"));

        for (Flight flights : flightList) {
            try {
                flightFinder.findFilght(flights);
            } catch (RouteNotFoundException exception) {
                System.out.println(exception);
            } finally {
                System.out.println("The flight from " + flights.getDepartureAirport() +
                        " to " + flights.getArrivalAirport() + " was checking ");
            }
        }
    }
}
