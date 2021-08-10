package com.pivottech;

import java.util.ArrayList;


public class Shop {
    private String name;
    private ArrayList<Review> reviews;

    public Shop(String name) {

        this.name = name;
        this.reviews = new ArrayList<>();
    }


    public void addReview(Review review){
        this.reviews.add(review);
    }

    public String toString() {

        String result;
        result = this.name  +  "\nReviews:\n---------------------";

        for (Review review: this.reviews) {
            result = result + "\n" + review.toString();
        }
        return result;
    }


}
