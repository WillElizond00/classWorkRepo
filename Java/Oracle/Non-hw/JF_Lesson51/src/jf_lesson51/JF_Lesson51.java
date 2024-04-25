/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jf_lesson51;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class JF_Lesson51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instantiate a scanner object
        Scanner input = new Scanner(System.in);
        Scanner myIn = new Scanner(System.in);
        
/*    
        //Prompt user for name
        System.out.println("Please enter your last name : ");
        String lName = input.next();
        
       
        
        System.out.println("Please enter your first name : ");
        String fName = myIn.next();
        
        
        
        System.out.println("Please enter the last digit of DOB : ");
        int yDob = input.nextInt();

        System.out.println("Please enter your GPA (5.0) : ");
        double myGpa = myIn.nextDouble();
        
        
        System.out.println("Last name : " + lName);
        System.out.println("First name : " + fName);
        System.out.println("Last digit of DOB : " + yDob);
        System.out.println("GPA : " + myGpa);
        
        // Close Scanner
        input.close();
        System.out.println(myIn.hasNext());
*/
        System.out.println("Enter Grade : ");
        int grade = input.nextInt();
        boolean madeHonorRoll = (grade >= 88);
        System.out.println("Enter absence : ");
        int numberOfDaysAbsent = input.nextInt();
        
        if (madeHonorRoll && numberOfDaysAbsent == 0) {
            System.out.println("Congrats you made honor roll!");
        }
        else if(madeHonorRoll) {
            System.out.println("Made honor roll but not Validictorian");
        }
        else {
            System.out.println("Sorry, no candies!");
        }
    }// end of main
    
}// end of class
