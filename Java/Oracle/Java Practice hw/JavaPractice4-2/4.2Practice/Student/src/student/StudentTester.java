/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;
import java.util.Scanner;

/**
 *
 * @author 0618506375
 */
public class StudentTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Student class: ");
        
  
        
        //ClassName ObjectName = new Constructor()
        Student student1 = new Student("William","Elizondo", 12345, "Active");
           
       
      
        System.out.println(student1);
        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getStudId());
        System.out.println(student1.getStuStatus());
      
        
    }// End of main method
    
    
}//End of Class
