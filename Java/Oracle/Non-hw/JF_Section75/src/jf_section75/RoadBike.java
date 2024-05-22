/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jf_section75;

/**
 *
 * @author 0618506375
 */
public class RoadBike extends Bicycle {
    // 1 new field
    private int tireSize;
    
    //Default Constructor
    public RoadBike(){
        super(); // Calls default super constructor 
    }
    
    // 3 parameter constructor
    public RoadBike(int gear, int speed, int size){
        super(gear, speed); // calls super 2 parameters
        this.tireSize = size;
        
    }
    
    //Getters / Setters
    
    public int getTireSize(){
        return tireSize;
    }
    public void setTireSize(int size){
        this.tireSize = size;
    }
    
    //toString()
    public String toString(){
        String myRoadBike = "";
        myRoadBike += super.toString();
        myRoadBike += "\nRoadbike Details : ";
        myRoadBike += "\nTireSize : "+ tireSize;
        myRoadBike += "\n-------------------------";
        return myRoadBike;
    }
    
}//end of RoadBike class
