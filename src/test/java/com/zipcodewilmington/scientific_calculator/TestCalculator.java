package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

    //  Quick debug copy/paste to method:  System.out.print(test);
    //  It keeps suggesting use Equals, so I'm starting to think it knows better.  I put it on a few tests but I haven't see a difference yet
    //@Test
   // public void testAddingInts() {
    //    int test = Calculator.addNumbers(5, 4);
   //    int valid = 9;
    //    assertEquals(test, valid);
    //}

    @Test
    public void testAddingDoubles() {
        double test = Calculator.addNumbers(5.0, 4.3);
        double valid = 9.3;
        assertEquals(test, valid, 0.0);
    }

    @Test
    public void testAddingDoubles2() {
        double test = Calculator.addNumbers(5.37, 4.19283434);
        double valid = 9.56283434;
        assertTrue(test == valid);
    }


    @Test
    public void testDividingInts() {
        int test = Calculator.divideNumbers(12, 4);
        int valid = 3;
        assertTrue(test == valid);
    }

    @Test
    public void testGettingRemainders() {
        int test = Calculator.getRemainders(11, 4);
        int valid = 3;
        assertEquals(test, valid);
    }

    @Test
    public void testDividingDoubles() {
        double test = Calculator.divideNumbers(9.0, 4.0);
        double valid = 2.25;
        assertEquals(test, valid, 0.0);
    }

    @Test
    public void testDividingDoubles2() {
        double test = Calculator.divideNumbers(10.0, 3.0);
        double valid = 3.33333333;
        assertTrue(test == valid);
    }

   /*  Test will fail with large numbers, don't use int multiplaction
   @Test
    public void testMultiplyInts() {
        int test = Calculator.multiplyNumbers(10, 4);
        int valid = 40;
        assertTrue(test == valid);
    }
    */

    @Test
    public void testMultiplyDoubles() {
        double test = Calculator.multiplyNumbers(9.00, 4.0);
        double valid = 36.0;
        assertTrue(test == valid);
    }

    @Test
    public void testMultiplyDoubles2() {
        double test = Calculator.multiplyNumbers(2.25, 4.0);
        double valid = 9.0;
        assertTrue(test == valid);
    }

    @Test
    public void testMultiplyDoubles3() {
        double test = Calculator.multiplyNumbers(3.333, 3.3333339);
        double valid = 11.11000189;
        assertTrue(test == valid);
    }

    /*
    @Test
    public void testSubtractingInts() {
        int test = Calculator.subtractNumbers(12, 4);
        int valid = 8;
        assertTrue(test == valid);
    }
    */

    @Test
    public void testSubtractingDoubles() {
        double test = Calculator.subtractNumbers(12.0, 5.0);
        double valid = 7.0;
        assertTrue(test == valid);
    }

    @Test
    public void testSubtractingDoubles2() {
        double test = Calculator.subtractNumbers(12.333, 4.0005);
        double valid = 8.3325;
        assertTrue(test == valid);
    }

    /*
    @Test
    public void testSquaresInt() {
        int test = Calculator.square(4);
        int valid = 16;
        assertTrue(test == valid);
    }
     */


    @Test
    public void testSquaresDouble() {
        double test = Calculator.square(4.5);
        double valid = 20.25;
        assertTrue(test == valid);
    }

    /*
    @Test
    public void testSquareRootsInt() {
        double test = Calculator.squareRoot(16);
        double valid = 4.0;
        assertEquals(test, valid, 0.0);
    }
    */

    /*
    @Test
    public void testSquareRootsInt2() {
        double test = Calculator.squareRoot(15);
        double valid = 3.8729833;
        assertTrue(test == valid);
    }
     */

    @Test
    public void testSquareRootsDouble() {
        double test = Calculator.squareRoot(33.3);
        double valid = 5.7706152;
        assertTrue(test == valid);
    }

    /*
    @Test
    public void testInverseInt() {
        double test = Calculator.inverse(4);
        double valid = 0.25;
        assertTrue(test == valid);
    }
     */

    /*
    @Test
    public void testInverseInt2() {
        double test = Calculator.inverse(97);
        System.out.print(test);
        double valid = 0.01030928;
        assertTrue(test == valid);
    }
     */

    @Test
    public void testInverseDouble() {
        double test = Calculator.inverse(20);
        double valid = 0.05;
        assertEquals(test, valid, 0.0);
    }

    @Test
    public void testInverseDouble2() {
        double test = Calculator.inverse(20.4);
        double valid = 0.04901961;
        assertEquals(test, valid, 0.0);
    }

    // This test will always fail because int can't hold a big enough number
    // @Test
    // public void testExponentiationInt() {
    //    int test = Calculator.exponentiation(20, 10);
    //    System.out.print(test);
    //   int valid = 10240000000000;
    //   assertFalse(test, valid);
    //}

    //@Test
    //public void testExponentiationInt2() {
    //    int test = Calculator.exponentiation(4, 3);
    //    int valid = 64;
    //    assertEquals(test, valid);
   // }

    @Test
    public void testExponentiationDoubles() {
        double test = Calculator.exponentiation(4.0, 4.0);
        double valid = 256.0;
        assertEquals(test, valid, 0.0);
    }

    //@Test
    //public void testExponentiationDoubles2() {
    //    double test = Calculator.exponentiation(20, 10);
     //   System.out.print(test);
      //  double valid = 10240000000000.0;
      //  assertFalse(test, valid, 0.0);
   // }

}
