package com.pivottech;

public class Review {
    String author;
    String body;
    int numOfStars;

    public Review(String authorName, String messageBody, int starRating) {
        this.author = authorName;
        this.body = messageBody;
        this.numOfStars = starRating;
    }
}
