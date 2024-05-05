/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deck
 */
public class Hand {
    private Card[] cards;
    private int numCards;
    
    public Hand(){
    cards = new Card[5];
    numCards = 0;
    }
    
    public void addCard(Card card){
        if(numCards < 5){
        cards[numCards] = card;
        numCards++;
        
        }
    }
    
    public int getTotalPoints(){
        int total = 0;
        int numAces = 0;
     
        for(int i = 0; i < numCards; i++){
            total += cards[i].getValue();
            if(cards[i].getValue() == 11){
            numAces++;
            }
        }
        
        while(total > 21 && numAces > 0){
            total -= 10;
            numAces--;
        }
        return total;
        
    }
    
    public boolean isBust(){
        return getTotalPoints() > 21;
    }
    
    public void printHand(){
        System.out.println("Hand:");
        for(int i = 0; i < numCards; i++){
            System.out.println(cards[i]);
        }
        System.out.println("Total points: " + getTotalPoints());
    }
 
    
    
}
