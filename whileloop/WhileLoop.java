package com.mycompany.whileloop;

import java.util.Scanner;

public class WhileLoop {
    
    public static void main(String[] args) {
        
        //while loop = executes a block of code as long it's condition is true
        
        Scanner scanner = new Scanner(System.in);
        String name = "";
        
        //    (1==1) ----> Always true (Cntrl+c to stop)
        while (name.isBlank()){
            System.out.println("hello enter your name ");
            name = scanner.nextLine();
        }
        System.out.println("Welcome "+name);
    }
}
