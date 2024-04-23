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
    private int priceOfEachUnit;
    
    //Default constructor
    public Product(){
    
    }
    
    public Product(int number, String name, int qty, int price){
        this.itemNumber = number;
        this.productName = name;
        this.unitsInStock = qty;
        this.priceOfEachUnit = price;
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
    public int getPrice(){
        return priceOfEachUnit;
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
    public void setPrice(int newPrice){
        priceOfEachUnit = newPrice;
    }
    
    @Override
 public String toString() {
     String myProduct = "\nList product\n";
            myProduct += "itemNumber = " + itemNumber + "\n" ;
            myProduct += "productName = " + productName + "\n";
            myProduct += "unitsInStock = " + unitsInStock + "\n";
            myProduct += "priceOfEachUnit = " + priceOfEachUnit + "\n";
             
 return myProduct;   

 }

    
}

