class Calculator {



    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * returns avg of the supplied integers
     * Notice: client caller can pass zero or more ints for this 'rest' parameter
     */
    public static double average(int first, int... rest) {
        // inside, rest is automatically an array of int[]
        int sum = first;

        for (int value : rest) {
            sum = sum + value;
        }
        return (double) sum / (rest.length + 1); // first would be the first int given, rest is rest of ints (so + 1)
    }

    /*
     * Returns a random integer between min and max (inclusive)
     */
    public static int randomInt(int min, int max) { // Min = 5, Max = 16
        /*
         * alternative result (the breakdown method):
         * int result = 0;
         * double rand = Math.random()       // random default range is 0.0000 to 0.9999
         * double scaled = (rand * (max - min + 1));    // max=16 min=5, 16-5= 11+1= 12*0.9999= 11.9999,   0.0000 to 11.9999
         * double lifted = scaled + min; //min is 5 in our case , 5.0000 to 16.9999
         * result = (int) lifted; //takes off decimal
         * return result;
         */
        return (int) (Math.random() * (max - min + 1)) + min; // 0.000-11.9999 + 1=12.9999, then add 5 (5.000 - 16.999),
                                                              // int downcasts (takes off) decimal results in 5-16
    }

    /*
     * returns a random int between 1 and 'max'
     */
    public static int randomInt(int max) {
        return randomInt(1, max); // delegate to "min-max" version, 1 and "max"
    }

    /*
     * Returns a random integer between 1 and 11 inclusive
     * HINT: see a class called Math in package java.lang, look for a helpful method here
     * These methods are all "static", which means you call them:
     *  Math.methodName()
     */
    public static int randomInt(){
        return randomInt(1, 11); // delegate to "min-max" version, 1 for min and 11 for max

//        int result = 0;
//
//        double rand = Math.random(); // 0.0000 to 0.9999
//        double scaled = (rand * 11) + 1; // 1.0000 to 11.9999
//        result = (int) scaled; //explicit downcast from double to int
//
//        return result;
    }
}