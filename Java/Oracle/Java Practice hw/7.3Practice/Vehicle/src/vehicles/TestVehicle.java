package vehicles;

public class TestVehicle {
    public static void main(String[] args) {
        // Output message using the value of the static variable "MAKE"
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        
        // Output message using the value of the static variable "numVehicles"
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Create an instance of Vehicle named vehicle1 with "Vision" as the model
        Vehicle vehicle1 = new Vehicle("Vision");

        // Create another instance of Vehicle named vehicle2 with "Edict" as the model
        Vehicle vehicle2 = new Vehicle("Edict");

        // Change the MAKE using vehicle2 (demonstrating the static nature of MAKE)
        vehicle2.setMake("Seer");

        // Output the details of vehicle1 and vehicle2 after changing the MAKE
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        // Create an instance of Engine named vehicle3 with "Fortune" as the model
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");

        // Output the details of vehicle3
        System.out.println("Vehicle number " + vehicle3.getChassisNo() + 
                           " is a " + vehicle3.getModel() + 
                           " model and has an engine capacity of " + Vehicle.Engine.getCapacity() + "cc");

        // Output the total number of vehicles manufactured
        Vehicle.displayTotalVehicles();

        // Attempt to access Engine-specific details from vehicle1 or vehicle2 (will not work)
        // Uncommenting the following lines would result in a compilation error
        // System.out.println("Vehicle number " + vehicle1.getChassisNo() + 
        //                    " is a " + vehicle1.getModel() + 
        //                    " model and has an engine capacity of " + vehicle1.getCapacity() + "cc");
    } // End of main
} // End of class
