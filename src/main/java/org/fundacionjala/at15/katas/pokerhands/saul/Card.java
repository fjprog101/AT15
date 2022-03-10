package org.fundacionjala.at15.katas.pokerhands.saul;

public class Card implements Comparable<Card> {
    private int value;
    private char suit;

    public Card(char value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public char getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card card) {
        if (this.value < card.getValue()) {
            return -1;
        } else if (this.value > card.getValue()) {
            return 1;
        }

        return 0;
    }
}
