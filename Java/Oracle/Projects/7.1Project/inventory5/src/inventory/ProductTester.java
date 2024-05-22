/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;
import java.util.Scanner;

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
        //Scanner Initialization
        Scanner in = new Scanner(System.in);
        
        // Declare variables to store product attributes
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
        
        //Prompt and input for item number
        System.out.println("Please enter item number : ");
        tempNumber = in.nextInt();
        
        //Prompt and input for product name
        System.out.println("Please enter the product name: ");
        tempName = in.next();
        
        //Prompt and input for quantity
        System.out.println("Please enter the quantity: ");
        tempQty = in.nextInt();
        
        //Prompt and input for price
        System.out.println("Please enter the price: ");
        tempPrice = in.nextDouble();
        // Split 
        in.nextLine();
        // User Input prompts for p2 (modified versions of p1 prompts)
        System.out.println("Please enter item number for p2 :");
        tempNumber = in.nextInt();

        System.out.println("Please enter the product name for p2:");
        tempName = in.next(); // Consider using in.nextLine() here if needed

        System.out.println("Please enter the quantity for p2:");
        tempQty = in.nextInt();

        System.out.println("Please enter the price for p2:");
        tempPrice = in.nextDouble();


      //Creating product objects using the default constructor
      Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);
      Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);
      
      Product p3 = new Product(125, "Rice", 5, 30);
      Product p4 = new Product(126, "Sauce", 30, 3);
      Product p5 = new Product(127, "Noodles", 5, 4);
      Product p6 = new Product(128, "Tuna", 15, 3);
      
     
      
        p6.setActive(false);
   
       
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        
        in.close();
    } //end of main
        public static void displayInventory(Product[] products){
            for(Product product: products){
            System.out.println(product);
            }
        }

}//end of class
