/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author 0618506375
 */
public class Calculator {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to for two floating numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        //Prompt user for an operator
        System.out.print("Enter an operator(*, +, -, /, %): ");
        String operator = scanner.next();
        
        //Declare a variable to hold the result
        double result = 0; // Initialize to 0
        
        //Process input using if/else logic
        if ("+".equals(operator)){
            result = num1 + num2;
        } else if ("-".equals(operator)){
            result = num1 - num2;
        } else if ("*".equals(operator)){
            result = num1 * num2;
        } else if ("/".equals(operator)){
            if(num2 != 0){
                result = num1 / num2;
            } else {
                System.out.println("Division by zero error!");
                scanner.close(); // Close the scanner
                return;
            }
        }  else if ("%".equals(operator)) {
            result = num1 % num2;
        } else {
            System.out.println("Invalid operator!");
            scanner.close(); // It's a good practice to close the scanner
            return; // Exit the program
        }

        // Output the result
        System.out.printf("Result: %.2f\n", result);

        // Close the scanner
        scanner.close();
     
        /*
        //Declare variable to hold the result
        double result; 
        
        // Calculate result based on operator
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 + num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2 != 0){
                result = num1 / num2;
                } else {
                    System.out.println("Division by zero error!");
                    return; // Exit the program
                }
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return; // Exit the program
        
        }
        
        //Output the result 
        System.out.printf("Result: %.2f\n", result);
*/
        
    }
    
}
