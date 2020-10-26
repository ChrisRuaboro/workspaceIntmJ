package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest
{
    private Employee emp;

    @Before
    public void init()
    {
        emp = new HourlyEmployee();
    }
    @Test
    public void testEquals()
    {

    }

    @Test
    public void testHashCode()
    {

    }
}