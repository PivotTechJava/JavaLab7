package com.pivottech;

public class Restaurant implements RestaurantReview {

    public String name;
    public int rating;
    public String priceRange;

    public Restaurant(String name, int rating, String priceRange) {
        System.out.println(name + " the rating is: " + rating + " the price range is " + priceRange);
        aString(name, priceRange);
    }

    @Override
    public String aString(String name, String priceRange) {
        if (priceRange == "$")
        {
            priceRange = name + " is cheap";
        }
        if (priceRange == "$$")
        {
            priceRange = name + " is medium priced");
        }
        if (priceRange == "$$$")
        {
            priceRange = name + " is expensive";
        }
        return priceRange;
    }
}
