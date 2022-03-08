package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class Card {
    private String value;
    private String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value1) {
        this.value = value1;
    }

    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit1) {
        this.suit = suit1;
    }

    public String getMixCard() {
        return value + suit;
    }
}
