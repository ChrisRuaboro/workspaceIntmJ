package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeTest
{
    private Employee emp1; // business object under test
    private Employee emp2; //

    @Before
    public void init()
    {
        // what would be nice is a direct instance of employee, keeping SalariedEmployee out of it
        // what we do is create an anonymous sub class of Employee
        // we use it right here, right now, nowhere else and never again.

        emp1 = new Employee("Randall", Date.valueOf("2020-10-08")){
            @Override
            public double pay() { return 0; }

            @Override
            public double payTaxes() { return 0; }
        };
        emp2 = new Employee("Randall", Date.valueOf("2020-10-08"))
        {
            @Override
            public double pay() { return 0; }

            @Override
            public double payTaxes() { return 0; }
        };
    }
    @Test
    public void testEquals()
    {

    }

    @Test
    public void equals_shouldReturnFalseWhenEqualHireDates()
    {
        emp2.setName("Bruh");
        assertEquals(emp1,emp2);
    }

    @Test
    public void equals_shouldReturnFalseWhenDifferentHireDates()
    {
        emp2.setHireDate(Date.valueOf("1990-09-09"));
        assertEquals(emp1,emp2);
    }

    @Test
    public void testHashCode()
    {

    }
}