/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    

// Default constructor
public Product(){

}

public Product(int number, String name, int qty, int price){

    this.itemNumber = number;
    this.productName = name;
    this.unitsInStock = qty;
    this.priceOfEachUnit = price;
    
}
// Getters

//Return number
public int getNumber(){
    return itemNumber;
}
// Return name
public String getName(){
    return productName;
}
// Return Units in stock
public int getQty(){
    return unitsInStock;
}
// Return price
public int getPrice(){
    return priceOfEachUnit;
}

// Setters 

public void setNumber(int itemNum){
    itemNumber = itemNum;
    
}

public void setName(String newName){
    productName = newName;
    
}

public void setQty(int newQty){
    unitsInStock = newQty;
}

public void setPrice(int newPrice){
    priceOfEachUnit = newPrice;
}

public static void main(String[] args) {
    Product product = new Product(1, "Coffee Maker", 50, 99);
    System.out.println("Hello");
}