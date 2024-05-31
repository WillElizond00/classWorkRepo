/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrument;

/**
 *
 * @author 0618506375
 */
public class Guitar extends StringInstrument {
    private boolean isElectric;
    
    public Guitar(double price, int numInStock, int numStrings, boolean isElectric){
        super(price, numInStock, numStrings);
        this.isElectric = isElectric;
    }
    
    public boolean getIsElectric(){
        return isElectric;
    }
}
