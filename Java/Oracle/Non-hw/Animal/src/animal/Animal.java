/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author 0618506375
 */
public class Animal {
    int weight, height;
    double speed;
    Animal(){
        weight = 50;
        height = 4;
        speed = 2; // miles per hour
    }
    Animal(int w, int h , int s){
        weight = w;
        h = height;
        speed = s;
    }
    public double getTime(double miles){
        return miles/speed;
    }
    public int getWeight(){
        return weight;
    }
    public int getHeight(){
        return height;
    }
    public double getSpeed(){
        return speed;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Animal myAnimal = new Animal();
    
    Animal myAnimal2 = new Animal(25, 5, 4);
   
    System.out.println("Animal #1 has a speed of " + myAnimal.getSpeed()+ ".");
    System.out.println("Animal #2 has a speed of " + myAnimal2.getSpeed()+ ".");
    
    }
}
