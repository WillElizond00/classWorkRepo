/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 0618506375
 */
public class Hand {
    private Card[] cards = new Card[5]; // Array to hold up to 5 cards
    private int numCards = 0; // Counter for the number of cards in the hand

    public void addCard(Card card) {
        if (numCards < 5) { // Ensure we don't add more than 5 cards
            cards[numCards] = card;
            numCards++;
        } else {
            System.out.println("Cannot add more cards, hand is full.");
        }
    }

    public void printHand() {
        System.out.println("Your hand:");
        for (int i = 0; i < numCards; i++) {
            if (cards[i] != null) { // Null check for safety
                System.out.println(cards[i]); // Assuming Card class has a proper toString method
            }
        }
    }

    public int getPoints() {
        int totalPoints = 0;
        for (int i = 0; i < numCards; i++) {
            if (cards[i] != null) { // Null check for safety
                totalPoints += cards[i].getPoints(); // Assuming getRank() returns the point value of the card
            }
        }
        return totalPoints;
    }
    
    public int getNumCards() {
        return numCards; // Simply returns the number of cards in the hand
    }
    
}