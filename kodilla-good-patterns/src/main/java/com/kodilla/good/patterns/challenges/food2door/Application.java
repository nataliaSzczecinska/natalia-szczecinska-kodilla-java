package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class Application {
    public static void main (String [] arg) {
        User user = new User("Jan Kowalski",
                "JK 12345678",
                "jan.kowalski",
                "Warszawa 00-123, Zamkowa 2 m. 32",
                "jan.kowalski@op.pl",
                new EMailInformationService("jan.kowalski@op.pl"));

        Product cheese1 = new Product("Cheese",
                "EFS C 01.123",
                Units.mass,
                12.45);
        Product cheese2 = new Product("Cheese",
                "HS C 123.123432.123",
                Units.mass,
                17.5);
        Product cheese3 = new Product("Cheese",
                "GFS C 34/2134/123",
                Units.mass,
                100.0);
        Product apple1 = new Product("Apple",
                "EFS F 02.009",
                Units.mass,
                12.45);
        Product apple2 = new Product("Apple",
                "HS F 101.19483.890",
                Units.mass,
                17.5);
        Product apple3 = new Product("Apple",
                "GFS F 01/0002/001",
                Units.art,
                1000.0);

        Map<String, Product> productList = new HashMap<>();


    }
}
