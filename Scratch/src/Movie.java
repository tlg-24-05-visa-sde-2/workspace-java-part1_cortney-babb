class Movie {
    // fields or instance variables
    private String title;
    private int year;
    private double revenue;
    private Rating rating = Rating.PG;
    private Genre genre;

    // constructors
    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    // reduces redundancy via title being in 2 separate constructors
    public Movie(String title, int year, double revenue, Rating rating, Genre genre) {
        this(title, genre); // delegate to ctor above for title
        setYear(year);
        setRevenue(revenue);
        setRating(rating);
    }
// alternative for above since constructor 1 & 2 both have string title in common:
//    public Movie(String title, int year, double revenue) {
//        // delegate to setters for any data validation / conversion they might be doing
//        setTitle(title);
//        setYear(year);
//        setRevenue(revenue);
//    }


    // business or "action" methods
    // play() pause() rewind() fastForward() stop() goTo()

    // accessor methods, provides controlled access to the objects (private) fields
    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // toString() method
    public String toString() {
        return "Movie: Title=" + getTitle() +
                ", Year=" + getYear() +
                ", Revenue=" + getRevenue() +
                ", Rating=" + getRating() +
                ", Genre=" + getGenre();
    }
}