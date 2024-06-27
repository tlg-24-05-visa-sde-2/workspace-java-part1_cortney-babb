/*
 * Client-side "main-class" - the class definition with main()
 * That is the only thing in here
 * We will create a few AlarmClock objects and give them a basic test drive
 */

class AlarmClockClient {

    // starting "entry" point for every standalone Java application
    public static void main(String[] args) {
        //create an instance (or object) of AlarmClock and set its snoozeInterval
        AlarmClock clock1 = new AlarmClock();
        clock1.snoozeInterval = 7;

        //second AlarmClock object and set its snoozeInterval also
        AlarmClock clock2 = new AlarmClock();
        clock2.snoozeInterval = 10;

        // create third AlarmClock object, don't give it a snooze interval
        // defaults to 0
        AlarmClock clock3 = new AlarmClock();


        //make them snooze()
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
    }
}