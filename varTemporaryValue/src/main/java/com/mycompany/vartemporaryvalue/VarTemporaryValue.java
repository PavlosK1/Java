package com.mycompany.vartemporaryvalue;

public class VarTemporaryValue {

    public static void main(String[] args) {
        //Swap 2 vaiables
        String x = "water";
        String y = "gin";
        
        String temp;
        temp = x;
        x=y;
        y = temp;
        
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
