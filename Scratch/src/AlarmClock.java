
/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not
 */
class AlarmClock {
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
        System.out.println("Snoozing for " + snoozeInterval + " minutes");
    }

    // accessor methods - provide "controlled access" to the objects fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }
    // TODO: implement constraint - must be between 1 and 20 inclusive
    // if the incoming value is "valid" we take it, assign to the private field
    // otherwise we reject w/ an error message
    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
    }
//    public void setSnoozeInterval(int snoozeIntervalIn) {
//    snoozeInterval = snoozeIntervalIn;
//    }

    // Purpose: return a string (sentence) describing this object
    public String toString() {
        return "AlarmClock: snoozeInterval = " + snoozeInterval;
    }

}