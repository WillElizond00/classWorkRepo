/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jf_lesson74;

/**
 *
 * @author 0618506375
 */
public class Rectangle extends Shape {
    // 2 new Fields
    private int length;
    private int width;
    private double temp;
    
    //Constructor
    public Rectangle(){
        super();
        length = 10;
        width = 20;
        temp = length * width;
    }
    // constructor with 1 parameter
    
    public Rectangle(String color){
        super(color);// 1 param constructor
        temp = length*width;
    }
  
      // constructor with 2 parameters
    
    public Rectangle(String color,int length){
        super(color);
        this.length=length;
        this.width=width;
        temp = length*width;
        this.setArea(temp);
    }
    
    // constructor with 3 parameters
    
    public Rectangle(String color,int length,int width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    //toString()
    public String toString(){
        String myRectangle;
        myRectangle = "\nRectangle Details : \n";
        myRectangle += "Color  :" + super.getColor(); 
        myRectangle += "\nLength :" + length;
        myRectangle += "\nWidth  :" + width + "\n";
        myRectangle += "\nArea   :" + getArea() + "\n";
        return myRectangle;
        
    }
    
}//End of rectangle
