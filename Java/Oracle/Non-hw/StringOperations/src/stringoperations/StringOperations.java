/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringoperations;
import java.util.Scanner;

/**
 *
 * @author 0618506375
 */
public class StringOperations 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //Declare Variables
        Scanner input = new Scanner(System.in);
        int grades;
        String name = "First Name, Lastname";
        String name2;
        String string1 = "Hello";
        String string2 = "Lisa";
        String string3 = new String("How are you");
        string3 = "New String 3";
        string3 = " ";
        String string4 = (string1 + string3 + string2);
        name2 = name;
        
        System.out.println("Please enter a name : ");
        name = input.next();
        System.out.println("Please enter a name2 : ");
        name2 = input.next();
        
        name2 = name;
        System.out.println(name);
        System.out.println(name2==name);
        System.out.println(name.equals(name2));
        
        System.out.println(string3);
        System.out.println(string1 + string3 + string2);
        System.out.println("length : " + string1.length());
        System.out.println("Substring : " + string4.substring(6));
        System.out.println("Substring (s, e) : " + string4.substring(0,5));
        System.out.println("Substring (s, e) : " + (string4.substring(0,5)).toUpperCase());
       
        String s1 = "This is a ";
        String s2 = "string";
        String s3 = s1 + s2;
        String s4 = "This is a " + s2;
  
        
        System.out.println("s1: \t" + s1);
        System.out.println("s2: \n" + s2);
        System.out.println("s3: \\" + s3);
        System.out.println("s4: " + s4);
        
        
        String s5 = "abc";
        String s6 = "cde";
        System.out.println(s5.compareTo(s6));
        System.out.println(s5.equals(s6));
        System.out.println(s5.indexOf("b"));
        System.out.println(s5.charAt(1));
        
        
    }// end of main method
    
}// end of class
