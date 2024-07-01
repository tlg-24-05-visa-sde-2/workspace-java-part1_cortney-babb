class MovieClient {
    public static void main(String[] args) {
        Movie mv1 = new Movie();
        System.out.println(mv1);
        System.out.println();

        Movie mv2 = new Movie();
        mv2.setTitle("Black Panther");
        mv2.setYear(2018);
        mv2.setRevenue(1_346_913_171.0);
        System.out.println(mv2);
        System.out.println();

        Movie mv3 = new Movie("Finding Nemo", 2003, 940_000_000.0); // constructor
        System.out.println(mv3);
        System.out.println();

        Movie mv4 = new Movie("Naruto: Shippuden"); // constructor
        System.out.println(mv4);



//        Movie mv2 = new Movie();
//        mv2.setTitle("Finding Nemo");
//        mv2.setYear(2003);
//        mv2.setRevenue(940_000_000);
    }

}