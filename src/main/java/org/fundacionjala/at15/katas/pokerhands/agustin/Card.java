package org.fundacionjala.at15.katas.pokerhands.agustin;

public abstract class Card {
    protected String suit;
    protected String notation;
    protected int value;


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
