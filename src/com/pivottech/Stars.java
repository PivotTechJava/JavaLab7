package com.pivottech;

import java.util.HashMap;

public enum Stars {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private int numStars;

    Stars(int numStars){
        this.numStars = numStars;
    }

    public String toString(){
        String starStr = "";
        for(int i = 0; i < numStars; i++) {
            starStr += "★";
        }
        return starStr;
    }
}
