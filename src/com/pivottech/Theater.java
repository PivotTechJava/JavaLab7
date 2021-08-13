package com.pivottech;
import java.util.ArrayList;

public class Theater {
    private String name;
    private ArrayList <String> movieList;
    private ArrayList<Review> reviews;

    public Theater(String name, ArrayList<String> movies)
    {
        this.name = name;
        this.movieList = movies;
        this.reviews = new ArrayList<>();

    }

    public Theater(String name, ArrayList<String> movies, ArrayList<Review> reviewArr)
    {
        this(name, movies);
        this.reviews = new ArrayList<>(reviewArr);

    }

    public ArrayList<String> addMovie(String movie)
    {
        movieList.add(movie);
        return movieList;

    }
    public ArrayList<String> removeMovie(String movie)
    {
        movieList.remove(movie);
        return movieList;

    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public String toString() {
        String result;
        result = this.name + "\nMovies:\n---------------------";

        for (String movie: this.movieList) {
            result += "\n" + movie;
        }
        result += "\n";

        if (this.reviews.size() > 0) {
            result += "\nReviews:\n---------------------";
            for (Review review: this.reviews) {
                result += "\n" + review + "\n";
            }
            result += "\n";
        }

        return result;
    }
}