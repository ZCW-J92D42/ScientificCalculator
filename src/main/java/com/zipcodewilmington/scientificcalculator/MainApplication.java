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
