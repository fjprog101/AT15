package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;

public class PokerHandBuilder {
    private List<Card> handOfCards = new ArrayList<>();

    public PokerHandBuilder(Card card1, Card card2, Card card3, Card card4, Card card5) {
        handOfCards.add(card1);
        handOfCards.add(card2);
        handOfCards.add(card3);
        handOfCards.add(card4);
        handOfCards.add(card5);
    }

    public Card getHandOfCardsElement(int ind) {
        return handOfCards.get(ind);
    }
}
