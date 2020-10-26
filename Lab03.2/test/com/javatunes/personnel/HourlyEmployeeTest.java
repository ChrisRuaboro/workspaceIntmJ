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
    public void pay()
    {
    }

    @Test
    public void payTaxes()
    {
    }
}