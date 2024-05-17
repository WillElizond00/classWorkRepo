/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicles;

/**
 *
 * @author 0618506375
 */
public class Vehicle {
    
    //Static variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;
    
    //Instance variables
    private String ChassisNo;
    private String model;
    
    //Constructor 
    public Vehicle(String model){
        this.model = model;
        numVehicles++;
        this.ChassisNo = "ch" + numVehicles;
        System.out.println("Vehicle Manufactured");
    }
    // Getter for ChassisNo
    public String getChassisNo(){
        return ChassisNo;
    }
    //Getter for model
    public String getModel(){
        return model;
    }
    //Setter for ChassisNo
    public void setChassisNo(String chassisNo){
        this.ChassisNo = chassisNo;
    }
    //Setter for model
    public void setModel(String model){
        this.model = model;
    }
    
    
    /**
     * @param args the command line arguments
     */
  
    
}
