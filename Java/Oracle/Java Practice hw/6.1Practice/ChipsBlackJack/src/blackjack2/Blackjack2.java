package blackjack2;  // Declares the package name
import java.util.Scanner;  // Imports the Scanner class for reading user input

enum SUITE {  // Enumeration for the card suits
    HEARTS, DIAMONDS, CLOVES, SPADES, JOKER
}

enum LEVEL {  // Enumeration for the card levels
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, JOKER
}

public class Blackjack2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner object for input
        Deck d = new Deck();  // Creates a new deck of cards
        Hand Dealer = new Hand("Dealer");  // Dealer's hand
        Hand Player = new Hand("Scotty");  // Player's hand
        boolean outer = true;  // Controls the outer game loop
        boolean inner = true;  // Controls the inner game loop (player turn)
        boolean victory = false;  // Tracks if there's a winner
        String incoming = "";  // Stores user input
        int a = 0;  // Player's score
        int b = 0;  // Dealer's score

        System.out.println("This program will play blackjack. (do not attempt in real life; gambling is super bad)");
        System.out.print("Enter your name: ");
        incoming = input.nextLine();  // Read player's name

        Player.writeName(incoming);  // Set player's name

        d.Shuffle();  // Shuffle the deck

        while (outer) {  // Game loop

            d.Shuffle();  // Shuffle deck before each round

            dealTo(Dealer, d, 2);  // Deal 2 cards to dealer
            dealTo(Player, d, 2);  // Deal 2 cards to player

            while (inner) {  // Player's turn

                System.out.println(Player);  // Display player's hand

                System.out.print("Take another card?(y/n) ");
                incoming = input.nextLine().toUpperCase();  // Player's choice to take another card

                if (incoming.contains("Y")) {
                    dealTo(Player, d, 1);  // Deal one more card to player
                } else {
                    inner = false;  // End player's turn
                }

                if (Player.getScore() > 21) {
                    inner = false;  // Check if player busts
                }

                if (Player.getFull() >= 5) {
                    inner = false;  // Check if hand is full
                }

            }

            while (Dealer.getScore() < 16) {  // Dealer's turn, must take cards until score is at least 16
                dealTo(Dealer, d, 1);
            }

            System.out.println();

            a = Player.getScore();  // Final scores
            b = Dealer.getScore();

            System.out.print(Player);  // Display player's final hand
            if (a > 21) {
                System.out.println("BUST");  // Check if player busts
            }

            System.out.println();

            System.out.print(Dealer);  // Display dealer's final hand
            if (b > 21) {
                System.out.println("BUST");  // Check if dealer busts
            }

            System.out.println();

            if (a > 21 && b > 21) {
                System.out.println("Both Players BUST. Both lose.");  // Both bust scenario
            } else {
                if (a > b) {
                    if (a <= 21) {
                        System.out.println(Player.getName() + " wins.");  // Player wins scenario
                    } else {
                        System.out.println("Dealer wins.");  // Dealer wins scenario
                    }
                } else if (a < b) {
                    if (b <= 21) {
                        System.out.println("Dealer wins.");
                    } else {
                        System.out.println(Player.getName() + " wins.");
                    }
                } else {
                    System.out.println("Tie. No Winner. No loser.");  // Tie scenario
                }
            }

            purge(Player, d);  // Clear player's hand and return cards to deck
            purge(Dealer, d);  // Clear dealer's hand and return cards to deck

            d.Shuffle();  // Shuffle the deck for a new game

            System.out.print("Play again?(y/n) ");
            incoming = input.nextLine().toUpperCase();
            if (incoming.contains("N")) {
                System.out.println("Goodbye");  // End game scenario
                outer = false;
            } else {
                System.out.println();
            }

        }

        input.close();  // Close the scanner
    }  // End of main

 public static void dealTo(Hand h, Deck d, int num) {
    for (int i = 0; i < num; i++) {
        if (h.getFull() < 5) {
            Card c = d.deal();
            if (c != null) {
                if (!h.take(c)) {
                    d.discard(c);  // If the card isn't taken for some reason, return it to the deck
                } else {
                    System.out.println("Dealt: " + c);  // Show which card was dealt
                }
            } else {
                System.out.println("Deck is empty, no card to deal.");
                break;
            }
        } else {
            System.out.println("Hand is full.");
            break;
        }
    }
}

    public static void purge(Hand h, Deck d) {  // Method to clear a hand and return cards to the deck
        int f = h.getFull();
        for (int i = 0; i <= f; i++) {
            Card cd = h.discard();
            if (cd != null && !d.discard(cd)) {
                h.take(cd);  // If card cannot be discarded, add it back to the hand
            }
        }
    }
}  // End of Blackjack2 class
