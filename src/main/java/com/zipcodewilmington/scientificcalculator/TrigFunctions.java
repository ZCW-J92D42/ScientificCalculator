package com.zipcodewilmington.scientificcalculator;

public class TrigFunctions {
    private String unitMode; //guessing were using a scanner ?
    //declare variables for the units modes (both degrees and radianss)
    public TrigFunctions(){
        this.unitMode = "Degrees"; //default mode is degrees
    }
    public void setUnitMode(String mode){
        if (mode.equals("Degrees") || mode.equals("Radians")){
            this.unitMode = mode;
            return String.format("Set to %s mode", mode);
        } else {
            return "Invalid input mode";
        }
    }
    public void switchUnitMode(){
        if(this.unitMode.equals("Degrees"){
            this.unitMode = "Radians";
        } else if (this.unitMode.equals("Radians")) {
            this.unitMode = "Degrees";
        }
    }

    //methods for sin, cosine, tangent, etc.

    //Sine

    public double sine(double userInput){ //change userInput to givenNumber globally
        double currentValue;
        if (this.unitMode.equals("Degrees")) {
            currentValue = Math.sin(Math.toRadians(userInput));
        } else {
            currentValue = Math.sin(userInput);
        }
        return currentValue;
    }

    //Cosine

    public double cosine(double userInput){ //change userInput to givenNumber globally
        double currentValue;
        if (this.unitMode.equals("Degrees")) {
            currentValue = Math.cos(Math.toRadians(userInput));
        } else {
            currentValue = Math.cos(userInput);
        }
        return currentValue;
    }

    //Tangent
    public double tangent(double userInput){ //change userInput to givenNumber globally
        double currentValue;
        if (this.unitMode.equals("Degrees")) {
            currentValue = Math.tan(Math.toRadians(userInput));
        } else {
            currentValue = Math.tan(userInput)
        }
        return currentValue;
    }

    //Inverse Sine

    public double inverseSine(double userInput){ //change userInput to givenNumber globally
        double currentValue = Math.asin(userInput);
        if (this.unitMode.equals("Degrees")) {
            currentValue = Math.toDegrees(currentValue);
        }
        return currentValue;
    }
    //Inverse Cosine
    public double inverseCosine(double userInput){ //change userInput to givenNumber globally
        double currentValue = Math.acos(userInput);
        if (this.unitMode.equals("Degrees")) {
            currentValue = Math.toDegrees(currentValue);
        }
        return currentValue;
    }
}
    //Inverse Tangent
    public double inverseTangent(double userInput){ //change userInput to givenNumber globally
        double currentValue = Math.atan(userInput);
        if (this.unitMode.equals("Degrees")) {
            currentValue = Math.toDegrees(currentValue);
        }
        return currentValue;
    }
}


