package org.fundacionjala.at15.katas.pokerhands.agustin.Cards;

public enum Suit {
    CLUB("C"),
    SPADES("S"),
    HEARTS("H"),
    DIAMONDS("D");

    private final String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
