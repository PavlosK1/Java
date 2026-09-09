package com.mycompany.objarray;

public class ObjArray {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];
        
        //Food[] foods = new Food[3];
        
        ///Food food1 = new Food("pitogyro");
        ///Food food2 = new Food("Pitsa");
        ///Food food3 = new Food("icecream");
        
        Food[] foods = {new Food("pitogyro"),new Food("Pitsa"),new Food("icecream")};
        
        //foods[0] = food1;
        //foods[1] = food2;
        //foods[2] = food3;
        
        for (Food food : foods){
            System.out.println(food.name);
        }
        
        //System.out.println(foods[0].name);
        //System.out.println(foods[1].name);
        //System.out.println(foods[2].name);
                
    }
}
