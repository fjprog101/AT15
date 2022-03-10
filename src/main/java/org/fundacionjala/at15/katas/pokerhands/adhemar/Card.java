package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class Card {
    private String suit;
    private String stringValue;

    public Card(String stringValue, String suit) {
        this.suit = suit;
        this.stringValue = stringValue;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public int calculateValue() {
        switch (this.stringValue) {
            case "2":
                return Values.TWO.getValue();
            case "3":
                return Values.THREE.getValue();
            case "4":
                return Values.FOUR.getValue();
            case "5":
                return Values.FIVE.getValue();
            case "6":
                return Values.SIX.getValue();
            case "7":
                return Values.SEVEN.getValue();
            case "8":
                return Values.EIGHT.getValue();
            case "9":
                return Values.NINE.getValue();
            case "T":
                return Values.TEN.getValue();
            case "J":
                return Values.JACK.getValue();
            case "Q":
                return Values.QUEEN.getValue();
            case "K":
                return Values.KING.getValue();
            case "A":
                return Values.ACE.getValue();
            default:
                return 0;
        }
    }
}
