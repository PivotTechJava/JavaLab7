package com.pivottech;

public class Restaurant {
    String name;
    int stars;
    String priceCategory;

    public Restaurant(String newName, int newStar, String newPrice) {
        this.name = newName;
        this.stars = newStar;
        this.priceCategory = newPrice;
    }

    public void MakeString() {
        System.out.println("Name: " + name + "\r\nStars: " + stars +  "\r\nPrice Category: " + priceCategory);
    }
}
