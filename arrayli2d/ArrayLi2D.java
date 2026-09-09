package com.mycompany.arrayli2d;

import java.util.ArrayList;

public class ArrayLi2D {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> partyList = new ArrayList<ArrayList<String>>();
        
        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("Tsipouro");
        drinkList.add("Ouzo");
        drinkList.add("Gin");
        
        ArrayList<String> sodaList = new ArrayList<String>();
        sodaList.add("Tonic");
        sodaList.add("Cola");
        sodaList.add("Soda");
        
        ArrayList<String> foodList = new ArrayList<String>();
        foodList.add("Pitogyro");
        foodList.add("Pizza");
        foodList.add("Chips");
        
        partyList.add(drinkList);
        partyList.add(sodaList);
        partyList.add(foodList);
        
        //System.out.println(partyList.get(2).get(1));
        System.out.println(partyList.get(1).get(2));
        
    }
}
