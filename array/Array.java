package com.mycompany.array;

public class Array {

    public static void main(String[] args) {
        
        // Array = used to store multiple values within a single variable
        
        String[] cars = new String[3];
        
        cars[0] = "lambo";
        cars[1] = "BMW";
        cars[2] = "Mercedes";
        
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
