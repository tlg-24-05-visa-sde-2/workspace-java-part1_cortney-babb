package edu.tests;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

class MapTest {
    public static void main(String[] args) {
        Map<String,Double> gpa = new HashMap<>(); // K: String, V: Double

        gpa.put("cort", 3.8);
        gpa.put("kea", 4.0);
        gpa.put("jasmin", 3.4);
        gpa.put("chris", 3.6);
        gpa.put("kelvin", 1.7);
        gpa.put("deshon", 2.5);

        Double cortGpa = gpa.get("cort");
        System.out.println("Cort's GPA was: " + cortGpa);
        System.out.println();

        dump(gpa);
        System.out.println();

        // print all gpas that are 3.5 or greater
        Collection<Double> gpas = gpa.values(); // returns Collection<V>, Collection of Double
        for (Double gpaVal : gpas) {
            if (gpaVal >= 3.5) {
                System.out.println("GPA values 3.5+ were " + gpaVal);
            }
        }
        System.out.println();

        // print all names of those with a gpa of 2.5 or greater
        for (var entry : gpa.entrySet()) {
            if (entry.getValue() >= 2.5) {
                System.out.println("GPA values 2.5+ were " + entry.getKey());
            }
        }
        System.out.println();

    }

    private static void dump(Map<String, Double> gpa) {
        for(Map.Entry<String, Double> entry : gpa.entrySet()) { // collection of "rows"
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}