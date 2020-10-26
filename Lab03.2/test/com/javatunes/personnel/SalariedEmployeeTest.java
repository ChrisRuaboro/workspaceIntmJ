package com.javatunes.personnel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest
{
    private SalariedEmployee emp;
    @Before
    public void setUp() throws Exception
    {
        emp = new SalariedEmployee("John", Date.valueOf("2018-01-06"), 50000.0);
    }

    @Test
    public void testPay()
    {
        assertEquals(50000.0,emp.pay(), 0.001);
    }

    @Test
    public void testPayTaxes()
    {
        assertEquals(15000.0, emp.payTaxes(), 0.001);
    }



    @After
    public void tearDown() throws Exception
    {
    }
}