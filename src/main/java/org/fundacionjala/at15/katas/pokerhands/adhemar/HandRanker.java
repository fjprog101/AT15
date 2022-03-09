package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class HandRanker {
    private Card[] cards;

    public HandRanker(Card[] cards) {
        this.cards = cards;
    }

    public boolean isAllSameSuit() {
        char prevSuit = this.cards[0].getSuit();
        for (Card card : this.cards) {
            if (prevSuit != card.getSuit()) {
                return false;
            }
            prevSuit = card.getSuit();
        }
        return true;
    }

    public boolean isContinuous() {
        int prevValue = this.cards[0].calculateValue() - 1;
        for (Card card : this.cards) {
            if (card.calculateValue() != prevValue + 1) {
                return false;
            }
            prevValue = card.calculateValue();
        }
        return true;
    }
}
