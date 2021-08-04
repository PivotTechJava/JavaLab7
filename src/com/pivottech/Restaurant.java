package com.pivottech;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int starRating;
    private String price;
    private ArrayList<Review> reviews;

    Restaurant(){
        super();
        this.name = "Default text";
    }

    Restaurant(String n) {
        this.name = n;
    }

    Restaurant(String n, ArrayList<Review> reviewArray) {
        this.name = n;
        this.reviews = new ArrayList<Review>(reviewArray);
        System.out.println("LENGTH:" + this.reviews.stream().count());
    }

    public String toString() {
        String result;
        result = this.name;

        for (Review review:this.reviews) {
            result = result + "Review: " + review.toString();
        }
        return result;
    }

}
