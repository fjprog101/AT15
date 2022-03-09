package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class Card {
    private char suit;
    private char charValue;

    public Card(char suit, char charValue) {
        this.suit = suit;
        this.charValue = charValue;
    }

    public char getSuit() {
        return this.suit;
    }

    public char getCharValue() {
        return this.charValue;
    }
}
