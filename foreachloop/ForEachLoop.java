package com.mycompany.foreachloop;

import java.util.ArrayList;

public class ForEachLoop {

    public static void main(String[] args) {
        
        //for-each = similar to "for" but has less steps and less flexible that "for"
        
        //String[] cars = {"BMW","Mercedes","Ford","VW"};
        
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Ford");
        cars.add("VW");
        
        for(String i : cars){
            System.out.println(i);
        }
        
        
    }
}
