/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

public class TestVehicle {
    public static void main(String[] args) {
        // Output message using the value of the static variable "MAKE"
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        
        // Output message using the value of the static variable "numVehicles"
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Create an instance of Vehicle named vehicle1
        Vehicle vehicle1 = new Vehicle("Model1");

        // Output message for the chassis number of vehicle1
        System.out.println("The chassis number is " + vehicle1.getChassisNo());

        // Create another instance of Vehicle
        Vehicle vehicle2 = new Vehicle("Model2");

        // Output message for the chassis number of vehicle2
        System.out.println("The chassis number is " + vehicle2.getChassisNo());

        // Output message again after creating vehicles
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    } //End of main
}// End of class
