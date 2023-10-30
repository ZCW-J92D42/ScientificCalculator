package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Operations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestOperations {
    private Operations testOperations;

    @Before
    public void setUp() {
        testOperations = new Operations();
    }
    @Test
    public void testAdd(){
        double int1 = 3;
        double int2 = 6;
        double rightResult = 9;
        double result = testOperations.add(int1, int2);

        Assert.assertEquals(rightResult, result, 0.01);
    }
    @Test
    public void testSubtract(){
        double int1 = 6;
        double int2 = 3;
        double rightResult = 3;
        double result = testOperations.subtract(int1, int2);

        Assert.assertEquals(rightResult,result,0.01);
    }
    @Test
    public void testMultiple(){
        double int1 = 2;
        double int2 = 2;
        double rightResult = 4;
        double result = testOperations.multiply(int1, int2);

        Assert.assertEquals(rightResult, result, 0.01);
    }
    @Test
    public void testDivide(){
        double int1 = 4;
        double int2 = 2;
        double rightResult = 2;
        double result = testOperations.divide(int1, int2);

        Assert.assertEquals(rightResult, result, 0.01);
    }
    @Test
    public void testSquare(){
        double int1 = 2;
        double rightResult = 4;
        double result = testOperations.square(int1);

        Assert.assertEquals(rightResult, result, 0.01);
    }
    @Test
    public void testSquareRoot(){
        double int1 = 4;
        double rightResult = 2;
        double result = testOperations.squareRoot(int1);

        Assert.assertEquals(rightResult, result, 0.01);

    }
}
