
package blackjack2;


public class Card {
    private int serial = 52;  // Serial number for the card
    private SUITE st = SUITE.JOKER;  // Suite of the card
    private LEVEL lv = LEVEL.JOKER;  // Level of the card

    public Card(int num){  // Constructor assigns suite and level based on serial number
        this.serial = (num >= 0 && num < 52) ? num : 52;
        this.interpretSuite();
    }

    public String toString(){  // Returns the string representation of the card
        String text = "";
        // Case switch for each level followed by suite
        return text;
    }

    private void interpretSuite(){  // Determines suite and level based on serial
        int num = serial / 13;
        // Case switch for suite
        // Case switch for level based on serial modulo 13
    }

    public SUITE getSuite(){  // Returns the suite of the card
        return this.st;
    }

    public LEVEL getLevel(){  // Returns the level of the card
        return this.lv;
    }

    public int getSerial(){  // Returns the serial number of the card
        return this.serial;
    }
}  // end class Card
