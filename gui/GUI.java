package com.mycompany.gui;

import javax.swing.JOptionPane;

public class GUI {

    public static void main(String[] args) {
        
        //GUI = Graphical User Interface
        //Parse = Convert strings into other data types
        
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showConfirmDialog(null, "You are "+age+" years old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height?"));
        JOptionPane.showConfirmDialog(null, "You are "+height+"m tall?");
    }
}
