/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jf_lesson52;
import java.util.Scanner;

/**
 *
 * @author 0618506375
 */
public class JF_Lesson52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a Scanner object 
        
        Scanner input = new Scanner(System.in);
        
        String name = "William";
        System.out.println(name);
        
        int myInput; //Value of input 
        int numberInputs = 0; // count for number of inputs
        int sum = 0; //sum of all inputs\\
        
/*        
        // While loop 
        while (numberInputs < 2) {
            System.out.println("Please enter a number to add : ");
            myInput = input.nextInt();
            sum += myInput;
            numberInputs++;
      
        
        System.out.println("The sum of those numbers is : " + sum);
        }// end of while 
*/
/*        
        // Do while 
        
        System.out.println("Please enter the number of inputs : ");
        int maxInputs = input.nextInt();
        
        do {
            System.out.println("Please enter a number to add: ");
            myInput = input.nextInt();
            
            sum += myInput;
            numberInputs += 1;
        } while (numberInputs < maxInputs);
        System.out.println("The sum of all numbers is : " + sum);
*/
        for(int i=0; i < 2; i++){
            System.out.println("Please enter a number to add: ");
            myInput = input.nextInt();
            sum += myInput;
            numberInputs += 1;
            
        }// end of for loop
        System.out.println("The sum of all numbers is : " + sum);

    }// end of main
    
    
}// end of class
