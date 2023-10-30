package com.zipcodewilmington.scientificcalculator;

public class DisplayClass  {
    //trying to convert input string into ints/doubles/ and chars
   /* public static Integer stringToInt(String prompt){
        println(prompt);
        Integer strInt;
        try {
           strInt = Integer.parseInt(Console.getStringInput(System.in.toString()));
           System.out.println(strInt);
        }catch(NumberFormatException e){
        println("invalid num");
        }
        return strInt;
    }*/
    //integerExtract - converts user input into a string and then extracts the numerical values
    /*static String integerExtract(String prompt){
        prompt = Console.getStringInput(System.in.toString());
        prompt = prompt.replaceAll("\\D", " ");
        println(prompt);
        return prompt;
    }*/

    //Extracts two numerical values from string and converts to double
    public static Double[] integerExtractor(String w){
        String intExtract = w;
        intExtract = intExtract.replaceAll("\\D", " ");
        //split string
        String[] intExtractArr = intExtract.split("\\s+");
        //if else so the user can enter 1 or 2 numbers
        if (intExtractArr.length > 1) {
            //converts string arr values into ints
            Double[] givenNumMulti = new Double[2];
            givenNumMulti[0] = Double.parseDouble(intExtractArr[0]);
            givenNumMulti[1] = Double.parseDouble(intExtractArr[1]);
            //System.out.println(givenNumMulti[0]);
            //System.out.println(givenNumMulti[1]);
            return givenNumMulti;
        }else{
            Double[] givenNumMulti = new Double[1];
            givenNumMulti[0] = Double.parseDouble(intExtractArr[0]);
            //System.out.println(givenNumMulti[0]);
            return givenNumMulti;
        }
    }
    //
    public static String operatorExtractor(String w){
        String opExtract = w;
        opExtract = opExtract.replaceAll("[\\d, \\s]", "");
        //System.out.println(opExtract);
        return opExtract;
    }
    //clears the console display
    public static void clearDisplay(){
        System.out.flush();
    }
}
