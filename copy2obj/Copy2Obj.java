package com.mycompany.copy2obj;

public class Copy2Obj {

    public static void main(String[] args) {
        Car car1 = new Car("VW", "Golf", 2003);
        Car car2 = new Car("BMW", "X2", 2015);
        Car car3 = new Car(car1);
        
        //car2 = car1; =>WRONG 
        car2.copy(car1);
        
        System.out.println(car1); // prints the memory location
        System.out.println(car2); // prints the memory location
        System.out.println(car3); // prints the memory location
        System.out.println();
        
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }
}
