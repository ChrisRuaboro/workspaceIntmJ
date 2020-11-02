package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest_old
{
    private Employee emp1;
    private Employee emp2;

    @Before
    public void init()
    {
        emp1 = new SalariedEmployee("Dustin", Date.valueOf("2010-02-20"));
        emp2 = new SalariedEmployee("Dustin", Date.valueOf("2010-02-20"));
    }
    @Test
    public void testEquals()
    {
        assertTrue(emp1.equals(emp2));
    }

    @Test
    public void testHashCode()
    {
        assertEquals(emp1.hashCode(), emp2.hashCode());
    }
}