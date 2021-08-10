package com.pivottech;

// Java Lab 7
public class Main {

    public static void main(String[] args) {


        Restaurant myRestaurant = new Restaurant("Ruth Chris", Stars.FIVE, Restaurant.$$$);
        Review myReview = new Review("Great!", "Jimmy", Stars.FIVE);

        myRestaurant.addReview(myReview);

      //  System.out.println(myRestaurant);

        Theatre myTheatre = new Theatre("MegaCinePlex");
        myTheatre.addReview(myReview);
      //  System.out.println(myTheatre);
        Movie myMovie1 = new Movie("I Still Believe");
        Movie myMovie2 = new Movie("You Got Mail");

        Review myReview1 = new Review("Made me cry!", "Feven", Stars.FIVE);
        Review myReview2 = new Review("Haven't seen it","Cesar",Stars.THREE);

        myMovie1.addReview(myReview1);
        myMovie1.addReview(myReview2);

        myTheatre.addMovie(myMovie1);
        myTheatre.addMovie(myMovie2);

        System.out.println(myTheatre);

        Shop myShop = new Shop("The Shoemaker");
        myShop.addReview(myReview);

       // System.out.println(myShop);







    }
}