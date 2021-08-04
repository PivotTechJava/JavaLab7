package com.pivottech;

public class Review {

    public Review(String author, String body, String stars){
        System.out.println("Author: " + author + " Review: " +body + ". Stars Awarded: " + stars);
        aString(stars);
    }


    public String aString(String stars) {
        if (stars == "*")
        {
            System.out.println("Needs a lot of help");

        }
        if (stars == "**")
        {
            System.out.println("Needs help");
        }
        if (stars == "***")
        {
            System.out.println("is average");
        }
        if (stars == "****")
        {
            System.out.println("is good/above average!");
        }
        if (stars == "*****")
        {
            System.out.println("is excellent!!");
        }
        return stars;
    }
}
