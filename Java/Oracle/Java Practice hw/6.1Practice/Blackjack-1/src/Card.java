/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 0618506375
 */
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
   
    private int getPoints() { // Now a private method with no parameters
        switch (name) {
            case "Jack":
            case "Queen":
            case "King":
            case "Ten":
                return 10;
            case "Ace":
                return 1; // Adjust for blackjack rules as needed (1 or 11)
            default:
                try {
                    return Integer.parseInt(name); // Converts "Two" to 2, "Three" to 3, etc.
                } catch (NumberFormatException e) {
                    return -1; // In case of an error
                }
        }
    }

    
  public String getSuit(int i){
      if(i == 1) return "Diamonds";
      if(i == 2) return "Clubs";
      if(i == 3) return "Spades";
      if(i == 4) return "Hearts";
      return "error";
  }

}
