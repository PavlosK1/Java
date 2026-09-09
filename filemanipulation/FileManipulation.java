package com.mycompany.filemanipulation;
import java.io.File;

public class FileManipulation {

    public static void main(String[] args) {
        
        //File file = new File("C:\\Users\\Pavlos\\Desktop");
        File file = new File("secret");
        //File file = new File("secret_file.txt");
        
        if(file.exists()){
            System.out.println("This file exists");
            System.out.println(file.getAbsolutePath());
            //System.out.println(file.isFile());
            System.out.println(file.isDirectory()); //Directory is looking for Folder
            file.delete(); // Deletes the file/folder
        }
        else{
            System.out.println("This file does not exist !");
        }
        
    }
}
