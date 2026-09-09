package com.mycompany.overloaded_con;

public class Overloaded_Con {

    public static void main(String[] args) {
        
        Pizza pizza = new Pizza("Italian thin","Mozzarella");
        
        System.out.println("here are the ingredients: ");
        System.out.println(pizza.bread);
        //System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        //System.out.println(pizza.topping);
        
    }
}
