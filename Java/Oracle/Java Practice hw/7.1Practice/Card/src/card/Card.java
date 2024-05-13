/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;
import java.util.Scanner;

public class Card {
    //Instance variables for the Card class
    String suit, name;
    int points;

    //Constructor for Card class that initializes card properties based on input numbers
    Card(int n1, int n2){
        suit = getSuit(n1); // Set the suit based on the first player
        name = getName(n2); // Set the name based on the second player
        points = getPoints(name); // Determine points based on the card's name
    }
    //Overrides the default toString method to return a string representation of the card
    public String toString(){
        return "The " + name + " of " + suit;
    }
    //Returns the card name based on an intger input
    public String getName(int i){
        if(i == 1) return "Ace";
        if(i == 2) return "Two";
        if(i == 3) return "Three";
        if(i == 4) return "Four";
        if(i == 5) return "Five";
        if(i == 6) return "Six";
        if(i == 7) return "Seven";
        if(i == 8) return "Eight";
        if(i == 9) return "Nine";
        if(i == 10) return "Ten";
        if(i == 11) return "Jack";
        if(i == 12) return "Queen";
        if(i == 13) return "King";
        return "error"; // This handles any unexpected values
    }
    //Returns points based on the card name using string comparison
    public int getPoints(String n){
        if("Jack".equals(n) || "Queen".equals(n) || "King".equals(n) || "Ten".equals(n))
            return 10;
        if("Two".equals(n))
            return 2;
        if("Three".equals(n))
            return 3;
        if("Four".equals(n))
            return 4;
        if("Five".equals(n))
            return 5;
        if("Six".equals(n))
            return 6;
        if("Seven".equals(n))
            return 7;
        if("Eight".equals(n))
            return 8;
        if("Nine".equals(n))
            return 9;
        if("Ace".equals(n))
            return 1;
        return -1;  // This handles cases where an invalid name is entered
    }
    // Returns the card suit based on an integer input
    public String getSuit(int i){
        //Mapping integer values to suits
        if(i == 1) return "Diamonds";
        if(i == 2) return "Clubs";
        if(i == 3) return "Spades";
        if(i == 4) return "Hearts";
        return "error"; // This handles any unexpected values
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPoints = 0; // Track total points of all cards
        int cardCount = 0; // Track the number of cards drawn

        // Loop until break condition is met
        while (true) {
            // Check if the maximum number of cards (5) is reached
            if (cardCount == 5) {
                System.out.println("Maximum of 5 cards reached.");
                break;
            }
            // Randomly determine the suit and face number for a new card
            int suitNumber = (int) (Math.random() * 4.0 + 1);
            int faceNumber = (int) (Math.random() * 13.0 + 1);
            Card newCard = new Card(suitNumber, faceNumber);
            System.out.println(newCard); // Display the new card
            totalPoints += newCard.points; // Add points of the new card to total
            cardCount++;// Increment card count
            
            // Display current total points
            System.out.println("Current total points: " + totalPoints);
            
            // Check if total points exceed 21
            if (totalPoints > 21) {
                System.out.println("Total points exceed 21. Game over!");
                break;
            }
            //Provide the option to draw another card if the limit hasn't been reached
            if (cardCount < 5) {
                System.out.println("Would you like another card? (yes/no)");
                String response = scanner.nextLine(); // Read user input
                if (!"yes".equalsIgnoreCase(response)) {
                    System.out.println("You chose to stop. Final total points: " + totalPoints);
                    break;
                }
            }
        }
        scanner.close();
    } // end of main
} // end of class