/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixprogram;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class MatrixProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        
        //Placeholder matrices
        int[][] matrixA = null;
        int[][] matrixB = null;
        
        while (isRunning){
        System.out.println("Choose an option:");
        System.out.println("a. Enter Matrix A");
        System.out.println("b. Enter Matrix B");
        System.out.println("c. Display A + B");
        System.out.println("d. Display A - B");
        System.out.println("e. Display A * B");
        System.out.println("f. Exit");
        System.out.println("Enter your choice: ");
        String choice = scanner.nextLine();

        
        
        
        switch(choice){
            case "a":
                break;
            case "b":
                break;
            case "c":
                break;
            case "d":
                break;
            case "e":
                break;
            case "f":
                System.out.println("Exiting...");
                isRunning = false;
                break;
            default:
                System.out.println("Invalid option. Please choose again.");
        }
        
        
        }
        
 
            
        scanner.close();
      
    } //end of main
} // end of class 
      

