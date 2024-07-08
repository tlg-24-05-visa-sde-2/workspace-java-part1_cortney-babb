package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Application main class
 * In the main() method we will create a few tv objects and give them a test drive
 */
class TelevisionClient {
    //entry point
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        //instance of tv, set its properties
        Television tv = new Television("Sony", 40);

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.PLASMA);

        Television tv2 = new Television("Sony", 50,  DisplayType.OLED);

        //3rd tv object
        Television tv3 = new Television("LG", Television.MAX_VOLUME);

        tv.turnOn();
        tv.turnOff();
        tv1.turnOn();
        tv1.turnOff();
        // tv1.verifyInternetConnection(); // private method in Television, no access
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();

        System.out.println();

        // calling the toString()
        System.out.println(tv);
        System.out.println(tv1.toString());
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println(Television.getInstanceCount() + " instances");
    }
}