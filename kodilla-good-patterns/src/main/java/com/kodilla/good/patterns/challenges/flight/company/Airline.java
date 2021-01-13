package com.kodilla.good.patterns.challenges.flight.company;

public enum Airline {
    QatarAirways("Qatar Airways"),
    SingaporeAirlines("SingaporeAirlines"),
    QantasAirways("Qantas Airways"),
    Lufthansa("Lufthansa"),
    Wizzair("Wizzair"),
    LOTPolishAirlines("LOT Polish Airlines"),
    Ryanair("Ryanair");

    private String airlineName;

    Airline(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    @Override
    public String toString() {
        return airlineName;
    }
}
