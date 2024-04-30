/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anagram;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author deck
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        if (isAnagram(str1, str2)){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        scanner.close();
        
        
        
    }// End of main method
    
    public static boolean isAnagram(String first, String second) {
    // Remove all whitespace and punctuation, and convert to lower case
    char[] firstArray = first.replaceAll("[\\s+\\p{Punct}]", "").toLowerCase().toCharArray();
    char[] secondArray = second.replaceAll("[\\s+\\p{Punct}]", "").toLowerCase().toCharArray();
    
    // Sort both character arrays
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    
    // Convert arrays back to strings and compare
    return Arrays.equals(firstArray, secondArray);
}
    
}
