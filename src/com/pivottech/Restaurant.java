package com.pivottech;

public class Restaurant {

    public String name;
    public int rating;
    public String priceCategory;

    public Restaurant(String name,int rating, String priceCategory)
    {

        System.out.println(" "+ name + " has a rating of  " + rating +" and the price category is  " + priceCategory);
        AString(name, priceCategory);
    }
    public String AString(String name, String priceCategory)
    {
        if(priceCategory == "$")
        {
            System.out.println(" "+name+ " is cheap");
        }
        if(priceCategory == "$$")
        {
            System.out.println(" "+name+ " is cheap");
        }
        if(priceCategory == "$$$")
        {
            System.out.println(" "+name+ " is cheap");
        }
        return priceCategory;
    }
}
