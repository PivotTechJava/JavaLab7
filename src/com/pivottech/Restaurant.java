package com.pivottech;

import java.util.ArrayList;

public class Restaurant {

    public final static int $ = 1;
    public final static int $$ = 2;
    public final static int $$$ = 3;

    private String name;
    private Stars starRating;
    private int price;
    private ArrayList<Review> reviews;

    public Restaurant(String name, Stars stars, int price) {

        this.name = name;
        starRating = stars;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public Restaurant(String name, Stars stars, int price, ArrayList<Review> reviewArray) {
        this(name, stars, price); // calls previous constructor
        this.reviews = new ArrayList<>(reviewArray);
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }

    public String toString() {
        String priceStr;

        //assign price string based on int price
        if(price == 1 ) priceStr = "$";
        else if(price == 2 ) priceStr = "$$";
        else priceStr = "$$$";

        String result;
        result = this.name  + " "+ priceStr + " " + this.starRating +  "\nReviews:\n---------------------";

        for (Review review: this.reviews) {
            result = result + "\n" + review.toString();
        }
        return result;
    }

}
