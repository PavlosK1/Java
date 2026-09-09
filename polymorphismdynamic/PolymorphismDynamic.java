package com.mycompany.polymorphismdynamic;
import java.util.Scanner;

public class PolymorphismDynamic {

    public static void main(String[] args) {
        
        // Dynamic Polymorphism works while the program is running
        
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        
        System.out.println("What animal do you want?");
        System.out.println("1 = Cat |   2 = Dog ");
        int choice = scanner.nextInt();
        
        if (choice==1){
            animal = new Cat();
            
        }
        else if(choice==2){
            animal = new Dog();
            
        }
        else{
            animal = new Animal();
            
        }
        
        animal.speak();
                
    }
}
