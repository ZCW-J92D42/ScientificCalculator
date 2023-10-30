package com.zipcodewilmington.scientificcalculator;

public class ScientificFeatures {
    private boolean isDegrees = true;
    private String displayMode = "Decimal"; // The default display mode is Decimal
    private FactorialFunction factorialFunction = new FactorialFunction();

    // Constructors and getter methods

    // Trigonometric functions
    public double sine(double entry) {
        return isDegrees ? Math.sin(Math.toRadians(entry)) : Math.sin(entry);
    }

    public double cosine(double entry) {
        return isDegrees ? Math.cos(Math.toRadians(entry)) : Math.cos(entry);
    }

    public double tangent(double entry) {
        return isDegrees ? Math.tan(Math.toRadians(entry)) : Math.tan(entry);
    }

    // Inverse trigonometric functions
    public double inverseSine(double entry) {
        return isDegrees ? Math.toDegrees(Math.asin(entry)) : Math.asin(entry);
    }

    public double inverseCosine(double entry) {
        return isDegrees ? Math.toDegrees(Math.acos(entry)) : Math.acos(entry);
    }

    public double inverseTangent(double entry) {
        return isDegrees ? Math.toDegrees(Math.atan(entry)) : Math.atan(entry);
    }

    // Logarithmic functions
    public double logarithmBase10(double entry) {
        return Math.log10(entry);
    }

    public double inverseLogarithmBase10(double entry) {
        return Math.pow(10, entry);
    }

    public double naturalLogarithm(double entry) {
        return Math.log(entry);
    }

    public double inverseNaturalLogarithm(double entry) {
        return Math.exp(entry);
    }

    // Unit switching
    public void switchUnitsMode(String mode) {
        if (mode.equalsIgnoreCase("Degrees")) {
            isDegrees = true;
        } else if (mode.equalsIgnoreCase("Radians")) {
            isDegrees = false;

        } else {
            throw new IllegalArgumentException("Invalid mode. Supported modes are 'Degrees' and 'Radians'.");
        }
    }

    // Method to apply the display mode to received input
    public double applyDisplayMode(double entry, double entry2) {
        if (entry == 1) {
            System.out.println("Binary");
            return Double.parseDouble(Integer.toBinaryString((int) entry2));
        } else if (entry == 2) {
            System.out.println("Octal");
            return Double.parseDouble(Integer.toOctalString((int) entry2));
        } else if (entry == 3) {
            System.out.println("Decimal");
            return Double.parseDouble(Integer.toBinaryString((int) entry2));
        } else if (entry == 4) {
            System.out.println("Hexadecimal");
            return Double.parseDouble(Integer.toHexString((int) entry2));
        }
        return entry2;
    }
}
