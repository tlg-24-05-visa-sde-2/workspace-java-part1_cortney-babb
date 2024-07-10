package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        //registerIn401k();
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        //this(name, hireDate);
        setSalary(salary);
    }

    // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString()
    public String toString() {
        return "Salaried Employee Name: " + getName() +
                ", Hire Date: " + getHireDate() +
                ", Salary: " + getSalary();
    }
}