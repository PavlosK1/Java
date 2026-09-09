package com.mycompany.staticismodifier;

public class StaticIsModifier {

    public static void main(String[] args) {
        
        // static = modifier. A single copy of a variable/method is created and shared to all objects of this class
        // the class "owns" the static member
        
        Food food1 = new Food("souvlaki");
        Food food2 = new Food("pizza");
        Food food3 = new Food("pastitsio");
        
        Food.prinNumberOfFoods();
        
        
    }
}
