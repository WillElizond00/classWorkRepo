/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author deck
 */
public class Person {
    private String name;
    private int age;
    private String address;
    
    //Constructor
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    //Getter and Setter methods
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAddress(){
        return address;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    }// End of main
    
}//End of class
