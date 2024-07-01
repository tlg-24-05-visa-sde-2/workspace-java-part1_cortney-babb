/*
 * Client-side main class focused only on testing setSnoozeInterval()
 * We will do BVT (Boundary Value Testing)
 * We test on each boundary of range and just outside it: 0,1 and 20,21
 */
class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1); // value should "stick", no error message
        System.out.println(clock);

        clock.setSnoozeInterval(20); // value should "stick", no error message
        System.out.println(clock);

        clock.setSnoozeInterval(0); // error message, value rejected (value is still 20)
        System.out.println(clock);

        clock.setSnoozeInterval(21); // error message, value rejected (value is still 20)
        System.out.println(clock);
    }

}