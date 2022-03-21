package org.fundacionjala.at15.katas.pokerhands.adhemar;

public final class HandFunctions {
    public static Card[] sort(Card[] cards) {
        Card temp = null;
        for (int xindex = 0; xindex < cards.length; xindex++) {
            for (int yindex = 0; yindex < cards.length; yindex++) {
                if (cards[xindex].getIntValue() < cards[yindex].getIntValue()) {
                    temp = cards[xindex];
                    cards[xindex] = cards[yindex];
                    cards[yindex] = temp;
                }
            }
        }
        return cards;
    }

    public static Card calculateTheHighestCard(Card[] cards) {
        Card high = cards[0];
        for (Card card : cards) {
            high = card.getIntValue() > high.getIntValue() ? card : high;
        }
        return high;
    }
}
