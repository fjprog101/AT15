package org.fundacionjala.at15.katas.pokerhands.saul;

public class Card implements Comparable<Card> {
    private int value;
    private char suit;

    public Card(int value, char suit) {
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
    public int compareTo(Card otherCard) {
        if (this.value < otherCard.getValue()) {
            return -1;
        } else if(this.value > otherCard.getValue()) {
            return 1;
        }

        return 0;
    }
}
