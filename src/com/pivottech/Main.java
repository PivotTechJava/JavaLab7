package com.pivottech;

import java.util.ArrayList;
import java.util.List;

// Java Lab 7
public class Main {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Space Jame",2013));
        Restaurant myRestaurant = new Restaurant("Ruth Chris", Stars.FIVE, Restaurant.$$$);
        Review myReview = new Review("Great!", "Jimmy", Stars.FIVE);
        Shop myShop = new Shop("Car Stop","GrEAT", 2);
        Theater myTheater = new Theater("Regal",movies.add(new Movie("Get Out",2014));
        myRestaurant.addReview(myReview);
        myShop.addReview(myShop);
        myTheater.addMovie(myTheater);
        System.out.println(myRestaurant);
    }
}