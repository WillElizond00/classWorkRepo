package blackjack2;
import java.util.Scanner;

enum SUITE {
    HEARTS,
    DIAMONDS,
    CLOVES,
    SPADES,
    JOKER
}

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
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deck d = new Deck();
        Hand Dealer = new Hand("Dealer");
        Hand Player = new Hand("Scotty");
        boolean outer = true;
        boolean inner = true;
        boolean victory = false;
        String incoming = "";
        int a = 0;
        int b = 0;
        
        System.out.println("This program will play blackjack. (do not attempt in real life; gambling is super bad)");
        System.out.print("Enter your name: ");
        incoming = input.nextLine();
        
        Player.writeName(incoming);
        
        d.Shuffle();
        
        while(outer){
        
            d.Shuffle();

            dealTo(Dealer, d, 2);
            dealTo(Player, d, 2);
            
            
            while(inner){
                
                System.out.println(Player);
            
                System.out.print("Take another card?(y/n) ");
                incoming = input.nextLine();
                incoming = incoming.toUpperCase();

                if(incoming.contains("Y")){
                    dealTo(Player, d, 1);
                } else{
                    inner = false;  
                }
                
                if(Player.getScore() > 21){
                    inner = false;
                }
                
                if(Player.getFull() >= 5){
                    inner = false;
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

