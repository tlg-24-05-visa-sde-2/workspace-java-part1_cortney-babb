package edu.tests;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "28";
        int age = Integer.parseInt(ageInput); // returns int 28 from string "57"
        Integer ageInteger = Integer.valueOf(ageInput); // returns object Integer(28) from "28"

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);
        Long populationLong = Long.valueOf(populationInput);

        String priceInput = "12.49";
        double price = Double.parseDouble(priceInput);
        Double priceDouble = Double.valueOf(priceInput);

        String isSunnyInput = "true";
        boolean isSunny = Boolean.parseBoolean(isSunnyInput);
        Boolean sunnyBoolean = Boolean.valueOf(isSunnyInput);

        System.out.println(ageInteger);
        System.out.println(populationLong);
        System.out.println(priceDouble);
        System.out.println(sunnyBoolean);
    }
}