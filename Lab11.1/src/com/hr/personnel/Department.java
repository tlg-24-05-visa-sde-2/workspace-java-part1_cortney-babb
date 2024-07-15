/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    // 1-to-many HAS-A relationship
    private final Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
            emp.work();
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void payEmployees() {
        for (Employee emp : employees) {
            emp.pay();
        }
    }
    /*
     * office closure, all employees that take vacation are asked to do so
     * HINT: if a given employee is actually salaried, make them do it
     * otherwise, there is nothing to do
     */
    public void holidayBreak() {
        for (Employee emp : employees) {
            if (emp instanceof SalariedEmployee) {
                // downcast the Employee reference emp to more specific type SE
                // we need to do this in order to call SalariedEmployee specific methods
                SalariedEmployee semp = (SalariedEmployee) emp;
                // semp.takeVacation();

                //auto downcast using salariedemployee semp in if ()
                semp.takeVacation();

                // this is downcast and method call in one line
                // ((SalariedEmployee) employees[i]).takeVacation();
            }
        }
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName() + ", location=" + getLocation();
    }
}