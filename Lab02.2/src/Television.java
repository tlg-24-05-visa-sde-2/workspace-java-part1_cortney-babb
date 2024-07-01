/*
 * Application or system class model the workings of a television
 * it has properties/attributes and business methods but no main() method
 */
class Television {
    // properties or attributes - "fields" or "instance variables"
    // default values when values are not specified
    private String brand = "Toshiba";
    private int volume = 1;

    // methods
   public void turnOn() {
        // call private method for this task
         boolean isConnected = verifyInternetConnection();
         // System.out.println(verifyInternetConnection());
         System.out.println();


        System.out.println("Turning on your " + getBrand() + " television to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Turning off... goodbye!");
    }

    //accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection() {
       return true; // fake implementation
    }

    //toString()
    public String toString() {
       return "Television: brand=" + getBrand() + ", volume=" + getVolume();
    }
}