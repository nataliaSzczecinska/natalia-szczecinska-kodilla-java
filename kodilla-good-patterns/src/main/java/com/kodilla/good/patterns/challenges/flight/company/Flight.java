package com.kodilla.good.patterns.challenges.flight.company;

import java.util.Objects;

public class Flight {
    private String departureFrom;
    private String arrivalTo;
    private String flightID;
    private Airline airlines;
    private double price;

    public Flight(String departureFrom,
                  String arrivalTo,
                  String flightID,
                  Airline airlines,
                  double price) {
        this.departureFrom = departureFrom;
        this.arrivalTo = arrivalTo;
        this.flightID = flightID;
        this.airlines = airlines;
        this.price = price;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public String getArrivalTo() {
        return arrivalTo;
    }

    public String getFlightID() {
        return flightID;
    }

    public Airline getAirlines() {
        return airlines;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flight from " + departureFrom +
                " to " + arrivalTo +
                "\nAirline: " + airlines +
                "\nFlight number: " + flightID +
                "\nPrice: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureFrom, flight.departureFrom) &&
                Objects.equals(arrivalTo, flight.arrivalTo) &&
                Objects.equals(flightID, flight.flightID) &&
                Objects.equals(airlines, flight.airlines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureFrom, arrivalTo, flightID, airlines);
    }
}
