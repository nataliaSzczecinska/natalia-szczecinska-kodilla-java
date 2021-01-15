package com.kodilla.good.patterns.challenges.flight.company;

import java.util.*;
import java.util.stream.*;

public class SearchFlight {


    /*public List<Flight> searchDirectFlight(String departure,
                                                 String arrival,
                                                 FlightDatabase flightDatabase) {
        return flightDatabase.getFlightMap().entrySet().stream()
                .filter(e -> departure.equals(e.getValue().getDepartureFrom()))
                .filter(e ->  arrival.equals(e.getValue().getArrivalTo()))
                .map(e -> e.getValue())
                .collect(Collectors.toList());
    }

    public List<Flight> flightListFrom(String departure, FlightDatabase flightDatabase) {
        return flightDatabase.getFlightMap().entrySet().stream()
                .filter(e -> (departure.equals(e.getValue().getDepartureFrom())))
                .map(e -> e.getValue())
                .collect(Collectors.toList());
    }

    public List<Flight> flightListTo(String arrival, FlightDatabase flightDatabase) {
        return flightDatabase.getFlightMap().entrySet().stream()
                .filter(e -> (arrival.equals(e.getValue().getArrivalTo())))
                .map(e -> e.getValue())
                .collect(Collectors.toList());
    }

    public Map<Flight, List<Flight>> flightsFromToWithOneChange(String departure,
                                                   String arrival,
                                                   FlightDatabase flightDatabase) {
        List<Flight> departureFrom = flightListFrom(departure, flightDatabase);
        List<Flight> arrivalTo = flightListTo(arrival, flightDatabase);

        Map<Flight, List<Flight>> map = new HashMap<>();
        for (Flight from : departureFrom) {
            if(!(flightChanger(from, arrivalTo).isEmpty())) {
                map.put(from, flightChanger(from, arrivalTo));
            }
        }
        return map;
    }

    private List<Flight> flightChanger(Flight startFlight, List<Flight> flightsArrivalToEnd) {
        return flightsArrivalToEnd.stream()
                .filter(e -> startFlight.getArrivalTo().equals(e.getDepartureFrom()))
                .collect(Collectors.toList());
    }*/

    public List<FlightFromTo> flightFromToListTo(String arrival, FlightDatabase flightDatabase) {
        return flightDatabase.getFlightFromToSet().stream()
                .filter(e -> arrival.equals(e.getArrivalTo()))
                .collect(Collectors.toList());
    }

    public List<FlightFromTo> flightFromToListFrom(String departure, FlightDatabase flightDatabase) {
        return flightDatabase.getFlightFromToSet().stream()
                .filter(e -> departure.equals(e.getDepartureFrom()))
                .collect(Collectors.toList());
    }

    public List<FlightFromTo> searchDirectFlightFromTo(String departure,
                                                 String arrival,
                                                 FlightDatabase flightDatabase) {
        return flightDatabase.getFlightFromToSet().stream()
                .filter(e -> departure.equals(e.getDepartureFrom()))
                .filter(e ->  arrival.equals(e.getArrivalTo()))
                .collect(Collectors.toList());
    }

    public Map<FlightFromTo, List<FlightFromTo>> flightsFromToWithOneChange(String departure,
                                                                String arrival,
                                                                FlightDatabase flightDatabase) {
        List<FlightFromTo> departureFrom = flightFromToListFrom(departure, flightDatabase);
        List<FlightFromTo> arrivalTo = flightFromToListTo(arrival, flightDatabase);

        Map<FlightFromTo, List<FlightFromTo>> map = new HashMap<>();
        for (FlightFromTo from : departureFrom) {
            if(!(flightChanger(from, arrivalTo).isEmpty())) {
                map.put(from, flightChanger(from, arrivalTo));
            }
        }
        return map;
    }

    private List<FlightFromTo> flightChanger(FlightFromTo startFlight, List<FlightFromTo> flightsArrivalToEnd) {
        return flightsArrivalToEnd.stream()
                .filter(e -> startFlight.getArrivalTo().equals(e.getDepartureFrom()))
                .collect(Collectors.toList());
    }
}
