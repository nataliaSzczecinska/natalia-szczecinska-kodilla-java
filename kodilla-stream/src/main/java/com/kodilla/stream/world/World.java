package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public World() {
        continents.add(new Continent("Africa"));
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Europe"));
        continents.add(new Continent("North America"));
        continents.add(new Continent("South America"));
    }

    public List<Continent> getContinents() {
        List<Continent> continentList = new ArrayList<>();
        continentList = continents;

        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        List<Country> countryList = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .collect(Collectors.toList());

        BigDecimal totalPeople = countryList.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));

        return totalPeople;
    }
}
