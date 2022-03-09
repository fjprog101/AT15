package org.fundacionjala.at15.katas.pokerhands;

public abstract class Card implements Comparable<Card> {
    protected char value;
    protected char suit;

    public Card(char value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public char getValue() {
        return value;
    }

    public char getSuit() {
        return suit;
    }
}
