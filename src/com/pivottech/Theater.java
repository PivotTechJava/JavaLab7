package com.pivottech;
import java.util.ArrayList;
public class Theater {
    private String name;
    private ArrayList <Movie> movies;

    public Theater(String name, ArrayList<Movie> movies)
    {
        this.name = name;
        this.movies = movies;

    }
    public ArrayList<Movie> addMovie(Theater movie)
    {
        movies.add(movie);
        return movies;

    }
    public ArrayList<Movie> RemoveMovie(Movie movie)
    {
        movies.remove(movie);
        return movies;

    }
}
