/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jf_lesson6_2;
import java.util.*;
import java.io.*;

/**
 *
 * @author 0618506375
 */
public class JF_Lesson6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        // Will not allow : Checked exeception must be handled    
        try {
            FileReader reader = new FileReader("test.txt");
        }
        catch(IOException e){
            System.out.println("File not found.");
        }

        System.out.println("All Good");
        
        // Exception with throwing first 
        int i =-2;
        try {
            if (i<0 || i>9)
                throw new Exception("Index " + i + "is out of bounds");
        }
        catch(Exception e) {
            System.out.println(e);
            if (i>9)
                i -= 9;
            else
                i += 9;
       
        }
        
        System.out.println("The value of i is : " + i);
       
        
        
    }// end of main
    
}// end of class
