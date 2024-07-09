package edu.math;

import edu.math.Calculator.*; // ok to use * for static imports

import static edu.math.Calculator.*;

class CalculatorClient {

    public static void main(String[] args) {
        // you can remove Calculator. when importing edu.math.Calculator.*
        double sum = add(15,5); // implicit upcast, passing ints where doubles are expected
        System.out.println("The sum is: " + sum);

        double sum2 = subtract(60.3, 5.2); // here we pass doubles
        System.out.println("The difference is: " + sum2);

        double sum3 = Calculator.multiply(4, 4);
        System.out.println("The multiplication is: " + sum3);

        double sum4 = Calculator.divide(36.2, 9);
        System.out.println("The division is: " + sum4);


        System.out.println("Number 24 is even? " + Calculator.isEven(24));

        System.out.println("Random # from 5-16: " + Calculator.randomInt(5,16)); // min and max (2 parameters)
        System.out.println("Random # from 1-20: " + Calculator.randomInt(20)); // one param with a default of 1 being min
        System.out.println("Random # from 1-11: " + Calculator.randomInt()); // no param
        System.out.println("Average is: " + Calculator.average(3, 4, 9 , 2 ,3)); // ... handles loose ints
        System.out.println("Average of a single number is: " + Calculator.average(12));

    }

}