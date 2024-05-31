/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instrument;

/**
 *
 * @author 0618506375
 */
public class Instrument {
    private boolean onSale;
    private double price;
    private int numInStock;
    
    public Instrument(double price, int numInStock){
        this.price = price;
        this.numInStock = numInStock;
        this.onSale = false;
    }
    
    public double getPrice(){
        if (onSale){
            return price * 0.85; // 15% off if on sale
        }
        return price;
    }
    public double applyEmployeeDiscount(){
        return price * 0.75; // 25% off for employees
    }
    public void setOnSale(boolean onSale){
        this.onSale = onSale;
    }
    public boolean getOnSale(){
        return onSale;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getNumInStock(){
        return numInStock;
    }
    public void setNumInStock(int numInStock){
        this.numInStock = numInStock;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Guitar guitar = new Guitar(500.0, 10, 6, true);
        System.out.println("Price of guitar: $" + guitar.getPrice());
        guitar.setOnSale(true);
        System.out.println("Price of guitar on sale: $" + guitar.getPrice());
        System.out.println("Price of guitar with employee discount: $" + guitar.applyEmployeeDiscount());
        System.out.println("Is the guitar electric? " + guitar.getIsElectric());
    }
    
}
