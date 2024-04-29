/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collegeentrance;
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class CollegeEntrance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("In order to enter Mountville University you must meet certain requirements.");
        //Ask for valedictorian or salutatorian status and school size
        System.out.println("Were you validictorian or salutatorian? (yes/no)");
        String valSalStatus = scanner.nextLine().toLowerCase();
        int schoolSize = 0;
        if (valSalStatus.equals("yes")){
            System.out.println("What is the size of your school?");
            schoolSize = scanner.nextInt();
            scanner.nextLine();
        }
                
        //Ask for GPA and SAT score 
        System.out.println("Enter your GPA:");
        double gpa = scanner.nextDouble();
        System.out.println("Enter your SAT Score:");
        int satScore = scanner.nextInt();
        
        //Determine eligibility for admission
        if((valSalStatus.equals("yes") && schoolSize >= 1400)||
               (gpa >= 4.0 && satScore >= 1100) ||
               (gpa >= 3.5 && satScore >= 1300) ||
               (gpa >= 3.0 && satScore >= 1500)) {
                System.out.println("Congratulations! You are eligibile for admission to Mountville University.");
        } else {
            System.out.println("Unfortunately, you do not meet eligibility criteria for admission to Mountville University.");
        }
        scanner.close();
    }
    
}
