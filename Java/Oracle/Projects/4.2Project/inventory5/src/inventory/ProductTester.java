/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;

/**
 *
 * @author 0618506375
 */
public class ProductTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //Creating product objects using the default constructor
      Product p1 = new Product();
      Product p2 = new Product();
      
      Product p3 = new Product(125, "Rice", 5, 30);
      Product p4 = new Product(126, "Sauce", 30, 3);
      Product p5 = new Product(127, "Noodles", 5, 4);
      Product p6 = new Product(128, "Tuna", 15, 3);
      
     
      
        
   
       
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
    
}
