package com.pivottech;
import java.util.ArrayList;

public class Shop {
    public final static int $ = 1;
    public final static int $$ = 2;
    public final static int $$$ = 3;

    private String name;
    private String description;
    private int price;
    private ArrayList<Review> reviews;

    public Shop(String name, String description, int price) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public Shop(String name, String description, int price, ArrayList<Review> reviewArr) {
        this(name, description, price); // calls previous constructor
        this.reviews = new ArrayList<>(reviewArr);
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
        result = this.name  + " - "+ priceStr + " - " + this.description +  "\nReviews:\n---------------------";

        for (Review review: this.reviews) {
            result += "\n" + review.toString() + "\n";
        }
        return result;
    }
}
