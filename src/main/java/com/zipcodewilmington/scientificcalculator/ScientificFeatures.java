package com.zipcodewilmington.scientificcalculator;

public class ScientificFeatures {
    public boolean isDegrees = true; // using boolean to represent units. True for degrees and false for radians
    private FactorialFunction factorialFunction = new FactorialFunction(); // Instantiate FactorialFunctions
    public ScientificFeatures() {
    }

    public void setUnits(boolean degrees) {
        isDegrees = degrees;
    }
    public boolean isDegrees() {
        return isDegrees;
    }
    public double sine(double entry) {
        if (isDegrees) {
            return Math.sin(Math.toRadians(entry));
        } else {
            return Math.sin(entry);
        }
    }
    public double cosine(double entry) {
        if (isDegrees) {
            return Math.cos(Math.toRadians(entry));
        } else {
            return Math.cos(entry);
        }
    }
    public double tangent(double entry) {
        if (isDegrees) {
            return Math.tan(Math.toRadians(entry));
        } else {
            return Math.tan(entry);
        }
    }
    public void switchUnitsMode() {
        isDegrees = !isDegrees;
    }
}
