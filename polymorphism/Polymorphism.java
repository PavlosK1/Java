package com.mycompany.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        
        // Polymorphism = many forms
        // The ability of an object to be treated as more than one type
        
    Rabbit rabbit = new Rabbit();
    Hawk hawk = new Hawk();
    Fish fish = new Fish();
    
    Animal[] animals = {hawk, rabbit, fish};
    
    for(Animal animal : animals){
        animal.move();
    }
        
    }
}
