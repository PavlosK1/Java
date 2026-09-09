package com.mycompany.tostring_method;

public class Car {
    
    String make = "VolksWagen";
    String model = "Golf";
    String color = "Black";
    int year = 2015;
    
    //Overriding
    
    public String toString(){
        return make+", "+model+", "+color+", "+year;
    }
    
}
