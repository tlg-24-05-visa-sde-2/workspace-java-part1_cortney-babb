class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between min and max (inclusive)
     * TODO: implement this algorithm
     */
    int randomInt(int min, int max) {

        return 0;
    }


    /*
     * Returns a random integer between 1 and 11 inclusive
     * HINT: see a class called Math in package java.lang, look for a helpful method here
     * These methods are all "static", which means you call them:
     *  Math.methodName()
     */
    double randomInt(){
        int result = 0;

        double rand = Math.random(); // 0.0000 to 0.9999
        double scaled = (rand * 11) + 1; // 1.0000 to 11.9999
        result = (int) scaled; //explicit downcast from double to int

        return result;
    }
}