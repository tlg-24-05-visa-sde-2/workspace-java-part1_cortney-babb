/*
 * Application main class
 * In the main() method we will create a few tv objects and give them a test drive
 */
class TelevisionClient {
    //entry point
    public static void main(String[] args) {
        //instance of tv, set its properties
        Television tv1 = new Television();
        tv1.brand = "Samsung";
        tv1.volume = 32;

        Television tv2 = new Television();
        tv2.brand = "Sony";
        tv2.volume = 50;

        //3rd tv object, but don't set its properties
        Television tv3 = new Television();

        tv1.turnOn();
        tv1.turnOff();
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();

    }
}