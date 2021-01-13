package com.kodilla.good.patterns.challenges.flight.company;

public class Application {
    public static void main(String [] arg) {
        FlightDatabase flightDatabase = new FlightDatabase();
        DisplayFlights displayFlights = new DisplayFlights();
        SearchFlight searchFlight = new SearchFlight();

        System.out.println("Database have " + flightDatabase.getFlightMap().size() + " flights\n");
        displayFlights.displayList("***The flights from Athens***",
                searchFlight.flightListFrom("Athens", flightDatabase));
        displayFlights.displayList("***The flights to Athens***",
                searchFlight.flightListTo("Athens", flightDatabase));
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
