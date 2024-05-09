package blackjack2;
import java.util.Scanner;

// Enum for card suites including a JOKER
enum SUITE {
    HEARTS,
    DIAMONDS,
    CLOVES,
    SPADES,
    JOKER
}

// Enum for card levels, includes all face cards and a JOKER.
enum LEVEL {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    JOKER
}

public class Blackjack2 {
    // Entry point for the blackjack program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for reading user input
        Deck d = new Deck(); // Deck of cards
        Hand Dealer = new Hand("Dealer"); // Dealers hand
        Hand Player = new Hand("Scotty"); // Initial player's hand named Scotty 
        boolean outer = true; // Controls the game replay loop
        boolean inner = true; // Controls the inner gameplay loop
        boolean victory = false; //Flag for victory status
        String incoming = ""; //Store user input
        int a = 0; //Player's score
        int b = 0; //Dealers's score
        
        System.out.println("This program will play blackjack. (do not attempt in real life; gambling is super bad)");
        System.out.print("Enter your name: ");
        incoming = input.nextLine();
        
        Player.writeName(incoming); // Sets player name for user input
        
        d.Shuffle(); //Shuffle the deck
        
        while(outer){ //Outer loop to allow replaying the game
        
            d.Shuffle(); //Shuffle the deck each new game

            dealTo(Dealer, d, 2); // Deal two cards to the dealer 
            dealTo(Player, d, 2); // Deal two cards to the player
            
            // Gameplay loop for the player
            while(inner){
                
                System.out.println(Player); // Display player's hand
            
                System.out.print("Take another card?(y/n) "); // Ask user if they want another card
                incoming = input.nextLine();
                incoming = incoming.toUpperCase();

                if(incoming.contains("Y")){
                    dealTo(Player, d, 1); // Deal one more card to the player
                } else{
                    inner = false;  //Exit inner loop
                }
                
                if(Player.getScore() > 21){
                    inner = false;// player busts if score is over 21
                }
                
                if(Player.getFull() >= 5){
                    inner = false; // Exit loop if player has 5 cards
                }
                
            }
            
            while(Dealer.getScore() < 16){
                dealTo(Dealer, d, 1);
            }
            
            System.out.println();
            
            a = Player.getScore();
            b = Dealer.getScore();
            
            System.out.print(Player);
            if(a > 21){
                System.out.println("BUST");
            }
            
            System.out.println();
            
            System.out.print(Dealer);
            if(b > 21){
                System.out.println("BUST");
            }
            
            System.out.println();
            
            if(a > 21 && b > 21){
                System.out.println("Both Players BUST. Both lose.");
            } else{
                if(a > b){
                    if(a > 21){
                        System.out.println("Dealer wins.");
                    } else {
                        System.out.println(Player.getName() + " wins.");
                    }
                } else if (a < b){
                    if(b > 21){
                        System.out.println(Player.getName() + " wins.");
                    } else {
                        System.out.println("Dealer wins.");
                    }
                } else {
                    System.out.println("Tie. No Winner. No loser.");
                }
            }            
            
            purge(Player, d);
            purge(Dealer, d);
            
            d.Shuffle();
            
            System.out.print("Play again?(y/n) ");
            incoming = input.nextLine();
            incoming = incoming.toUpperCase();
            if(incoming.contains("N")){
                System.out.println("Goodbye");
                outer = false;
            } else{
                System.out.println();
            }
               
        }
        
        input.close();
    }//end main
    
    public static void dealTo(Hand h, Deck d, int num){
        Card c;
        
        for(int i = 0; i < num; i++){
            if(h.getFull() < 5){
                c = d.deal();
                if(c != null){
                    if(!h.take(c)){
                        d.discard(c);
                    }
                } else{
                    System.out.println("Deck Empty");
                    break;
                }
            } else{
                System.out.println("Hand Full.");
                break;
            }
        }
    }//end mod
    
    public static void purge(Hand h, Deck d){
        int i = 0;
        int f = h.getFull();
        Card cd;
        
        for(i = 0; i <= f; i++){
            cd = h.discard();
            
            if(cd != null){
                if(!d.discard(cd)){
                    h.take(cd);
                }
            }
        }
    }//end mod
}

