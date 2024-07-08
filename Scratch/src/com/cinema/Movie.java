package com.cinema;

public class Movie {
    // fields or instance variables
    private String title;
    private Integer year;
    private Double revenue;
    private Rating rating;
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
    public Movie(String title, Integer year, Double revenue, Rating rating, Genre genre) {
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
    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
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
        //TODO: null revenue should come out as null, non-null revenue should be formatted 122,000,229.00
        //HINT: If revenue is null, use %s, else use %,.2f
        //if (revenue == null){ revenue = %s } else { revenue = %,.2f}
//        String revenueString = this.getRevenue() ? "%,.2f" : "%f";

        if (this.getRevenue() == null) {
            return String.format("Movie: title=%s, year=%s, revenue=%s, rating=%s, genre=%s",
                    getTitle(), getYear(), getRevenue(), getRating(), getGenre());
        } else {
            return String.format("Movie: title=%s, year=%s, revenue=$%,.2f, rating=%s, genre=%s",
                    getTitle(), getYear(), getRevenue(), getRating(), getGenre());
        }
//        return "Movie: Title=" + getTitle() +
//                ", Year=" + getYear() +
//                ", Revenue=" + getRevenue() +
//                ", Rating=" + getRating() +
//                ", Genre=" + getGenre();
    }
}