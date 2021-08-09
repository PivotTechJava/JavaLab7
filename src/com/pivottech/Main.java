package com.pivottech;

public class Main {

    public static void main(String[] args) {


        Restaurant myRestaurant = new Restaurant("Ruth Chris", Stars.FIVE, Restaurant.$$$);
        Review myReview = new Review("Great!", "Jimmy", Stars.FIVE);

        myRestaurant.addReview(myReview);

        System.out.println(myRestaurant);
    }
}