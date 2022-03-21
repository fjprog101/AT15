package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class Deck {

    protected String suit;
    protected String value;

    public Deck(String newValue, String newSuit) {
        this.suit = newSuit;
        this.value = newValue;
    }
}
