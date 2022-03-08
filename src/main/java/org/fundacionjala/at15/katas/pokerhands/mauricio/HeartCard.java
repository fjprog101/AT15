package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class HeartCard extends Card {

    private String suit;

    public HeartCard(String value) {
        super(value);
        this.suit = "H";
        value = getValue();
    }

    public String getCompletCard() {
        return getValue() + suit;
    }

    public String getSuit() {
        return suit;
    }

}
