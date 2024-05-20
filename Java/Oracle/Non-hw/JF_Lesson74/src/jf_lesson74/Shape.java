package jf_lesson74;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 0618506375
 */
public class Shape {
    // fields
    private String color;
    
    //Default Constructor
    public Shape(){
        this.color = "red";
    }
     public Shape(String myColor){
        this.color = myColor;
    } 
    
    
    //Instance Methods
    //Getter
    public String getColor(){
        return color;
    }
    
    // method to return the area of the calling object 
    public double getArea(){
        return area;
    } // end of getArea method
    
    //Setter
    public void setColor(String myColor){
        this.color = myColor;
    }
    //method to caluclate area
    public void setArea(double myArea){
        this.area = myArea;
    }
    
    @Override
    //
    public String toString(){
        String myShape = "\nShape Details:\n";
        myShape += "Color : " + color;
        return myShape;
    }//End of toString
    
}//End of Shape class
