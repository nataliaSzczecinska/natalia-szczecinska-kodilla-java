package com.kodilla.good.patterns.challenges.flight.company;

import java.util.*;

public class FlightDatabase {
    private Set<Flight> flightSet;

    public FlightDatabase(Set<Flight> flightSet) {
        this.flightSet = flightSet;
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }
}
