package org.fundacionjala.at15.katas.pokerhands;

public class Card extends Deck {

    public Card(char newValue, char newSuit) {
        super(newValue, newSuit);
    }

    public String joinSuitValue() {
        String union;
        union = Character.toString(getValue()) + Character.toString(getSuit());
        return union;
    }
}
