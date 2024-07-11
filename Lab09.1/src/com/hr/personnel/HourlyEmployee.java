package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double rate;
    private double hours;
    //constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    // action methods
    @Override
    public void pay() {
        double payment = getRate() * getHours();
        System.out.println(getName() + " is paid hourly " +  payment);
    }

    @Override
    public void payTaxes() {
        double taxes = (getHours() * getRate()) * TaxPayer.HOURLY_TAX_RATE;
        System.out.println(getName() + " paid hourly taxes of " +  taxes);
    }

    // getters and setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() +
                ", rate: " + getRate() +
                ", hours: " + getHours();
    }
}