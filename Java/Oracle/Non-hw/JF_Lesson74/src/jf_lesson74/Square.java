/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jf_lesson74;

/**
 *
 * @author 0618506375
 */
public class Square extends Rectangle{
    //Fields
    private int size;
    
    
    //Default constructor
    public Square(){
        
    }
    
    //2 parameter constructor
    public Square(String color, int size){
        super(color, size, size);
    }
}// end of square class
