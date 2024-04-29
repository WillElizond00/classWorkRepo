/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decode;
import java.util.Scanner;

/**
 *
 * @author 0618506375
 */
public class Decode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Create a scanner object to read input from the console
    Scanner scanner = new Scanner(System.in);
        
    //Prompt the user     
    System.out.println("You're gonn give us 10 numbers, one at a time and it will print out a decoded message."); 
    //String variable to accumlate the decoded message.
    
    String message = ""; // Use a regular String to accumulate the message
    int count = 0;
    
    // Loop until 10 valid numbers are input
    while (count < 10){
        System.out.println("Enter a number between 1 and 7:");// ask for a number
        int num = scanner.nextInt(); // Read the number
        
        //Decode the number using if-else statements to check for each possible valid number.
        if (num == 1){
            message += 'D';
            count++;
        } else if (num == 2){
            message += 'W';
            count++;
        } else if (num == 3){
            message += 'E';
            count++;
        } else if (num == 4){
            message += 'L';
            count++;
        } else if (num == 5){
            message += 'H';
            count++;
        } else if (num == 6){
            message += 'O';
            count++;
        } else if (num == 7){
            message += 'R';
            count++;
        } else {
            System.out.println("Invalid number. Please enter a number from 1 through 7.");
        }
        
    }
        
    scanner.close();
    
    //Output the decoded message
    System.out.println("Decoded message: " + message);
    
    
    
    
    }//end of main
    
}//end of public
