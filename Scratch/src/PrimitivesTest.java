class PrimitivesTest {

    public static void main(String[] args) {

        int age = 28;
        System.out.println("My age is " + age);

        long population = 8_000_000_000L;
        System.out.println("Earth's population is " + population + "+");

        double price = 799.99;
        System.out.println("iPad 11 total: $" + price);

        boolean isCloudy = true;
        System.out.println("Is the weather cloudy? " + isCloudy);

        char gender = 'F';
        System.out.println("Male or Female? " + gender);

        String grade = "A";
        System.out.println("Grade: " + grade);

        String quote = "Life is a \"beach\" I'm just playing in the sand";
        System.out.println("Lil Wayne: " + quote);

        String poem = "Roses are red\nViolets are blue";
        System.out.println(poem);
        System.out.println();

        int n = 18;
        int m = n;
        n = 19;
        System.out.println("n: " + n); //19
        System.out.println("m: " + m);//18
        System.out.println();

        int kids = 2;
        System.out.println("Number of kids: " + ++kids);
    }
}