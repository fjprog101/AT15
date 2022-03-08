package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class SpadeCard extends Card {

    private String suit;

    public SpadeCard(String value) {
        super(value);
        this.suit = "S";
        value = getValue();
    }

    public String getCompletCard() {
        return getValue() + suit;
    }

    public String getSuit() {
        return suit;
    }

}
