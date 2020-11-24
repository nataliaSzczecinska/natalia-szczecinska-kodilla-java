package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public final class World {

    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        List<Continent> continentList = new ArrayList<>();
        continentList = continents;

        return continentList;
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
