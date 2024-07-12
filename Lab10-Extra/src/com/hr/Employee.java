package com.hr;

import com.hr.client.WorkException;
import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * OPTION 1 - try-catch and handle
     * NOTE: It is critical that stop() is called no matter what
     */
//    public void goToWork() {
//        Car c = new Car("ABC123", "Chevrolet", "Camaro");
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e);
//        } finally {
//            c.stop();
//        }
//    }

    /*
     * OPTION 2 - ignore the exception (not dealing with it)
     * It is still critical stop() is called
     * must use throws DestinationUnreachableException
     */
//    public void goToWork() throws DestinationUnreachableException{
//        Car c = new Car("ABC123", "Chevrolet", "Camaro");
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//        } finally {
//            c.stop();
//        }
//    }

    /*
     * OPTION 3 - try/catch, react/respond in some way, then rethrow exception back to client
     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("ABC123", "Chevrolet", "Camaro");
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            // respond by using Java Mail API to send an email
//            throw e;
//        } finally {
//            c.stop();
//        }
//    }

    /*
     * OPTION 4 - try-catch and throw a different one back at client
     * NOTE: we nest or wrap the low-level transportation-oriented exception "cause"
     * into a high-level, business-oriented workException
     */
    public void goToWork() throws WorkException {
        Car c = new Car("ABC123", "Chevrolet", "Camaro");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work.", e);
        } finally {
            c.stop();
        }
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}