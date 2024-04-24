/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fieldtrip;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class FieldTrip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        //Step 1: Input the total number of people
        System.out.print("Enter the total number of people going on the field trip : ");
        int totalPeople = scanner.nextInt();
        
        // The capacity of one bus 
        int busCapacity = 45;
        
        // The amount of busses needed
        int busesNeeded = totalPeople / busCapacity;
        
        // Calculate the number of people in vans
        int peopleInVans = totalPeople % busCapacity;
        
        // Output the results
        System.out.println("Number of buses required: " + busesNeeded);
        System.out.println("Total number of people in vans: " + peopleInVans);
        
        scanner.close();
    
    
    }
    
}
