package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import java.util.List;

public class DeckOfCards {
    private final String clubs = "C";
    private final String diamonds = "D";
    private final String hearts = "H";
    private final String spades = "S";
    private CreateCards suit;

    public List<String> clubsSuit() {
        suit = new CardSuit();
        return suit.cards(clubs);
    }

    public List<String> diamondsSuit() {
        suit = new CardSuit();
        return suit.cards(diamonds);
    }

    public List<String> heartsSuit() {
        suit = new CardSuit();
        return suit.cards(hearts);
    }

    public List<String> spadesSuit() {
        suit = new CardSuit();
        return suit.cards(spades);
    }
}
