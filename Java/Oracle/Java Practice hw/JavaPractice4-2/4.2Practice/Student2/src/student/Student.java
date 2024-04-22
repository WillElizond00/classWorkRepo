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
    
    //Constructor with 3 parameters
    public Student(int stuId,String stutName,double myGpa){
        this.studentId = stuId;
        this.name = stutName;
        this.gpa = myGpa;
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
    
    // Overwrite the toString() method
    public String toString(){
        String stuData = "\nStudent Data : \n";
        stuData += "Student Number : " + studentId +"\n";
        stuData += "Student Name   : " + name + "\n";
        stuData += "Student GPA    : " + gpa + "\n";
        return stuData;
    }
    
}// End of class
