package com.pivottech;

public class Review {

    public Review(String author, String body, String stars) {
        System.out.println("Author " + author + " review: " + body + ". Stars given:  " + stars);
        AString(stars);
    }

    public String AString(String stars) {
        if (stars == "*") {
            System.out.println("Needs a lot of help!!!!");
        }
        if (stars == "**") {
            System.out.println("Needs help!! ");
        }
        if (stars == "***") {
            System.out.println("Average rating");
        }
        if(stars == "****")
        {
            System.out.println("Above average / good");
        }
        if(stars == "*****")
        {
            System.out.println("Excellent/ yummy ");
        }
        return stars;
    }
}
