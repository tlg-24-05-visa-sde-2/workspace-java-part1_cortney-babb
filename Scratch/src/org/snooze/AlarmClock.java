package org.snooze;

/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not
 */
class AlarmClock {
    // public class ("static") fields - ONE copy, shared among all instances
    // static methods execute up here, not in a specific instance (object/bubble)
    // final "fixed" - cannot be changed, class constants
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // properties or attributes - these are called "instance variables" or "fields" in Java
    // accessor methods - provide controlled access to the objects fields
    private int snoozeInterval = 5; //default value when client doesn't specify one (instead of default of 0)


    //constructors
    public AlarmClock() { // no operations
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval); // delegate to setter for validation conversion (if any)
    }

    // functions or operations - these are called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provide "controlled access" to the objects fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }
    // business constraint / error handling - must be between 1 and 20 inclusive
    // if the incoming value is "valid" we take it, assign to the private field
    // otherwise we reject w/ an error message
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Error: Invalid snooze interval: " + getSnoozeInterval() +
                                ". Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " (inclusive).");
        }
    }

    // Purpose: return a string (sentence) describing this object
    public String toString() {
        return "AlarmClock: snoozeInterval = " + getSnoozeInterval();
    }

}