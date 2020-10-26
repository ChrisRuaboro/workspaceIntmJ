/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
    private Calculator calc;

    // Set up before each test method
    @Before
    public void setUp()
    {
        System.out.println("setUp");
        calc = new Calculator();
    }
    @After
    public void after()
    {
        System.out.println("After");
    }

    @Test
    public void testAdd()
    {
        //Calculator calc = new Calculator();
        assertEquals(5, calc.add(1, 4));  // expected, actual
    }
    /*
     * The "tolerance" or "delta" is needed when comparing doubles, due to the inherent imprecision of
     * floating-point operations. For example, you might expect Math.sqrt(4.0) to be 2.0, but the result
     * could actually be something like 1.999999999999993, or 2.000000000000007. It's true.
     */
    @Test
    public void testDivide()
    {
        //Calculator calc = new Calculator();
        assertEquals(3,calc.divide(9,3), .001);

    }
    @Test
    public void testIsEqual()
    {
        //Calculator calc = new Calculator();
        assertTrue(calc.isEven(698));
        assertFalse(calc.isEven(9));

    }
}