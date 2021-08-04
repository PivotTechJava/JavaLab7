package com.pivottech;

public class Main {

    public static void main(String[] args) {
	    Restaurant sub = new Restaurant("Subculture", 2, "$");
	    Restaurant alex = new Restaurant("J Alexander", 3, "$$$");

	    Review review1 = new Review("April", "One of my favorite go-to places for salad!", 4);

	    alex.MakeString();
    }
}
