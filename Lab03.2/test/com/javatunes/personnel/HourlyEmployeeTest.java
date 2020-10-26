package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest
{
    private HourlyEmployee emp;

    @Before
    public void init()
    {
        emp = new HourlyEmployee("John", Date.valueOf("2018-08-02"),50.0,40.0);
    }
    @Test
    public void testPay()
    {
        assertEquals(2000.0, emp.pay(), 0.001);
    }

    @Test
    public void testPayTaxes()
    {
        assertEquals(500,emp.payTaxes(), 0.001);
    }

    /*@Test
    public void testEquals()
    {
        HourlyEmployee emp2 = new HourlyEmployee("John", Date.valueOf("2018-08-02"),50.0,40.0);
        assertTrue(emp.equals(emp2));
    }

    @Test
    public void testHashcode()
    {

    }*/
}