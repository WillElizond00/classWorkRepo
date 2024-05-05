/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 0618506375
 */
public class Main {
    public static void main(String args[]){
        Deck d = new Deck();
        Hand h = new Hand();

        // Deal two cards to the hand
        h.addCard(d.dealCard());
        h.addCard(d.dealCard());

        System.out.println("Your initial hand:");
        h.printHand();

        Scanner scanner = new Scanner(System.in);
        while (!h.isBust() && h.getNumCards() < 5) {
            System.out.println("Do you want another card? (yes/no)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                h.addCard(d.dealCard());
                h.printHand();
            } else {
                break;
            }
        }

        if (h.isBust()) {
            System.out.println("Bust! Total points exceeded 21.");
        } else {
            System.out.println("You chose to stop. Final hand:");
            h.printHand();
        }

        scanner.close();
   
    
    
    }// end of main
} // end of class 




