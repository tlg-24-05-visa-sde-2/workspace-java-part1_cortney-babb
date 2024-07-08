package com.cinema;

enum Rating {
    G("G"),
    PG("PG"),
    PG_13("PG-13"),
    R("R"),
    NC_17("NC-17");

    private String output;

    // must be implicitly private
    Rating(String output) {
        System.out.println("Rating ctor called.");
        this.output = output;
    }
    public String getOutput() {
        return output;
    }

    public String toString() {
        return getOutput();
    }
}
