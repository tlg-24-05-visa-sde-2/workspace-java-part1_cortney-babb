/*
 * Application main class
 * In the main() method we will create a few tv objects and give them a test drive
 */
class TelevisionClient {
    //entry point
    public static void main(String[] args) {
        //instance of tv, set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);

        Television tv2 = new Television();
        tv2.setBrand("Sony");
        tv2.setVolume(50);

        //3rd tv object, but don't set its properties
        Television tv3 = new Television();

        tv1.turnOn();
        tv1.turnOff();
        // tv1.verifyInternetConnection(); // private method in Television, no access
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();

        System.out.println();

        // calling the toString()
        System.out.println(tv1.toString());
        System.out.println(tv2);
        System.out.println(tv3);

    }
}