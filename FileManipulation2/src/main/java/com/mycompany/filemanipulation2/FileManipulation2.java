package com.mycompany.filemanipulation2;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulation2 {

    public static void main(String[] args) {
    
    try{
        FileWriter writer = new FileWriter("testfile.txt");
        
        writer.write("This is Pavlos line \nThis is line 2 \nThis is line 3");
        writer.append("\nThis is an appended line");
        writer.append("\nBye bye");
        writer.close();
        
        
        }catch (IOException e) {
            e.printStackTrace();
            
        }
    }
}
