/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        Deck deck = new Deck();
        deck.shuffle(); // Shuffle the deck before dealing cards

        Hand playerHand = new Hand();
        // Deal two cards to the player
        playerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());

        // Display the initial hand and points
        System.out.println("Your initial hand:");
        playerHand.printHand();
        System.out.println("Total points: " + playerHand.getPoints());

        // Ask the player if they want another card
        System.out.print("Would you like another card? (yes/no): ");
        String response = scanner.nextLine();

        while (response.equalsIgnoreCase("yes")) {
            if (playerHand.getNumCards() >= 5) {
                System.out.println("Cannot add more cards, hand is full.");
                break;
            }

            playerHand.addCard(deck.dealCard());
            playerHand.printHand();
            System.out.println("Total points: " + playerHand.getPoints());
            
            if (playerHand.getPoints() > 21) {
                System.out.println("Busted!");
                break;
            }

            System.out.print("Would you like another card? (yes/no): ");
            response = scanner.nextLine();
        }

        System.out.println("Final hand:");
        playerHand.printHand();
        System.out.println("Final points: " + playerHand.getPoints());

        scanner.close();
    }
}
