package com.kodilla.good.patterns.challenges.flight.company;

import java.util.Objects;

public class FlightFromTo {
    private String departureFrom;
    private String arrivalTo;

    public FlightFromTo(String departureFrom, String arrivalTo) {
        this.departureFrom = departureFrom;
        this.arrivalTo = arrivalTo;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public String getArrivalTo() {
        return arrivalTo;
    }

    @Override
    public String toString() {
        return "Flight from " + departureFrom +
                " to " + arrivalTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightFromTo that = (FlightFromTo) o;
        return Objects.equals(departureFrom, that.departureFrom) &&
                Objects.equals(arrivalTo, that.arrivalTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureFrom, arrivalTo);
    }
}
