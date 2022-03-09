package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class Card {
    private String suit;
    private String stringValue;
    static final int TWO = 2;
    static final int THREE = 3;
    static final int FOUR = 4;
    static final int FIVE = 5;
    static final int SIX = 6;
    static final int SEVEN = 7;
    static final int EIGHT = 8;
    static final int NINE = 9;
    static final int TEN = 10;
    static final int JACK = 11;
    static final int QUEEN = 12;
    static final int KING = 13;
    static final int ACE = 14;

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
                return TWO;
            case "3":
                return THREE;
            case "4":
                return FOUR;
            case "5":
                return FIVE;
            case "6":
                return SIX;
            case "7":
                return SEVEN;
            case "8":
                return EIGHT;
            case "9":
                return NINE;
            case "T":
                return TEN;
            case "J":
                return JACK;
            case "Q":
                return QUEEN;
            case "K":
                return KING;
            case "A":
                return ACE;
            default:
                return 0;
        }
    }
}
