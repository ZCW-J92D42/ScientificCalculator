package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import jdk.dynalink.Operation;


public class Computing {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ScientificFeatures scientific = new ScientificFeatures();
        Operations operation = new Operations();
        FactorialFunction factorial = new FactorialFunction();
        double solution = 0;
        String display = String.valueOf(0);
        System.out.println("Booting up calculator...");

        // created an array of choices for the user
        String[] choiceArray = {
                "1. Clear Screen", "2. Add", "3. Subtract", "4. Multiply", "5. Division",
                "6. Square", "7. Square Root", "8. Variable Exponential", "9. Inverse", "10. Invert\n",
                "11. Switch to scientific calculations", "12. Off/Shut Down", "11. sin(", "12. cos(",
                "13. tan(", "14. Inverse sin(", "15. Inverse cos(", "16. tan(", "17. Log", "18. Inverse Logarithm",
                "19. Natural Logarithm", "20. Inverse Natural Logarithm", "21. Off/Shut Down"
            };
        //looping through the array to list out the choices

        while(true) {
            for (int i = 0; i < choiceArray.length; i++) {
                System.out.println(choiceArray[i]);
            }

            System.out.println("\nPlease enter a number: ");
            int userInput = scanner.nextInt();

            if (userInput > 0 && userInput <= 10){
                switch (userInput) {
                    case 1:
                        //This will convert the variable into a string data type
                        display = String.valueOf(0);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 2:
                        System.out.println("Addition");
                        double input1 = scanner.nextDouble();
                        double input2 = scanner.nextDouble();
                        solution = operation.add(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 3:
                        System.out.println("Subtraction");
                        input1 = scanner.nextDouble();
                        input2 = scanner.nextDouble();
                        solution = operation.subtract(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 4:
                        System.out.println("Multiplication");
                        input1 = scanner.nextDouble();
                        input2 = scanner.nextDouble();
                        solution = operation.multiply(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 5:
                        System.out.println("Division");
                        input1 = scanner.nextDouble();
                        input2 = scanner.nextDouble();
                        solution = operation.divide(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 6:
                        System.out.println("Square");
                        input1 = scanner.nextDouble();
                        input2 = scanner.nextDouble();
                        solution = operation.square(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 7:
                        System.out.println("Square Root");
                        input1 = scanner.nextDouble();
                        solution = operation.squareRoot(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 8:
                        System.out.println("Exponential");
                        input1 = scanner.nextDouble();
                        input2 = scanner.nextDouble();
                        solution = operation.expo(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 9:
                        System.out.println("Inverse");
                        input1 = scanner.nextDouble();
                        solution = operation.inverse(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 10:
                        System.out.println("Invert");
                        input1 = scanner.nextDouble();
                        solution = operation.invert(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s",  display);
                        break;
                }

            }else if (userInput >= 11 && userInput <= 20) {

                switch (userInput) {
                    case 11:
                        System.out.println("Sine");
                        double input1 = scanner.nextDouble();
                        solution = scientific.sine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 12:
                        System.out.println("Cosine");
                        input1 = scanner.nextDouble();
                        solution = scientific.cosine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 13:
                        System.out.println("Tangent");
                        input1 = scanner.nextDouble();
                        solution = scientific.tangent(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 14:
                        System.out.println("Inverse Sine");
                        input1 = scanner.nextDouble();
                        solution = scientific.inverseSine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 15:
                        System.out.println("Inverse Cosine");
                        input1 = scanner.nextDouble();
                        solution = scientific.inverseCosine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 16:
                        System.out.println("Inverse Tangent");
                        input1 = scanner.nextDouble();
                        solution = scientific.inverseTangent(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    /*case 17:
                        System.out.println("Log");
                        input1 = scanner.nextDouble();
                        solution = scientific.log();
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 18:
                        System.out.println(Inverse Log);
                        input1 = scanner.nextDouble();
                        solution = scientific.invlog();
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 19:
                        System.out.println(Natural Log);
                        input1 = scanner.nextDouble();
                        solution = scientific.natlog();
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 20:
                        System.out.println(Inverse Natural Log);
                        input1 = scanner.nextDouble();
                        solution = scientific.invnatlog();
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;*/
                }
            }else if (userInput == 21){
                System.out.println("Turning off calculator...");
                break;
            } else {
                System.out.println("\nThat is not an correct selection\nPlease choose from the selection list");
            }


    }

}
}


