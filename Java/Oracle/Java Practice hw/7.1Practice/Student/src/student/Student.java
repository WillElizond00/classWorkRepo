/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author deck
 */
public class Student {

    String name;
    double credits, gpa,qualityPoints;
    
    Student(String name, double credits, double gpa, double qualityPoints){
        this.name = name;
        this.credits = credits;
        this.gpa = gpa;
        this.qualityPoints = qualityPoints;
               
    }
    public double getGpa(){
        return qualityPoints / credits;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        
    }//end of main
    
}//end of class
