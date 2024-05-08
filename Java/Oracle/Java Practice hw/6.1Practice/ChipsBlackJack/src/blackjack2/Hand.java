
package blackjack2;


public class Hand {
    private Card[] contents = new Card[5];  // Array to hold up to 5 Card objects
    private String player = "";             // Player's name
    private int score = 0;                  // Player's current score
    private int c = 0;                      // Counter for the number of cards in the hand

    public Hand(String pl){  // Constructor initializes the hand for a player
        this.player = pl;
        this.c = 0;
        this.score = 0;
    }

    public String toString(){  // Overrides the default toString method to display hand contents
        String text = player + "\'s Hand:\n";
        if(this.c <= 0){
            text += "No Cards\n";
        } else {
            for(int i = 0; i < this.c; i++){
                text += this.contents[i].toString() + "\n";
            }   
        }
        text += "Score: " + this.getScore() + "\n";
        return text;
    }

    public void writeName(String text){  // Setter method for player's name
        this.player = text;
    }

    public String getName(){  // Getter method for player's name
        return this.player;
    }

    public int getScore(){  // Calculates and returns the player's score
        this.tabulateScore();  // Call to recalculate the score based on current cards
        return this.score;
    }

    public boolean take(Card cd){  // Method to add a card to the hand
        if(this.c < 5 && cd != null){
            this.contents[this.c++] = cd;  // Adds card and increments counter
            return true;
        }
        return false;
    }

    public int getFull(){  // Returns the number of cards in the hand
        return this.c;
    }

    public Card discard(){  // Removes and returns the last card in the hand
        if(this.c > 0){
            Card cd = this.contents[--this.c];
            this.contents[this.c] = null;
            return cd;
        }
        return null;
    }

    private void tabulateScore(){  // Recalculates the player's score
        int modScore = 0, baseScore = 0;
        for(int i = 0; i < this.c; i++){
            switch(this.contents[i].getLevel()){
                case ACE: modScore += 1; break;
                case TWO: baseScore += 2; break;
                // Continue for other card types...
                case KING: baseScore += 10; break;
                default: break;  // Handles cases like JOKER
            }
        }
        this.score = baseScore + (modScore * 11);  // Ace can be 1 or 11
        if(this.score > 21) this.score = baseScore + modScore;  // If bust, Ace counts as 1
    }
}  // end class Hand