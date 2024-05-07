/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jf_section71;

/**
 *
 * @author 0618506375
 */
public class VehicleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle("Toyota");
        Vehicle car3 = new Vehicle("Audi", 30);
        
        car1.setMilesPerGallon(20);
        car2.setMilesPerGallon(30);
        
        System.out.println(car1);
        System.out.println(car1.getMake());
        System.out.println(car2);
        System.out.println(car3);
        
        System.out.println("Car 1 compared to Car 2: " + car2.compareTo(car1, car2));
    }
    
}
