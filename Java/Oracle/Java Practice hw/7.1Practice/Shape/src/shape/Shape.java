/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

/**
 *
 * @author 0618506375
 */
public class Shape {

   //instance variables
    private int numSides;
    private boolean regular;
    
    //Default constructor
    public Shape(){
        //Default shape is a regular triangle
        this.numSides = 3;
        this.regular = true;
    }
    
    //Parameterized contructor
    public Shape(int numSides, boolean regular){
        this.numSides = numSides;
        this.regular = regular;
    }
    //Getter for numSides
    public int getNumSides(){
        return numSides;
    }
    //Setter for numSides 
    public void setNumSides(int numsides){
        this.numSides = numSides;
    }
    //Getter for regular
   public boolean isRegular(){
       return regular;
   }
   //Setter for regular
   public void setRegular(boolean regular){
       this.regular = regular;
   }
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }// end of main
    
}//end of class
