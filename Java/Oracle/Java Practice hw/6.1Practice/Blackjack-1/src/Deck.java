/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author 0618506375
 */
public class Deck{
    Card[] cardArray = new Card[52];
    int currentCardIndex = 0;
    Deck(){
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for(int i = 1; i <= suits; i++){
            for(int j = 1; j <= cardType; j++){
               cardArray[cardCount] = new Card(i, j);
               cardCount++;
            }
        }
    }
    
    public void shuffle(){
        Random random = new Random();
        for (int i = cardArray.length - 1 ; i > 0; i--){
        int index = random.nextInt(i + 1);
        Card temp = cardArray[index];
        cardArray[index] = cardArray[i];
        cardArray[i] = temp;
        }
        currentCardIndex = 0; // Reset currentCardIndex after shuffling
    }
    
    public void print(){
            for(int i = 0; i < cardArray.length; i++)
                    System.out.println(cardArray[i]);
    }
}
