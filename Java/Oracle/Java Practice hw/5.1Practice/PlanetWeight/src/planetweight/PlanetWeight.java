/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planetweight;
import java.util.Scanner;

/**
 *
 * @author 0618506375
 */
public class PlanetWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //Conversion factors for each planet
        
        double mercuryFactor = 0.38;
        double venusFactor = 0.91;
        double marsFactor = 0.38;
        double jupiterFactor = 2.36;
        double saturnFactor = 0.92;
        double uranusFactor = 0.89;
        double neptuneFactor = 1.1;
        
        //Prompt user for their weight on Earth
        System.out.println("Please enter your earth weight : ");
        double earthWeight = scanner.nextDouble();
        
        //Display menu for planet selection
        System.out.println("Choose a planet to find out your weight there:");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturn");
        System.out.println("6. Uranus");
        System.out.println("7. Neptune");
        
        //Get users choice
        int choice = scanner.nextInt();
        
        //Calculate and display the user's weight on the chosen planet
        if (choice == 1) {
            System.out.println("Your weight on Mercury is " + (earthWeight * mercuryFactor) + " lbs.");
        } else if (choice == 2) {
            System.out.println("Your weight on Venus is " + (earthWeight * venusFactor) + " lbs.");
        } else if (choice == 3) {
            System.out.println("Your weight on Mars is " + (earthWeight * marsFactor) + " lbs.");
        } else if (choice == 4) {
            System.out.println("Your weight on Jupiter is " + (earthWeight * jupiterFactor) + " lbs.");
        } else if (choice == 5) {
            System.out.println("Your weight on Saturn is " + (earthWeight * saturnFactor) + " lbs.");
        } else if (choice == 6) {
            System.out.println("Your weight on Uranus is " + (earthWeight * uranusFactor) + " lbs.");
        } else if (choice == 7) {
            System.out.println("Your weight on Neptune is " + (earthWeight * neptuneFactor) + " lbs.");
        } else {
            System.out.println("Invalid choice. Please select a number from 1 to 7.");
        }

        scanner.close();
        
    }// end of main
    
}// end of class
