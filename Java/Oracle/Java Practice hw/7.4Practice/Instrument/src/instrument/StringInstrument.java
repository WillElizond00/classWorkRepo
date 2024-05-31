/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrument;

/**
 *
 * @author 0618506375
 */
public class StringInstrument extends Instrument {
    private int numStrings;
    
    public StringInstrument(double price, int numInStock, int numStrings){
        super(price, numInStock);
        this.numStrings = numStrings;
    }
    
    public int getNumStrings(){
        return numStrings;
    }
    
    public void setStrings(int numStrings){
        this.numStrings = numStrings;
    }
    
}
