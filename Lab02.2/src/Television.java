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
    private boolean isMuted;
    private int oldVolume;
    private DisplayType display = DisplayType.LED;

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
    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
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

    public void mute() {

        if (!isMuted) {
            // store current volume in oldVolume
            oldVolume = this.volume;
            // set volume to 0
            setVolume(MIN_VOLUME);
            // set muted flag to true
            isMuted = true;
            System.out.println("Is muted");
        } else {
            // restore volume from oldVolume
            volume = oldVolume;
            // set muted flag to false
            isMuted = false;
            System.out.println("Is unmuted");
        }
    }

    //accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        // validate brand, samsung, lg, sony, toshiba only valid brands
        if (brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony") || brand.equals("Toshiba") ) {
            this.brand = brand;
        } else {
            System.out.println("Error: Invalid brand. Your selection of brands must be one of the following:" +
                    "Samsung, LG, Sony, Toshiba");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        // if greater than or equal to 0 && less than or equal to 100
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false; // clear the isMuted flag
        } else {
            System.out.println("Error: Invalid number! Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
       return true; // fake implementation
    }

    //toString()
    public String toString() {
        String volumeString = isMuted() ? "Muted" : String.valueOf(getVolume());
       return "Television: brand=" + getBrand() +
               ", volume=" + volumeString + " display=" + getDisplay();
    }
}