package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import jdk.dynalink.Operation;


public class Computing {

    public void compute(){
        Scanner scanner = new Scanner(System.in);
        double input1 = scanner.nextDouble();
        double input2 = scanner.nextDouble();
        //ScinentificFeatures scientific = new ScientificFeatures;
        Operations operation = new Operations();
        double solution = 0;
        System.out.println("Booting up calculator...");

        while(true) {
            String display = String.valueOf(0);
            //created an array of choices for the user
            String[] choiceArray = {
                    "1. Clear Screen", "2. Add", "3. Subtract", "4. Multiply", "5. Division",
                    "6. Square", "7. Square Root", "8. Variable Exponential", "9. Inverse", "10. Invert\n",
                    "Switch - Switch to scientific calculations",
                    "11. sin(", "12. cos(", "13. tan(", "14. Inverse sin(", "15. Inverse cos(", "16. tan(",
                    "17. Log", "18. Inverse Logarithm", "19. Natural Logarithm", "20. Inverse Natural Logarithm",
                    "21. Off/Shut Down"
            };
            //prompt user to enter a number
            System.out.println("\nPlease enter a number or enter \"switch\" to change to scientific functions");
            //looping through the array to list out the choices
            for (int i = 0; i < choiceArray.length; i++) {
                System.out.println(choiceArray[i]);
            }
            //saves user's number in the variable userInput
            int userInput = scanner.nextInt();

//                if (userInput.equals("21")) {
//                    System.out.println("Ok, calculator will now turn off.");
//                    System.exit(0);
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

            }else if (userInput >= 11 && userInput <= 20) {
                System.out.println("You have switched to the Scientific Functions. Your input is for:\n");
                switch (userInput) {
                    case 11:
                        solution = scienfic.sine();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 12:
                        solution = scienfic.cosine();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 13:
                        solution = scienfic.tangent();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 14:
                        solution = scienfic.invsin();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 15:
                        solution = scienfic.invcosine();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 16:
                        solution = scienfic.invtangent();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 17:
                        solution = scienfic.log();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 18:
                        solution = scienfic.invlog();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 19:
                        solution = scienfic.natlog();
                        display = String.valueOf(solution);
                        System.out.printf("Scientific Operations: %s", display);
                    case 20:
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


