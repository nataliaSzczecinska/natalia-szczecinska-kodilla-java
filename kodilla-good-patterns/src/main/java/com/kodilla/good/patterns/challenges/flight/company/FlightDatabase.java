package com.kodilla.good.patterns.challenges.flight.company;

import java.util.*;

public class FlightDatabase {
    private Map<String, Flight> flightMap;
    private Set<FlightFromTo> flightFromToSet;

    public FlightDatabase() {
        this.flightMap = createFlightMap();
        this.flightFromToSet = createFlightSet();
    }

    public FlightDatabase(Set<FlightFromTo> flightFromToSet) {
        this.flightFromToSet = flightFromToSet;
    }

    public FlightDatabase(Map<String, Flight> flightMap) {
        this.flightMap = flightMap;
    }

    private Map<String, Flight> createFlightMap() {
        Map<String, Flight> createdFlightMap = new LinkedHashMap<>();

        Flight flight1 = new Flight("Athens",
                "Madrid",
                "AM WA 1201923",
                Airline.Wizzair,
                599.99);
        Flight flight2 = new Flight("Athens",
                "London",
                "AL LG 0192302",
                Airline.Lufthansa,
                2500.0);
        Flight flight3 = new Flight("Athens",
                "Rome",
                "AR SA 3900909",
                Airline.SingaporeAirlines,
                3499.9);
        Flight flight4 = new Flight("Madrid",
                "Athens",
                "MA WA 2131443",
                Airline.Wizzair,
                599.99);
        Flight flight5 = new Flight("London",
                "Athens",
                "LA LG 00234213",
                Airline.Lufthansa,
                2500.0);
        Flight flight6 = new Flight("Rome",
                "Athens",
                "RA SA 32098422",
                Airline.SingaporeAirlines,
                3499.9);
        Flight flight7 = new Flight("Rio de Janeiro",
                "Washington, D.C.",
                "RW LOT 1123241",
                Airline.LOTPolishAirlines,
                1500.0);
        Flight flight8 = new Flight("Warsaw",
                "Rio de Janeiro",
                "WR LG 23141532",
                Airline.Lufthansa,
                7500.0);
        Flight flight9 = new Flight("Madrid",
                "Warsaw",
                "MW QA 34353234",
                Airline.QantasAirways,
                2459.89);
        Flight flight10 = new Flight("Rome",
                "Berlin",
                "RB QRA 2342378",
                Airline.QatarAirways,
                3433.87);
        Flight flight11 = new Flight("Berlin",
                "Warsaw",
                "AL LG 0967443",
                Airline.Lufthansa,
                2500.0);
        Flight flight12 = new Flight("Berlin",
                "Athens",
                "AR SA 3452342",
                Airline.Ryanair,
                499.9);

        createdFlightMap.put(flight1.getFlightID(), flight1);
        createdFlightMap.put(flight2.getFlightID(), flight2);
        createdFlightMap.put(flight3.getFlightID(), flight3);
        createdFlightMap.put(flight4.getFlightID(), flight4);
        createdFlightMap.put(flight5.getFlightID(), flight5);
        createdFlightMap.put(flight6.getFlightID(), flight6);
        createdFlightMap.put(flight7.getFlightID(), flight7);
        createdFlightMap.put(flight8.getFlightID(), flight8);
        createdFlightMap.put(flight9.getFlightID(), flight9);
        createdFlightMap.put(flight10.getFlightID(), flight10);
        createdFlightMap.put(flight11.getFlightID(), flight11);
        createdFlightMap.put(flight12.getFlightID(), flight12);

        return createdFlightMap;
    }

    private Set<FlightFromTo> createFlightSet(){
        Set<FlightFromTo> createdFlightSet = new LinkedHashSet<>();

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

        createdFlightSet.add(flight1);
        createdFlightSet.add(flight2);
        createdFlightSet.add(flight3);
        createdFlightSet.add(flight4);
        createdFlightSet.add(flight5);
        createdFlightSet.add(flight6);
        createdFlightSet.add(flight7);
        createdFlightSet.add(flight8);
        createdFlightSet.add(flight9);
        createdFlightSet.add(flight10);
        createdFlightSet.add(flight11);
        createdFlightSet.add(flight12);

        return createdFlightSet;
    }

    public Map<String, Flight> getFlightMap() {
        return flightMap;
    }

    public Set<FlightFromTo> getFlightFromToSet() {
        return flightFromToSet;
    }
}
