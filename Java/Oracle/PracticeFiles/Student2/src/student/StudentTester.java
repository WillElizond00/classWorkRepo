/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

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
       Student student1 = new Student();
       Student student2 = new Student(1,"Jerry", 4.0);
       Student student3 = new Student(2, "William", 4.0);
        
       student1.setName("Chip");
        System.out.println(student2);
        System.out.println(student1);
        System.out.println(student3);
        
        
    }// End of main method
    
}//End of Class
