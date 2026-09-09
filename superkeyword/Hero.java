package com.mycompany.superkeyword;

public class Hero extends Human {
    
    String power;
    
    Hero(String name, int age, String power){
        super(name, age);
        this.power = power;
    }
    // overriding method
    public String toString(){
        return super.toString() + this.power;
    }
}
