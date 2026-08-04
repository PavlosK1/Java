package com.mycompany.ifstatement;

public class IfStatement {

    public static void main(String[] args) {
        //if statement = execute a block of code if the condition evaluates to be true
        
        int age = 20;
        
        if (age == 50){
            System.out.println("You are old");
        }
        else if(age >= 18){
            System.out.println("You are adult");
        }
        else if(age >= 13){
            System.out.println("You are teenager");
        }
        else{
            System.out.println("You are still a kid");
        }
    }
}
