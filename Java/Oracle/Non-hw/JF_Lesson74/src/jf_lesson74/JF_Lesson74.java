/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jf_lesson74;

/**
 *
 * @author 0618506375
 */
public class JF_Lesson74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Instantiation shape 
        Shape shape1 = new Shape(); // Default constructor
        Shape shape2 = new Shape("Blue");
        shape2.setColor("Grey");
        
        System.out.println(shape1);
        System.out.println(shape2);
        
        // Instance Rectangle
        Rectangle rec1 = new Rectangle(); //Default
        rec1.setColor("Black");
        
        
        Rectangle rec2 = new Rectangle("Brown"); // super
        Rectangle rec3 = new Rectangle("Orange", 30); // 2 param
        Rectangle rec4 = new Rectangle("Green", 40 ,50);// 3 param
        
        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec3);
        System.out.println(rec4);
        
        //Instantiate square
        Square sq1 = new Square();
        Square sq2 = new Square("purple", 15);
        
        System.out.println("\nSquare\n");
        
        System.out.println(sq1);
        System.out.println(sq2);
                
        
    }//end of main
    
}// end of class
