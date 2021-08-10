package com.pivottech;

import java.util.ArrayList;

public class Theatre {
    private String name;
    private ArrayList<Review> reviews;
    private ArrayList<Movie> movies = new ArrayList<Movie>();

    public Theatre(String name) {

        this.name = name;
        this.reviews = new ArrayList<>();
        this.movies = new ArrayList<>();
    }
    public Theatre(String name,  ArrayList<Review> reviewArray) {
        this(name); // calls previous constructor
        this.reviews = new ArrayList<>(reviewArray);
        this.movies = new ArrayList<>(movies);
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }
    public void addMovie(Movie movie){

        this.movies.add(movie);
    }

    public void removeMovie(Movie movie){
        for(Movie m:movies){
            if (m.title == movie.title){
                    movies.remove(m);
            }
        }
    }




    public String toString() {
        String priceStr;

        String result;
        result = this.name +  " "  + "\nReviews:\n---------------------";

        for (Review review : this.reviews) {
            result = result + "\n" + review.toString();
        }

        result = result +  "\n\nNow Playing:\n---------------------";

        for (Movie m : this.movies) {
            result = result + "\n" + m.toString();
            result = result + "\n" + "Reviews of Movie:"+"\n";
            for (Review r: m.reviews){
                result = result + "----"+r.toString();
            }
        }

        return result;
    }

    }
