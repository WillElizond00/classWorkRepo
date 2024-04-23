/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson4_3_math;

/**
 *
 * @author 0618506375
 */
public class Lesson4_3_Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int myInt1 = 10;
        int myInt2 = 15;
        System.out.println("Truncation: " + myInt2/myInt1);
        System.out.println("Double: " + ((double)myInt2/(double)myInt1));
        System.out.println("Mod: " + ((double)myInt2%(double)myInt1));
        System.out.println("Floor: " +Math.floor((double)myInt2/(double)myInt1));
        */
        
        int number; 
        double numberx;
        
        numberx = Math.random();
        number = (int)(numberx * 100);
        
        
        System.out.println("The random number is " + numberx + ".\n");
        System.out.println("The random number is " + number + ".\n");
        
        // System.out.println(PI);
        double answer = Math.sqrt(625);
        System.out.println("Answer : " + answer);
        
        
        
        
        
    }
    
}
