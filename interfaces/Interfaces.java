package com.mycompany.interfaces;

public class Interfaces {

    public static void main(String[] args) {
        
        // Interface = is a template that can be applied to a class
        // it looks like inheritance, but ιt defines what a class must have or do.
        // we can have many interfaces in a class but only one super class
        
        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();
        
        fish.hunt();
        fish.flee();
        
        hawk.hunt();
        
        rabbit.flee();
    }
}
