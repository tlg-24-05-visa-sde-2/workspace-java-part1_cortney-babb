package com.cinema;

enum Genre {
    // each of these is calling the Genre() ctor below
    ANIME("Anime"),
    HORROR("Horror"),
    DRAMA("Drama"),
    COMEDY("Comedy"),
    ACTION("Action"),
    SCI_FI("Sci-Fi"),
    CARTOON("Cartoon");

    // everything under here is just regular class definition stuff, fields, ctos and methods..
    private String display;

    // must be implicitly private
   Genre(String display) {
       System.out.println("Genre ctor called.");
       this.display = display;
    }
    public String getDisplay() {
       return display;
    }

    public String toString() {
       return getDisplay();
    }
}
