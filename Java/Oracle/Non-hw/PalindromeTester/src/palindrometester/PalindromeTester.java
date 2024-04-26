/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrometester;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class PalindromeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please enter a word : ");
        String word = input.next();
        
        
        int firstPosition = 0;
        int lastPosition = word.length() - 1;
        boolean isAPalindrome = true;
        
        while (firstPosition < lastPosition){
            if (word.charAt(firstPosition) != word.charAt(lastPosition)){
                
                isAPalindrome = false;
               
            }
            
            firstPosition++;
            lastPosition--;
            
            
        }// End of while 
        
        
            if (isAPalindrome)
                System.out.println("The word is a palindrome");
            else
                System.out.println("The word is not a palindrome");
        
    }// end of main
    
}// end of class
