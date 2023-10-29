package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import jdk.dynalink.Operation;


public class Computing {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ScientificFeatures scientific = new ScientificFeatures();
        Operations operation = new Operations();
        double solution = 0;
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
        for (int i = 0; i < choiceArray.length; i++) {
            System.out.println(choiceArray[i]);
        }
        while(true) {
            String display = String.valueOf(0);


            //prompt user to enter a number
            System.out.println("\nPlease enter a number: ");
            //saves user's number in the variable userInput
            int userInput = scanner.nextInt();

            //starting switch case statement that will run conditions based upon user's choice
            if (userInput > 0 && userInput <= 10){
                double input1 = scanner.nextDouble();
                double input2 = scanner.nextDouble();
                for (int i = 0; i < choiceArray.length; i++) {
                    System.out.println(choiceArray[i]);
                }
                switch (userInput) {
                    case 1:
                        //This will convert the variable into a string data type
                        display = String.valueOf(0);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 2:
                        System.out.println("Addition");
                        //solution will be converted to a string and saved to the variable display
                        solution = operation.add(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 3:
                        System.out.println("Subtraction");
                        solution = operation.subtract(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 4:
                        System.out.println("Multiplication");
                        solution = operation.multiply(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 5:
                        System.out.println("Division");
                        solution = operation.divide(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 6:
                        solution = operation.square(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 7:
                        solution = operation.squareRoot(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 8:
                        solution = operation.expo(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 9:
                        solution = operation.inverse(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                        break;
                    case 10:
                        solution = operation.invert(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s",  display);
                        break;
                }

            }else if (userInput >= 11 && userInput <= 20) {
                double input1 = scanner.nextDouble();
                double input2 = scanner.nextDouble();

                switch (userInput) {
                    case 11:
                        solution = scientific.sine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                    case 12:
                        solution = scientific.cosine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                    case 13:
                        solution = scientific.tangent(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                    case 14:
                        solution = scientific.inverseSine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                    case 15:
                        solution = scientific.inverseCosine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                    case 16:
                        solution = scientific.inverseTangent(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                    /*case 17:
                        solution = scientific.log();
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                    case 18:
                        solution = scientific.invlog();
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                    case 19:
                        solution = scientific.natlog();
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);
                    case 20:
                        solution = scientific.invnatlog();
                        display = String.valueOf(solution);
                        System.out.printf("Solution %s", display);*/
                }
            }else if (userInput == 21){
                System.out.println("Turning off calculator...");
                System.exit(0);
            } else {
                System.out.println("\nThat is not an correct selection\nPlease choose from the selection list");
            }


    }

}
}


