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

    public void setSuit(String param) {
        this.suit = param;
    }

    public void setNotation(String param) {
        this.notation = param;
    }

    public void setValue(int param) {
        this.value = param;
    }
}
