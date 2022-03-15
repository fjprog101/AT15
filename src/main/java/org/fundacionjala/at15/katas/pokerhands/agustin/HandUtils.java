package org.fundacionjala.at15.katas.pokerhands.agustin;

public class HandUtils extends ObjectCollection {

    public HandUtils(Card[] cardCollection) {
        super(cardCollection);
    }

    public boolean isStraight() {
        Card[] sorted = Hand.sort(this.cardSet);
        int prev = sorted[0].getValue() - 1;
        for (Card card : sorted) {
            if (card.getValue() != prev + 1) {
                return false;
            } else {
                prev = card.getValue();
            }
        }
        return true;
    }

    public boolean isFlush() {
        String prev = this.cardSet[0].getSuit();
        for (Card card : this.cardSet) {
            if (!prev.equals(card.getSuit())) {
                return false;
            } else {
                prev = card.getSuit();
            }
        }
        return true;
    }
}
