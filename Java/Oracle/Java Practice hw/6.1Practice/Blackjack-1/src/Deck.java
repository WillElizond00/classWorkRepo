/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
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
        for(int i = 1; i <= suits; i++)
            for(int j = 1; j <= cardType; j++){
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
    }
    
   public void shuffle(){
        List<Card> cardList = new ArrayList<Card>(java.util.Arrays.asList(cardArray));
        Collections.shuffle(cardList);
        cardArray = cardList.toArray(new Card[0]);
    }

    public void print(){
           for(int i = 0; i < cardArray.length; i++)
           System.out.println(cardArray[i]);
    }  
    
    
    
    
    
}// end of class 
