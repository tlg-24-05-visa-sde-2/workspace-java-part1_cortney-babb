/*
 * Application or system class model the workings of a television
 * it has properties/attributes and business methods but no main() method
 */
class Television {
    // properties or attributes - "fields" or "instance variables"
    // default values when values are not specified
    String brand;
    int volume;

    // methods
    void turnOn() {
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    void turnOff() {
        System.out.println("Turning off... goodbye!");
    }
}