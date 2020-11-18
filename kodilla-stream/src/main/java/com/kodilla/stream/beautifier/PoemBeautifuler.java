package com.kodilla.stream.beautifier;

public class PoemBeautifuler {
    public static void beautify (String text, PoemDecorator decorator) {
        String decorateText = decorator.decorate(text);
        System.out.println(decorateText);
    }
}
