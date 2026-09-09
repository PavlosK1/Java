package com.mycompany.overloadedmethods;

public class OverloadedMethods {

    public static void main(String[] args) {
        // Overloaded methods = methods that have the same name but they have diffrent parameters
        // Method name + parameters = method signature
        
        //int result = add(2,3,9);
        double result = add(6.4,7.6,1);
        System.out.println(result);
    }
    
    static int add(int x, int y){
        System.out.println("method 1");
        return x+y;
        
    }
    static int add(int x, int y, int z){
        System.out.println("method 2");
        return x+y+z;
        
    }
    static int add(int x, int y, int z, int n){
        System.out.println("method 3");
        return x+y+z+n;
    }
    static double add(double x, double y){
        System.out.println("method 4 double");
        return x+y;
    }
    static double add(double x, double y, double z){
        System.out.println("method 5 double");
        return x+y+z;
    }
}
