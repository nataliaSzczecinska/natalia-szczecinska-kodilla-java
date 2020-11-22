package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class Continent {

    private final  List <Country> countries = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public List<Country> getCountries() {

        List<Country> resultList = new ArrayList();

        if (continentName.equals("Africa")) {
            countries.add(new Country("Algieria", new BigDecimal("42228408")));
            countries.add(new Country("Angola", new BigDecimal("30809787")));
            countries.add(new Country("Cameroon", new BigDecimal("25216267")));
            countries.add(new Country("Democratic Republic of the Congo",
                                                new BigDecimal("84068091")));
            countries.add(new Country("Egypt", new BigDecimal("98423598")));
            countries.add(new Country("Ethiopia", new BigDecimal("109224414")));
            countries.add(new Country("Kenya", new BigDecimal("51392565")));
            countries.add(new Country("Libya", new BigDecimal("6678559")));
            countries.add(new Country("Niger", new BigDecimal("22442831")));
            countries.add(new Country("Nigeria", new BigDecimal("195874685")));
            countries.add(new Country("Republic of South Africa",
                                                new BigDecimal("57792518")));
            countries.add(new Country("Sudan", new BigDecimal("41801533")));

            resultList = countries;

            return resultList;
        } else if (continentName.equals("Asia")) {
            countries.add(new Country("Russia", new BigDecimal("146748590")));
            countries.add(new Country("China", new BigDecimal("1427647786")));
            countries.add(new Country("India", new BigDecimal("1352642280")));
            countries.add(new Country("Kazakhstan", new BigDecimal("18319618")));
            countries.add(new Country("Saudi Arabia", new BigDecimal("33702756")));
            countries.add(new Country("Turkey", new BigDecimal("82340088")));
            countries.add(new Country("Pakistan", new BigDecimal("212228286")));
            countries.add(new Country("Japan", new BigDecimal("127202192")));

            resultList = countries;

            return resultList;
        } else if (continentName.equals("Europe")) {
            countries.add(new Country("Germany", new BigDecimal("80996685")));
            countries.add(new Country("France", new BigDecimal("66259012")));
            countries.add(new Country("Great Britan", new BigDecimal("63742977")));
            countries.add(new Country("Italy", new BigDecimal("61680122")));
            countries.add(new Country("Spain", new BigDecimal("47737941")));
            countries.add(new Country("Ukraine", new BigDecimal("42805731")));
            countries.add(new Country("Poland", new BigDecimal("38346279")));
            countries.add(new Country("Portugal", new BigDecimal("10813834")));
            countries.add(new Country("Greece", new BigDecimal("10775557")));
            countries.add(new Country("The Netherlands", new BigDecimal("16877351")));
            countries.add(new Country("The Czech Republic", new BigDecimal("10627448")));
            countries.add(new Country("Slovakia", new BigDecimal("5443583")));
            countries.add(new Country("Austia", new BigDecimal("8223062")));
            countries.add(new Country("Hungary", new BigDecimal("9919128")));
            countries.add(new Country("Switzerland", new BigDecimal("8061516")));
            countries.add(new Country("Norway", new BigDecimal("5147792")));
            countries.add(new Country("Sweden", new BigDecimal("9723809")));
            countries.add(new Country("Finland", new BigDecimal("5268799")));
            countries.add(new Country("Lithuania", new BigDecimal("3505738")));
            countries.add(new Country("Esthonia", new BigDecimal("1257921")));
            countries.add(new Country("Latvia", new BigDecimal("2165165")));

            resultList = countries;

            return resultList;
        } else if (continentName.equals("North America")){
            countries.add(new Country("Canada", new BigDecimal("37064562")));
            countries.add(new Country("The United States", new BigDecimal("327096265")));
            countries.add(new Country("Mexico", new BigDecimal("128649565")));

            resultList = countries;

            return resultList;
        } else if (continentName.equals("South America")) {
            countries.add(new Country("Brazil", new BigDecimal("209469323")));
            countries.add(new Country("Argentina", new BigDecimal("44361150")));
            countries.add(new Country("Colombia", new BigDecimal("18729160")));
            countries.add(new Country("Chile", new BigDecimal("49661048")));
            countries.add(new Country("Peru", new BigDecimal("31989260")));
            countries.add(new Country("Uruguay", new BigDecimal("3449285")));
            countries.add(new Country("Venezuela", new BigDecimal("28887118")));

            resultList = countries;

            return resultList;
        }

        return resultList;
    }
}
