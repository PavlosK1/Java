package com.mycompany.inheritance;

public class Inheritance {

    public static void main(String[] args) {
        // inheritance = the process where one class acquires,
        // the attributes an methods of another.
        
        Car car1 = new Car();
        Bike bike1 = new Bike();
        
        //System.out.println(car1.speed);
        //car1.drive();
        
        ///bike1.stop();
        
        System.out.println(car1.doors);
        System.out.println(bike1.wheels);
    }
}
