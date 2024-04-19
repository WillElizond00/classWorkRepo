/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// William Elizondo
// 4.2 - 7 Practice
package person;

/**
 *
 * @author 0618506375
 */
public class Person {
    private String name;
    private int age;

    //Constructor 
    public Person(String name, int age){
    this.name = name;
    this.age = age;
    
    }
    //Accessor
    // Get name
    public String getName(){
     return name;   
    }
    
    public int getAge(){
        return age;
    }
    //Setter 
    public void setName(String theName){
       name = theName;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
