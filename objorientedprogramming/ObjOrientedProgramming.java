package com.mycompany.objorientedprogramming;

public class ObjOrientedProgramming {

    public static void main(String[] args) {
        
        // object oriented programming (OOP) = is a programming style where you organize code into objects. 
        //                                     An object represents something with data (attributes) and behavior (methods)
        
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        
        System.out.println(myCar1.model);
        System.out.println(myCar2.model);
        
        myCar2.drive();
        myCar2.brake();
        
    }
}
