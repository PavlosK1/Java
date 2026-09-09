package com.mycompany.staticismodifier;

public class Food {
    String name;
    
    static int numberOfFoods;
    
    Food(String name){
        this.name = name;
        numberOfFoods++;
    }
    
    static void prinNumberOfFoods(){
        System.out.println("You have "+numberOfFoods+" in total");
    }
    
}
