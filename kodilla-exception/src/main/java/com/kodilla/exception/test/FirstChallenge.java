package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        double result = 0;

        try {
            result = a / b ;
            if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException exception) {
            System.out.println("There is an error: " + exception);
        } finally {
            System.out.print("\nThere divide " + a + "/" + b + " = ");
        }

        return result;
    }


    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.print(result + "\n");

        result = firstChallenge.divide(3, 2);

        System.out.print(result);
    }
}
