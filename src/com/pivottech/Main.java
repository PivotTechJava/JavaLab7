package com.pivottech;

import java.util.ArrayList;

// Java Lab 7
public class Main {

    public static void main(String[] args) {

        Restaurant ruth = new Restaurant("Ruth Chris", Stars.FIVE, Restaurant.$$$);
        Review review1 = new Review("Great!", "Jimmy", Stars.FIVE);
        Review review2 = new Review("Food and service was excellent as always!", "April", Stars.FIVE);

        Shop morrow = new Shop("Morrow's Body Shop", "Auto body repair shop in midtown Memphis", 2 );
        Review review3 = new Review("Great work at a fair price.", "Ashley", Stars.FIVE);
        Review review4 = new Review("Would return for sure", "Kenneth", Stars.FOUR);

        ruth.addReview(review1);
        ruth.addReview(review2);
        morrow.addReview(review4);
        morrow.addReview(review3);

        System.out.println(morrow);
        System.out.println(ruth);

        Theater amc = new Theater("AMC", new ArrayList<String>());
        amc.addMovie("Man on Fire");
        amc.addMovie("Tenet");
        amc.addMovie("Good Boys");

        System.out.println(amc);
        amc.removeMovie("Good Boys");

        Review review5 = new Review("My favorite location", "Kendra", Stars.FIVE);
        Review review6 = new Review("Nice!", "Mac", Stars.FOUR);
        amc.addReview(review5);
        amc.addReview(review6);

        System.out.println(amc);
    }
}