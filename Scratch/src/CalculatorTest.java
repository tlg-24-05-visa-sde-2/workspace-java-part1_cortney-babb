class CalculatorTest {
    public static void main(String[] args) {
        boolean isCorrect = true;

        // call randomInt() 100_000_000 times and check result each time
        // if its less than 5 or greater than 16, its invalid
        // break the loop
        int min = 5;
        int max = 16;

        for (int i = 0; i < 100_000_000; i++) {
            int random = Calculator.randomInt(min, max); // min = 5, max = 16
            if (random < min || random > max) { // this would be an error if true
                isCorrect = false;
                break;
            }
        }
        if (isCorrect) {
            System.out.println("It works! :)");
        } else {
            System.out.println("It does not work! :(");
        }
    }
}