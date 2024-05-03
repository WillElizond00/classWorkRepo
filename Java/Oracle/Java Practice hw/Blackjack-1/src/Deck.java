/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 0618506375
 */
public class Deck{
    Card[] cardArray = new Card[52];
    Deck(){
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for(int i = 1; i <= suits; i++){
               cardArray[cardCount] = new Card(i, j);
               cardCount++;
        }
    }
    public void print(){
            for(int i = 0; i < cardArray.length; i++)
                    System.out.println(cardArray[i]);
    }
}
