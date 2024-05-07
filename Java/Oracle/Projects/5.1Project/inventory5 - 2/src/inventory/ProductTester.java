/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Declare variables to store product attributes
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
        
        //Prompt and input for item number
        System.out.println("Please enter item number : ");
        tempNumber = in.nextInt();
        
        // Clearing the input buffer
        in.nextLine();  // This consumes the newline left after nextInt
        
        //Prompt and input for product name
        System.out.println("Please enter the product name: ");
        tempName = in.nextLine();  // Using nextLine() to include potential spaces in the name
        
        //Prompt and input for quantity
        System.out.println("Please enter the quantity: ");
        tempQty = in.nextInt();
        
        // Clearing the input buffer
        in.nextLine();  // This consumes the newline left after nextInt
        
        //Prompt and input for price
        System.out.println("Please enter the price: ");
        tempPrice = in.nextDouble();
        
        // Clearing the input buffer
        in.nextLine();  // This consumes the newline left after nextDouble
        
        //Creating product object p1 using the values from user
        Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);

        // Ask the user again for details for p2
        System.out.println("Please enter details for another product.");
        
        System.out.println("Please enter item number for second product: ");
        tempNumber = in.nextInt();
        
        // Clearing the input buffer
        in.nextLine();  // This consumes the newline left after nextInt
        
        System.out.println("Please enter the product name for second product: ");
        tempName = in.nextLine();  // Correct use of nextLine() to avoid skipping input
        
        System.out.println("Please enter the quantity for second product: ");
        tempQty = in.nextInt();
        
        // Clearing the input buffer
        in.nextLine();  // This consumes the newline left after nextInt
        
        System.out.println("Please enter the price for second product: ");
        tempPrice = in.nextDouble();
        
        // Clearing the input buffer
        in.nextLine();  // This consumes the newline left after nextDouble

        //Creating product object p2 using new values from user
        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);
      
        // Hardcoded products
        Product p3 = new Product(125, "Rice", 5, 30);
        Product p4 = new Product(126, "Sauce", 30, 3);
        Product p5 = new Product(127, "Noodles", 5, 4);
        Product p6 = new Product(128, "Tuna", 15, 3);
      
        
        p6.setActive(false);
        
        // Print the details of all products
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        
        
        //Close the scanner object 
        in.close();
    } // end of main
} //end of class
