package com.mycompany.methoverriding;

public class MethOverriding {

    public static void main(String[] args) {
        
        // method overriding = Declaring a method in sub class,
        // which is already present in parent class.
        // done so that a child class can give its own implementation
        
        Car car1 = new Car();
        
        car1.drive();
        
        Bike bike1 = new Bike();
        bike1.drive();
        
    }
}
