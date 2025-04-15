package com.neoteric.javademo.bookmyshow;

public class Movies {

    private String name;
    private String timing;
    private double rating;

    public Movies(String name, String timing, double rating) {
        this.name = name;
        this.timing = timing;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getTiming() {
        return timing;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " at " + timing + " | Rating: " + rating + " / 5";
    }
}
