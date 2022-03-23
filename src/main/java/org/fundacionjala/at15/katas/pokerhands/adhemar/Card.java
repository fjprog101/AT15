package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class Card {
    private String suit;
    private String stringValue;
    private int intValue;

    public Card(String stringValue, String suit) {
        this.suit = suit;
        this.stringValue = stringValue;
        this.intValue = Values.turnIntoInt(stringValue);
    }

    public String getSuit() {
        return this.suit;
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public int getIntValue() {
        return this.intValue;
    }
}
