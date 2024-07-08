package edu.tests;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 28;
        ages[1] = 5;
        ages[2] = 30;

        System.out.println(Arrays.toString(ages)); // toString() automatically called
        System.out.println();

        double[] temps = {95.2, 91.7, 89, 92, 94.5};
        System.out.println(Arrays.toString(temps));

        for (double temp : temps) {
            System.out.printf("Temperature: %s\n", temp);
        }
        System.out.println();

        String[] countries = {"Japan", "Germany", "Switzerland", "Turkey"};
        System.out.println("There are " + countries.length + " countries in this array.");
        System.out.println(Arrays.toString(countries));

        for (String country : countries) {
            System.out.printf("=> %s\n", country);
        }
        System.out.println();

        for (int i = 0; i < countries.length; i++) {
            System.out.println("I want to visit " + countries[i]);
        }
    }
}