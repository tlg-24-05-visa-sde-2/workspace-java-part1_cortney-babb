class MovieClient {
    public static void main(String[] args) {
        Movie mv1 = new Movie("Black Panther");
        mv1.setYear(2018);
        mv1.setRevenue(1_346_913_171.0);
        System.out.println(mv1);
        System.out.println();

        Movie mv2 = new Movie("Finding Nemo", 2003, 940_000_000.0, Rating.G, Genre.CARTOON); // constructor
        System.out.println(mv2);
        System.out.println();

        Movie mv3 = new Movie("Naruto: Shippuden", Genre.ANIME); // constructor
        System.out.println(mv3);
        System.out.println();



//        Movie mv1 = new Movie();
//        mv1.setTitle("Finding Nemo");
//        mv1.setYear(2003);
//        mv1.setRevenue(940_000_000);
    }

}