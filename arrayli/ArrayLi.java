package com.mycompany.arrayli;

import java.util.ArrayList;

public class ArrayLi {

    public static void main(String[] args) {
        //ArrayList = a resizable array
        //            Elements can be added and removed after coplilation phase
        //            store reference data types
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(8);
        numbers.add(52);
        numbers.add(100);
        
        numbers.set(1, 10);
        numbers.remove(2);
        //numbers.clear();
        
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
    
        
    }
}
