package com.mycompany.methods;

public class Methods {

    public static void main(String[] args) {
        
        // Method = a block of code that is executed when it is called
        
        String name = "Pavlos";
        int age = 35;
        hello(name,age);
        
        
    }
    
    static void hello(String name,int age){
        System.out.println("Hello "+name+" you are "+age+" years old");
    }
}
