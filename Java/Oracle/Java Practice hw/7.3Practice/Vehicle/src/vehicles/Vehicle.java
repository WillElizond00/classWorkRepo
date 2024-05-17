package vehicles;

public class Vehicle {
    
    // Static variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;
    
    // Instance variables
    private String ChassisNo;
    private String model;
    
    // Constructor 
    public Vehicle(String model) {
        this.model = model;
        numVehicles++;
        this.ChassisNo = "ch" + numVehicles;
        System.out.println("Vehicle manufactured");
        System.out.println(this.toString());
    }
    
    // Getter for ChassisNo
    public String getChassisNo() {
        return ChassisNo;
    }
    
    // Getter for model
    public String getModel() {
        return model;
    }
    
    // Setter for ChassisNo
    public void setChassisNo(String chassisNo) {
        this.ChassisNo = chassisNo;
    }
    
    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }
    
    // Setter for MAKE
    public static void setMake(String make) {
        MAKE = make;
    }

    // Nested static Engine class extending Vehicle
    public static class Engine extends Vehicle {
        // Static final variables
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;
        
        // Constructor accepting a model parameter
        public Engine(String model) {
            super(model);
        }
        
        // Getter for MAKE
        public static String getMake() {
            return MAKE;
        }
        
        // Getter for CAPACITY
        public static int getCapacity() {
            return CAPACITY;
        }
    }
    
    // toString method
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE +
               "\nThe model type is " + model +
               "\nThe chassis number is " + ChassisNo +
               "\nThe engine make is " + Engine.getMake() +
               "\nThe engine capacity is " + Engine.getCapacity() + "cc";
    }
    
    // Method to display the total number of vehicles manufactured
    public static void displayTotalVehicles() {
        System.out.println("Number of vehicles manufactured: " + numVehicles);
    }
}
