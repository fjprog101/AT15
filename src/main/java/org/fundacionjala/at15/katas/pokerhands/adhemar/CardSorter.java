package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class CardSorter {
    public static Card[] sort(Card[] cards) {
        Card temp = null;
        for (int xindex = 0; xindex < cards.length; xindex++) {
            for (int yindex = 0; yindex < cards.length; yindex++) {
                if (cards[xindex].calculateValue() < cards[yindex].calculateValue()) {
                    temp = cards[xindex];
                    cards[xindex] = cards[yindex];
                    cards[yindex] = temp;
                }
            }
        }
        return cards;
    }
}
