package com.mycompany.print_f;

public class Print_F {

    
    public static void main(String[] args) {
        
        //printf = is an optional method to control, format and display text to the console
        
        boolean myBool = true;
        char myChar = '$';
        String myString = "Code";
        int myInt = 5000;
        double myDouble = 1.56;
        
        System.out.printf("%b%n", myBool);
        System.out.printf("%c%n", myChar);
        System.out.printf("%s%n", myString);
        System.out.printf("%d%n", myInt);
        System.out.printf("%f%n", myDouble);
        System.out.printf("%s,    %d%n", myString, myInt);
        
        
        //// width = minimum characters to be written
        
        System.out.printf("Hello %14s%n", myString);
        System.out.printf("Hello %-14s%n", myString);
        
        
        //// precision = stes number of digits of precision float-double
        
        System.out.printf("Double number: %.1f%n", myDouble); // .1 = round the number, .2 and more shows exactly two or more (depends on number) decimal places
        
        
        //// flags = adds an effect to output (- left justify, + output (+) or (-) sing for a numeric value, (0) numeric values are zero-padded, (,) groupping separator))
        
        System.out.printf("You have this amount of money %+f%n", myDouble);
        System.out.printf("You have this amount of money |%-9f|%n", myDouble);
        System.out.printf("You have this amount of money %011.1f%n", myDouble);
        System.out.printf("You have this amount of money %,f%n", myDouble);
    }
}
