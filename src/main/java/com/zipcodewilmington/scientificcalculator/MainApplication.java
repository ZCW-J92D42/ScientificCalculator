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
        //Double num1 = DisplayClass.integerExtractor(s)[0];
        //Double num2 = DisplayClass.integerExtractor(s)[1];
        Double[] num = DisplayClass.integerExtractor(s);
        String operator = DisplayClass.operatorExtractor(s);
        //System.out.println(num1);
        //System.out.println(num2);
        //System.out.println(operator);

        Calculator calculator = new Calculator();
        //determines which operators to use
        switch(operator){
            case "+":
                System.out.println(calculator.addNumbers(num[0], num[1]));
                break;
            case "-":
                System.out.println(calculator.subtractNumbers(num[0], num[1]));
                break;
            case "*":
                System.out.println(calculator.multiplyNumbers(num[0], num[1]));
                break;
            case "/":
                if(num[1] == 0.0){
                    System.out.println("ERR");
                }else{
                System.out.println(calculator.divideNumbers(num[0], num[1]));
                }
                break;
            case "sq":
                System.out.println(calculator.square(num[0]));
                break;
            case "sqrt":
                System.out.println(calculator.squareRoot(num[0]));
                break;
            case "inv":
                System.out.println(calculator.inverse(num[0]));
                break;
            case "pow":
                System.out.println(calculator.exponentiation(num[0], num[1]));
                break;
        }

    }

}
