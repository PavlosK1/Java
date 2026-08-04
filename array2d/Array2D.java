package com.mycompany.array2d;

public class Array2D {

    public static void main(String[] args) {
        
        // 2D Array = an array of arrays
        
        String [][] cars = {    {"BMW","Mercedes","Ford"},
                                {"Ferrari","Tesla","Lambo"},
                                {"VW","Toyota","Ranger"}  
                            };
        
        
        //String [][] cars = new String[3][3];
        
        
        //cars[0][0] = "BMW";
        //cars[0][1] = "Mercedes";
        //cars[0][2] = "Ford";
        
        //cars[1][0] = "Ferrari";
        //cars[1][1] = "Tesla";
        //cars[1][2] = "Lambo";
        
        //cars[2][0] = "VW";
        //cars[2][1] = "Toyota";
        //cars[2][2] = "Ranger";
        
        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
        }
        
    }
}
