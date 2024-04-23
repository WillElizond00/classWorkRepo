/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trianglearea;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class TriangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner scanner = new Scanner(System.in);
    
    // Prompt user for base
    System.out.print("Enter the base of the triangle: ");
    double base = scanner.nextDouble();
    
    // Prompt user for height 
    System.out.print("Enter the height of the triangle: ");
    double height = scanner.nextDouble();
    
    //Calculate the area
    double area = 0.5 * base * height;
    
    // Display the area
    System.out.println("The area of the triangle is: " + area);
                
    
    }
    
    
    
}
