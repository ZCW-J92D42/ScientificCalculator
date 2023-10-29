package com.zipcodewilmington.scientificcalculator;

public class FactorialFunction {
    public double factorial(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }

        return result;
    }
}