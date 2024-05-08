
package blackjack2;


public class Deck {
    final int ln = 52;  // Total number of cards
    private int c = 0;  // Current number of cards in deck
    private Card[] contents = new Card[ln];  // Array to hold cards

    public Deck(){  // Constructor to populate the deck
        this.Populate();
    }

    public String toString(){  // Displays current state of the deck
        return "A deck of " + this.ln + " cards with " + this.c + " cards.";
    }

    private void Populate(){  // Fills the deck with cards
        for(int i = 0; i < this.ln; i++){
            this.contents[i] = new Card(i);
        }
        this.c = this.ln;
    }

    public void Shuffle(){  // Shuffles the deck
        for(int i = (this.c - 1); i >= 0; i--){
            int place = (int) (Math.random() * (i + 1));
            Card hold = this.contents[place];
            this.contents[place] = this.contents[i];
            this.contents[i] = hold;
        }
    }

    public Card deal(){  // Deals the top card from the deck
        if(this.c > 0){
            Card cd = this.contents[0];
            System.arraycopy(this.contents, 1, this.contents, 0, --this.c);
            this.contents[this.c] = null;
            return cd;
        }
        return null;
    }

    public boolean discard(Card n){  // Adds a card back to the deck
        if(this.c < this.ln && n != null){
            this.contents[this.c++] = n;
            return true;
        }
        return false;
    }
}  // end class Deck