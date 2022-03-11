package org.fundacionjala.at15.katas.pokerhands.agustin;

public class Card {
    protected String suit;
    protected String notation;
    protected int value;

    public Card() {

    }

    public String getSuit() {
        return suit;
    }

    public String getNotation() {
        return notation;
    }

    public int getValue() {
        return value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setNotation(String notation) {
        this.notation = notation;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
