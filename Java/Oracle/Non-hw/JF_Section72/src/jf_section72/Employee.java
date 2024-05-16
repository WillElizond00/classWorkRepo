/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jf_section72;

/**
 *
 * @author 0618506375
 */
public class Employee {
    
    //Attributes / Fields / instance Variables
    private String lastName;
    private String firstName;
    private double lengthOfEmp; // length of employment

    // Default Constructor
    public Employee(){
    
    }
   
    //Constructor with 3 parameters
    public Employee(String lName, String fName, double lengthOfEmp){
        this.firstName = fName;
        this.lastName = lName;
        this.lengthOfEmp = lengthOfEmp;
    }
    // Constructor with 2 parameters
    public Employee(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
        this.lengthOfEmp = lengthOfEmp;
    }
    
    // Instance Methods
    //Getters
    
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getLengthOfEmp(){
        return lengthOfEmp;
    }
    
    //Setters - Mutators
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    public void setLastName(String lName){
        this.lastName = lName;
    }
    public void setLengthOfEmp(double lengthOfEmp){
        this.lengthOfEmp = lengthOfEmp;
    }
    
    // Overwrite toString()
    public String toString(){
        String empDetails = "\nEmployee Details:\n";
        empDetails += "Firstname              : " + firstName;
        empDetails += "\nLastname             : " + lastName;
        empDetails += "\nLength of Employment : " + lengthOfEmp;
        empDetails += "\n-----------------------------------------\n";                
       
        
        return empDetails;
    }
    
    //Class method using 2 objects
    public static String promotion(Employee e1, Employee e2){
       double rating = 0.0;
       rating = e1.getLengthOfEmp() - e2.getLengthOfEmp();
       String promoted = "";
       if (rating > 0){
           promoted = e1.getLastName();
       }
       else {
           promoted = e2.getLastName();
       }
       return promoted;
       
    }
    
    
    
} //end of class
