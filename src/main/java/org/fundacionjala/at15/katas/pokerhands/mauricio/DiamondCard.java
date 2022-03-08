package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class DiamondCard extends Card {

    private String suit;

    public DiamondCard(String value) {
        super(value);
        this.suit = "D";
        value = getValue();
    }

    public String getCompletCard() {
        return getValue() + suit;
    }

    public String getSuit() {
        return suit;
    }
}
