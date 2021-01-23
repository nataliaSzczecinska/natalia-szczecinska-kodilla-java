package com.kodilla.good.patterns.challenges.flight.company;

import java.util.*;

public class Application {
    /*public static void main(String [] arg) {
        Flight flight1 = new Flight("Athens","Madrid");
        Flight flight2 = new Flight("Athens","London");
        Flight flight3 = new Flight("Athens","Rome");
        Flight flight4 = new Flight("Madrid","Athens");
        Flight flight5 = new Flight("London", "Athens");
        Flight flight6 = new Flight("Rome","Athens");
        Flight flight7 = new Flight("Rio de Janeiro", "Washington, D.C.");
        Flight flight8 = new Flight("Warsaw","Rio de Janeiro");
        Flight flight9 = new Flight("Madrid","Warsaw");
        Flight flight10 = new Flight("Rome","Berlin");
        Flight flight11 = new Flight("Berlin","Warsaw");
        Flight flight12 = new Flight("Berlin","Athens");

        Set<Flight> flightFromToSet = new HashSet<>();
        flightFromToSet.add(flight1);
        flightFromToSet.add(flight2);
        flightFromToSet.add(flight3);
        flightFromToSet.add(flight4);
        flightFromToSet.add(flight5);
        flightFromToSet.add(flight6);
        flightFromToSet.add(flight7);
        flightFromToSet.add(flight8);
        flightFromToSet.add(flight9);
        flightFromToSet.add(flight10);
        flightFromToSet.add(flight11);
        flightFromToSet.add(flight12);

        FlightDatabase flightDatabase = new FlightDatabase(flightFromToSet);
        DisplayFlights displayFlights = new DisplayFlights();
        SearchFlight searchFlight = new SearchFlight();

        System.out.println("Database have " + flightDatabase.getFlightSet().size() + " flights\n");
        displayFlights.displayList("***The flights from Athens***",
                searchFlight.flightListFrom("Athens", flightDatabase));
        displayFlights.displayList("***The flights to Athens***",
                searchFlight.flightListTo("Athens", flightDatabase));
        displayFlights.displayList("***The directly flights from Athens to Rome***",
                searchFlight.searchDirectFlight("Athens",
                        "Rome",
                        flightDatabase));
        displayFlights.displayMap("***The flights from Rome to Athens with one change***",
                searchFlight.flightsWithOneChange("Rome",
                        "Athens",
                        flightDatabase));
    }*/
}
