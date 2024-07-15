/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new HourlyEmployee("Jason", LocalDate.of(1990, 8, 24),
                        15.45, 40));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 1750));

        // lab 8.2 create instances of each employee
        dept.addEmployee(new SalariedEmployee("Malachi", LocalDate.of(2024, 5, 8), 2500));
        dept.addEmployee(new HourlyEmployee("Drake", LocalDate.of(2022, 1, 1),
                        35.2, 60));
        dept.addEmployee(new Executive("Cortney", LocalDate.of(2023, 10, 12), 10_000));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay Employees
        System.out.println("\nPay employees:");
        dept.payEmployees();

        // only salaried Employees take vacations (yikes)
        System.out.println("\nHoliday break:");
        dept.holidayBreak();
    }
}