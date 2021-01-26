package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.*;

public class MovieStore {

    public static void main(String[] args) {

    }

    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public void displayTitles() {
        Map <String, List<String>> titleMoviesMap = getMovies();

        String text = titleMoviesMap.entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(e -> e + " ! ")
                .collect(Collectors.joining());

        System.out.println(text);
    }
}
