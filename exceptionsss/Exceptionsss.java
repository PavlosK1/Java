package com.mycompany.exceptionsss;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionsss {

    public static void main(String[] args) {
        
        // Exception = is an unexpected event that occurs during the execution
        // of a program and interrupts its normal flow
        
        try{
            
            Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to divide: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter a number to divide: ");
        int num2 = scanner.nextInt();
        
        int result = num1/num2;
        
        System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by 0!");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter only numbers ");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
            System.out.println(e.toString());
        }
        
    }
}