package com.kodilla.exception.test;

public class ExceptionHandling {

    public String probablyIWillThrowException(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String text = new String();

        try {
            text = secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("There is an exception");
        } finally {
            return text;
        }
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        String exceptionHandingText = exceptionHandling.probablyIWillThrowException(1.0, 2.0);
        System.out.println(exceptionHandingText);

        exceptionHandingText = exceptionHandling.probablyIWillThrowException(0.9, 2.0);
        System.out.println(exceptionHandingText);

        exceptionHandingText = exceptionHandling.probablyIWillThrowException(2.0, 2.0);
        System.out.println(exceptionHandingText);

        exceptionHandingText = exceptionHandling.probablyIWillThrowException(1.0, 1.5);
        System.out.println(exceptionHandingText);

    }
}
