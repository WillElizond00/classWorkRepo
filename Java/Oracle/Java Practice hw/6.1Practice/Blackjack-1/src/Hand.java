/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 0618506375
 */
public class Hand {
    private Card[] cards;
    private int cardCount;
    
    public Hand(){
    this.cards = new Card[5];
    this.cardCount = 0;
    }
    
    //Method to add a card to the hand
    public void addCard(Card card){
        if(cardCount < 5){
            cards[cardCount] = card;
            cardCount++;
        }
    }
    
    public int getTotalPoints(){
        int totalPoints = 0;
    }
    
}//end of class 
