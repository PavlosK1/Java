package com.mycompany.methoverriding;

public class Bike extends Vehicle {
    
    int wheels = 2;
    int doors = 0;
    
    
    void drive(){
        System.out.println("Goes on one wheel!");
    }
}
