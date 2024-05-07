
package blackjack2;


public class Deck {
    final int ln = 52;
    private int c = 0;
    private Card[] contents = new Card[ln];
    
    public Deck(){
        
        this.Populate();
    }
    
    public String toString(){
        String text = "A deck of " + this.ln + " cards with " + this.c+ " cards.";
        
        return text;
    }
    
    private void Populate(){
        
        for(int i = 0; i < this.ln; i++){
            this.contents[i] = new Card(i);
        }
        
        this.c = this.ln;
    }
    
    public void Shuffle(){
        int i = 0;
        int place = 0;
        Card hold;
        
        for(i = (this.c - 1); i >= 0; i--){
            place = (int)Math.floor((Math.random())*(i+1));
            hold = this.contents[place];
            this.contents[place] = this.contents[i];
            this.contents[i] = hold;
        }

    }
    
    public Card deal(){
        Card cd = contents[0];
        
        if(this.c > 0){
            for(int i = 0; i < (this.c - 1); i++){
                this.contents[i] = this.contents[i+1];
            }
            
            this.c = this.c - 1;

            this.contents[this.c] = null;
        }
        
        return cd;
    }
    
    public boolean discard(Card n){
        boolean valid = true;
        
        if(this.c < 52){
            if(n != null){
                this.contents[this.c] = n;
                this.c = c + 1;
            }
        }

        return valid;
    }
    
    /*public void allOut(){
        for(int i = 0; i < ln; i++){
            System.out.println(this.contents[i]);
        }
    }*/
}
