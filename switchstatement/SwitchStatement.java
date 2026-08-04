package com.mycompany.switchstatement;

public class SwitchStatement {

    public static void main(String[] args) {
        
        //switch = statement that allows a variable to be tested for equality
        
        String day = "Saturday";
        
        switch (day){
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thurstday":
                System.out.println("It is Thurstday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("This is not a day!");
                
        }
        
    }
}
