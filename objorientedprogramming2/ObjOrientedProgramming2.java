package com.mycompany.objorientedprogramming2;

public class ObjOrientedProgramming2 {

    public static void main(String[] args) {
        //object oriented programming (OOP)
        //constructor
        
        
        Hero hero = new Hero("Batman",50 ,90.5);
        Hero hero2 = new Hero("Joker", 45, 75.4);
        
        System.out.println(hero.name);
        hero.eat();
        hero.drink();
        
        System.out.println(hero2.name);
        hero2.eat();
        hero2.drink();
        
    }
}
