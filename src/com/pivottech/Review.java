package com.pivottech;

import java.lang.*;

public class Review {

    private String body;
    private String author;
    private Stars stars;

    public Review() {
        super();
        this.body = "";
        this.author = "";
        this.stars = Stars.ONE;
    }

    public Review(String _body, String _author, Stars stars) {

        this.body = _body;
        this.author = _author;
        this.stars = stars;
    }

    public String toString() {
        return "\"" + this.body + "\"" + "\nAuthor: " + this.author + "\nStar Rating: " + this.stars + "\n";
    }
}
