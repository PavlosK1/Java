package com.mycompany.local_global_var;

import java.util.Random;

public class Dice {
    
    Dice(){
        // local
        Random random = new Random();
        int number = 0;
        roll(number,random);
    }
    
    void roll(int number, Random random){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
    
}
