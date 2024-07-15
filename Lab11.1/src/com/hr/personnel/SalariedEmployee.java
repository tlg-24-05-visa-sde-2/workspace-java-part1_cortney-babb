package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double salary;
    //constructors
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
    // action methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override // interface TaxPayer
    public void payTaxes() {
        double taxes = getSalary() * TaxPayer.SALARIED_TAX_RATE;

        System.out.println(getName() + " paid salaried taxes of " + taxes);
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation.");
    }

    // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() +
                ", salary: " + getSalary();
    }
}