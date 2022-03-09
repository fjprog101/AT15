package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import java.util.List;

public class DeckOfCards {
    private String clubs = "C";
    private String diamonds = "D";
    private String hearts = "H";
    private String spades = "S";
    private CardSuit suit;

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
