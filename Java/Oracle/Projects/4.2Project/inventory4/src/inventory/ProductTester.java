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
        
        Product p1 = new Product(123,"Sprite", 25, 250);
   
        
        
        Product p2 = new Product(124,"Bustelo", 55, 25);
       
        
        Product p3 = new Product (125, "Rice", 35, 7);
        System.out.print(p3);
        System.out.print(p2);
        System.out.print(p1);
        
        
    }
    
}
