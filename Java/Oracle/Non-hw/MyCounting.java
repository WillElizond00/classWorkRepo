/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycounting;

/**
 *
 * @author 0618506375
 */
public class MyCounting {

    public static int counter = 5;
    public static void main(String[] args) 
            {
            System.out.println("At the start of this program, counter is "+ counter);
            count();
            System.out.println("At the end of this program, counter is" + counter);
            }
                public static void count()
                {
                int counter = 10;
                System.out.println("At the end of this method, counter is " + counter);
                } //end of count()
        
        
}
