
package blackjack2;


public class Card {
    private int serial = 52;
    private SUITE st = SUITE.JOKER;
    private LEVEL lv = LEVEL.JOKER;
            
    public Card(int num){
        if((num >= 0)&&(num < 52)){
            this.serial = num;
        } else {
            this.serial = 52;
        }

        this.interpretSuite();
    }//end mod
    
    public String toString(){
        String text = "";
        
        switch(this.lv){
            case ACE:
                text = "A";
                break;
            case TWO:
                text = "2";
                break;
            case THREE:
                text = "3";
                break;
            case FOUR:
                text = "4";
                break;
            case FIVE:
                text = "5";
                break;
            case SIX:
                text = "6";
                break;
            case SEVEN:
                text = "7";
                break;
            case EIGHT:
                text = "8";
                break;
            case NINE:
                text = "9";
                break;
            case TEN:
                text = "10";
                break;
            case JACK:
                text = "Jack";
                break;
            case QUEEN:
                text = "Queen";
                break;
            case KING:
                text = "King";
                break;
            default:
                ;
        }
        
        text = text + " of ";
        
        switch(this.st){
            case DIAMONDS:
                text = text + "\u2662";
                break;
            case HEARTS:
                text = text + "\u2661";
                break;
            case CLOVES:
                text = text + "\u2663";
                break;
            case SPADES:
                text = text + "\u2660";
                break;
            default:
                text = "Joker";
        }
        
        return text;
    }
    
    private void interpretSuite(){
        int num = 0;
        
        num = (int)(Math.floor(serial/13));
        
        switch(num){
            case 0:
                this.st = SUITE.HEARTS;
                break;
            case 1:
                this.st = SUITE.DIAMONDS;
                break;
            case 2:
                this.st = SUITE.SPADES;
                break;
            case 3:
                this.st = SUITE.CLOVES;
                break;
            default:
                this.st = SUITE.JOKER;
        }
        
        if(this.st == SUITE.JOKER){
            this.lv = LEVEL.JOKER;
        } else{
            num = (int)(serial % 13);
        
            switch(num){
                case 0:
                    this.lv = LEVEL.ACE;
                    break;
                case 1:
                    this.lv = LEVEL.TWO;
                    break;
                case 2:
                    this.lv = LEVEL.THREE;
                    break;
                case 3:
                    this.lv = LEVEL.FOUR;
                    break;
                case 4:
                    this.lv = LEVEL.FIVE;
                    break;
                case 5:
                    this.lv = LEVEL.SIX;
                    break;
                case 6:
                    this.lv = LEVEL.SEVEN;
                    break;
                case 7:
                    this.lv = LEVEL.EIGHT;
                    break;
                case 8:
                    this.lv = LEVEL.NINE;
                    break;
                case 9:
                    this.lv = LEVEL.TEN;
                    break;
                case 10:
                    this.lv = LEVEL.JACK;
                    break;
                case 11:
                    this.lv = LEVEL.QUEEN;
                    break;
                case 12:
                    this.lv = LEVEL.KING;
                    break;
                default:
                    this.lv = LEVEL.JOKER;
            } 
                   
        }

    }//end mod
    
    public SUITE getSuite(){
        SUITE ex = this.st;
        
        return ex;
    }//end mod
    
    public LEVEL getLevel(){
        LEVEL ex = this.lv;
        
        return ex;
    }//end mod
    
    public int getSerial(){
        int ex = this.serial;
        
        return ex;
    }//end mod
}//end class
