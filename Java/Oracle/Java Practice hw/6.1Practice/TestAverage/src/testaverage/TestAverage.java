/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testaverage;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class TestAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner inputy = new Scanner(System.in);
    
    
    //declare array to store the test score
    
    double[] scores = new double[5];
    
    //Use a for loop to prompt about each score till 5 is reached
    for(int i = 0; i < 5; i++){
        System.out.println("Enter the score for test " + (i + 1) + ":");
        scores[i] = inputy.nextDouble();
    }
    //Calculate the total
    double total = 0;
    for(int i = 0; i < scores.length; i++){
        total += scores[i];
    }
    
    //Calculate the average
    
    double average = total / scores.length;
    
    System.out.println("The average score is: " + average);
    
    
        
    }// end of main
    
}// end of class
