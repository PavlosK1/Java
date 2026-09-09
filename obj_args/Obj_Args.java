package com.mycompany.obj_args;

public class Obj_Args {

    public static void main(String[] args) {
        Refrigerator ref = new Refrigerator();
        
        Food food1 = new Food("Pastitsio");
        
        ref.freeze(food1);
        
    }
}
