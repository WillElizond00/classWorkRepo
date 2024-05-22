/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jf_section75;

/**
 *
 * @author 0618506375
 */
public class Bicycle {
    // Fields
    private int gear;
    private int speed;
    //Default Constructor
    public Bicycle(){
        
    }
    // 2 parameter constructor
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    
    //Instance methods()
    //Getters
    public int getGear(){
        return gear;
    }
    public int getSpeed(){
        return speed;
    }
    //Setters
    public void setGear(int gear){
        this.gear = gear;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    
    // 3 Bicycle methods
    public void speedUp(int increment){
        speed += increment;
    }
    public void slowDown(int decrement){
        speed -= decrement;
    }
    
    @Override
    // toString Method
    public String toString(){
        String myBicycle = "\nBicycle Details\n";
        myBicycle += "\nNo of Gears      : " + gear;
        myBicycle += "\nSpeed of Bicycle : " + speed;
        myBicycle += "\n---------------- : ";
        return myBicycle;
    }
    
}//end of Bicycle class
