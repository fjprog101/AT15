package org.fundacionjala.at15.katas.pokerhands;

public class Deck {
    private char suit;
    private char value;

    public Deck(char newSuit, char newValue) {
        this.suit = newSuit;
        this.value = newValue;
    }

    public char getSuit() {
        return suit;
    }

    public char getValue() {
        return value;
    }

}
