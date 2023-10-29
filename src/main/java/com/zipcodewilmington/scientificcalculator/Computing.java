package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import jdk.dynalink.Operation;


public class Computing {

    public void compute(){
        Scanner scanner = new Scanner(System.in);

        //ScinentificFeatures scientific = new ScientificFeatures;
        //Operation operation = new Operation();

        while(true) {
            System.out.println("Welcome to our Calculator");
            String display = String.valueOf(0);
            //created an array of choices for the user
            String[] choiceArray = {
                    "1. Clear Screen", "2. Add", "3. Subtract", "4. Multiply", "5. Division",
                    "6. Square", "7. Square Root", "8. Variable Exponential", "9. Inverse", "10. Invert",
                    "11. sin(", "12. cos(", "13. tan(", "14. Inverse sin(", "15. Inverse cos(", "16. tan(",
                    "17. Log", "18. Inverse Logarithm", "19. Natural Logarithm", "20. Inverse Natural Logarithm",
                    "21. Off/Shut Down"
            };
            System.out.println("\nPlease enter a number");
            String userInput = scanner.nextLine();
            //looping through the array to list out the choices
            for (int i = 0; i < choiceArray.length; i++) {
                System.out.println(choiceArray[i]);
            }
//                if (userInput.equals("21")) {
//                    System.out.println("Ok, calculator will now turn off.");
//                    System.exit(0);

            switch (userInput) {

            }
        }


    }

}


