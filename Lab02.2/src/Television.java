/*
 * Application or system class model the workings of a television
 * it has properties/attributes and business methods but no main() method
 */
class Television {
    // class-level "static" variables - these live in the "shared area" above the instances, ALL_CAP naming
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    public static int getInstanceCount() {
        // boolean isConnected = verifyInternetConnection();
        // ^^^ cannot be called here bc static methods can't directly call instance methods
        // w/o having a reference to a specific instance (object)
        return instanceCount;
    }
    // ****************************************************************************

    // properties or attributes - "fields" or "instance variables"
    // default values when values are not specified
    private String brand = "Toshiba";
    private int volume = 1;

    // constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

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