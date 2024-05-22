package inventory;

import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {
        // Scanner Initialization
        Scanner in = new Scanner(System.in);
        
        // Declare variables to store product attributes
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
        
        // Prompt and input for item number
        System.out.println("Please enter item number: ");
        tempNumber = in.nextInt();
        
        // Prompt and input for product name
        System.out.println("Please enter the product name: ");
        tempName = in.next();
        
        // Prompt and input for quantity
        System.out.println("Please enter the quantity: ");
        tempQty = in.nextInt();
        
        // Prompt and input for price
        System.out.println("Please enter the price: ");
        tempPrice = in.nextDouble();
        in.nextLine();  // Consume the newline character
        
        // User Input prompts for p2
        System.out.println("Please enter item number for p2: ");
        tempNumber = in.nextInt();
        
        System.out.println("Please enter the product name for p2: ");
        tempName = in.next();
        
        System.out.println("Please enter the quantity for p2: ");
        tempQty = in.nextInt();
        
        System.out.println("Please enter the price for p2: ");
        tempPrice = in.nextDouble();
        
        // Creating product objects using the constructor
        Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);
        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);
        
        Product p3 = new Product(125, "Rice", 5, 30);
        Product p4 = new Product(126, "Sauce", 30, 3);
        Product p5 = new Product(127, "Noodles", 5, 4);
        Product p6 = new Product(128, "Tuna", 15, 3);
        
        p6.setActive(false);
        
        Product[] products = {p1, p2, p3, p4, p5, p6};
        
        // Call displayInventory method to display the products
        displayInventory(products);
        
        in.close();
    } // end of main
    
    public static void displayInventory(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    } // end of displayInventory
    
} // end of class
