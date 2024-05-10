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
    
    Student(String name, double credits, double qualityPoints){
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        
        if (this.credits > 0){
        this.gpa = this.qualityPoints / this.credits;
        }else{
            this.gpa = 0;
        }
    }
    public double getGpa(){
        return gpa;
    }
    
    public void updateAcademicRecord(double newCredits, double newQualityPoints){
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        
        
        if(this.credits > 0){
            this.gpa = this.qualityPoints / this.credits;
        } else {
            this.gpa = 0;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Student maryJ = new Student("Mary Jones", 14,46);
        Student johnS = new Student("John Stiner", 60, 173);
        Student ariS = new Student("Ari Samala", 31, 69);
        
    }//end of main
    
}//end of class
