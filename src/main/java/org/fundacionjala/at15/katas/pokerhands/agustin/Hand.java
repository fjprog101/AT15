package org.fundacionjala.at15.katas.pokerhands.agustin;

public class Hand extends CardSet {

    public Hand(Card[] cardCollection) {
        super(cardCollection);
    }

    public static Card[] sort(Card[] cards) {
        Card temp = null;
        for (int xIndex = 0; xIndex < cards.length; xIndex++) {
            for (int yIndex = 0; yIndex < cards.length; yIndex++) {
                if (cards[xIndex].getValue() < cards[yIndex].getValue()) {
                    temp = cards[xIndex];
                    cards[xIndex] = cards[yIndex];
                    cards[yIndex] = temp;
                }
            }
        }
        return cards;
    }
}

