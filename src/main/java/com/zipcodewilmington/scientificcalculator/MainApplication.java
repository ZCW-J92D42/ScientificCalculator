package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("0");
      /*  String s = DisplayClass.integerExtract("Enter a string");


        // User needs to enter the operations they want to perform.   SQRT means to do square root.
        String s = Console.getStringInput("Enter a string");

        //
        Integer i = Console.getIntegerInput("Enter an integer");

        //
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as an integer", i);
        Console.println("The user input %s as a d", d);

*/
        //ignore below
        DisplayClass.clearDisplay();
        String s = Console.getStringInput("Enter your math problem");
        Double num1 = DisplayClass.integerExtractor(s)[0];
        Double num2 = DisplayClass.integerExtractor(s)[1];
        String operator = DisplayClass.operatorExtractor(s);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(operator);

    }

}
