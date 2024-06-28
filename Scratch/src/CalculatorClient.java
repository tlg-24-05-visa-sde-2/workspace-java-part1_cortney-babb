class CalculatorClient {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double sum = calc.add(15,5); // implicit upcast, passing ints where doubles are expected
        System.out.println("The sum is: " + sum);

        double sum2 = calc.subtract(60.3, 5.2); // here we pass doubles
        System.out.println("The difference is: " + sum2);

        double sum3 = calc.multiply(4, 4);
        System.out.println("The multiplication is: " + sum3);

        double sum4 = calc.divide(36.2, 9);
        System.out.println("The division is: " + sum4);

        System.out.println("Number 24 is even? " + calc.isEven(24));

        System.out.println("Random # from 1-11: " + calc.randomInt());

    }

}