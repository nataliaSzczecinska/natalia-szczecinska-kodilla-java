package com.kodilla.good.patterns.challenges.flight.company;

import java.util.*;

public class Application {
    public static void main(String [] arg) {
        FlightFromTo flight1 = new FlightFromTo("Athens","Madrid");
        FlightFromTo flight2 = new FlightFromTo("Athens","London");
        FlightFromTo flight3 = new FlightFromTo("Athens","Rome");
        FlightFromTo flight4 = new FlightFromTo("Madrid","Athens");
        FlightFromTo flight5 = new FlightFromTo("London", "Athens");
        FlightFromTo flight6 = new FlightFromTo("Rome","Athens");
        FlightFromTo flight7 = new FlightFromTo("Rio de Janeiro", "Washington, D.C.");
        FlightFromTo flight8 = new FlightFromTo("Warsaw","Rio de Janeiro");
        FlightFromTo flight9 = new FlightFromTo("Madrid","Warsaw");
        FlightFromTo flight10 = new FlightFromTo("Rome","Berlin");
        FlightFromTo flight11 = new FlightFromTo("Berlin","Warsaw");
        FlightFromTo flight12 = new FlightFromTo("Berlin","Athens");

        Set<FlightFromTo> flightFromToSet = new HashSet<>();
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

        System.out.println("Database have " + flightDatabase.getFlightFromToSet().size() + " flights\n");
        displayFlights.displayList("***The flights from Athens***",
                searchFlight.flightFromToListFrom("Athens", flightDatabase));
        displayFlights.displayList("***The flights to Athens***",
                searchFlight.flightFromToListTo("Athens", flightDatabase));
        displayFlights.displayList("***The directly flights from Athens to Rome***",
                searchFlight.searchDirectFlightFromTo("Athens",
                        "Rome",
                        flightDatabase));
        displayFlights.displayMap("***The flights from Rome to Athens with one change***",
                searchFlight.flightsFromToWithOneChange("Rome",
                        "Athens",
                        flightDatabase));
    }
}
