/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalexam;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class FinalExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    double average;
    int daysAbsent;
    boolean exempt=false;
    
    Scanner reader = new Scanner(System.in);
    
    System.out.println("This program will determine if you can get out of the final exam.");
    System.out.println("Please answer the following questions.");
    
    System.out.println("What is your average in the class?");
    average=reader.nextDouble();
    
    System.out.println("How many class lectures have you missed?");
    daysAbsent=reader.nextInt();
    
            
    if((average >= 90 && daysAbsent <= 3)||(average >= 80 && daysAbsent <= 0)){
        exempt = true;
    }
    
    if(exempt)
        System.out.println("Congratulations! You are exempt from the final exam.");
    else
        System.out.println("You are not exempt from the final exam.");
    
    }
    
}
