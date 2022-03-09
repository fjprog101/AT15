package org.fundacionjala.at15.katas.pokerhands.agustin;

public abstract class Card {
    protected String suit;
    protected String notation;
    protected int value;


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suitParam) {
        this.suit = suitParam;
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notationParam) {
        this.notation = notationParam;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int valueParam) {
        this.value = valueParam;
    }
}
