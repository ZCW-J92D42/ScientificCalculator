package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import jdk.dynalink.Operation;


public class Computing {

    public void compute(){
        Scanner scanner = new Scanner(System.in);
        double input1 = scanner.nextDouble();
        double input2 = scanner.nextDouble();
        ScientificFeatures scientific = new ScientificFeatures();
        Operations operation = new Operations();
        double solution = 0;
        System.out.println("Booting up calculator...");

        while(true) {
            String display = String.valueOf(0);
            //created an array of choices for the user
            String[] choiceArray = {
                    "1. Clear Screen", "2. Add", "3. Subtract", "4. Multiply", "5. Division",
                    "6. Square", "7. Square Root", "8. Variable Exponential", "9. Inverse", "10. Invert\n",
                    "11. Switch to scientific calculations", "12. Off/Shut Down"
            };
            //prompt user to enter a number
            System.out.println("\nPlease enter a number or enter \"switch\" to change to scientific functions");
            //looping through the array to list out the choices
            for (int i = 0; i < choiceArray.length; i++) {
                System.out.println(choiceArray[i]);
            }
            //saves user's number in the variable userInput
            int userInput = scanner.nextInt();
            //starting switch case statement that will run conditions based upon user's choice
            if (userInput > 0 && userInput <= 10){
                switch (userInput) {
                    case 1:
                        //This will convert the variable into a string data type
                        display = String.valueOf(0);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 2:
                        //solution will be converted to a string and saved to the variable display
                        solution = operation.add(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 3:
                        solution = operation.subtract(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 4:
                        solution = operation.multiply(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 5:
                        solution = operation.divide(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 6:
                        solution = operation.square(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 7:
                        solution = operation.squareRoot(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 8:
                        solution = operation.expo(input1, input2);
                        display = String.valueOf(solution);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 9:
                        solution = operation.inverse(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Core Operations: %s", display);
                        break;
                    case 10:
                        solution = operation.invert(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Core Operations: %s",  display);
                        break;
                }

            }else if (userInput == 11) {
                System.out.println("You have switched to the Scientific Functions. Choose an selection:\n");
                String[] scienceArray = {
                        "1. sin(", "2. cos(", "3. tan(", "4. Inverse sin(", "5. Inverse cos(", "6. tan(",
                        "7. Log", "8. Inverse Logarithm", "9. Natural Logarithm", "10. Inverse Natural Logarithm",
                        "11. Off/Shut Down", "12. Switch back to main operations"
                };
                for (int j = 0; j < scienceArray.length; j++) {
                    System.out.println(choiceArray[j]);
                switch (userInput) {
                    case 1:
                        solution = scientific.sine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 2:
                        solution = scientific.cosine(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 3:
                        solution = scientific.tangent(input1);
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 4:
                        solution = scientific.invsin();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 5:
                        solution = scienfic.invcosine();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 6:
                        solution = scienfic.invtangent();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 7:
                        solution = scienfic.log();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 8:
                        solution = scienfic.invlog();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 9:
                        solution = scienfic.natlog();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 10:
                        solution = scienfic.invnatlog();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);

                }
            } else if (userInput == 21){
                System.out.println("Turning off calculator...");
                System.exit(0);
            } else {
                System.out.println("\nThat is not an correct selection\nPlease choose from the selection list");
            }
        }


    }

}


