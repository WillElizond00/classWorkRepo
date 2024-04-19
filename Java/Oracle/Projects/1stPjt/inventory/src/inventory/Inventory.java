/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;

/**
 *
 * @author 0618506375
 */
public class Inventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Product p1 = new Product(123,"Sprite", 25, 250);
        System.out.println("Item Number :" + p1.getNumber());
        System.out.println("Name        :" + p1.getName());
        System.out.println("Qty in stock:" + p1.getQty());
        System.out.println("Price       :" + p1.getPrice());
    }
    
}
