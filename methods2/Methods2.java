package com.mycompany.methods2;

public class Methods2 {

    public static void main(String[] args) {
        
        // Method = a block of code that is executed when it is called
        
        int x = 3;
        int y = 5;
        
        //int z = add(x, y);
        //System.out.println(z);
        
        System.out.println(add(x, y));
    }
    static int add(int num1, int num2){
        int result = num1+num2;
        return result;
    }
}
