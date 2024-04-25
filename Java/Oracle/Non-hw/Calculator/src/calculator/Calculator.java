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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner in = new Scanner(System.in);
        double answer = 0;
        System.out.println("Enter a number:");
        int num1 = in.nextInt();
        System.out.println("Enter another number:");
        int num2  = in.nextInt();
        System.out.println("Enter the operand:");
        char input = in.next().charAt(0);
        
        
/*        if( input == '*')
            answer = num1 * num2;
        else if( input == '/' )
            answer = num1 / num2;
        else if ( input == '%' )
            answer = num1 % num2;
        else if ( input == '+')
            answer = num1 + num2;
        else if ( input == '-')
            answer = num1 - num2;
        else
            System.out.println("Invalid Command");
        System.out.println("The result is: " + answer);
*/
        switch(input){

            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            case '%': 
                answer = num1 % num2;
                break;
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            default:
                System.out.println("Invalid Command");
               
            break;

        }
         System.out.println(Double.toString(num1) + operation +(Double.toString(num2)));

    }// end of main 
    
    
}// end of class 
