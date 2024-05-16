/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jf_section72;

/**
 *
 * @author 0618506375
 */
public class JF_Section72 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        // Instantiate 3 employees
        Employee emp1 = new Employee(); // Call default constructor
        Employee emp2 = new Employee("Jerry","Mosley",20); // Call 3 parameter constructor
        Employee emp3 = new Employee("William","Elizondo");
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);        
        
        System.out.println("High rated Employee is : " + Employee.promotion(emp2, emp3));
        int myVar = total(1,2,3,4,5);
        System.out.println(myVar);
     
     
    }// end of main
    
    
    // Variable  arguments method
            public static int total(int... nums)
        {
            int sum = 0;
            for (int i = 0; i < nums.length; i++)
                sum += nums[i];
            return (sum);
        }
        
    
}// end of class
