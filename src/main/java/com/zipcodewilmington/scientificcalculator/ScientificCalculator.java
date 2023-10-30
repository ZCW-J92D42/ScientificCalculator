package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator extends Calculator{

    private double memory; //creating a memory -- need to coordinate with LOC on the display
    private TrigFunctions trigFunctions; //Composiiton
    public ScientificCalculator(){
        super();
        this.memory = 0;
        this.trigFunctions = new TrigFunctions();
    }

    //Memory

    public void storeInMemory(double value){
        this.memory = value; // what does value mean
    }

    public double callFromMemory(){
        return this.memory;
    }

    public void clearMemory(){
        this.memory = 0;
    }

    // base 10 log
    public double log10(double userInput){
        if (userInput <= 0){
            errorMessage = "Undefined";
            throw new ArithmeticException(errorMessage);
        }
        currentValue = Math.log10(userInput);
        return currentValue;
    }
    //inverse Log
    public double inverseLog(double userInput){
        currentValue = Math.pow(10, userInput);
        return currentValue;
    }
    //natural log
    public double naturalLog(double userInput){
        currentValue = Math.log(userInput);
        return currentValue;
    }
    //inverse natural log
    public double inverseNaturalLog(double userInput){
        currentValue = Math.pow(Math.E, userInput);
        return currentValue;
    }

    //factorial
    public double factorial(double userInput){
        if (userInput < 0){
            errorMessage = "Undefined";
            throw new ArithmeticException(errorMessage);
        } else {
            double result = 1;
            for (; userInput > 0; userInput --){
                result *= userInput;
            }
            currentValue = result;
            return currentValue;
        }

    }

    // delegation of trig functions
    public double sine(double angle) {
        return trigFunctions.sine(angle);
    }

    public double cosine(double angle) {
        return trigFunctions.cosine(angle);
    }

    public double tangent(double angle) {
        return trigFunctions.tangent(angle);
    }

    public double inverseSine(double angle) {
        return trigFunctions.inverseSine(angle);
    }

    public double inverseCosine(double angle) {
        return trigFunctions.inverseCosine(angle);
    }

    public double inverseTangent(double angle) {
        return trigFunctions.inverseTangent(angle);
    }

    //Handle exceptions from TrigFunctions

    public void setTrigUnitMode(String mode){
        String result = trigFunctions.setUnitMode(mode);
        if ("Invalid input mode".equals(result)) {
            errorMessage = result;
            // Handle error as needed
        } else {
            // Do something with the result, like displaying it to the user
        }
    }

}


