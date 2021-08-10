package com.pivottech;

// Java Lab 7
public class Main {

    public static void main(String[] args) {


        Restaurant myRestaurant = new Restaurant("Ruth Chris", Stars.FIVE, Restaurant.$$$);
        Review myReview = new Review("Great!", "Jimmy", Stars.FIVE);
        //test test

        myRestaurant.addReview(myReview);

        System.out.println(myRestaurant);
    }
}