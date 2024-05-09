
package blackjack2;


public class Hand {
    private Card[] contents = new Card[5];
    private String player = "";
    private int score = 0;
    private int c = 0;
    
    public Hand(String pl){
        this.player = pl;
        this.c = 0;
        this.score = 0;
    }
    
    public String toString(){
        String text = "";
        int i = 0;
        
        text = player + "\'s Hand:\n";
        
        if(this.c <= 0){
            text = text + "No Cards\n";
        } else{
            for(i = 0; i < this.c; i++){
                text = text + this.contents[i].toString() + "\n";
            }   
        }
                
        text = text + "Score: " + this.getScore() + "\n";
        
        return text;
    }
    
    public void writeName(String text){
        this.player = text;
    }
    
    public String getName(){
        String text = this.player;
        
        return text;
    }
    
    public int getScore(){
        int ex = 0;
        this.tabulateScore();
        
        ex = this.score;
        
        return ex;
    }
    
    public boolean take(Card cd){
        boolean valid = true;
        
        if(this.c < 5){
            if(cd != null){
                this.contents[this.c] = cd;
                this.c = this.c + 1; 
            } else {
                valid = false;
            }
        } else{
            valid = false;
        }
        
        return valid;
    }//end mod
    
    public int getFull(){
        int ex = this.c;
        
        return ex;
    }
    
    public Card discard(){
        Card cd = null;
        
        if(this.c > 0){
            this.c = this.c -1;
            cd = this.contents[this.c];
            this.contents[this.c] = null;
        } 
        
        return cd;
    }//end mod
    
    private void tabulateScore(){
        int modScore = 0;
        int baseScore = 0;
        int i = 0;
        
        for(i = 0; i < this.c; i++){
            switch(this.contents[i].getLevel()){
                case ACE:
                    modScore = modScore + 1;
                    break;
                case TWO:
                    baseScore = baseScore + 2;
                    break;
                case THREE:
                    baseScore = baseScore + 3;
                    break;
                case FOUR:
                    baseScore = baseScore + 4;
                    break;
                case FIVE:
                    baseScore = baseScore + 5;
                    break;
                case SIX:
                    baseScore = baseScore + 6;
                    break;
                case SEVEN:
                    baseScore = baseScore + 7;
                    break;
                case EIGHT:
                    baseScore = baseScore + 8;
                    break;
                case NINE:
                    baseScore = baseScore + 9;
                    break;
                case TEN:
                case JACK:
                case QUEEN:
                case KING:
                    baseScore = baseScore + 10;
                    break;
                default:
                    ;
            }//end switch
        }//end for
        
        this.score = baseScore + (modScore*11);
        
        if(this.score > 21){
            this.score = baseScore + modScore;
        } 
    }//end mod
}//end class
