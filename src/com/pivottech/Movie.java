package com.pivottech;

import java.util.ArrayList;

public class Movie {
    public String title;
    public ArrayList<Review> reviews = new ArrayList<Review>();

    Movie(String movieName){
        this.title = movieName;
    }
    public String toString(){
        return title;
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }
}
