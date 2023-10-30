package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("0");
      /*

        // User needs to enter the operations they want to perform.   SQRT means to do square root.
*/
        //ignore below
        DisplayClass.clearDisplay();
        String s = Console.getStringInput("Enter your math problem");
        String operator = DisplayClass.operatorExtractor(s);
        Double[] num = DisplayClass.integerExtractor(s);
        //System.out.println(num[0]);
        //System.out.println(num[1]);
        //System.out.println(operator);

        //determines which operators to use
        switch(operator){
            case "+":
                System.out.println(Calculator.addNumbers(num[0], num[1]));
                break;
            case "-":
                System.out.println(Calculator.subtractNumbers(num[0], num[1]));
                break;
            case "*":
                System.out.println(Calculator.multiplyNumbers(num[0], num[1]));
                break;
            case "/":
                if(num[1] == 0.0){
                    System.out.println("ERR");
                }else{
                System.out.println(Calculator.divideNumbers(num[0], num[1]));
                }
                break;
            case "sq":
                System.out.println(Calculator.square(num[0]));
                break;
            case "sqrt":
                System.out.println(Calculator.squareRoot(num[0]));
                break;
            case "inv":
                System.out.println(Calculator.inverse(num[0]));
                break;
            case "pow":
                System.out.println(Calculator.exponentiation(num[0], num[1]));
                break;
           /* case "sin":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
            case "cos":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
            case "tan":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
            case "insin":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
            case "incos":
                System.out.println(Calculator.exponentiation(num[0];
                break;
            case "intan":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
            case "Log":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
            case "inLog":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
            case "Ln":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
            case "e^x":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
            case "!":
                System.out.println(Calculator.exponentiation(num[0]);
                break;
                */
            case "quit":
                break;
        }
    }

}
