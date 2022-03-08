package org.fundacionjala.at15.katas.pokerhands;

public class Card extends Deck {

    public Card(char newSuit, char newValue) {
        super(newSuit, newValue);
    }

    public String joinSuitValue() {
        String union;
        union = "" + getValue() + getSuit();
        return union;
    }
}
