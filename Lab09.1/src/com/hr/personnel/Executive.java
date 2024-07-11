package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    // constructors
    public Executive() {
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    // i opt in to provide my own way vs default way of doing it
    @Override // interface TaxPayer as a default method
    public void fileReturn() {
        System.out.println("Return filed electronically.");
    }

    // action methods
    @Override
    public void work() {
        System.out.println(getName() + " is enjoying a nice round of golf.");
    }
}