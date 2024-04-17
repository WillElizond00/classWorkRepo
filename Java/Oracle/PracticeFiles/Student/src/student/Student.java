/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class Student {
    private int studentId;
    private String name;
    private double gpa;
    
    public final int SCHCODE = 2221;
    
    //Default constructor
    public Student(){
        
    }
    //Instance Methods 
    //Getter - Accessor
    public int getStudId(){
    return studentId;
    }
    public String getName(){
    return name;
    }    
    public double getGpa(){
    return gpa;
    }
    // Setters
    public void setStudId(int sId){
    studentId = sId;
    }
    public void setName(String myName){
    name = myName;
    }    
    public void setGpa(double gpa){
    this.gpa = gpa;
    }
    
    
}// End of class
