package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.util.*;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    private World preparedDataTest() {
        //countries Africa
        List<Country> africaCountries = new ArrayList<>();
        africaCountries.add(new Country("Algieria", new BigDecimal("42228408")));
        africaCountries.add(new Country("Angola", new BigDecimal("30809787")));
        africaCountries.add(new Country("Cameroon", new BigDecimal("25216267")));
        africaCountries.add(new Country("Democratic Republic of the Congo",
                new BigDecimal("84068091")));
        africaCountries.add(new Country("Egypt", new BigDecimal("98423598")));
        africaCountries.add(new Country("Ethiopia", new BigDecimal("109224414")));
        africaCountries.add(new Country("Kenya", new BigDecimal("51392565")));
        africaCountries.add(new Country("Libya", new BigDecimal("6678559")));
        africaCountries.add(new Country("Niger", new BigDecimal("22442831")));
        africaCountries.add(new Country("Nigeria", new BigDecimal("195874685")));
        africaCountries.add(new Country("Republic of South Africa",
                new BigDecimal("57792518")));
        africaCountries.add(new Country("Sudan", new BigDecimal("41801533")));

        //countries Asia
        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("Russia", new BigDecimal("146748590")));
        asiaCountries.add(new Country("China", new BigDecimal("1427647786")));
        asiaCountries.add(new Country("India", new BigDecimal("1352642280")));
        asiaCountries.add(new Country("Kazakhstan", new BigDecimal("18319618")));
        asiaCountries.add(new Country("Saudi Arabia", new BigDecimal("33702756")));
        asiaCountries.add(new Country("Turkey", new BigDecimal("82340088")));
        asiaCountries.add(new Country("Pakistan", new BigDecimal("212228286")));
        asiaCountries.add(new Country("Japan", new BigDecimal("127202192")));

        //contries Europe
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("Germany", new BigDecimal("80996685")));
        europeCountries.add(new Country("France", new BigDecimal("66259012")));
        europeCountries.add(new Country("Great Britan", new BigDecimal("63742977")));
        europeCountries.add(new Country("Italy", new BigDecimal("61680122")));
        europeCountries.add(new Country("Spain", new BigDecimal("47737941")));
        europeCountries.add(new Country("Ukraine", new BigDecimal("42805731")));
        europeCountries.add(new Country("Poland", new BigDecimal("38346279")));
        europeCountries.add(new Country("Portugal", new BigDecimal("10813834")));
        europeCountries.add(new Country("Greece", new BigDecimal("10775557")));
        europeCountries.add(new Country("The Netherlands", new BigDecimal("16877351")));
        europeCountries.add(new Country("The Czech Republic", new BigDecimal("10627448")));
        europeCountries.add(new Country("Slovakia", new BigDecimal("5443583")));
        europeCountries.add(new Country("Austia", new BigDecimal("8223062")));
        europeCountries.add(new Country("Hungary", new BigDecimal("9919128")));
        europeCountries.add(new Country("Switzerland", new BigDecimal("8061516")));
        europeCountries.add(new Country("Norway", new BigDecimal("5147792")));
        europeCountries.add(new Country("Sweden", new BigDecimal("9723809")));
        europeCountries.add(new Country("Finland", new BigDecimal("5268799")));
        europeCountries.add(new Country("Lithuania", new BigDecimal("3505738")));
        europeCountries.add(new Country("Esthonia", new BigDecimal("1257921")));
        europeCountries.add(new Country("Latvia", new BigDecimal("2165165")));

        //countries North America
        List<Country> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add(new Country("Canada", new BigDecimal("37064562")));
        northAmericaCountries.add(new Country("The United States", new BigDecimal("327096265")));
        northAmericaCountries.add(new Country("Mexico", new BigDecimal("128649565")));

        //countries South
        List<Country> southAmericaCountries = new ArrayList<>();
        southAmericaCountries.add(new Country("Brazil", new BigDecimal("209469323")));
        southAmericaCountries.add(new Country("Argentina", new BigDecimal("44361150")));
        southAmericaCountries.add(new Country("Colombia", new BigDecimal("18729160")));
        southAmericaCountries.add(new Country("Chile", new BigDecimal("49661048")));
        southAmericaCountries.add(new Country("Peru", new BigDecimal("31989260")));
        southAmericaCountries.add(new Country("Uruguay", new BigDecimal("3449285")));
        southAmericaCountries.add(new Country("Venezuela", new BigDecimal("28887118")));

        //continents
        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Africa", africaCountries));
        continents.add(new Continent("Asia", asiaCountries));
        continents.add(new Continent("Europe", europeCountries));
        continents.add(new Continent("North America", northAmericaCountries));
        continents.add(new Continent("South America", southAmericaCountries));

        //world
        World world = new World(continents);

        return world;
    }

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = preparedDataTest();
        BigDecimal totalPeopleExpected = new BigDecimal("5555521038");

        //When
        BigDecimal totalPeopleCalulate = world.getPeopleQuantity();

        //Then
        assertEquals(totalPeopleExpected, totalPeopleCalulate);
    }
}
