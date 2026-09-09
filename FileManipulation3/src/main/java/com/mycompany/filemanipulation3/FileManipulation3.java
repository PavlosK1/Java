package com.mycompany.filemanipulation3;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileManipulation3 {

    public static void main(String[] args) {
        
        // FileReader = reads the contents of a file as a stream of characters
        // read() returns an int containing a byte value and re -1 when there is no more content to read
        
        
    try {
        FileReader reader = new FileReader("testfile.txt");
        
        try {
            int data = reader.read();
            
            while(data !=-1) {
                System.out.print((char)data);  //// SOS ///
                data = reader.read();
            }
            reader.close();
            
            //int data = reader.read(); //reads the data character by character
            //System.out.println((char)data);
            //int data2 = reader.read();
            //System.out.println((char)data2);
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        } catch (FileNotFoundException e) {
        }
    }
}