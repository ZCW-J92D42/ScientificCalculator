package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!\nUse these commands for other stuff:" +
                "\nsq, sqrt, inv, pow, sin, cos, tan, insin, incos, intan, Log, inLog, Ln, e^x, !" +
                "\nType number first then operator then number" +
                "\nOr number then command" +
                "\nOR '1 quit' to quit");
        double current = 0;
      /*

        // User needs to enter the operations they want to perform.   SQRT means to do square root.
*/
        //ignore below
        DisplayClass.clearDisplay();
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        while (true) {
            System.out.println(current);
            DisplayClass.clearDisplay();
            String s = Console.getStringInput("Enter your math problem");
            String operator = DisplayClass.operatorExtractor(s);
            Double[] num = DisplayClass.integerExtractor(s);
            //System.out.println(num[0]);
            //System.out.println(num[1]);
            //System.out.println(operator);

            //determines which operators to use
            switch (operator) {
                case "+":
                    current = Calculator.addNumbers(num[0], num[1]);
                    break;
                case "-":
                    current = Calculator.subtractNumbers(num[0], num[1]);
                    break;
                case "*":
                    current = Calculator.multiplyNumbers(num[0], num[1]);
                    break;
                case "/":
                    if (num[1] == 0.0) {
                        System.out.println("ERR");
                    } else {
                        current = Calculator.divideNumbers(num[0], num[1]);
                    }
                    break;
                case "sq":
                    current = Calculator.square(num[0]);
                    break;
                case "sqrt":
                    current = Calculator.squareRoot(num[0]);
                    break;
                case "inv":
                    current = Calculator.inverse(num[0]);
                    break;
                case "pow":
                    current = Calculator.exponentiation(num[0], num[1]);
                    break;
                case "sin":
                    current = scientificCalculator.sine(num[0]);
                    break;
                case "cos":
                    current = scientificCalculator.cosine(num[0]);
                    break;
                case "tan":
                    current = scientificCalculator.tangent(num[0]);
                    break;
                case "insin":
                    current = scientificCalculator.inverseSine(num[0]);
                    break;
                case "incos":
                    current = scientificCalculator.inverseCosine(num[0]);
                    break;
                case "intan":
                    current = scientificCalculator.inverseTangent(num[0]);
                    break;
                case "Log":
                    current = scientificCalculator.log10(num[0]);
                    break;
                case "inLog":
                    current = scientificCalculator.inverseLog(num[0]);
                    break;
                case "Ln":
                    current = scientificCalculator.naturalLog(num[0]);
                    break;
                case "e^x":
                    current = scientificCalculator.inverseNaturalLog(num[0]);
                    break;
                case "!":
                    current = scientificCalculator.factorial(num[0]);
                    break;
            } if (operator.equals("quit")){
                break;
            }
        }
    }
}