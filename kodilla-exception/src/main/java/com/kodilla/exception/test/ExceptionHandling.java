package com.kodilla.exception.test;

public class ExceptionHandling {

    public String probablyIWillThrowException(double x, double y) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        String text = new String();

        try  {
            text = secondChallenge.probablyIWillThrowException(2.5, 1.5);
        } catch (Exception e) {
            System.out.println("There is an exception");
        } finally {
            return text;
        }
    }
}
