package com.mycompany.stringmethods;

public class StringMethods {

    public static void main(String[] args) {
        
        // String = data type that can store characters
        
        String name = "   PaVlos  ";
        
        //boolean result = name.equals("Pavlos");
        //boolean result = name.equalsIgnoreCase("pavlos");
        //int result = name.length();
        //char result = name.charAt(2);
        //int result = name.indexOf("a");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace("a", "e");
        
        System.out.println(result);
    }
}
