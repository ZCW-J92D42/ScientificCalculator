package com.zipcodewilmington.scientificcalculator;

/* Yea it'd be easier to use the Math class, and I probably should.  But let's see if this works.
 * Going to use operators as much as possible and see what pappens.
 * I will comment out the int methods we don't need or remove them before my final commits.
 * I will provide a list of methods to Nicole for UML & making sure our calls between classes work
 */


    // Change class to Calculator, change tests calls to Calculator.<method>
public class Calculator {

    /* Method to add two numbers:  ints, doubles, or mixed with either return
    public static int addNumbers(int currentNumber, int givenNumber) {
        int addNumbers = currentNumber + givenNumber;
        return addNumbers;
    }
     */

    // Method for adding two numbers, type doubles
    public static double addNumbers(double currentNumber, double givenNumber) {
        double addNumbers = currentNumber + givenNumber;
        return addNumbers;
    }

    // Method to divide two ints, one from display and one from input.  Should we display remainders?
    //  Modular division can be a feature, not necessary.
    public static int divideNumbers(int currentNumber, int givenNumber) {
        int divideNumbers = currentNumber / givenNumber;
        return divideNumbers;
    }

    public static int getRemainders(int currentNumber, int givenNumber) {
        int remainders = currentNumber % givenNumber;
        return remainders;
    }

    //  Either this function handles getting passed 0s and throws error, or 0 is prevented in denominator by caller
    public static double divideNumbers(double currentNumber, double givenNumber) {
        double divideNumbers = currentNumber / givenNumber;
        divideNumbers = Math.round(divideNumbers * 100000000) / 100000000.0;
        return divideNumbers;
    }

    /*
    public static int multiplyNumbers(int currentNumber, int givenNumber) {
        int multiplyNumbers = currentNumber * givenNumber;
        return multiplyNumbers;
    }
    */

    public static double multiplyNumbers(double currentNumber, double givenNumber) {
        double multiplyNumbers = currentNumber * givenNumber;
        multiplyNumbers = Math.round(multiplyNumbers * 100000000) / 100000000.0;
        return multiplyNumbers;
    }

    /*
    public static int subtractNumbers(int currentNumber, int givenNumber) {
        int subtractedNumbers = currentNumber - givenNumber;
        return subtractedNumbers;
    }
     */

    public static double subtractNumbers(double currentNumber, double givenNumber) {
        double subtractedNumbers = currentNumber - givenNumber;
        return subtractedNumbers;
    }

    /*
    public static int square(int currentNumber) {
        int sq = currentNumber * currentNumber;
        return sq;
    }
     */

    public static double square(double currentNumber) {
        double sq = currentNumber * currentNumber;
        return sq;
    }
    

    public static double squareRoot(double currentNumber) {
        double squareRoot = Math.sqrt(currentNumber);
        squareRoot = Math.round(squareRoot * 10000000) / 10000000.0;
        return squareRoot;
    }

    public static double inverse(double currentNumber) {
        double inverse = 1.0 / currentNumber;
        inverse = Math.round(inverse * 100000000) / 100000000.0;
        return inverse;
    }

    public static double exponentiation(double currentNumber, double givenNumber) {
        return Math.pow(currentNumber, givenNumber);
    }


}
