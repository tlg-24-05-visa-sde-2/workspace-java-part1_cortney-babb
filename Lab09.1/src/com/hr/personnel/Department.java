/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

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
    private Employee[] employees = new Employee[100]; // initially filled with nulls
    private int currentIndex = 0;  // for dealing with the array

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i]);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].work();
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees[currentIndex++] = emp;
    }

    public void payEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].pay();
        }
    }
    /*
     * office closure, all employees that take vacation are asked to do so
     * HINT: if a given employee is actually salaried, make them do it
     * otherwise, there is nothing to do
     */
    public void holidayBreak() {
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i] instanceof SalariedEmployee semp) {
                // downcast the Employee reference employees[i] to more specific type SE
                // we need to do this in order to call SalariedEmployee specific methods
                // SalariedEmployee semp = (SalariedEmployee) employees[i];
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