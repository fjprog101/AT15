package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class ClubCard extends Card {

    private String suit;

    public ClubCard(String value) {
        super(value);
        this.suit = "C";
        value = getValue();
    }

    public String getCompletCard() {
        return getValue() + suit;
    }


    public String getSuit() {
        return suit;
    }

}
