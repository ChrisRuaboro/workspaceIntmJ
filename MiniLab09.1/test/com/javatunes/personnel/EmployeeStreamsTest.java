/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.lang.invoke.CallSite;
import java.sql.Date;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class EmployeeStreamsTest
{

    private Collection<Employee> allEmployees;

    @Before
    public void setUp()
    {
        allEmployees = Department.getDepartment().getEmployees();
    }

    /**
     * TASK: Make all employees with salary 75,000+ work()
     * and do it in descending salary order,
     * i.e., highest paid works first. lowest paid works last.
     */

    @Test
    public void workAllEmployesWithSalary75000_highestToLowest()
    {
        allEmployees.stream()
                .filter(emp -> emp.getSalary() >= 75000.0)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(Employee::pay);
    }

    /**
     * TASK: find avg salary of all employees hired in 2000 or later
     */
    @Test
    public void avgSalary_hiredAfter2000()
    {
        double avgSal = allEmployees.stream()
                .filter(emp -> emp.getHireDate().after(Date.valueOf("2000-01-01")))
                .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println(avgSal);
    }

    /**
     * TASK: find all Employees that make 50000+
     * and sort them by salary increasing
     */

    @Test
    public void findAllEmployees_bySalary5000_sortedBySalaryIncreasing()
    {
        List<Employee> emps = allEmployees.stream()
                .filter(emp -> emp.getSalary() >= 50000.0)
                .sorted((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
                .collect(Collectors.toList());

    }

    /**
     * TASK: find all names of employees hired in 2010 or later.
     * JUST THE NAMES please
     */
    @Test
    public void findAllNames_EmployeesHiredIn2010_orLater()
    {
        List<String> names = allEmployees.stream()
                .filter(emp -> emp.getHireDate().after(Date.valueOf("2010-01-01")))
                .map(Employee::getName) // emp -> emp.getName()
                .sorted()
                .collect(Collectors.toList());
        assertEquals(7, names.size());
        assertEquals("Bob", names.get(0));
    }

    /**
     * TASK: find all Employees whose name is 5 characters or more,
     * and sort them by natural order
     */
    @Test
    public void testEmployeesNameGreaterThan5SortedByNaturalOrder()
    {

        List<Employee> employees = allEmployees.stream().filter(emp -> emp.getName().length() >= 5).sorted().collect(Collectors.toList());

        assertEquals(11, employees.size());
        assertEquals(Long.valueOf(2), employees.get(0).getId());
        assertEquals(Long.valueOf(16), employees.get(employees.size() - 1).getId());
    }


    /**
     * TASK: find all Employees with salary < 40000.0 and sort them by natural order.
     * Employee implements Comparable: natural order is id increasing.
     * <p>
     * RESULT: Employees 2 and 15, in that order.
     */
    @Test
    public void testSalaryLessThanSortNaturalOrder()
    {
        List<Employee> employees = allEmployees.stream().filter(emp -> emp.getSalary() < 40000.0).sorted()  // natural order
                .collect(Collectors.toList());

        assertEquals(2, employees.size());
        assertEquals(Long.valueOf(2), employees.get(0).getId());
        assertEquals(Long.valueOf(15), employees.get(1).getId());
    }
}