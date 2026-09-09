package com.mycompany.methoverriding;

public class Car extends Vehicle {
    
    int wheels = 4;
    int doors = 3;
    
    void drive(){
        System.out.println("Car goes like turbo");
    }
}
