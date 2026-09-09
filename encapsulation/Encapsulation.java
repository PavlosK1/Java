package com.mycompany.encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        
        // Encapsulation = the attributes of a class must be private
        // we have access only with setter/getter
        
        Car car = new Car("VW", "Golf", 2003);
        
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println("----------------");
        car.setYear(2020);
        System.out.println(car.getYear());
    }
}
