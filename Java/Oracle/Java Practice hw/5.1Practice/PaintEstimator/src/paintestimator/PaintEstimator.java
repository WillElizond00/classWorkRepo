/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paintestimator;
import java.util.Scanner;

/**
 *
 * @author 0618506375
 */
public class PaintEstimator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        
        // Constants for paint coverage and costs
        final int COVERAGE_5L = 1500; // square feet per 5-liter bucket
        final int COVERAGE_1L = 300; // square feet per 1-liter bucket
        final double COST_5L = 15.0; // cost per 5-liter bucket
        final double COST_1L = 4.0; // cost per 1-liter bucket

        // Get room dimensions from the user
        System.out.println("Enter the height of the room (in feet):");
        double height = scanner.nextDouble();
        System.out.println("Enter the length of the room (in feet):");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room (in feet):");
        double width = scanner.nextDouble();

        // Calculate the total area to be painted
        double wallArea = 2 * (length * height) + 2 * (width * height);
        double ceilingArea = length * width;
        double totalPaintArea = wallArea + ceilingArea;

        // Calculate the number of buckets needed for both types
        int buckets5L = (int) Math.ceil(totalPaintArea / COVERAGE_5L);
        int buckets1L = (int) Math.ceil(totalPaintArea / COVERAGE_1L);

        // Calculate costs for each option
        double costFor5L = buckets5L * COST_5L;
        double costFor1L = buckets1L * COST_1L;

        // Output the results
        System.out.println("Total area to paint: " + totalPaintArea + " square feet.");
        System.out.println("Option 1: Use 5-liter buckets only:");
        System.out.println(" - Buckets needed: " + buckets5L);
        System.out.println(" - Total cost: $" + costFor5L);
        System.out.println("Option 2: Use 1-liter buckets only:");
        System.out.println(" - Buckets needed: " + buckets1L);
        System.out.println(" - Total cost: $" + costFor1L);

        scanner.close();
        
        
    }
    
}
