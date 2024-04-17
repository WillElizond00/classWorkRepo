/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstjavaapp;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class MyFirstJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);
        
        
        String name = " ";
        System.out.println("Please enter your name: ");
        name = input.next();
        
        System.out.println(name.length());
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.substring(6));
        
        
    } // End of main method
    
}// End of Class
