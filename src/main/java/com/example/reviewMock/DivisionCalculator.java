package com.example.reviewMock;

/*
Q6: Create a Java class DivisionCalculator with a method divide(int numerator, int denominator)
that performs integer division. Handle the case where the denominator is zero by throwing an ArithmeticException.
In the main method, call divide with different values and handle any exceptions that are thrown.
 */

public class DivisionCalculator {

    public static int divide(int numerator, int denominator) throws ArithmeticException{

        if(denominator == 0){
            throw new ArithmeticException("Denominator can't be zero");
        }

        return numerator/denominator;
    }

    public static void main(String[] args) {
        try {
            // Valid division
            System.out.println("Result: " + divide(9, 3));

            // This will throw an ArithmeticException
            System.out.println("Result: " + divide(9, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
