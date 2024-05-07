/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jf_section71;

/**
 *
 * @author 0618506375
 */
public class Vehicle {
    // Instance Variables - Fields
    private int milesPerGallon;
    private String make;
    
    // Create a default constructor
    public Vehicle(){
        // Initialize instance variables
        milesPerGallon = 0;
        make = "Honda";
    }
  
      // Create a constructor with 1 parameter
    public Vehicle(String mk){
        // Initialize instance variables
        milesPerGallon = 0;
        this.make = mk;
    }
    
       // Create a constructor with 1 parameter
    public Vehicle(String mk, int mpg){
        // Initialize instance variables
        this.milesPerGallon = mpg;
        this.make = mk;
    }
    
    //Instance Methods
    //Mutators - Setters
    public void setMilesPerGallon(int mpg){
        this.milesPerGallon = mpg;
    }
    
    public void setMake(String mk){
        this.make = mk;
    }
    
    
    // Accessors - Getters
    public int getMilesPerGallon(){
        return milesPerGallon;
    }
    
    public String getMake(){
        return make;
    }        
    
    //Class methods
    //override the toString method
    public String toString(){
        String vehicleDetails = "\n\tVehicle Details\n";
        vehicleDetails += "Make             : " + make + "\n";
        vehicleDetails += "Miles per Gallon : " + milesPerGallon + "\n";
        vehicleDetails += "-----------------------------------------\n";
        return vehicleDetails;
    }
         
    //Class method
    // compare miles per gallon for 2 cars 
    // return +1 if car1 > car2
    // return -1 if car1 < car2
    // return 0 if equal
    public static int compareTo(Vehicle v1, Vehicle v2){
        if(v1.getMilesPerGallon() == v2.getMilesPerGallon())
            return 0;
        else if (v1.getMilesPerGallon() > v2.getMilesPerGallon())
            return 1;
        else
            return -1;
        
    }// end of compareTo()
    
} //end of class
