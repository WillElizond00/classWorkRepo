/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deck
 */
public class Main {
    public static void main(String args[]){
            Deck d = new Deck();
            d.print();
    }
    
}
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
    public void print(){
           for(int i = 0; i < cardArray.length; i++)
           System.out.println(cardArray[i]);
    }  
    
    
}
public class Card{
                String suit,name;
                int points;
    Card(int n1, int n2){
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }
    public String toString(){
            return "The " + name + " of " + suit;
    }
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
        return "error";
        
    }
    public int getPoints(String n){
        if
    }
    

}


