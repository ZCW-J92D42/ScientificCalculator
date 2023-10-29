package com.zipcodewilmington.scientificcalculator;

public class Operations {
    public static void input1(double int1) {System.out.println(int1);}
    public static void input2(double int2) {System.out.println(int2);}
    public double add(double int1, double int2) {
        return int1 + int2;
    }

    public double subtract(double int1, double int2) {
        return int1 - int2;
    }

    public double multiply(double int1, double int2) {
        return int1 * int2;
    }

    public double divide(double int1, double int2) {
        return int1 / int2;
    }

    public double square(double int1) {
        return Math.pow(int1, 2);
    }

    public double squareRoot(double int1) {
        return Math.sqrt(int1);
    }

    public double expo(double int1, double int2) {
        return Math.pow(int1, int2);
    }

    public double invert(double int1) {
        return int1 * -1;
    }

    public double inverse(double int1) {
        return 1 / int1;
    }

    public double factorial(double int1) {
        double x = 0;
        for (double i = 1; i <= int1; i++) {
            x = int1 *= i;
        }
        return x;
    }
}