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
    private String fName;
    private String lName;
    private int stuId;
    private String stuStatus;
    
    // Official version
    
    //Default constructor
    public Student(String fName, String lName, int stuId, String stuStaus){
      this.fName = fName;
      this.lName = lName;
      this.stuId = stuId;
      this.stuStatus = stuStatus;
    }
    //Instance Methods 
    //Getter - Accessor
    public int getStudId(){
    return stuId;
    }
    public String getFirstName(){
    return fName;
    }   
    public String getLastName(){
    return lName;
    }
    public String getStuStatus(){
    return stuStatus;
    }
    // Setters
    public void setStudId(int sId){
    stuId = sId;
    }
    public void setFName(String myFName){
    fName = myFName;
    }    
    public void setLName(String myLName){
    lName = myLName;
    }
    public void setStuStatus(String studStatus){
    this.stuStatus = studStatus ;
    }
    
    
}// End of class
