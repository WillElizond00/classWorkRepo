/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author 0618506375
 */
public class Product {
    //instance field declarations
    private int itemNumber;
    private String productName;
    private int unitsInStock;
    private double priceOfEachUnit;
    private boolean active = true;
    
    //Default constructor
    public Product(){
    
    }
    
    public Product(int number, String name, int qty, double price){
        this.itemNumber = number;
        this.productName = name;
        this.unitsInStock = qty;
        this.priceOfEachUnit = price;
        this.active = true;
    }
    
    public Product(int number, String name, int qty, double price, boolean active){
        this.itemNumber = number;
        this.productName = name;
        this.unitsInStock = qty;
        this.priceOfEachUnit = price;
        this.active = active;
    }
    
    //Getter
    
    //Return number
    public int getNumber(){
        return itemNumber;
    }
    // Return name
    public String getName(){
        return productName;
    }
    // Return units in stock
    public int getQty(){
        return unitsInStock;
    }
    // Return price
    public double getPrice(){
        return priceOfEachUnit;
    }
    public boolean isActive(){
        return active;
    }
    
    //Setters
    
    //Set number 
    public void setNumber(int itemNum){
        itemNumber =itemNum;
    }
    // Set name
    public void setName(String newName){
        productName = newName;
    }
    //Set qty
    public void setQty(int newQty){
        unitsInStock = newQty;
    }
    //Set price 
    public void setPrice(double newPrice){
        priceOfEachUnit = newPrice;
    }
    
    public void setActive(boolean newActive){
        this.active = newActive;
    }
    @Override
 public String toString() {
     String myProduct = "\nList product\n";
            myProduct += "itemNumber = " + itemNumber + "\n" ;
            myProduct += "productName = " + productName + "\n";
            myProduct += "unitsInStock = " + unitsInStock + "\n";
            myProduct += "priceOfEachUnit = " + priceOfEachUnit + "\n";
            myProduct += "active = " + (active ? "Active" : "Discontinued") + "\n"; 
            myProduct += "Stock Value : " + String.format("%.2f", calculateInventoryValue()) + "\n";
 return myProduct;   

 }

    public double calculateInventoryValue(){
        return priceOfEachUnit * unitsInStock;
    }
 
 
}

