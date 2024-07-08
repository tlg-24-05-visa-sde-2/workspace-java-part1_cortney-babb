package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {

        // setVolume() testing (in range + out of range)
        Television tv = new Television();
        //should stick, values 0 & 100
        tv.setVolume(0);
        System.out.println(tv);
        tv.setVolume(1);
        System.out.println(tv);
        tv.setVolume(100);
        System.out.println(tv);
        System.out.println();

        //error messages, should still have volume 100 from before
        tv.setVolume(-1);
        tv.setVolume(101);
        System.out.println(tv);
        Television tv1 = new Television("Samsung", -1);
        System.out.println(tv1);
        System.out.println();

        // ***************************************************************
        // setBrand() testing (all 4 + invalid brand)
        tv.setBrand("Samsung");
        System.out.println(tv);
        tv.setBrand("LG");
        System.out.println(tv);
        tv.setBrand("Sony");
        System.out.println(tv);
        tv.setBrand("Toshiba");
        System.out.println(tv);

        // invalid brand, should show error
        tv.setBrand("Galaxy");
        System.out.println(tv);
        System.out.println();

        // ***************************************************************
        // muted testing
        Television tv2 = new Television("Samsung", 32);
        System.out.println(tv2);
        tv2.mute();
        System.out.println(tv2);
        tv2.mute();
        System.out.println(tv2);
        tv2.mute();
        System.out.println(tv2);
        tv2.setVolume(50);
        System.out.println(tv2);

    }
}