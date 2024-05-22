/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jf_section75;

/**
 *
 * @author 0618506375
 */
public class JF_Section75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    //Instantiate roadBikes
    RoadBike rb1 = new RoadBike(3, 5, 22);
    //Instantiate MountainBikes
    MountainBike mb1 = new MountainBike(3, 5, 4);
    
    
    
    
    
    //instantiate Bicycles
    
    Bicycle bike1 = new Bicycle(5,10);
    Bicycle bikeRoad1 = new RoadBike(5,10,22);
    Bicycle bikeMount1 = new MountainBike(5,10,4);
  /*  
    System.out.println("Road Bike :" + rb1);
    System.out.println("Mountain Bike :" + mb1);
    System.out.println("Bicycle:" + bike1);
    System.out.println("Bicycle - RoadBike" + bikeRoad1);
    System.out.println("Bicycle - MountBike" + bikeMount1);
  */
    Bicycle[] bikes = new Bicycle[4];
    
    
    bikes[0] = bike1;
    bikes[1] = bikeRoad1;
    bikes[2] = bikeMount1;
    bikes[0] = bike1;
    
    for (int i = 0; i < 3; i++){
        System.out.println(bikes[i]);
    }
    
    }//end of main
   
   
    
}// end of class
