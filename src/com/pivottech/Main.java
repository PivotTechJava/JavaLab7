package com.pivottech;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Restaurant RestaurantClassTest = new Restaurant("Mike's Place");
        Review myReview = new Review("This is awesome place!", "Austin Cumberlander", 5);
        ArrayList<Review> restaurantReviews = new ArrayList<>();
        restaurantReviews.add(myReview);
        Restaurant newRestaurant = new Restaurant(RestaurantClassTest.toString(), restaurantReviews);

        System.out.println(RestaurantClassTest.toString());
        System.out.println(myReview.toString());
        System.out.println(newRestaurant.toString());
    }
}