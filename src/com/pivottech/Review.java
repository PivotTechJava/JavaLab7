package com.pivottech;

public class Review {
    private String body;
    private String author;
    private int stars;

    Review() {
        super();
        this.body = "default body";
        this.author = "default autho";
        this.stars = 0;
    }

    Review(String _body, String _author, int _stars) {
        this.body = _body;
        this.author = _author;
        this.stars = _stars;
    }

    public String toString() {
        return this.body + "---" + this.author + "---" + Integer.toString(this.stars);
    }
}
