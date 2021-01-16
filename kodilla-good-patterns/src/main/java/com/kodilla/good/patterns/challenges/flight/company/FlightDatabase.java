package com.kodilla.good.patterns.challenges.flight.company;

import java.util.*;

public class FlightDatabase {
    private Set<FlightFromTo> flightFromToSet;

    public FlightDatabase(Set<FlightFromTo> flightFromToSet) {
        this.flightFromToSet = flightFromToSet;
    }

    public Set<FlightFromTo> getFlightFromToSet() {
        return flightFromToSet;
    }
}
