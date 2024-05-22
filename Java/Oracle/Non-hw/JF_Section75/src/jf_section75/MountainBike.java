/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jf_section75;

/**
 *
 * @author 0618506375
 */
public class MountainBike extends Bicycle{
    // 1 new field
    private int seatHeight;
    
    public MountainBike(){}
    
    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    
    // getters / setters
    public int getSeatHeight(){
        return seatHeight;
    }
    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }
    
    // toString 
    public String toString(){
        String myMountainBike = "";
        myMountainBike += super.toString();
        myMountainBike += "\n My MountainBike Details :";
        myMountainBike += "\n Seat Height : " + seatHeight;
        myMountainBike += "\n-----------------------------";
        return myMountainBike;
        
    }
    
} // End of MountainBike class
